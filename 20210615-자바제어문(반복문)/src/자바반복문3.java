// ���� �Ѱ��� �޾Ƽ� => �ش� �������� ��� (2~9���� �Է�)
import java.util.Scanner;
public class �ڹٹݺ���3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("2~9���� �� �Է�:");
        int dan=scan.nextInt();
        /*System.out.printf("%d * %d = %d \n",dan,1,dan*1);
        System.out.printf("%d * %d = %d \n",dan,2,dan*2);
        System.out.printf("%d * %d = %d \n",dan,3,dan*3);
        System.out.printf("%d * %d = %d \n",dan,4,dan*4);
        System.out.printf("%d * %d = %d \n",dan,5,dan*5);
        System.out.printf("%d * %d = %d \n",dan,6,dan*6);
        System.out.printf("%d * %d = %d \n",dan,7,dan*7);
        System.out.printf("%d * %d = %d \n",dan,8,dan*8);
        System.out.printf("%d * %d = %d \n",dan,9,dan*9);*/
        for(int i=1;i<=9;i++)
        {
        	System.out.printf("%d * %d = %d \n",dan,i,dan*i);
        }
        
	}

}
