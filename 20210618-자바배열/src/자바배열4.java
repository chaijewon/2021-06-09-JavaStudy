// ���ڿ��迭 
// ��ǻ�� ==> ����� (���� ���� ��) 
import java.util.Scanner;
public class �ڹٹ迭4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // �迭���� ���
		// 1. ��ǻ�Ͱ� ����(0) ����(1) ��(2) ����
		int com=(int)(Math.random()*3); //0,1,2
		
		// 2.����� 
		Scanner scan=new Scanner(System.in);
		System.out.print("����(0),����(1),��(2):");
		int user=scan.nextInt();
		
		/*if(com==0)
			System.out.println("��ǻ��:����");
		else if(com==1)
			System.out.println("��ǻ��:����");
		else if(com==2)
			System.out.println("��ǻ��:��");
		
		if(user==0)
			System.out.println("�����:����");
		else if(user==1)
			System.out.println("�����:����");
		else if(user==2)
			System.out.println("�����:��");*/
		// �迭�̿�
		String[] s={"����","����","��"};
		System.out.println("��ǻ��:"+s[com]);
		System.out.println("�����:"+s[user]);
	}

}
