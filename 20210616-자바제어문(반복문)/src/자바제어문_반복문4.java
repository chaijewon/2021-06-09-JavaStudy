// 163 page => ����� �Է� �޾Ƽ� => �Է¼� ��ŭ ���� ��� 
import java.util.Scanner;
public class �ڹ����_�ݺ���4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 1. Scanner ���� => Ű����� �Էµ� ���� �о => �޸𸮿� ���� 
		Scanner scan=new Scanner(System.in);
		System.out.print("���� �Է�:");//����ڰ� �Է��� enter=> ���� �о� �´� 
		int n=scan.nextInt(); // �Էµ� �����͸� �о� �´� 
		for(int i=1;i<=n;i++) // �ټ� (����)
		{
			for(int j=1;j<=n-i;j++) // ���� (���� ������ ��� ��ġ)
			{
				System.out.print("��");
			}
			System.out.println();
		}
	}

}
