package com.sist.lang;
/*
 *    java.lang
 *    ==========
 *      Object(최상위 클래스)
 *        =  toString() : 객체를 문자열 변환  => (String)
 *           String toString()
 *        =  finalize() : 소멸자 함수 
 *           GC대상 (메모리 해제)
 *           => 객체가 null
 *           A a=new A();
 *           a=null;
 *           => 객체를 더이상 사용하지 않는 경우
 *        =  clone() : 복제 => 있는 그대로(변수값) => 다른 메모리에 COPY => 아바타 
 *           참조 : 같은 주소를 제어 (별칭)
 *           A a=new A();
 *           A b=a;
 *           new 
 *           class A
 *           {
 *              int aa=10;
 *              int bb=20;
 *           }
 *           A a=new A(); // a공간 => aa=100 , bb=200
 *             a.aa=100;
 *             a.bb=200;
 *           A b=new A(); ==> 초기화 (클래스로 등록한 내용이 초기화)
 *                        // b공간 => aa=10 , bb=20
 *           clone()
 *           A a=new A(); // a공간 => aa=100 , bb=200
 *             a.aa=100;
 *             a.bb=200;
 *           A b=a.clone() ==> 초기화 (클래스로 등록한 내용이 초기화)
 *                        // b공간 => aa=100 , bb=200
 *        = getClass() => 결합성이 낮은 프로그램 (한개의 클래스에서 수정 => 다른 클래스에 영향이 있으면)
 *          ========== 클래스의 정보를 가지고 와서 처리 
 *        = 객체 비교 : equals
 *        = 사용자 정의,라이브러리 클래스 => Object상속 (설정된 모든 메소드를 사용할 수 있다 => 경우에 따라 오버라이딩 가능)
 *        
 *      String(문자열 관리) : 확장할 수 없는 클래스 (상속할 수 없다) => public final class String
 *          => char[]을 제어하는 프로그램 
 *          => 문자열의 위치는 0번부터 시작 
 *          => 클래스=>Call By reference => String 제외 (이번 기본형처럼 사용)
 *          => ""(문자열) => 문자열 자체가 주소
 *             String s="Hello"
 *             String s1="Hello" => 같은 주소를 가지고 있다 s==s1
 *          => 주요메소드 
 *          1. 변환
 *             replace => 단어 / 문자 변경 
 *              String s="Hello Java";
 *              s.replace('a','b') ==> Hello Jbvb
 *              s.replace("Java","Kotlin") ==> Hello Kotlin
 *             replaceAll => 데이터 수집 (HTML포함 => 제거)
 *              String s="123Hello";
 *              s.replaceAll("[0-9]",""); => Hello
 *              s.replaceAll("[^0-9]","") (^ ==> !) 123
 *                => 정규식
 *                [0-9] => 범위
 *                {1,3} => 갯수  
 *                211.238.142.181 , 127.0.0.1 , 90.89.181.1
 *                [0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3} => 문자패턴 
 *                "/watch?v=[^가-힣]+"
 *             toUpperCase : 대문자 변환
 *             toLowerCase : 소문자 변환 
 *          2. 문자열 결합 
 *             +  
 *             concat 
 *             String s="Hello"
 *             String s1=" Java"
 *             s.concat(s1)  ===> Hello Java  ==> +
 *             s+s1=> Hello Java
 *             
 *          3. 문자 찾기 
 *             indexOf() => -1이면 없다 => 앞에서부터 찾는다 
 *             lastIndexOf() => 뒤에서부터 찾는다 
 *             => 오버로딩 
 *             indexOf(int) , indexOf(String) , indexOf(int,int)
 *             String s="http://www.daum.net/main/main.jsp"
 *                                         ===
 *             s.indexOf('/',8) => 위치찾기 
 *             
 *             contains() => 포함  ===> LIKE %'단어'%   ==> .*단어.*
 *             startsWith() => 시작문자열 => LIKE '단어'% ==> ^단어
 *             endsWith() => 끝나는 문자열 => LIKE %'단어' ==> 단어$
 *             matches(String regex) => 정규식으로 찾는 방법
 *             
 *          4. 기타 
 *             trim() : 공백문자 제거 (좌우)
 *             valueOf() : 모든 데이터형을 문자열로 변환 
 *             length() : 문자 갯수 
 *      StringBuffer/StringBuilder
 *        => 많은 문자열을 읽어 올때 주로 사용 
 *        => append() 문자열 결합  *** Buffer(임시 기억장소)
 *        => reverse() : 문자를 꺼꾸로 뒤집는 메소드 
 *      Math 
 *        => ceil() : 올림 => 총페이지 구하기 (오라클 : 인라뷰) : double
 *        => random() : 임의로 추출 => 0.0~0.99 : double 
 *        
 *      Wrapper : 기본 데이터형을 클래스화 시킨 것 : 제어하기 쉽게 만들어 준다 
 *         변환 ==> 문자열을 해당 데이터형으로 변경
 *         ***int = Integer
 *            = 2진법
 *            = 8진법
 *            = 10진법
 *            = 16진법 
 *            = 문자열 => 정수로 변환 => parseInt() => static => Integer.parseInt("10") => 10
 *         long = Long 
 *         ***double = Double
 *         float = Float
 *         ***byte = Byte ======> 코드 
 *         https://www.google.com/search?q=%EC%9E%90%EB%B0%94&rlz=1C1CHBD_koKR933KR933&oq=%EC%9E%90%EB%B0%94&aqs=chrome..69i57j69i59j35i39l2j0i433l2j0i131i433j0i433j0l2.1334j0j15&sourceid=chrome&ie=UTF-8
 *         자바=%EC%9E%90%EB%B0%94 인코딩 => 디코딩 
 *         char = Charecter
 *         short = Short
 *         ***boolean = Boolean
 *         오토박싱 / 언박싱 
 *         
 *         int a=10;
 *         Integer i=a; Integer i=10 Boolean b=true
 *         int b=i
 *         int b=i
 *         ==> int나 Integer가 동일하게 사용이 된다 
 *         
 *      System 
 *         println() , printf() ,  print() , gc() , System.currentTimeMillis():시간(long)
 *                                                  ===========================
 *      ==========================                    log파일 
 *    java.util
 *    =========
 *      Date , Calendar
 *      List , Set  , Map => Web,Spring => 제네릭스 (데이터형을 통일화) <String>
 *      StringTokenizer 
 *    java.io
 *    =========
 *      File , FileReader , FileInputStream , FileWriter , FileOutputStream => 자료실(업로드,다운로드)
 *      추천 
 *    java.net 
 *    =========
 *      URL , URLEncoder  (Socket,Thread:일반웹(X) ==> Kotlin)
 *    
 *    Stream(),람다 
 *    ============
 *    
 *    *****
 *    java.sql
 *    ========
 *     Connection , Statement , ResultSet
 *     
 *    ==========================================> 외부라이브러리 (lombok,simple-json,javax.xml.bind)
 *           Spring / Mybatis(DB 연동) 
 *    ==========================================> 
 *           지능형 웹  ==> 정규식 (java.lang.reflect) Pattern/Matcher => 데이터 분석 
 *                        형태소 분석 ==> 코모란,꼬꼬마 (자바 라이브러리)
 *                        ===================================================== 챗봇 , 유사 관련 검색어
 *                         연관 분석 
 *                         =======
 */
public class MainClass1 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
        /*String data="SSG 베테랑 우완 김상수는 5일 인천 롯데전서 3이닝 동안 3피안타(1피홈런) "
        		+ "1탈삼진 2볼넷 1실점으로 잘 던졌다. 7-3으로 앞선 5회초 시작과 함께 마운드에 올랐다. "
        		+ "타이트한 상황은 아니었다. 사실 치아 부상에서 돌아온 뒤 페이스가 안정적이지 않았다. "
        		+ "결정적 순간에 치명적 한 방을 맞기도 했다. 또한, 최근 신인 장지훈과 좌완 김태형의 페이스가 "
        		+ "상당히 좋다.";
        // matches=> 정규식 => 이메일 , IP , 전화번호 ...
        if(data.matches(".*김상수.*"))
        {
        	System.out.println("포함되어 있습니다");
        }
        else
        {
        	System.out.println("미포함입니다");
        }*/
        
        // 영어문자 포함 data.matches(".*[a-zA-Z].*")
        // 숫자 포함 data.matches(".*[0-9].*")
        // 한글 포함 data.matches(".*[가-힣].*")  => 정규식 
		String data="ABCDEFGHIJKLMN";
		for(int i=0;i<data.length();i++)
		{
			System.out.print(data.charAt(i));
		}
		System.out.println();
		for(int i=data.length()-1;i>=0;i--)
		{
			System.out.print(data.charAt(i));
		}
		System.out.println();
		StringBuffer sb=new StringBuffer(data); // 그림도 가능
		System.out.println(sb.toString());
		String s=sb.reverse().toString();
		System.out.println(s);
	}

}








