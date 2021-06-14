import java.util.Scanner;
public class 자바연산자정리2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 두개의 정수를 받아서 => 사칙연산 (+,-,*,/)
		Scanner scan=new Scanner(System.in);
		System.out.print("첫번째 정수 입력:");
		// enter => 지정된 변수에 값을 대입 => newxtInt()
		int a=scan.nextInt(); // 10
		System.out.print("두번째 정수 입력:");
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
