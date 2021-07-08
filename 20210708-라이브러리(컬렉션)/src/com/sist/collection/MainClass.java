package com.sist.collection;
/*
 *    java.util
 *    =========
 *     = StringTokenizer (웹사이트에서 이미지가 많이 경우 사용)
 *       => countTokens() => 단어 갯수
 *       => hasMoreTokens() => 제어문 (단어별)
 *       => 실제 데이터 가지고 오기 => nextToken()
 *     = 날짜 
 *       => Date => 데이터베이스(오라클) 등록된 날짜,시간
 *       => Calendar => 예매(달력=>마지막날, 요일을 구해준다)
 *    java.text 
 *     = SimpleDateFormat : 날짜,시간을 원하는 형태로 변경 
 *       = 년도 : yyyy,yy
 *       = 월   : MM , M
 *       = 일   : dd , d
 *       = 시간  : hh , h
 *       = 분   : mm ,m 
 *       = 초   : ss, s 
 *       ===============> 웹 (게시판 : 년월일 , 댓글,공지사항 : 년월일 , 시간)
 *     = ChoiceFormat : switch를 대체 (사용빈도가 작다)
 *     *****= MessageFormat : 출력 형식 => 복잡한 SQL문장을 문들 경우 주로 사용(오라클과 관련)
 *     예)
 *         회원가입 
 *         ======             버튼클릭                 INSERT 값을 채워서 전송
 *         사용자 브라우저에 등록 ======== 자바(값을 받는다) =====================오라클
 *         String id , pwd ,name ,addr , tel,email
 *         int age
 *         
 *         => String sql="INSERT INTO member VALUES('"+id+"','"+pwd+"','"+name
 *                       +"','"+addr+"','"+tel+"','"+email+"',"+age+")";
 *         => String sql="INSERT INTO member VALUES({0},{1},{2},{3},{4},{5},{6}..)"
 *         
 *     Collection : 데이터를 모아서 관리 => 가변 (갯수를 지정하지 않고 자동을 갯수가 증가)
 *     ==========  배열(X) : 고정  =======> 오라클에서 배열 사용 (갯수) 
 *        1) 표준화된 데이터 관리 프로그램 (라이브러리) 
 *          => 자바에서 제공하는 라이브러리 (완제품 =>자바개발자 누구나 동일하게 사용: 오버라이딩도 가능)
 *          => 스프링 (형태(같다) , 내용(틀리다)) , 마이바티스 
 *          => 자바스크립트 (라이브러리 ... Jquery , reactjs , nodejs , vuejs)
 *        2) 재사용성이 좋다 => 필요하면 언제든가 변경이 가능..
 *        3) 종류 
 *                  오라클 : 데이터 중복 허용
 *                         => 중복없는 데이터를 가지고 온다 (장르,등급)
 *                         => SELECT DISTINCT genre~
 *           List : 순서가 존재(인덱스) , 데이터 중복 허용 => 배열하고 동일 (0~~자동 증가)
 *           Set  : 순서가 존재하지 않는다 , 데이터 중복을 허용하지 않는다 
 *                  List => Set 변경 ==> 중복된 데이터를 버리고 가지고 온다 
 *           Map  : 키와 값이 쌍으로 만들어진다 => 
 *                  => 키는 중복이 불가능 , 값은 중복이 가능 ==> JSON , 웹에서 사용하는 모든 데이터는 Map형식
 *                     웹 : 사용자가 보내준 값(Request) , 사용자 요청을 처리후 브라우저로 보낸다(Response) 
 *                          필요한 내용은 서버저장(Session) , 클라이언트 브라우저에 저장 (Cookie)
 *                          => (id,admin)
 *                                Collection => interface
 *                                  |
 *                         -----------------------------
 *                         |             |             |
 *                        List         Set            Map => interface  
 *                        =====
 *                        List => ***ArrayList , Vector , LinkedList , Stack 
 *                                ArrayList : 데이터베이스 (비동기화) 
 *                                Vector : 네트워크(접속자 정보 저장 => 동기화) 
 *                                LinkList : C언어 개발자 (ObList) => MFC
 *                        Set 
 *                        =====
 *                        Set => ***HashSet , TreeSet 
 *                        Map 
 *                        =====
 *                        Map => Hashtable , ***HashMap
 *                        
 *                        ================> 람다식 , Stream , IO 
 *       CURD =>  데이터를 모아서 관리 (1. 추가 , 2. 읽기 , 3. 수정 , 4. 삭제) => 메모리저장
 *                                   INSERT   SELECT    UPDATE   DELETE => SQL(DML)
 *       ============================================================= 오라클,파일 (영구적인 저장 장치)
 *       1. List
 *          1) ArrayList : 단점 (메모리가 크다)
 *             ============================
 *                인덱스:값 |      |      |
 *             ============================
 *                 0 => 추가 , 삭제시 => 자동 인덱스번호가 부여
 *                 0 1 2 3
 *                     =
 *                 0 1 2 3 4  ==> loop 
 *                   =
 *                 0   2 3 4 5
 *                   1
 *             => 추가 
 *                add(값)
 *                add(index,값)
 *             => 읽기
 *                get(인덱스번호)
 *             => 수정
 *                set(인덱스번호,값)
 *             => 삭제
 *                remove(인덱스번호) 
 *             => 갯수
 *                size() : 저장된 갯수
 *             => 저장이 가능 : 기본형데이터 (정수,실수,논리,문자,문자열,사용자 정의 클래스)
 *                ========= 이미 만들어져 있다 => 값을 읽는 경우에 모든 리턴형 Object
 *                                            =========== 형변환 
 *                                            =========== Object 데이터형을 전부 변경 => 제네릭스
 *       
 *                        
 */
import java.util.*;
// T(type) , E(element) , K(key) , V(value) => 임시클래스
// T => 클래스형 
class Box<T> 
{
	T t;
	public void setT(T t)
	{
		this.t=t;
	}
	public T getT()
	{
		return t;
	}
	public T display()
	{
		return t;
	}
	
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*ArrayList list=new ArrayList();
        //list.add(list)
        list.add("홍길동");
        list.add("남자");
        list.add(30);
        list.add("010-1111-1111");
        list.add(true);
        list.add('A');
        list.add("서울시");  // for을 사용할 수 없다 => 1. 변수명이 동일 , 2. 데이터값이 동일  
                            // 데이터를 모아서 관리 => 동일한 데이터만 모아서 관리
        // Object로 설정 => 첨부하기 편하다 , 단 읽기가 어렵다 */
		//Box<String> b=new Box<String>();
		//b.
		// 데이터를 추가할 경우에는 => 순차적으로 추가 
		List<String> names=new Stack<String>();
		names.add("홍길동"); // 0
		names.add("심청이"); // 1
		names.add("이순신"); // 3
		names.add("박문수"); // 4
		names.add("춘향이"); // 5
		//인덱스번호는 항상 => 일괄적으로 유지  
		// 출력
		int i=0;
		for(String name:names)
		{
			System.out.println("인덱수번호:"+i+",저장된 이름:"+name);
			i++;
		}
		names.add(2,"강감찬");// 2 ==> 사용하지 않는다 (권장)
		System.out.println("==========================");
		i=0;
		for(String name:names)
		{
			System.out.println("인덱수번호:"+i+",저장된 이름:"+name);
			i++;
		}
		// 삭제 
		names.remove(3);
		
		System.out.println("==========================");
		i=0;
		for(String name:names)
		{
			System.out.println("인덱수번호:"+i+",저장된 이름:"+name);
			i++;
		}
		
		// 수정 
		names.set(3, "홍문수");
		i=0;
		for(String name:names)
		{
			System.out.println("인덱스번호:"+i+",저장된 이름:"+name);
			i++;
		}
		System.out.println("=====================");
		System.out.println("저장 인원:"+names.size()); // 
		//데이터수집 =>Jsoup for(int i=0;i<title.size();i++)
		// 전체 삭제 
		names.clear();
		System.out.println("저장 인원:"+names.size());
		// ArrayList에 등록된 데이터를 지우는 경우 => clear()
		
	}

}










