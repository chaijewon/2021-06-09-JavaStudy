import java.util.Scanner;
public class �ڹٿ���������2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // �ΰ��� ������ �޾Ƽ� => ��Ģ���� (+,-,*,/)
		Scanner scan=new Scanner(System.in);
		System.out.print("ù��° ���� �Է�:");
		// enter => ������ ������ ���� ���� => newxtInt()
		int a=scan.nextInt(); // 10
		System.out.print("�ι�° ���� �Է�:");
		int b=scan.nextInt(); // (double)b
		
		// +
		System.out.printf("%d+%d=%d\n",a,b,a+b);
		// -
		System.out.printf("%d-%d=%d\n",a,b,a-b);
		// *
		System.out.printf("%d*%d=%d\n",a,b,a*b);
		// /
		System.out.printf("%d/%d=%.2f\n",a,b,a/(double)b);
		
	}

}
