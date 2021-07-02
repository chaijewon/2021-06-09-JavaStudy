/*
 *  310page 
 *   => Ŭ�������� , ����ó�� => ���̺귯�� => ����
 *   => ��� (�ҽ� �����ϴ�,�ڵ带 ���� , ������ ��, �ڵ��� �ߺ��� ����) 
 *           ==========                       ==============
 *   => ���� (������(X),����ȭ(X)) 
 *   class A
 *   class B exends A  ==> 1) A�� �޸� �Ҵ� 2) B�� �޸� �Ҵ�  
 *                         3)�������� ����� �޴� ��� �ҽ��� ������ �� �� �ִ�  
 *                         4) �ٸ� Ŭ������ ������ ���� ��ģ��
 *                         ============������ (1.xx) => 2.5=> POJO(�Ϲ� Ŭ����=> ������)
 *                         ==> ��� ��ó : ���� Ŭ���� , �͸� Ŭ����(��Ӿ��� ������)
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
 *   ����� �ȵǴ� ���� 
 *     1) ������ , �ʱ�ȭ ����� ��ӿ��� ���� ���� 
 *     2) �޸� ũ��� ��ӹ��� Ŭ������ ���� , ���� Ŭ���� ��� ���� Ŭ������ ũ�� 
 *     
 *        ���� (����)
 *         |
 *        �ΰ� (�ΰ� ,����) 
 *     3) static�� ����� �������� �ƴϰ� ����� �����ϰ� ����� �ش� 
 *     4) private�� ����� �������� ������ �Ұ��� 
 *        => ������ , �ʱ�ȭ��� , static , private ��� ����
 *        
 *     5) ����� �ִ� ��� ���� �ö� �� ���� ũŰ�� Ŀ���� 
 *     6) �ڹ��� ��� Ŭ������ Object�κ��� ����� �޴´� 
 *                        ========
 *                          �ֻ��� Ŭ���� 
 *     7) �ڹٴ� ���ϻ���̴� 
 *        class A
 *        class B 
 *        class C extends A,B (X)   class C:A,B(C���,���̽�)
 *     ============================ ���߻��   
 *        class A
 *        class B extends A
 *        class C extends B
 */
class Child extends Parent
{
	/*
	 *   String name;
	      int age;
	      ������ ����� Ȯ���ؼ� => �ʿ�� ���� , �ٸ� ��� �߰��� �����ϴ�
	      public void display()
	      {
		    System.out.println("Parent:display() Call...");
	      } 
	 */
	
	// ��� ���� => �������̵�(������)
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
