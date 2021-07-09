package com.sist.lib;
/*
 *   =======
 *   J2SE (일반자바) => JDK설치시 자동 설정
 *   J2EE (기업용 환경 => web) 별도로 다운로드 (tomcat => servlet-api.jar) tomcat:webserver+jsp엔진
 *   J2ME (모바일) => X => Kotlin(안드로이드) 
 *   =======
 *   
 *   라이브러리 => 자바에 지원 (클래스 제작) => 85% (있는 그대로 사용) 15%(재정의=오버라이딩)
 *   
 *   JDK1.0
 *   ====================
 *   웹 : 오라클연결 ===> 자바 (데이터읽기) ===> 브라우저 
 *       ===== 데이터 저장 (관리 명령어 : SQL)
 *             CURD (저장 , 수정 , 읽기 , 삭제)=> SELECT(검색),INSERT(추가),UPDATE(수정),DELETE(삭제)
 *       ===== 오라클 (저장 => 숫자형 , 문자형 , 날짜형)
 *                          ======  =====  ======
 *                          Integer,Double , String , Date
 *                          byte => 자바 ====> 브라우저 
 *                                      파일(업로드) ===> 자바(2바이트,Unicode, 브라우저 : 1바이트 :ASC)
 *   java.lang 
 *     Object : 모든 데이터를 관리할 수 있는 최상의 클래스(기본데이터형)
 *              Object o=1 , o="aaa" , o='A' , o=new A()
 *              클래스제공 => 재사용(메소드)
 *              = equals() : 객체비교 
 *              = finalize() : 소멸자 (자동 호출 => 호출되면 메모리 해제)
 *              = clone() : 복제(새로운 메모리 생성) => prototype
 *              = toString() : 형변환 없이 문자열 변환시 
 *      **String : 문자열 관리 클래스
 *                 length() : 문자갯수 (화면 UI)
 *                 ***substring() : 문자 자르기 (...) => 오라클에 저장 (그림 여러개, 메뉴여러개)
 *                 =========== 찾기
 *                 ***indexOf,lastIndexOf : 문자,문자열 위치 찾기 
 *                 ***contains() : 포함 
 *                 startsWith,endsWith
 *                 유사문자열 : 문자의패턴이용 : matchers()
 *                            ======= 정규식 ==> (String regex)
 *                 ====================
 *                 replace , replaceAll => 변환 
 *                 ***trim() : 공백문자 제거 
 *                 ***valueOf() => 모든 데이터형을 문자열 변경 
 *                 concat() , + => 문자열 결합 
 *                 split()
 *      StringBuffer : 많이 데이터가 있는 파일을 읽을 경우 => 문자열을 결합 => append()
 *      **Wrapper : 모든 데이터형을 쉽게 관리할 수 있게 만든다
 *         기본데이터형 => 클래스화 되어 있다 
 *           int = Integer  =======> parseInt() : 정수형변경
 *           double = Double ======> parseDouble() : 실수 변경
 *           boolean = Boolean  ===> parseBoolean() : true/false
 *           long = Long    ====> parseLong() : long 변경 
 *           ======================== web에서 전송받는 모든 데이터는 문자열로 전송을 받는다 
 *      Math ===> 대부분 static =========> Math.ceil()
 *         = 올림 : 총페이지구하기 (ceil())
 *         = 난수 : random() => 0.0~0.99 
 *      System ===> gc() 
 *                  System.currentTimeMillis() : 시간 => log파일 (걸리는 시간)
 *   java.util
 *      StringTokenizer 
 *        = hasMoreTokens
 *        = countTokens() : 갯수
 *        = nextToken() : 실제 데이터 읽기 
 *      Random 
 *        = nextInt(10) => 0~9  
 *      Scanner : 키보드 입력값 
 *      Date : 시스템의 시간 읽기 => 날짜
 *      Calendar : 요일 , 각달의 마지막 
 *                 월(0~11) , 요일 (1~7)
 *                 =======   =========
 *                   +1         -1
 *      데이터를 묶어서 처리 (컬렉션)
 *      ================
 *        List : 중심 => 순서가 있다 , 데이터 중복 허용
 *               데이터관리 (CURD)
 *               ArrayList(***)
 *               Vector
 *               LinkedList
 *               Stack
 *               ================== 추가(add()),수정(set()),삭제(remove()),읽기(get()) 확인(size())
 *        Set : 순서가 없다 , 데이터 중복할 수 없다 
 *               ***HashSet,TreeSet
 *        Map : key,value동시에 저장 
 *              key는 중복(X) ,value(중복 가능) ==> 클래스 메모리 관리 (스프링)
 *              => ***HashMap,Hashtable
 *   java.text
 *      변환 
 *      ====
 *       SimpleDateFormat : 날짜,시간을 변환 할때 ( yyyy , MM , dd , hh , mm ,ss)
 *       MessageFormat : 출력 형식 
 *                       =======
 *                       오라클 데이터 추가 , 데이터 수정 
 *                       INSERT INTO ~~   UPDATE table SET
 *   java.io
 *      File , FileReader , FileWriter , FileInputStream,FileOutputStream
 *      BufferedReader , BufferedWriter , BufferedInputStream,BufferedOutputStream
 *   java.net
 *      URL , URLEncoder
 *      
 *   *** 제네릭스 : 데이터형 한번에 통일화 
 *       형식) <클래스>
 *            ArrayList<String> => 문자열만 저장이 가능
 *            ArrayList<int>(X) => ArrayList<Integer>
 *            ArrayList => 제네릭스를 사용하지 않으면 => default Object (출력 , 추가 => 형변환)
 *            장점)
 *              = 데이터형의 안전성 
 *              = 형변환이 없기 때문에 소스 간결하다 
 *           예)
 *               T => type (클래스형)
 *               E => Element (클래스형)
 *               Vector<E>
 *               K => key
 *               V => value
 *               Map<K,V>
 *               public class ArrayList<T> => T 임시 클래스 데이터형
 *               {
 *                  T t;
 *                  public ArrayList()
 *                  {
 *                     if(제네릭스가 없는 경우)
 *                     {
 *                         T=Object => 형변환 => for-each를 구현하기 어렵다
 *                     }
 *                     else
 *                     {
 *                         <String> <Integer>
 *                         T=String => Integer
 *                     }
 *                     
 *                  }
 *                  public T get(int i){} => public String get(int i)
 *                  public void set(int i,T t){} => public void set(int i,String t){}
 *                  
 *                  
 *               }
 *   
 *   JDK1.2
 *   ====================
 *   웹 (web) 
 *   javax.xml
 *   javax.servlet
 *   
 *   외부라이브러리(마이바티스,스프링)
 *   ====================
 *   java(X) => org , com
 */
import java.util.*;
public class MainClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Vector vec=new Vector(); // 저장공간 (배열대신 사용)
        // 배열:고정적 , 컬렉션 : 가변 ==> 순서를 가지고 있다(인덱스번호가 자동으로 조정 : 순차적) => 제어문사용 편리
        /*
         *    0 1 2 3
         *      4
         *    0 4 1 2 3
         *       (X)
         *    0 4 2 3
         */
        // 5명의 이름
        /*vec.add("홍길동");
        vec.add("심청이");
        vec.add("박문수");
        vec.add("춘향이");
        vec.add("이순신"); // 15만개 
        */
        Collections.addAll(vec, "홍길동","심청이","박문수","춘향이","이순신");
        for(Object o:vec)
        {
        	System.out.println(o);
        }
        System.out.println("===============");
        System.out.println("===== 정렬 =====");
        Collections.sort(vec); // 정렬 (ASC)
        for(Object o:vec)
        {
        	System.out.println(o);
        }
        System.out.println("====Vector=>ArrayList변환====");
        ArrayList list=new ArrayList();
        list.addAll(vec);
        for(Object o:list)
        {
        	System.out.println(o);
        }
	}

}







