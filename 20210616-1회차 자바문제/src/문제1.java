/*
 *  1) Scanner Ŭ������ �̿��Ͽ� �� ���� ������ �Է� �޾� ������� 
 *     �������� �Ǻ��Ͽ� ����϶�
 *     
 *     if~else 
 *     
 *     ����)
 *          if(���ǹ�) => ���� => <0
 *          {
 *             ������ true ó��
 *          }
 *          else => ���
 *          {
 *             ������ false 
 *          }
 *          
 *          ==> ���׿����� (����)?"���":"����"
 */
import java.util.Scanner;
public class ����1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // ������ �޴´� 
		Scanner scan=new Scanner(System.in); //System.in => Ű���� �Է°��� �޴´� 
		System.out.print("���� �Է�:");
		int num=scan.nextInt();
		// ��û�� �����Ϳ� ���� ����� ��� 
		if(num<0)
			System.out.println(num+"��(��) �����Դϴ�");
		else
			System.out.println(num+"��(��) ����Դϴ�");
		
		// if~else ==> �����ڸ� �̿��� ���� ���׿����ڸ� �̿��Ѵ� 
		System.out.println(num<0?num+"��(��) �����Դϴ�":num+"��(��) ����Դϴ�");
	}

}









