/*
 *   1. ����ȯ => ���������� ���� (���� : boolean)
 *      int => double ==> 10 => 10.0
 *      double=> int (******) 10.5 => 10 (�Ҽ��� ����)
 *      int => char ==> 65 ==> 'A'
 *      char=> int  ==> 'A' ==> 65
 *   2. ����ó�� 
 *      => ���� ���������� ����� (���� ū ������������ ����)
 *         int + double = double
 *         ===
 *         double  ===> �ڵ�����ȯ 
 *         
 *         double d=10 ==> 10.0
 *                  ==
 *                  10.0
 *         int a= 'A' ==> 65
 *                ===
 *                65
 *      => int���� (byte,short,char) => �������� int
 *      => ���� ��ȯ (��������)��
 *         (int)10.5 ==> 10
 *         (char)65
 *         => ���̺귯�� 
 *            Math.random() ==> 0.0~0.99
 *            
 *       ���� ���� 
 *       1) ����
 *          int a;
 *       2) �ʱⰪ
 *          a=10     ===> 1. ������� �Է°��� �޾Ƽ� ���� Scanner
 *                   ===> 2. ��ǻ�Ϳ��� ���� 
 *       ========
 *       ����� ���� �ʱⰪ 
 *       int a=10;
 *       
 *            
 */
public class �ڹ�����ȯ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // double => int
		// ���� ���� 
		int a;
		// �ʱ�ȭ 
		a=(int)(Math.random()*100);  // 0.0~0.99 * 100  => 0.0~99.0
		// 0.0 and less than 1.0
		// 0~99
		System.out.println(a);
		
		int b='A'+32;
		// b=97 ==> ���ĺ� 
		System.out.println((char)b);
	}

}
