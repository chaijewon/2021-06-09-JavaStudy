/*
 *   + , - , * , / , % => �ڵ�����ȯ
 *   int + int = int
 *   int + long = long
 *   int + long + double = double
 *   char + int = int
 *   char + char = int
 *   byte + byte = int
 *   ������ (/)
 *     = ����/���� = ����  10/3 => 3 , 10/4 = 2
 *       �Ҽ����� �ʿ��� ��� => ����/�Ǽ� = �Ǽ�
 *     = 0���� ������ �����߻��Ѵ� 
 *   ������ (%) 
 *     5%2 = 1    10%3 = 1 ==> ������ 
 *     ��ȣ�� ���� (������ ��ȣ�� ���� ���´�) 
 *     5%2=1
 *     5%-2=1  => 1+4/-2
 *     -5%2 = -1  -1-4/2
 *     -5%-2=-1   -1(-4/-2)
 *     
 *   
 */
public class �ڹٿ�����_��������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        /*int a=10;
        int b=3;
        System.out.println(a/b);*/
		int a=5;
		int b=2;
		System.out.println(a%b); // 1
		System.out.println(a%-b);// 1
		System.out.println(-a%b);// -1
		System.out.println(-a%-b);// -1
		System.out.println(a*-b); //-10
		System.out.println(-a*-b);//10
		byte b1=127;
		byte b2=127;
		byte b4=10+20+30; // 60
		long b3=(b1+b2); // ������� int
		System.out.println(b3);
		System.out.println(Integer.toBinaryString(-2));
		//  1111 1110 
		/*
		 *    1111 1110
		 *    ========== ���
		 *    0000 0001
		 *    ==========
		 *    +       1
		 *    ==========
		 *          2 ==> ���� = -2
		 */
		//System.out.println(0b11111111111111111111111111111110);
		char c1='A';
		char c2='B';
		double c3=(char)(c1+c2); // 10+20 =>
		System.out.println(c3);
		/*
		 *   ��� ��� : short ==> short , int , long, float, double
		 *             long  ==> long , float, double
		 *             int   ==> int , long, float , double
		 *             
		 *    double d=10
		 *    float f=10
		 *    
		 */
		
	}

}
