/*
 *   �ڽ��� ��ü : this
 *   ������ ��ü : super
 */
class Music
{
	int a=10;//heap
	void display(int b)//stack
	{
		// �������� => �Ű����� ���� => ���α׷��� �������� �켱���� => ���������� ���� ��� (�������)
		this.a=b;
		System.out.println("this="+this);
	}
}
public class �ڽ��ǰ�ü {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Music m=new Music();
		System.out.println("m="+m);
		m.display(100);
		System.out.println(m.a);//10
		/*
		 *  JVM
		 *   => Music m=new Music();
		 *      this=m; => ������ ��ü�� �ּҰ� ���� => this 
		 *      ��� Ŭ������ �ڽ��� ��ü�� ������ �ִ� (this) => super
		 */
	}

}








