/*
 *    �������� ���� 
 *    =========== ���ڿ� ���ؼ��� ���� (boolean�� ���� �� �� ����)
 *    ����/�Ǽ�/���ڸ� �����ϴ�  (Ŭ������ ����)
 *    
 *    ��) ���� => �Ǽ� ����   upcasting  ==> �ڵ�����ȯ
 *       �Ǽ� => ���� ����   downcasting ==> ��������ȯ 
 *       ���� => ������ ����  upcasting
 *       ���� => ���ڷ� ����  downcasting
 *       ���� => �Ǽ��� ����  upcasting
 *       
 *       ===> �ڹٿ��� ����ó�� (���� ���������� �����Ѵ�) => ���� ū �����Ͱ��� �����
 *            10 + 10.5 ====> 20.5
 *            ==
 *            10.0
 *            
 *            'A'+10 
 *            ===
 *            int=> 65 +10 => 75
 *            
 *            'A'+10+20.5
 *            ======
 *            'A'=> 65 +10
 *            75+20.5
 *            ==
 *            75.0 + 20.5 => 95.5
 *            
 *            10.5+10.5=21.0
 *            (int)10.5+(int)10.5 =-> �Ǽ��� ������ ��ȯ => �Ҽ����� ����� 
 *            ========= ==========
 *              10         10
 *                   + => 20
 *                   
 *            => ������ ũ�� 
 *               byte < short < int < long < float < double
 *                      char
 *            => byte + byte = int
 *               char + char = int
 *               short+short = int
 *               
 *               byte+char+short = int
 *               
 *               => byte,short,char�� ����Ǹ� ������� int
 *               
 *            ������ ������ 
 *            int a=10;
 *            int b=20;
 *            int c=30;
 *            
 *            int a=10,b=20,c=30;
 *            
 *            int a,b; // ������� �Է°��� �޴� ��� , �������� �޴� ��� 
 *            a=10;
 *            b=20;
 *               
 */
public class ����ȯ������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //System.out.println((int)Math.ceil(235/10.0));// �������� 
        //System.out.println((int)(Math.random()*101)); // 0~100������ ����
		// ������ 'A'�� �����ߴٰ� ��� 
		char c='A';
		System.out.println(c);
		// 'A'�� ������ �ִ� ���� ��� 
		System.out.println((int)c);
		
		// 'a'�� �����ϰ� => ������� 
		c='a';
		System.out.println((int)c);
		
		// 70�� ������ ������  => 70�� �ش�Ǵ� ���ĺ��� ��� 
		int a='ȫ';
		System.out.println(a);
		
		//char c1=70;
		//System.out.println(c1);
		//System.out.println((char)('A'+32));
		// 'A'+1 ==> int 
		// 'A'+'B' => int 
		// 10/3 ==> 3   10/(double)3
		// double d=10/3; => 3.0
		double d=10/(double)3;
		System.out.println(d);
		/*
		 *   int a=123456;
		 *   double d=123456.78;
		 *   (int)((d-a)*100)
		 */
		/*int a1=123456;
		float d1=123456.78f;
		int r=(int)((d1-a1)*100);
		System.out.println(d1-a1);
		System.out.println(r);*/
		
	}

}











