// ����� �Է� 
import java.util.Scanner;
/*
 *   11111222223333344444
 *   16781562829234834083048  ==> �������� ==> ���� (������) 
 *   
 *   *
 *   **
 *   ***
 *   ****
 *   ==========================
 *          �ټ�  ��ǥ 
 *           i    j  ==> i,j(X) ==> a,b
 *           1    1
 *           2    2
 *           3    3
 *           4    4    => i=1 , j<=i
 *   ****
 *   ***
 *   **
 *   *
 *          �ټ� ��ǥ 
 *           i   j
 *           1   4
 *           2   3
 *           3   2
 *           4   1   => ���� ���Ѵ�   i+j=5 ==> j=5-i
 *   
 */
public class �ڹٹݺ���5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //1. ��ǻ�� => 1~100������ ������ ���� (����)
		int com=(int)(Math.random()*100)+1; // 1~100������ ���� �߻� 
		//2. ����� ���ߴ� ���α׷� 
		//3. ��Ʈ => UP/DOWN
		//4. ������ : ȱ���� ������ ���� => ���ѷ��� => �ݵ�� ���� ������ �߰� 
		Scanner scan=new Scanner(System.in);
		for(;;) //���� ���� => ������ ���������� ���� 
		{
			// ����ڰ� �Է� 
			System.out.print("1~100���� ������ ���� �Է�:");
			int user=scan.nextInt();
			// �� (���� �Է°� ��)  => ����>�Է°� , ����<�Է°�  , ����==�Է°�
			// ��Ʈ
			if(com>user)
			{
				System.out.println("�Է°����� ū ���� �Է��ϼ���");//UP
			}
			else if(com<user)
			{
				System.out.println("�Է°����� ���� ���� �Է��ϼ���");
			}
			else
			{
				System.out.println("Game Over!!");
				// �ݺ����� ����ÿ� break
				break; 
			}
			
		}
		
	}

}






