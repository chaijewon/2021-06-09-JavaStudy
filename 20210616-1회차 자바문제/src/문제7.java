/*
 * 7) ���� 2���� ������(+,-,*,/)�� �Է� �޾� ��Ģ �����ϴ� ���α׷��� ������ 
   (switch~case ���) 

 */
import java.util.Scanner;
public class ����7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("ù��° ���� �Է�:");
        int num1=scan.nextInt();
        System.out.print("�ι�° ���� �Է�:");
        int num2=scan.nextInt();
        System.out.print("������ �Է�(+,-,*,/):");
        // �����
        switch(scan.next())
        {
          case "+":
        	 System.out.printf("%d + %d = %d\n",num1,num2,num1+num2);
        	 break;
          case "-":
         	 System.out.printf("%d - %d = %d\n",num1,num2,num1-num2);
         	 break;
          case "*":
         	 System.out.printf("%d * %d = %d\n",num1,num2,num1*num2);
         	 break;
          case "/":
        	 if(num2==0)
        		 System.out.println("0���� ���� �� �����ϴ�");
        	 else
         	     System.out.printf("%d / %d = %d\n",num1,num2,num1/num2);
         	 break;
          default:
        	  System.out.println("ó�� �� �� ���� �������Դϴ�");
        }
	}

}




