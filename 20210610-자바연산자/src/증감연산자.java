/*
 *   ���� �����͸� 1�� ���� 
 *   int a=10; 
 *   ===   ==
 *   1     2
 *       =
 *       a
 *       
 *   int => 4byte�޸𸮸� ���� 
 *          =============== 
 *          10�� �޸𸮿� ���� 
 *          ===============
 *          ����� ��ġ�� a��� �̸����� ��� 
 *          a=1000;
 *          
 *    byte b=100;
 *    ====
 *         1byte �޸� ������ �����
 *         ������� ������ 100�� �����Ѵ� 
 *         ����� ���� ����Ϸ��� => b��� �̿��Ѵ� 
 *         b=1000; // �����÷���
 *         
 *    boolean b=true;
 *    =======
 *         1byte �޸� ������ ����� 
 *         ������� ������ true�� �����Ѵ�
 *         ����� ���� ����Ϸ��� => b��� �̸��� �̿��Ѵ� 
 *         b=false;
 *         
 *    char c='A';
 *         2byte �޸� ������ ����� 
 *         'A'�� ���� �ض� 
 *         'A'��� ���� ��� => c��� �̸����� ��� 
 *         c='B'
 *         
 *    float f=10.5f; ==> float f  =  10.5 (10.5=>float => 10.5f)
 *                       ========    ====
 *                         4          double(8)
 *         // ���� �߻� 
 *         4byte �޸𸮸� ���� => �̸��� f�� ���
 *         f ��� ������ 10.5f�� ���� �Ѵ� 
 *         
 *         f=20.0f�� ���� �Ѵ�  10.5f(X) => 20.0f
 */
public class ���������� {
    //int a=20;//heap
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� ��Ͼȿ����� ���� �̸��� ������ ����� �� ����
        /*int a=10;//stack
        System.out.println(a); 
        a=20;
        System.out.println(a);
        a=30;
        System.out.println(a);
        */
		// ���� ='A'�� ���� �Ѵ�  ==> 'B'�� ���� => 'C'�� �����ؼ� ��� 
		char c='A';
		System.out.println(c);
		c='B';
		System.out.println(c);
		c='C';
		System.out.println(c);
		
		// ���� = false  => true�� �����ؼ� ��� (boolean)
		// ��� �������� ==> �����ϱ� ���� �ڹٿ� Ŭ����ȭ boolean => Boolean
		boolean b=false;
		b=true;// ���� 
		
		// �Ǽ��� 
		// 4byte�� 10.5 �Ǽ����� �Ѵ� ����Ѵ� 
		float f=10.5f;
		// f,F=> float ������ ǥ�� 
		System.out.println(f);
		
		// int�� (4byte) => 2150000000
		long won=2150000000L; // �ڹٿ����� ��� ������ int 
		System.out.println(2150000000L);
		
		byte b1=100;// �Ϲ� ���ڸ� ���� (�� => 127�� ����� �ȵȴ�)
		short s=200; // �Ϲ� ���ڸ� ���� (�� => 32767�� ����� �ȵȴ�)
		// byte , short , char => ���� => ����� => int
		byte b2=100;
		byte b3=10;
		//int b4=b2+b3;
		
	}

}
