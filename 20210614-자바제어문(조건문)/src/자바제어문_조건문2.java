import java.util.Scanner;
public class �ڹ����_���ǹ�2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // ��ǻ�Ͱ� ���Ƿ� ���ڸ� ���� 
		// 1~100���� ������ ���� ���Ƿ� ���� 
		
		//int com=(int)(Math.random()*100)+1; // 1~100������ ������ �� 
		/*
		 *   Math.random() => 0.0~0.99 => ���Ƿ� ���� 
		 *      0.0~0.99 * 100 ==> 0.0~99.0+1 ==> 1.0~100.0
		 *      
		 *   (int)(Math.random()*100)+1
		 *        ===================
		 *              1  0.81*100 ==> 81.0
		 *   =====
		 *     2   ==> 81
		 *                           ==
		 *                           3  ==> 82
		 *   ** �ڹٿ��� �����ϴ� �޼ҵ�� �ݵ�� ����� (������� ���� ��� void)
		 */
		int com=105;
		// ���� ���ǹ��� ���� ���� ���������� ���� 
		
		if(com%3==0)
			System.out.println(com+"��(��) 3�� ����Դϴ�");
		
		
		if(com%5==0)
			System.out.println(com+"��(��) 5�� ����Դϴ�");
		
		
		if(com%7==0)
			System.out.println(com+"��(��) 7�� ����Դϴ�");
		
		
		if( !(com%3==0 || com%5==0 || com%7==0) )
			System.out.println(com+"��(��) 3,5,7����� �ƴմϴ�");
	}

}







