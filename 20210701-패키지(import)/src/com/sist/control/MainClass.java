package com.sist.control;
/*
 *   page 344
 *   
 *   제어자 
 *    1. 접근 제어자 : public , protected , default , private
 *       public => 패키지와 관련이 없이 모든 클래스에 접근이 가능 
 *                 public선언 : 생성자(클래스를 읽어 올때 메모리에 저장을 한다=> new 생성자())
 *                             => public 클래스명()
 *                             메소드는 다른 클래스와 통신을 할때 사용
 *                             => public 리턴형 메소드명(매개변수...) 
 *                             클래스 
 *                             => public class 클래스명 
 *      protected => 패키지안에서 접근이 가능 + 상속받은 클래스(다른 패키지) => 거의 사용빈도가 없다 
 *      default => 같은 패키지안에서 
 *      private => 클래스내에서 (자신의 클래스) : 변수 => 은닉화  
 *                                          === 읽기메소드/쓰기메소드 첨부 ==> 캡슐화
 *                                              ================
 *                                              getter/setter 
 *   2. 기타제어자 
 *      static / abstract / final 
 *      static => 공통으로 사용되는 (공통=> 메모리 공간을 1개만 생성) 
 *                변수 => 클래스 영역에서만 가능 (변수, 메소드)
 *                class A
 *                {
 *                    static int a;
 *                    public void display()
 *                    {
 *                       static int b; ==> 오류 (지역변수는 static을 사용 할 수 없다)
 *                    }
 *                }
 *      ====== 변수 , 메소드 , 클래스 (내부클래스)
 *      final : 마지막 (변수에서만 주로 사용)
 *              변수 : 멤버변수,지역변수가 가능하다 
 *              변수 , 메소드, 클래스 
 *              ===
 *               상수  final int 변수명=값 => 오라클 주소 , 오라클 port(1521)
 *                    final 리턴형 메소드명(){} => 수정할 수 없는 메소드 (오버라이딩) ==> 사용빈도 없다 
 *                    => 목적 (재사용=변경, 추가)
 *                    final class A ==> 종단 클래스 : 상속을 할 수 없다 (있는 그대로 사용)
 *      ===================================================================================
 *      클래스  => public , default (private,protected는 사용이 불가능)
 *      메소드  => public protected,default,private 
 *               주로 사용은 (다른 클래스 연결할 때 사용) => public 
 *      멤버변수 => public protected,default,private 
 *               주로 사용은 (데이터를 보호 => 은닉화) => private
 *      지역변수 => 없다  => final
 *      캡슐화 => 외부로부터 데이터 보호 
 *              => 데이터가 손상 (데이터 은닉화 => 필요한 경우는 메소드를 이용해서 사용이 가능)
 *                             ===========   ==================================
 *                             private           메모리 저장 / 메모리 읽기
 *                                               setXxx()     getXxx() ==> getter/setter
 *      
 */
class A
{
	
}
public class MainClass {
    /*public static int a=10;
    static public int b=20;
    public final int c=30;
    final public int d=40;*/
	static public void main(String[] args) {
		// TODO Auto-generated method stub

	}

}





