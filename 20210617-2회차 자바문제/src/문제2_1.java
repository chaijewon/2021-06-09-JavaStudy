/*
 *   2.	Scanner Ŭ������ �̿��Ͽ� ������ �� ���� �׼��� �Է¹޾� ���� ����, �� ����, õ ����, 500��¥�� ����, 100��¥�� ����, 50��¥�� ����, 10��¥�� ����, 1��¥�� ���� �� ��� ��ȯ�Ǵ��� ����϶�.


		���)
		�ݾ��� �Է��Ͻÿ� >> 65376 
		�������� 1�� 
		������ 1�� 
		õ���� 5�� 
		500��
		100�� 3�� 
		50�� 1�� 
		10�� 2��
		1�� 6��



 */
import java.util.Scanner;
public class ����2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("�ݾ� �Է�:");
        int won=scan.nextInt();
        
        // 5������
        int a=won/50000;
        System.out.printf("5������:%d��\n",a);
        won=won-(50000*a);
        System.out.println("won="+won);
        // 1����
        a=won/10000;
        System.out.printf("1������:%d��\n",a);
        won=won-(10000*a);
        System.out.println("won="+won);
        // 5õ��
        a=won/5000;
        System.out.printf("5õ����:%d��\n",a);
        won=won-(5000*a);
        System.out.println("won="+won);
        
        // 1õ��
        a=won/1000;
        System.out.printf("1õ����:%d��\n",a);
        won=won-(1000*a);
        System.out.println("won="+won);
        
        // 500��
        a=won/500;
        System.out.printf("500��:%d��\n",a);
        won=won-(500*a);
        System.out.println("won="+won);
        
        // 100��
        a=won/100;
        System.out.printf("100��:%d��\n",a);
        won=won-(100*a);
        System.out.println("won="+won);
        
        // 50��
        a=won/50;
        System.out.printf("50��:%d��\n",a);
        won=won-(50*a);
        System.out.println("won="+won);
        
        // 10��
        a=won/10;
        System.out.printf("10��:%d��\n",a);
        won=won-(10*a);
        System.out.println("won="+won);
        
        System.out.printf("1��:%d��\n",won);
        
	}

}














