import java.util.Scanner;
// Math,String,System(클래스) => java.lang ==> 생략이 가능 
// 3개 ==> 정수 2개 , 연산자 1개 
public class 자바조건문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        // 정수 2개 입력 
        System.out.print("첫번째 정수 입력:");
        int a=scan.nextInt();
        
        System.out.print("두번째 정수 입력:");
        int b=scan.nextInt();
        
        // 연산자 입력 
        // Scanner의 단점 : 문자 1개는 받을 수 없다 => String
        System.out.println("연산자 입력(+,-,*,/):");
        char op=scan.next().charAt(0); 
        // Hello Java ==> charAt(0) ==> H  charAt(1) ==> 문자열은 시작 번호가 0부터 시작한다 char[]
      if((op=='+'||op=='-'||op=='*'||op=='/'))
      {
        if(op=='+')
        	System.out.printf("%d + %d = %d\n",a,b,a+b);
        if(op=='-')
        	System.out.printf("%d - %d = %d\n",a,b,a-b);
        if(op=='*')
        	System.out.printf("%d * %d = %d\n",a,b,a*b);
        // if ~ else => 오류 처리일 경우 
        if(op=='/')
        {
        	if(b==0) // 0으로 나눌 수 없다 (오류)
        	{
        		System.out.println("0으로 나눌 수 없습니다!!"); // 오류 처리 
        	}
        	else
        	{
        		System.out.printf("%d / %d = %.2f\n",a,b,a/(double)b); // 정상 수행 
        	}
        }
      }
      else
      {
    	  System.out.println("사칙연산자가 아닙니다");
      }
	}

}









