package com.sist.string;
/*
 *   모든 클래스는 Object로부터 상속을 받는다 
 *   =========
 *     객체와 객체를 비교 : equals
 *     새로운 메모리 (메모리 복제) : clone
 *     객체를 문자열 변환 : toString
 *     클래스의 정보를 읽어 온다 : getClass
 *     메모리 해제 여부 확인 : finalize()
 *        Object
 *          |
 *    ------------------- java.lang
 *     String , StringBuffer , StringBuilder 
 *     System, Wrapper , Math
 *    ------------------- java.util
 *     Date , Calendar , StringTokenizer , Scanner , Random
 *     ArrayList , Vector , LinkedList , HashSet , HashMap
 *    ------------------- java.io
 *    ------------------- java.net
 *    ------------------- Web (JSON,XML,CSV)
 *                            ===== Spring => Kotlin,Python,Java,JavaScript
 *                            {"name":"홍길동","":""} => Map
 *    String :  문자열 제어 (464page) => 원형) public final class String:상속을 내릴 수 없는 클래스 
 *    ====== 있는 그대로 사용 (확장할 수 없는 클래스)
 *    ***** 문자열 "" => 자체가 주소값이다 
 *          => char[]에 제어하는 프로그램  
 *          String s="Hello"; => char[] s={'H','e','l','l','o'} => char* s="Hello"
 *          => 문자열 저장 방법 
 *             String s="Hello"; 주로 사용 
 *             String s=new String("Hello"); // new를 사용하면 메모리 공간을 새롭게 만든다 
 *            문자열은 주소를 비교하지 않고 저장된 문자열 비교
 *            =======================      ========= equals
 *               ==(X) 
 *    ***** 문자열이 가지고 있는 기능 (메소드) 
 *    1) 비교 (문자열과 문자열 비교)
 *       equals => 대소문자 구분 (아이디,비밀번호) ==> 오라클은 대소문구분이 없다
 *                             select selECT SELECT Select.... (오라클에서 대소문자 구분=저장된 데이터)
 *       equalsIgnoreCase => 대소문자 구분 없이 비교 (사람의 영문이름)
 *       compare() => 정렬 (크기 비교) 0(같다)  음수 / 양수  =========> 오라클 (Order BY name DESC|ASC)
 *                                  "ABC" "ABC"  "AB" "CD"
 *                                  ===========   A-C => -2
 *                                  A-A=0
 *                                  B-B=0
 *                                  C-C=0
 *    2) 찾기 
 *       =============================
 *       indexOf
 *       lastIndexOf ==> 문자위치 (번호)
 *       ============================= MVC (url주소)
 *       contains : 포함여부 
 *       ============================= 분석 => 자음만으로 찾기
 *       startsWith:시작문자열
 *       endWidth:끝문자열
 *       ============================= 검색
 *    3) 문자열 분해 
 *       split => String[]
 *       substring() : 
 *       ============================= 문자열 분해 
 *       
 *    4) 기타 
 *       replace : 한글자 
 *       replaceAll => 변환(정규식)
 *       ========================================
 *         [0-9] : 숫자 전체
 *         [A-Z] : 대문자
 *         [a-z] : 소문자
 *         [A-Za-z] : 대소문자
 *         [가-힣] : 한글전체
 *         + 한글자 이상
 *         * 0글자 이상
 *         | 둘중에 한개 선택
 *         ? 
 *         ^ 시작 , 제외   ^A  ^영화  [^가-힣]
 *         $ 끝문자  A$
 *       ========================================= AI (30%) 챗봇 + 형태소분석
 *         regexp_like()
 *         
 *         ==> 문자에 대한 패턴 
 *       trim() : 공백 제거 ===> 사용자 입력 (space)          문자열
 *       valueOf : 모든 데이터형을 문자열로 변경 ========> 자바=========>웹(문자열)
 *                                                   웹 =========> 자바
 *                                                       true  (String)
 *                                                    String s="true";
 *                                                    boolean b=(boolean)s; (X)
 *                                                    Boolean.parseBoolean(s) ==> wrapper
 *       length() : 문자열 길이 => 화면 UI     ...
 *       
 *    5) 문자열 결합 
 *       +
 *       concat()  ... => 문자열 결합 (+) "Hello"+"Java"="HelloJava" => 7+"7"="77"
 *       
 *    ===========================================
 *    
 *    ******* 문자열은 번호가 0부터 시작 (오라클은 1번부터 시작)
 *    "Hello Java"
 *     0123456789  ==>  char[]={'H','e'.....}
 *    ******* String에서 지원하는 모든 메소드는 인스턴스 메소드다 (제외 : static => valueOf())
 *            String.valueOf()
 *             
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // equals : 문자열 비교 
		String s1="Hello";
		String s2="Hello";
		//   s1과 s2은 주소값이 동일 하다 => 문자열 자체가 주소를 가지고 있다 
		String s3=new String("hello"); // Hello주소 아닌 새로운 주소에 저장한다 
		
		if(s1==s2)
			System.out.println("s1과 s2는 동일한 주소를 가지고 있다");
		else
			System.out.println("s1과 s2는 다른 주소를 가지고 있다");
		
		// == 실제값 (기본데이터형,주소값 비교)
		if(s1==s3)
			System.out.println("s1과 s3는 동일한 주소를 가지고 있다");
		else
			System.out.println("s1과 s3는 다른 주소를 가지고 있다");
		
		// 실제 메모리에 저장되어 있는 문자열 비교 => equals
		// public boolean equals(String s)
		// 대소문자 구분:equals / 대소문자 구분 없이 :equalsIgnoreCase
		// 검색어 : equalsIgnoreCase
		// 비밀번호 : equals
		if(s1.equalsIgnoreCase(s3)) // 저장된 문자열 자체를 비교
		{
			System.out.println("s1에 저장된 데이터와 s3에 저장된 데이터가 같다");
		}
		else 
		{
			System.out.println("s1에 저장된 데이터와 s3에 저장된 데이터가 다르다");
		}
	}

}












