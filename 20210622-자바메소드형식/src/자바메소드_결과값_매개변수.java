import java.util.Scanner;
// ��Ģ���� ó�� => �޼ҵ� 
public class �ڹٸ޼ҵ�_�����_�Ű����� {
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
    	System.out.print("ù��° ���� �Է�:");
    	int a=scan.nextInt();
    	
    	System.out.print("�ι�° ���� �Է�:");
    	int b=scan.nextInt();
    	
    	System.out.print("������ �Է�(+,-,*,/):");
    	// Scanner�� ���� : char�� ���� �� ���� => ���ڿ� 
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
    			System.out.println("0���� ���� �� �����ϴ�");
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



