// ���� ���� �� => ��ø ���ǹ� ==> ���� ���� �˻� ( ��з� => �ߺз� => �Һз� )
/*
 *    if(��з�)
 *    {
 *       if(�ߺз�)
 *       {
 *          if(�Һз�)
 *          {
 *             
 *          }
 *       }
 *    }
 *    
 *    ===> if(��з� && �ߺз� && �Һз�)
 *    
 *    *
 *    **
 *    ***
 *    ****
 *    
 *    System.out.println("*");
 *    System.out.println("**");
 *    System.out.println("***");
 *    System.out.println("****");
 *    
 *    for(int i=1;i<=4;i++)
 *    {
 *       for(int j=1;j<=5-i;j++)
 *       {
 *          System.out.print("*");
 *       }
 *       System.out.println("\n");
 *    }
 *    
 */
import java.util.Scanner;
public class �ڹ���ø���ǹ�2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 1. ���� (�����)
		int com=(int)(Math.random()*3); // 0 (����), 1(����) , 2(��)
		// ���Ƿ� ���� => double (0.0~0.99)  ==> 
		
		// 2. ����ڰ� �Է� 
		Scanner scan=new Scanner(System.in);
		System.out.print("����(0),����(1),��(2):");
		int user=scan.nextInt();
		
		// ��� �����
		if(com==0)
			System.out.println("��ǻ��:����");
		else if(com==1)
			System.out.println("��ǻ��:����");
		else 
			System.out.println("��ǻ��:��");
		// ����� 
		if(user==0)
			System.out.println("�����:����");
		else if(user==1)
			System.out.println("�����:����");
		else 
			System.out.println("�����:��");
		// ���
		if(com==0) // ��ǻ�� => ���� => ��ø ==> &&�� ����� �� �ִ� 
		{
			if(user==0) // ����  ==> if(com==0 && user==0)
			{
				System.out.println("����!!");
			}
			else if(user==1) // ����
			{
				System.out.println("����� Win!!");
			}
			else if(user==2) // ��
			{
				System.out.println("��ǻ�� Win!!");
			}
		}
		else if(com==1) // ��ǻ�� => ����
		{
			if(user==0) // ����
			{
				System.out.println("��ǻ�� Win!!");
			}
			else if(user==1) // ����
			{
				System.out.println("����!!");
			}
			else if(user==2) // ��
			{
				System.out.println("����� Win!!");
			}	
		}
		else // ��ǻ�� => ��
		{
			if(user==0) // ����
			{
				System.out.println("����� Win!!");
			}
			else if(user==1) // ����
			{
				System.out.println("��ǻ�� Win!!");
			}
			else if(user==2) // ��
			{
				System.out.println("����!!");
			}
		}
		
	}

}










