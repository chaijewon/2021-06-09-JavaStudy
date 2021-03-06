/*
 *    class 구성요소 
 *    =============
 *    1. 변수 (데이터 저장) => 출력할 데이터
 *       = 따로 저장 (new 갯수만큼 생성) = 인스턴스
 *       = 공통 사용(메모리 공간 1개)    = 클래스(공통변수)
 *    2. 메소드 (기능) => 사용자의 행위 (마우스 클릭 , 버튼 클릭 , 메뉴선택... , 엔터..)
 *    3. 생성자 : 변수의 초기값을 담당 , 초기화 블록 
 *    => page 291 
 *    1) 변수 => 초기값을 저장하고 => 변경을 해서 사용 
 *       int a=10;
 *       String name="홍길동"; // 명시적 초기화 
 *       ==> 파일에서 읽거나 , 웹에서 읽어서 초기화 , 연결(서버) .... {구현}
 *       class A
 *       {
 *           선언,선언 동시에 입력 (연산처리 , 제어문 , 파일읽기 ... 구현 (사용 할 수 없다)
 *           구현 {}
 *           => {
 *                 초기화 블록 => XML을 읽는다 (셋팅) => 스프링(XML),마이바티스(XML)
 *                 코틀린 <========> 스프링(자바)
 *                       XML,JSON
 *              }
 *           
 *           => 메소드() // 선언 
 *              {
 *                  구현 
 *              }
 *           
 *           => 생성자()
 *              {
 *                  구현후 => 초기화  ==> 메소드 호출 , 연산처리 , 제어문 ...
 *              }
 *           
 *       }
 *       
 *       구성 요소 
 *       class ClassName
 *       {
 *           ============
 *             변수 
 *           ============
 *             메소드
 *           ============
 *             생성자 => 존재하지 않는 경우도 있다 : 자동 추가 (컴파일러가 자동으로 추가)
 *           ============
 *       }
 *       class ClassName
 *       {
 *           ============
 *             생성자 
 *           ============
 *             메소드
 *           ============
 *             변수
 *           ============
 *       }
 *       
 *       생성자 
 *        = 특징
 *          1) 클래스명과 동일하다 
 *          2) 리턴형이 없다 => 리턴형을 사용하면 일반 메소드가 된다 
 *             class A
 *             {
 *                A()
 *                {
 *                }
 *                ========== 생성자
 *                void A()
 *                {
 *                }
 *                ========== 인스턴스 메소드 
 *             }
 *        = 사용목적 : 인스턴스변수의 초기화 (초기값을 저장)
 *                   초기값을 메모리에 설정 =====> 객체를 생성시에 반드시 호출되는 메소드 
 *                   호출시에는 new 생성자()
 *                           ===========
 *        = 오버로딩 : 같은 이름의 메소드로 여러개의 기능을 만든다 
 *                   생성자가 오버로딩을 지원한다 (단점: 상속의 예외 조건=> 생성자,static) 
 *                   예)
 *                      class A
 *                      {
 *                         A(){} =============> default 생성자 (매개변수가 없는 생성자)
 *                                          => 컴파일러가 자동으로 생성 (디폴트 생성자)
 *                         A(int a){}
 *                         A(String s){}
 *                         A(String s, int a){}
 *                      }
 *                      *** 생성자 1개라도 존재하면 컴파일러는 자동 생성하지 않는다 
 *                      
 *        자바 자체에서 생성
 *        1) import java.lang.* => String , Math , System...
 *        2) extends Object => 자바의 모든 클래스는 Object상속 
 *           ======= 상속 
 *        3) void 메소드일때 맨 마지막에 return이 없는 경우에 자동 추가 
 *           void display()
 *           {
 *              => 생략이 된 경우 return을 추가 
 *           }
 *        4) class 설계시 ==> 생성자가 없는 경우에 
 *           => 자동 추가 (디폴트 생성자만 추가) : 매개변수가 없는 생성자 
 *        5) 자바의 모든 클래스는 예외처리를 가지고 있다 (실행시(생략) , 컴파일시)
 *          
 */
class Music
{
	/*
	 *   Music()
	 *   {
	 *   }
	 */
}
class Movie
{
	// Movie(){} (X)
	Movie(int mno) {
		System.out.println("mno="+mno);
	}
	Movie(int mno,String title)
	{
		System.out.println("mno="+mno+",title="+title);
	}
	Movie(double d1,double d2,double d3)
	{
		System.out.println("d1="+d1+",d2="+d2+",d3="+d3);
	}
	/*
	 *     자바 
	 *       변수 => 연산자 => 제어문
	 *              =============
	 *               메소드
	 *       ====================
	 *           클래스 => ( 재사용 , 데이터 보호 , 유지보수 ) => 객체지향의 3대 요소
	 *                    =======  =========  =======
	 *                     상속,포함  캡슐화      다형성(추가:오버로딩,수정:오버라이딩)
	 *       ===============================================================
	 *       1. 종료하지 않는 프로그램 (정상 수행이 가능 프로그램) : 예외처리 (Exception)
	 *          = 예외복구 try~catch
	 *          = 예외회피 throws
	 *       2. 조립법 (사용자 정의 클래스 + 라이브러리)
	 *       3. 최종 
	 *          = 네트워크 : 온라인 게임 
	 *          = 데이터베이스 : 웹 (*******)
	 */
	Movie(char c,int a,double d) // 웹 , 데이터베이스 , 네트워크 ... 쓰레드 
	{
		
		System.out.println("호출");
	}
	// 오버로딩 => 해당 데이터형을 찾는다 
	// char , int , double ==> 존재하지 않는 경우 ==> char,int보다 큰데이터형을 찾는다
	/*
	 *   void dipaly(long l)  => long 1='A' => 65
	 *                           long 1=10;
	 *                           long l=10L
	 *   
	 *   => display('A')
	 *   => display(10)
	 *   => display(10L)
	 *   
	 *   double d=(byte,short,int,char,long,float,double)
	 */
}
public class 생성자 {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Movie m=new Movie(10);// 오류 발생 
        Music mm=new Music();
        Movie m1=new Movie(30,"홍길동전");
        Movie m2=new Movie('A',10,10.5);
	}

}








