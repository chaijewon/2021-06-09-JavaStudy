/*
 *    ������ �ʱ�ȭ 
 *     ���� : �Ѱ��� �����ϴ� ���� (�ݵ�� ���� �Է�)
 *     ������� => �ڵ� �ʱ�ȭ
 *               class A
 *               {
 *                  int a; ==> 0
 *                  double d;=> 0.0
 *                  boolean b;=> false
 *                  String s; => null
 *                  long l; => 0L
 *               }
 *     �������� => �ڵ� �ʱ�ȭ (X) : ��������� �ݵ�� ���� ���� 
 *                              ======
 *                              ����ó���� , ����� ...
 *                              
 *    ��������� ���� �ʱⰪ 
 *      1.����� �ʱ�ȭ 
 *        class A
 *        {
 *            int a; = 0
 *            int b=100;// ���� , ��ġ(���)
 *            String name; null=> ���߿� �����ؼ� ��� 
 *            String n="ȫ�浿";
 *        }
 *      2.������ : �ܺο��� �����͸� �о �ʱ�ȭ 
 *                => �ڵ� �α��� 
 *               ���� �б� => �����͸� �ʱ�ȭ 
 *      3.�ʱ�ȭ��� 
 *        class A
 *        {
 *            int sum;
 *            
 *            �ν��Ͻ���� 
 *            {
 *               for(int i=1;i<=1000;i++)
                 {
        	        sum+=i;
                 }
 *            }
 *            
 *            // �������� �� ���(static)
 *            static  ==> ���̹�Ƽ�� (XML�� �о� �ʱ�ȭ)
 *            {
 *               
 *            }
 *            
 *        }           
 *        
 *         a => 10 => 100 => 1000
 *         b => 20 => 200 => 2000
 */
class B
{
	int a=1000; 
	static int b=2000;
	
	    // ������ �ʱ�ȭ => for, ���� ... , ��ü���� ���� �ʱⰪ�� �ٸ��� ����� 
	    // 2
		{
			System.out.println("�ν��Ͻ� �ʱ�ȭ ���");
			a=100;
		}
		// 1
		static
		{
			System.out.println("static �ʱ�ȭ ���");
			b=200;
		}
		// 3
		B()
		{
			System.out.println("�����ڿ��� �ʱ�ȭ");
			a=1000;
			b=2000;
		}
	
}
public class �����ʱ�ȭ {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        B b=new B();
        System.out.println(b.b);
        System.out.println(b.a);
	}

}






