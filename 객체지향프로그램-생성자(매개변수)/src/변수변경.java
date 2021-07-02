/*
 *   1. 생성자  (this():거의 사용빈도가 없다)
 *      ===== 초기값 (데이터베이스 : 드라이버 등록) : 초기값 (윈도우 화면 디자인, 웹 첫화면)
 *   2. this  : 지역변수와 멤버변수을 구분 (같은 변수명일 경우)
 *      =====
 *      1) 사용위치 => 멤버메소드(인스턴스에서만) , 생성자 
 *                   static메소드는 this를 사용 할 수 없다 
 *         class A
 *         {
 *            void display(A this,매개변수)
 *            {
 *               => this생략이 가능하게 만든다 
 *            }
 *         }
 */
class A
{
	int age;
	String name;
	A(int a,String n)
	{
		this.age=a;
		this.name=n;
		
	}
	void display()
	{
		age=10;
		name="aaa";
	}
	
}
public class 변수변경 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        A aa=new A(30,"홍길동");
        aa.display();
        System.out.println(aa.age);
        System.out.println(aa.name);
        System.out.println("aa="+aa);
        //aa=new A(25,"심청이");
        aa.age=25;
        aa.name="심청이";
        System.out.println(aa.age);
        System.out.println(aa.name);
        System.out.println("aa="+aa);
	}

}
