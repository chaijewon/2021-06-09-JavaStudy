/*
 *   1.	Scanner 클래스를 이용하여 2자리의 정수(10~99사이)를 입력받고,
        십의 자리와 1의 자리가 같은 지 판별하여 출력하는 프로그램을 작성하라.

결과)
      2자리수 정수 입력(10~99) >> 77 
      10의 자리와 1의 자리가 같습니다.

 */
import java.util.Scanner;
public class 문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        int num=0;
        //System.out.print("10~99까지 두개 정수 입력:");
        //num=scan.nextInt();
        while(true)
        {
        	System.out.print("10~99까지 두개 정수 입력:");
        	num=scan.nextInt();
        	if(num<10 || num>99)
        	{
        		System.out.println("잘못된 입력입니다!!");
        		continue; // while 처음으로 돌아간다
        	}
        	break;
        }
        // 55
        int a=num/10; // 5
        int b=num%10; // 5
        if(a==b)
        {
        	System.out.println("10의 자리와 1의 자리가 같습니다.");
        }
        else
        {
        	System.out.println("10의 자리와 1의 자리가 다릅니다.");
        }
        
        /*if(num%11==0)
        {
        	System.out.println("10의 자리와 1의 자리가 같습니다.");
        }
        else
        {
        	System.out.println("10의 자리와 1의 자리가 다릅니다.");
        }*/
        
        
	}

}








