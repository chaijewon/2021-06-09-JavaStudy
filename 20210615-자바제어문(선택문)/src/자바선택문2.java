// ���� 2�� , ������ �޾Ƽ� ����ϴ� ���� => switch
import java.util.Scanner;
public class �ڹټ��ù�2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 1. Ű���� �Է��� �ޱ� 
		Scanner scan=new Scanner(System.in);
		System.out.print("ù��° ���� �Է�:");
		int num1=scan.nextInt();
		
		System.out.print("�ι�° ���� �Է�:");
		int num2=scan.nextInt();
		
		System.out.print("��Ģ����(+,-,*,/):"); // ���ڿ��� ����� �� �ִ� ""
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
			  System.out.println("�߸��� �������Դϴ�");
		}
	}

}
