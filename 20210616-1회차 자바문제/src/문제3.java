/*
 *  3) Scanner Ŭ������ �̿��Ͽ� �� ���� ������ �Է� �޾� ������ ���밪�� ����϶� ��� 
 *     if(num<0) 
 *         System.out.println(num+"�� ���밪�� "+ -num +"�Դϴ�")
 *     else 
 *         System.out.println(num+"�� ���밪�� "+ num +"�Դϴ�")
 *         
 *      ==> Math.abs(num) => ���밪 ����ϴ� ��� 
 */
import java.util.Scanner;
public class ����3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //System.out.println(Math.abs(-1));
        //System.out.println(Math.abs(1));
		Scanner scan=new Scanner(System.in);
		System.out.print("���� �Է�:");
		int num=scan.nextInt();
		
		if(num<0)
			System.out.println(num+"�� ���밪�� "+(-num)+"�Դϴ�");
		else
			System.out.println(num+"�� ���밪�� "+(num)+"�Դϴ�");
		
		System.out.println(
		   num<0?num+"�� ���밪�� "+(-num)+"�Դϴ�":num+"�� ���밪�� "+(num)+"�Դϴ�"		
		);
		
	}

}








