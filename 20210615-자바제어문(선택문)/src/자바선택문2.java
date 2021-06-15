// 정수 2개 , 연산자 받아서 계산하는 연습 => switch
import java.util.Scanner;
public class 자바선택문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 1. 키보드 입려값 받기 
		Scanner scan=new Scanner(System.in);
		System.out.print("첫번째 정수 입력:");
		int num1=scan.nextInt();
		
		System.out.print("두번째 정수 입력:");
		int num2=scan.nextInt();
		
		System.out.print("사칙연산(+,-,*,/):"); // 문자열을 사용할 수 있다 ""
		switch(scan.next())
		{
		  case "+":
			  System.out.printf("%d+%d=%d\n",num1,num2,num1+num2);
			  break;
		  case "-":
			  System.out.printf("%d-%d=%d\n",num1,num2,num1-num2);
			  break;
		  case "*":
			  System.out.printf("%d*%d=%d\n",num1,num2,num1*num2);
			  break;
		  case "/":
			  System.out.printf("%d/%d=%d\n",num1,num2,num1/num2);
			  break;
		  default:
			  System.out.println("잘못된 연산자입니다");
		}
	}

}
