/*
 *   ���� ���� ���� ������ �޾Ƽ� ��� , ���� 
 */
// => ���� �Է� , ����� �Է°� , ����(��ǻ��)
/*
 *    int kor=90;
 *    int eng=80;...
 *    
 *    scan.nextInt()
 *    
 *    Math.random()
 */
import java.util.Scanner;
public class �ڹٿ���������3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Scanner�� ����  => Ŭ������ ���� => new => �޸𸮿� ���� 
		Scanner scan=new Scanner(System.in);
		// System.in(�Է°��� �д� ��� : inputStream), System.out(ȭ�� ��� : outputStream) => IO
		System.out.print("���� �Է�:");
		int kor=scan.nextInt();// �Էµ� ������ �޾ƿ��� ���  (nextInt())
		System.out.print("���� �Է�:");
		int eng=scan.nextInt();
		System.out.print("���� �Է�:");
		int math=scan.nextInt();
		
		System.out.println("=============���===========");
		System.out.println("����:"+(kor+eng+math));// 80+80+80  => ����:808080
		//    ()�ȿ� �ִ� ������ ���� => ���� ������� ����:�ڿ� ���δ�
		System.out.printf("���:%.2f\n",(kor+eng+math)/3.0);
		/*
		 *   next()  ===> String  ====> String
		 *   nextInt() => ����(int)
		 *   nextBoolean() => true/false
		 *   nextDouble() => �Ǽ� 
		 */
		
	}

	
	
	
	
	
	
	
}
