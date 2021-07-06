package com.sist.lang;
/*
 *  웹 => 자바기본 , 오라클 , HTML/CSS , JavaScript => Web SITE
 *       오라클 : 공유된 데이터를 저장하는 곳(영구적) => 라이브러리 (마이바티스)
 *       자바 : 오라클 연결해서 데이터를 가지고 온 후에 => 브라우저로 전송 
 *       HTML/CSS => 브라우저에 출력 
 *       JavaScript => 실시간 전송(AJAX) => 댓글 ,날씨... 브라우저에서 이벤트처리(버튼,메뉴...)
 *       ===========================================================================
 *       
 *       1. 자바(기초) 
 *          변수,연산자,제어문,메소드(기능:사용자요청=> 로그인,회원가입,예매...)
 *          데이터 전송 : 데이터를 묶어서 한번에 전송 => 캡슐화 (private변수+public 메소드)
 *          데이터 읽기(오라클) ==> 예외처리(컴파일예외) => 오라클 연결 프로그램 
 *          클래스 여러개 => 배열 (X) , 컬렉션(라이브러리 => java.util)
 *          ==================================================================== 1차 완료(Ajax,Jquery)
 *       2. 자바(중급) => XML , 어노테이션 , 스프링 구조 
 *       3. 자바(고급) => 데이터 분석 , 통계 (기능형 웹=>정규식,코모란,꼬꼬마(형태소분석)
 *       ======================================================================= 2차 완료(Vue.js,React)
 *       4. 코틀린 (언어) => 안드로이드 전용 (모바일) ==> 개인 프로젝트 
 *       
 *   조립식 : 사용자 정의 클래스 + 자바에서 지원하는 라이브러리
 *          ======================================= 한개의 기능을 제작 
 *          자바에서 지원하는 라이브러리 
 *          java.lang , java.util , java.io , java.net , javax.xml , javax.servlet=>JSP
 *          기타 => 외부라이브러리 (스프링,마이바티스,Jsoup,simple-json....:mvnrepository.com)
 *          java.lang => 자바에서 기본 패키지 : import를 생략 할 수 있다 
 *          ==========
 *          1.Object : 최상위 클래스 => 모든 자바 클래스는 Object상속을 받는다 (사용자 정의,라이브러리..)
 *          ======= 클래스 = 데이터형 (Object는 모든 데이터형을 받을 수 있다)
 *          Object o=1; Object o=10.5; Object o='A'; Object o="Hello"; Object o=true....
 *          2.문자열 관련 : String , StringBuffer , StringBuilder
 *          3.수학 : Math
 *          4.입출력 : System => 화면 출력 , 입력값 받기 , GC(메모리 해제) 
 *          5.Wrapper 클래스 
 *            기본데이터형을 쉽게 제어가 가능하게 만든 클래스 
 *            =========
 *            정수형(int,long,byte,short), 실수형(float,double),논리형(boolean)
 *            => ***int ====> Integer 
 *                웹 => "10" => 자바에서 받기  => int page=(int)"10" => 오류 
 *                                            int page=Integer.parseInt("10");
 *               ***long ===> Long
 *               byte ===> Byte
 *               short ==> Short
 *               float ==> Float
 *               ***double ==> Double
 *               ***boolean ==> Boolean
 *          ==================================================================
 *          java.util 
 *            = Date , Calendar:날짜 관련 
 *            = 문자열 분해 : StringTokeniger 
 *            = 랜덤 : Random
 *            = 배열 대신 사용 : 컬렉션 => ArrayList,Vector,Map, HashSet,Queue,Stack,LinkedList
 *                            ====== 자료구조 
 *         java.io : 입출력 => File , FileReader ,FileWriter,FileInputStream,FileOutputStream 
 *         java.net : 네트워크 => URL , Socket , URLEncoder(한글변환) 
 *         
 *         라이브러리는 공부하는 방식 
 *         1) 클래스 
 *             = 메소드(기능)
 *               ==========
 *               리턴형 , 메소드명 , 매개변수 => 용도
 *               ==============================
 *               
 *         java.lang 
 *         =========
 *         Object 제공 기능 : 450page 
 *           = finalize() : 소멸자함수 => 호출이 되면 메모리에서 객체가 해제 
 *             원형) protected void finalize()
 *           = clone()    : 복제 (객체) => 스프링 (prototype) => 참조/복제
 *                          참조(같은 메모리 주소) , 복제(새로운 메모리 제작) , new 
 *             원형) protected Object clone() 
 *                  => 다른 패키지에서 사용 : 상속 , 재정의(오버라이딩) => 접그지정어를 확장해서 사용이 가능
 *                     ========= 사용이 가능 (모든 Object 상속)
 *                  => 서로 다른 클래스를 한개로 묶어서 사용 => Object[]
 *                     =============================
 *             class A
 *             class B
 *             class C 
 *             class D 
 *             ======== 묶어서 사용이 불가능 (인터페이스 , Object)
 *             Object[] cls={new A(),new B(),new C() , new D()} , Object[] o={10,'A',10.5,"Java"}
 *             ===> Object상위 클래스이기 때문에 => 사용시마다 형변환 
 *             interface I
 *             class A implements I
 *             class B implements I
 *             class C implements I
 *             class D implements I
 *             
 *             I i=new A() , i=new B() , i=new C() , i=new D() => 인터페이스 
 *             => 인터페이스 : 서로 다른 클래스를 여러개 묶어서 관리 ==> 웹(요청받아서 응답하는 프로그램)
 *           = toString() : 객체 출력 => 주소값을 출력 (생략)
 *                          A a=new A();
 *                          System.out.println("a="+a) => A@주소
 *                                            =========
 *                                             a.toString() 
 *           = equals() : 객체 비교 => 가지고 있는 값을 비교
 *       
 *       
 */
class Sawon
{
	public Sawon()
	{
		System.out.println("Sawon 객체 생성...");
	}
	public void display()
	{
		System.out.println("Sawon:display() Call...");
	}
    // Sawon객체가 메모리에서 사라질때 자동 호출되는 메소드(소멸자함수) => A() , ~A()
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Sawon클래스 메모리 해제!!");//소멸자 => 호출되면 해제, 호출이 안되면 메모리에 저장중
	}
	
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //1. 객체 생성 
		Sawon s=new Sawon();
		
		//2. 객체가 가지고 있는 기능 활용 (메소드 호출) 
		s.display();
		//3. 객체 해제 ==> gc() => 해제하는 시간이 늦다 (프로그램 종료시 해제) => 멀티미디어 
		s=null; // 객체가 null값이거나 사용하지 않으면 => GC()가 자동 해제를 한다 
		// 메모리에서 자동 해제 => Stack(지역변수,매개변수) , 프로그래머 관리 영역 => heap(객체,배열) => 가비지컬렉션
		System.gc(); // null인 객체를 가지고 가라
	}

}









