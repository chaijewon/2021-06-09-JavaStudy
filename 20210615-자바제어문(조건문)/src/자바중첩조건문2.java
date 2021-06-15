// 가위 바위 보 => 중첩 조건문 ==> 다중 조건 검색 ( 대분류 => 중분류 => 소분류 )
/*
 *    if(대분류)
 *    {
 *       if(중분류)
 *       {
 *          if(소분류)
 *          {
 *             
 *          }
 *       }
 *    }
 *    
 *    ===> if(대분류 && 중분류 && 소분류)
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
public class 자바중첩조건문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 1. 난수 (사용자)
		int com=(int)(Math.random()*3); // 0 (가위), 1(바위) , 2(보)
		// 임의로 숫자 => double (0.0~0.99)  ==> 
		
		// 2. 사용자가 입력 
		Scanner scan=new Scanner(System.in);
		System.out.print("가위(0),바위(1),보(2):");
		int user=scan.nextInt();
		
		// 결과 사용자
		if(com==0)
			System.out.println("컴퓨터:가위");
		else if(com==1)
			System.out.println("컴퓨터:바위");
		else 
			System.out.println("컴퓨터:보");
		// 사용자 
		if(user==0)
			System.out.println("사용자:가위");
		else if(user==1)
			System.out.println("사용자:바위");
		else 
			System.out.println("사용자:보");
		// 결과
		if(com==0) // 컴퓨터 => 가위 => 중첩 ==> &&로 사용할 수 있다 
		{
			if(user==0) // 가위  ==> if(com==0 && user==0)
			{
				System.out.println("비겼다!!");
			}
			else if(user==1) // 바위
			{
				System.out.println("사용자 Win!!");
			}
			else if(user==2) // 보
			{
				System.out.println("컴퓨터 Win!!");
			}
		}
		else if(com==1) // 컴퓨터 => 바위
		{
			if(user==0) // 가위
			{
				System.out.println("컴퓨터 Win!!");
			}
			else if(user==1) // 바위
			{
				System.out.println("비겼다!!");
			}
			else if(user==2) // 보
			{
				System.out.println("사용자 Win!!");
			}	
		}
		else // 컴퓨터 => 보
		{
			if(user==0) // 가위
			{
				System.out.println("사용자 Win!!");
			}
			else if(user==1) // 바위
			{
				System.out.println("컴퓨터 Win!!");
			}
			else if(user==2) // 보
			{
				System.out.println("비겼다!!");
			}
		}
		
	}

}










