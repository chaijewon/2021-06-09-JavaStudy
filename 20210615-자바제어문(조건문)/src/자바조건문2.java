import java.util.Scanner;
// Math,String,System(Ŭ����) => java.lang ==> ������ ���� 
// 3�� ==> ���� 2�� , ������ 1�� 
public class �ڹ����ǹ�2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        // ���� 2�� �Է� 
        System.out.print("ù��° ���� �Է�:");
        int a=scan.nextInt();
        
        System.out.print("�ι�° ���� �Է�:");
        int b=scan.nextInt();
        
        // ������ �Է� 
        // Scanner�� ���� : ���� 1���� ���� �� ���� => String
        System.out.println("������ �Է�(+,-,*,/):");
        char op=scan.next().charAt(0); 
        // Hello Java ==> charAt(0) ==> H  charAt(1) ==> ���ڿ��� ���� ��ȣ�� 0���� �����Ѵ� char[]
      if((op=='+'||op=='-'||op=='*'||op=='/'))
      {
        if(op=='+')
        	System.out.printf("%d + %d = %d\n",a,b,a+b);
        if(op=='-')
        	System.out.printf("%d - %d = %d\n",a,b,a-b);
        if(op=='*')
        	System.out.printf("%d * %d = %d\n",a,b,a*b);
        // if ~ else => ���� ó���� ��� 
        if(op=='/')
        {
        	if(b==0) // 0���� ���� �� ���� (����)
        	{
        		System.out.println("0���� ���� �� �����ϴ�!!"); // ���� ó�� 
        	}
        	else
        	{
        		System.out.printf("%d / %d = %.2f\n",a,b,a/(double)b); // ���� ���� 
        	}
        }
      }
      else
      {
    	  System.out.println("��Ģ�����ڰ� �ƴմϴ�");
      }
	}

}









