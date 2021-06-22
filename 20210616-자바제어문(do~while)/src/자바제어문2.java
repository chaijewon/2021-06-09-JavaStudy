// 짝수의 합 , 홀수의 합 , 총합 (사용자가 입력한 숫자까지) => do~while
// 173 page
import java.util.Scanner;
public class 자바제어문2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
        // 1. Scanner 생성
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
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
			
			i++;// 증가식
		}while(i<=num);
		Thread.sleep(100);
		System.out.println("1~"+num+"까지의 총합:"+sum);
		Thread.sleep(1000);
		System.out.println("1~"+num+"까지의 짝수의 총합:"+even);
		Thread.sleep(1000);
		System.out.println("1~"+num+"까지의 홀수의 총합:"+odd);
	}

}








