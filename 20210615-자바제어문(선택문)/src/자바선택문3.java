// ���� => 3 => �� (������ �˷��ִ� ���α׷�)
/*
 *   345 : �� 
 *   678 : ���� 
 *   91011: ���� 
 *   12 1 2: �ܿ� 
 */
import java.util.Scanner;
public class �ڹټ��ù�3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 1. �Է°��� �޴´� 
		Scanner scan=new Scanner(System.in);
		System.out.print("�� �Է�:");
		int a=scan.nextInt();
		switch(a)
		{
		case 3:case 4:case 5:
			System.out.println("���Դϴ�");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("�����Դϴ�");
			break;
		case 9: case 10: case 11:
			System.out.println("�����Դϴ�");
			break;
		case 12: case 1: case 2:
			System.out.println("�ܿ��Դϴ�");
            break;			
		}
	}

}














