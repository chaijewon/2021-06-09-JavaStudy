/*
 * ���� (�θ��ô�) => ���� , ��ȣȭ...(��������ȣȭ) => ��Ī  => RAS , DES , AES => ��ȣȭ 
 *   ���� ��� => 4�� ���� 
 *              100�� ���� ���� 
 *              400�� ����
 *              
 *               ===> �ڹٷ� ���� 
 *                    (year%4==0) && (year%100!=0) || (year%400==0) ==> ����  => �޷� 
 *                      => ���� , ȣ��(üũ��,üũ�ƿ�) => ERP (����)
 *                      => Calendar 
 */
import java.util.Scanner;
public class ����4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("�⵵ �Է�:");
        int year=scan.nextInt();
        // ��� 
        if((year%4==0 && year%100!=0)||(year%400==0))
        	System.out.println(year+"��(��) �����Դϴ�");
        else
        	System.out.println(year+"��(��) ������ �ƴմϴ�");
	}

}










