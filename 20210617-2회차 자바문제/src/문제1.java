/*
 *   1.	Scanner Ŭ������ �̿��Ͽ� 2�ڸ��� ����(10~99����)�� �Է¹ް�,
        ���� �ڸ��� 1�� �ڸ��� ���� �� �Ǻ��Ͽ� ����ϴ� ���α׷��� �ۼ��϶�.

���)
      2�ڸ��� ���� �Է�(10~99) >> 77 
      10�� �ڸ��� 1�� �ڸ��� �����ϴ�.

 */
import java.util.Scanner;
public class ����1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        int num=0;
        //System.out.print("10~99���� �ΰ� ���� �Է�:");
        //num=scan.nextInt();
        while(true)
        {
        	System.out.print("10~99���� �ΰ� ���� �Է�:");
        	num=scan.nextInt();
        	if(num<10 || num>99)
        	{
        		System.out.println("�߸��� �Է��Դϴ�!!");
        		continue; // while ó������ ���ư���
        	}
        	break;
        }
        // 55
        int a=num/10; // 5
        int b=num%10; // 5
        if(a==b)
        {
        	System.out.println("10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
        }
        else
        {
        	System.out.println("10�� �ڸ��� 1�� �ڸ��� �ٸ��ϴ�.");
        }
        
        /*if(num%11==0)
        {
        	System.out.println("10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
        }
        else
        {
        	System.out.println("10�� �ڸ��� 1�� �ڸ��� �ٸ��ϴ�.");
        }*/
        
        
	}

}








