import java.util.Scanner;
// 사칙연산 처리 => 메소드 
public class 자바메소드_결과값_매개변수 {
    static int plus(int a1,int b1)
    {
    	return a1+b1;
    }
    static int minus(int a,int b)
    {
    	return a-b;
    }
    static int gop(int a,int b)
    {
    	return a*b;
    }
    static double div(int a,int b)
    {
    	return a/(double)b;
    }
    static void calc1()
    {
    	Scanner scan=new Scanner(System.in);
    	System.out.print("첫번째 정수 입력:");
    	int a=scan.nextInt();
    	
    	System.out.print("두번째 정수 입력:");
    	int b=scan.nextInt();
    	
    	System.out.print("연산자 입력(+,-,*,/):");
    	// Scanner의 단점 : char를 받을 수 없다 => 문자열 
    	String op=scan.next();
    	
    	switch(op)
    	{
    	case "+":
    	{
    		int c=plus(a,b);//a+b
    		System.out.println(c);
    	}
    	break;
    	case "-":
    	{
    		int c=minus(a,b);
    		System.out.println(c);
    	}
    	break;	
    	case "*":
    	{
    		int c=gop(a,b);
    		System.out.println(c);
    	}
    	break;
    	case "/":
    		if(b==0)
    			System.out.println("0으로 나눌 수 없습니다");
    		else
    		{
    			double d=div(a,b);
    			System.out.printf("%.2f\n",d);
    		}
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        calc1();
		
	}

}



