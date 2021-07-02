/*
 *  310page 
 *   => 클래스종류 , 예외처리 => 라이브러리 => 응용
 *   => 상속 (소스 간결하다,코드를 변경 , 관리가 편리, 코드을 중복을 제거) 
 *           ==========                       ==============
 *   => 단점 (가독성(X),최적화(X)) 
 *   class A
 *   class B exends A  ==> 1) A를 메모리 할당 2) B를 메모리 할당  
 *                         3)여러개의 상속을 받는 경우 소스가 복잡할 수 도 있다  
 *                         4) 다른 클래스의 영향을 많이 미친다
 *                         ============스프링 (1.xx) => 2.5=> POJO(일반 클래스=> 독립적)
 *                         ==> 상속 대처 : 포함 클래스 , 익명 클래스(상속없이 재정의)
 */
class Parent
{
	String name;
	int age;
	public void display()
	{
		System.out.println("Parent:display() Call...");
	}
}
/*
 *   상속이 안되는 내용 
 *     1) 생성자 , 초기화 블록은 상속에서 예외 조건 
 *     2) 메모리 크기는 상속받은 클래스가 많다 , 실제 클래스 상속 내린 클래스가 크다 
 *     
 *        동물 (동물)
 *         |
 *        인간 (인간 ,동물) 
 *     3) static은 상속을 내리것이 아니고 사용이 가능하게 만든어 준다 
 *     4) private은 상속은 내리지만 접근이 불가능 
 *        => 생성자 , 초기화블록 , static , private 상속 예외
 *        
 *     5) 상속이 있는 경우 위로 올라 갈 수록 크키가 커진다 
 *     6) 자바의 모든 클래스는 Object로부터 상속을 받는다 
 *                        ========
 *                          최상위 클래스 
 *     7) 자바는 단일상속이다 
 *        class A
 *        class B 
 *        class C extends A,B (X)   class C:A,B(C언어,파이썬)
 *     ============================ 다중상속   
 *        class A
 *        class B extends A
 *        class C extends B
 */
class Child extends Parent
{
	/*
	 *   String name;
	      int age;
	      기존의 기능을 확장해서 => 필요시 변경 , 다른 기능 추가가 가능하다
	      public void display()
	      {
		    System.out.println("Parent:display() Call...");
	      } 
	 */
	
	// 기능 변경 => 오버라이딩(재정의)
	public void display()
	{
		System.out.println("Child:display() Call...");
	}
}
public class MainClass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Parent p=new Parent();
        p.name="";
        p.age=10;
        p.display();
        Child c=new Child();
        c.name="";
        c.age=20;
        c.display();
	}

}
