// ¦���� �� , Ȧ���� �� , ���� (����ڰ� �Է��� ���ڱ���) => do~while
// 173 page
import java.util.Scanner;
public class �ڹ����2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
        // 1. Scanner ����
		Scanner scan=new Scanner(System.in);
		System.out.print("���� �Է�:");
		int num=scan.nextInt();
		int sum=0,even=0,odd=0;
		int i=1;
		do
		{
			if(i%2==0) 
				even+=i;
			else
				odd+=i;
			
			sum+=i;
			
			i++;// ������
		}while(i<=num);
		Thread.sleep(100);
		System.out.println("1~"+num+"������ ����:"+sum);
		Thread.sleep(1000);
		System.out.println("1~"+num+"������ ¦���� ����:"+even);
		Thread.sleep(1000);
		System.out.println("1~"+num+"������ Ȧ���� ����:"+odd);
	}

}








