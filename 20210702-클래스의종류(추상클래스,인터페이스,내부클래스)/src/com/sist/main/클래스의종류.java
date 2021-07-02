package com.sist.main;
/*
 *   ==================== 문법=>형식=>용도
 *   1. 변수 
 *   2. 연산자 , 제어문 
 *   ================
 *   3. 메소드 
 *   4. 클래스의 구성요소 
 *   4-1 멤버변수(전역변수) 
 *       = 따로 저장 (인스턴스 변수) 
 *       = 한개 사용 (정적 변수)      
 *   4-2 메소드 (리턴형 , 매개변수)
 *   4-3 new연산자 , 생성자 (초기화 블록)
 *   5. 객체지향 3대 요소 
 *   5-1 캡슐화 (데이터 보호)
 *   5-1_1 접근 지정어 (private , public , protected , default)
 *   5-2 재사용 (상속,포함)
 *   5-3 유지 보수 (추가 , 수정) => 오버로딩 / 오버라이딩 
 *       메소드 => 제어자 사용여부 (static , abstract , final) 
 *               메소드에 final => 오버라이딩(수정) => 고정 
 *   class : 
 *           = 부품 (Component) ==> 게시판 , 예매 , 목록 , 영화 상세....
 *           = 조립자 (Container) => Spring
 *           => main()
 *   ==============================================================
 *    클래스 : 패키지와 상관없이 모든 클래스에서 사용이 가능하게 만든다 : public
 *   ==============================================================
 *    메소드 : 다른 클래스와 연결하기 위한 목적 : public 
 *   ==============================================================
 *    변수 : 다른 클래스에 직접 사용이 불가능하게 만든다 : private
 *   ==============================================================
 *    생성자 : 다른 클래스에 클래스를 저장해서 사용 => 호출이 가능게 만든다 : public 
 *   ==============================================================
 *   
 *   6. 상속 , 포함 => 클래스의 크기 확인 
 *                   is-a => 상위 클래스 > 하위 클래스 
 *                   has-a => 가지고 있는 클래스 크다 
 *      class A
 *      class B extends A
 *      
 *      ==> A a=new A();
 *          B b=a; ======> 오류 
 *          B b=(B)a =====> 오류 
 *          ===================
 *          A a=new B();
 *          B b=(B)a;
 *      ==> 모든 클래스의 상위 클래스 Object
 *      page 362 
 *      ==> 크기가 정상인지 확인 ==> instanceof (객체 비교) equals (문자열 비교) , == (수치비교)
 *          객체명 instanceof 클래스명 ==> Spring (@Autowired) => 해당 객체 주소를 찾는 경우 주로 사용 
 *          
 *      클래스의 종류 
 *      = 일반클래스 (POJO) => 상속 , 인터페이스 구현이 없는 클래스 
 *        접근지정어 class ClassName
 *        (public,default)
 *        {
 *             ==================
 *              변수선언 위치 
 *                = 인스턴스 변수
 *                = 공유 변수 (static)
 *             ==================
 *              메소드 : 기능처리 (요청처리) ===> 대상 (USER) => 메뉴 (상세보기...)
 *             ==================
 *              생성자 : 메모리할당후 변수에 대한 초기화 (생성자를 사용하지 않는 경우에 컴파일러 디폴트 생성자 생성)
 *             ==================
 *        }
 *      주목적 : 관련된 클래스를 한개로 모아서 관리 (서로 다른 클래스를 연결해서 사용)
 *      ===============================================================================
 *      = *** 추상 클래스 : 미완성 클래스 => 메소드를 구현하지 않고 => 프로그래머가 프로그램에 맞게 구현 사용
 *                    메소드 선언만 한다 (오버라이딩) 
 *        형식)
 *             public abstract class ClassName
 *             {
 *                ===============
 *                 변수 영역
 *                ===============
 *                 메소드 => 구현 => public void display(){}
 *                ===============
 *                 메소드 => 미구현 (선언) => 추상메소드 public abstract void display();
 *                ===============
 *             }
 *             => 단일 상속만 가능 
 *             => 선언만 한 메소드가 존재할 수 있다 
 *             => class => 인스턴스 변수, 인스턴스 메소드 
 *             => 단점 : 미완성된 클래스 => 메모리 할당을 할 수 없다 (new를 사용 할 수 없다)
 *                      메모리 할당을 하기 위해서는 반드시 구현된 하위클래스를 이용해서 메모리 할당을 한다 
 *                      class A
 *                      class B extends A
 *                      A a=new B()
 *                      ===========
 *      = *** 인터페이스 : 추상클래스의 일종 (추상 클래스보다 추상적) => 공통점 => 팩토리 패턴 
 *              => 웹 , 모바일 
 *                 음악 => 지니뮤직 , 멜론 .... 
 *                 영화 => CGV , 롯데시네마 , 메가박스 
 *                 쇼핑몰 => 
 *                 책 => 
 *                 은행 => 
 *                  예)
 *                        마우스클릭 , 마우스를 누르고 있는 상태 , 마우스UP  ==> 설계
 *                        요구사항 => 기능 확인 
 *                  형식) public interface Interface명
 *                       {
 *                            ====================
 *                             변수 : 인스턴스변수가 아니다 , 상수형 변수 
 *                             public static final int A=10;
 *                             => (public static final) int B=10; // 값을 지정한다 
 *                            ====================
 *                             메소드는 무조건 선언만 가능 
 *                             public abstract void disp();
 *                             ===============
 *                               생략 =============================> 
 *                               접근지정어는 변수,메소드 : public만 사용 가능
 *                            ====================
 *                             JDK1.8 구현이 가능한 메소드 : default 
 *                             public default void display(){}
 *                            ====================
 *                             public static void aaa(){}
 *                            ====================
 *                       }
 *                       
 *                 ==> 미완성 ==> 상속을 받아서 구현 처리 
 *                     추상클래스 
 *                       public abstract class A
 *                       public class B extends A
 *                       {
 *                          구현이 안된 메소드를 반드시 구현해서 사용 
 *                       }
 *                     인터페이스 
 *                       public interface A
 *                       public class B implements A
 *                                      ==========
 *                     => 장점 : 다중 구현이 가능 
 *                       public interface A
 *                       public interface B
 *                       public class C implements A,B
 *                       
 *                     => interface ===== interface 
 *                                 extends 
 *                        interface ===== class
 *                                 implements
 *                        class   ===== interface (존재하지 않는다)
 *                           
 *      ================================================================================
 *      = 내부 클래스 : 다른 클래스에서 변수,메소드의 접근이 쉽게 만들어 주는 역할 
 *        = 멤버클래스 => 쓰레드 , 네트워크 ,윈도우
 *          class A
 *          {
 *             class B
 *             {
 *             }
 *          }
 *        = 익명의 클래스 => 상속이 없는 상태에서 오버라이딩 , 오버로딩 (새로운 기능을 추가)
 *          class A
 *          {
 *              public void display(){}
 *          }
 *          class B
 *          {
 *              A a=new A() => 오버라이딩 
 *              {
 *                 public void display(){}
 *                 public void aaa(){} // 메소드 추가도 가능 
 *              }
 *          }
 *        = 지역 클래스 => 사용빈도가 거의 없다 (메소드안에서 클래스 선언)
 *          class A
 *          {
 *              public void display()
 *              {
 *                  class B
 *                  {
 *                  }
 *              }
 *          }
 *      = 종단 클래스 : 상속할 수 없는 클래스 => java.lang => String , StringBuffer , Math , Scanner...
 *        public final class A
 *        {
 *        }
 *        
 */
public class 클래스의종류 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="";
        StringBuffer sb=new StringBuffer();
        Object obj=new Object();
        /*
         *   class Object ===> 동물
         *   class String extends Object 사람
         *   class StringBuffer extends Object 말
         */
        if(s instanceof Object) // Object>=String
        	System.out.println("true");
        else
        	System.out.println("false");
        
        if(obj instanceof String)  // Object <= String
        	System.out.println("true");
        else
        	System.out.println("false");
        
        if(sb instanceof StringBuffer) // StringBuffer<=StringBuffer
        	System.out.println("true");
        else
        	System.out.println("false");
        
        //if(s instanceof StringBuffer) // 비교할 수 없는 대상을 비교해서 오류  "aaa" == 10
        	  //System.out.println("true");
	}

}











