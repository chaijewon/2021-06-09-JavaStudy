/*
 *   ���� 
 *     ��� : ������ ����� �����ؼ� ��� 
 *     ���� : ������ ����� �������� �ʰ� ��� 
 *     
 *     1) ��� extends 
 *     2) ��� => �ҽ��ڵ��� �״�� �����´� (�޸� ����)
 *     3) ���� ��� 
 *     4) ����� ���� Ŭ���� => ���̺귯�� ��� 
 *                          ============ ��� ���� (�������̵�)
 *                          
 *     5) ũ�� (���,���Ը� Ŭ������ ũ�� ��) 
 *     class A
 *     class B ==> ���� �� ���� 
 *     
 *     class A extends B     => B>A
 *     class A               => A>B
 *     {
 *         B b=new B();
 *     }
 *     =====================================================
 *     ���� : �ڵ��� ���� �ʰ� ��� (CV => �ڵ�)
 *     
 *     => Ŭ������ ��� ��������� => ������ ��ȣ : private 
 *     => ������ : ��� Ŭ�������� ����� ���� : public 
 *     => ��� �޼ҵ�� public (�ٸ� ����ϴ� ����)
 *     => private < default < protected < public 
 *                  ===================(Ư���� ���ܴ� ���󵵰� ����)
 *        ������ private => �޼ҵ�� public ==> ĸ��ȭ (getter/setter)
 *     =========================================================== ��
 *     Ŭ���� : �������� ���δٸ� �������� �ѹ��� ��� ���� 
 *     ==> ���� 
 *         �ڹ� =======> ������ 
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
