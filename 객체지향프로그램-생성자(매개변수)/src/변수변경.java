/*
 *   1. ������  (this():���� ���󵵰� ����)
 *      ===== �ʱⰪ (�����ͺ��̽� : ����̹� ���) : �ʱⰪ (������ ȭ�� ������, �� ùȭ��)
 *   2. this  : ���������� ��������� ���� (���� �������� ���)
 *      =====
 *      1) �����ġ => ����޼ҵ�(�ν��Ͻ�������) , ������ 
 *                   static�޼ҵ�� this�� ��� �� �� ���� 
 *         class A
 *         {
 *            void display(A this,�Ű�����)
 *            {
 *               => this������ �����ϰ� ����� 
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
public class �������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        A aa=new A(30,"ȫ�浿");
        aa.display();
        System.out.println(aa.age);
        System.out.println(aa.name);
        System.out.println("aa="+aa);
        //aa=new A(25,"��û��");
        aa.age=25;
        aa.name="��û��";
        System.out.println(aa.age);
        System.out.println(aa.name);
        System.out.println("aa="+aa);
	}

}
