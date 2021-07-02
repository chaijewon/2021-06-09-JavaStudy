/*
 *   재사용 
 *     상속 : 기존의 기능을 변경해서 사용 
 *     포함 : 기존의 기능을 변경하지 않고 사용 
 *     
 *     1) 상속 extends 
 *     2) 상속 => 소스코딩이 그대로 내려온다 (메모리 저장)
 *     3) 단일 상속 
 *     4) 사용자 정의 클래스 => 라이브러리 상속 
 *                          ============ 기능 변경 (오버라이딩)
 *                          
 *     5) 크기 (상속,포함만 클래스의 크기 비교) 
 *     class A
 *     class B ==> 비교할 수 없다 
 *     
 *     class A extends B     => B>A
 *     class A               => A>B
 *     {
 *         B b=new B();
 *     }
 *     =====================================================
 *     재사용 : 코딩을 하지 않고 사용 (CV => 코딩)
 *     
 *     => 클래스의 모든 멤버변수는 => 데이터 보호 : private 
 *     => 생성자 : 모든 클래스에서 사용이 가능 : public 
 *     => 모든 메소드는 public (다른 통신하는 도구)
 *     => private < default < protected < public 
 *                  ===================(특별한 경우외는 사용빈도가 낮다)
 *        변수는 private => 메소드는 public ==> 캡슐화 (getter/setter)
 *     =========================================================== 웹
 *     클래스 : 여러개의 서로다른 데이터형 한번에 묶어서 관리 
 *     ==> 전송 
 *         자바 =======> 브라우저 
 *             
 */
class A
{
	public A() {
		// TODO Auto-generated constructor stub
	}
	public void display()
	{
		System.out.println("A:display() Call....");
	}
}
class B extends A
{
	public void display()
	{
		System.out.println("B:display() Call....");
	}
}
class C 
{
	A a=new A();
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        B b=new B();
        b.display();
        C c=new C();
        c.a.display();
	}

}
