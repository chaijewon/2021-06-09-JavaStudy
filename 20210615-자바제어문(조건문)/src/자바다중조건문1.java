/*
 *    141 page ���� ���ǹ� 
 *    => if�� ������ ���� => ������ 1���� ���� 
 *    ����)
 *         if(���ǹ�)
 *         {   �� true
 *             ���� ���� ==========> if�� ���� 
 *             
 *         }        �� false
 *         else if(���ǹ�)
 *         {        �� true
 *              true�϶� �����ϴ� ���� ====> ���� �����Ŀ� ���� 
 *                  
 *         }        �� false
 *         else if(���ǹ�)
 *         {        �� true
 *              true�϶� �����ϴ� ���� ====> ���� �����Ŀ� ���� 
 *                  
 *         }        �� false
 *         ================
 *         else
 *         {
 *               �����߿� �ش��ϴ� ������ ���� ��쿡 �����ϴ� ���� 
 *         }
 *         ================ ���ǿ� �ش�Ǵ� ������ ���� ��� ó�� (default)
 */
// ���� ���� �� => ��ǻ��   ==> 0(����) , 1(����) , 2(��)  ==> ��ǻ�Ͱ� ���� 
import java.util.Scanner;
public class �ڹٴ������ǹ�1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 1. ��ǻ�Ͱ� ���������� 
		int com=(int)(Math.random()*3); //0~2 ������ ������ �߻� 
		// 2. ����ڰ� ���� 
		Scanner scan=new Scanner(System.in); // Ű���� �Է°��� �޾Ƽ� �޸𸮿� ���� 
		System.out.print("����(0),����(1),��(2):");
		int user=scan.nextInt();
		/// ��� (��ǻ��)
		if(com==0)
			System.out.println("��ǻ��:����");
		else if(com==1)
			System.out.println("��ǻ��:����");
		else
			System.out.println("��ǻ��:��");
		
		// ���(�����)
		if(user==0)
			System.out.println("Player:����");
		else if(user==1)
			System.out.println("Player:����");
		else if(user==2)
			System.out.println("Player:��");
		else
			System.out.println("Player�� ������ ���� �߽��ϴ�");
		
		// ���� ��� 
		if(user>2)
		{
			System.out.println("���� ���� : ��ǻ�� Win!!!");
		}
		/*
		 *     ��ǻ�ʹ� ���� 
		 *     ��ǻ��  =====================> user-com
		 *               ����ڰ� �̱�� ���� => 1, -2
		 *               ��ǻ�Ͱ� �̱�� ���� => 2, -1
		 *               �������� 0 (����)
		 *       ����(0)
		 *              => ����� 
		 *                 ����(0) => ����   ==> 0
		 *                 ����(1) => �����   ==> 1
		 *                 ��(2)   => ��ǻ��  ==> 2
		 *       ����(1)
		 *             => ����� 
		 *                 ����(0) => ��ǻ��   ==> -1
		 *                 ����(1) => ����   ==> 0
		 *                 ��(2)   => �����   ==> 1
		 *       ��(2)
		 *             => ����� 
		 *                 ����(0)  => �����   ==> -2
		 *                 ����(1)  => ��ǻ��   ==> -1
		 *                 ��(2)    => ����   ==> 0
		 */
		else
		{
			// ���� �Է��� �� ��� 
			int result=user-com;
			if(result==-1 || result==2)
			{
				System.out.println("��ǻ�� Win!!");
			}
			else if(result==1 || result==-2)
			{
				System.out.println("Player Win!!");
			}
			else
			{
				System.out.println("����!!");
			}
		}
	}

}











