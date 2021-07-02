/*
 *   자신의 객체 : this
 *   상위의 객체 : super
 */
class Music
{
	int a=10;//heap
	void display(int b)//stack
	{
		// 지역변수 => 매개변수 포함 => 프로그램은 지역변수 우선순위 => 지역변수가 없는 경우 (멤버변수)
		this.a=b;
		System.out.println("this="+this);
	}
}
public class 자신의객체 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Music m=new Music();
		System.out.println("m="+m);
		m.display(100);
		System.out.println(m.a);//10
		/*
		 *  JVM
		 *   => Music m=new Music();
		 *      this=m; => 생성된 객체의 주소값 저장 => this 
		 *      모든 클래스는 자신의 객체를 가지고 있다 (this) => super
		 */
	}

}








