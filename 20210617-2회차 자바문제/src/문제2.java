/*
 *   2.	Scanner Ŭ������ �̿��Ͽ� ������ �� ���� �׼��� 
 *   �Է¹޾� ���� ����, �� ����, õ ����, 500��¥�� ����, 
 *   100��¥�� ����, 50��¥�� ����, 10��¥�� ����, 
 *   1��¥�� ���� �� ��� ��ȯ�Ǵ��� ����϶�.


 */
import java.util.Scanner;
// 65376 
public class ����2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("�ݾ� �Է�:");
        int won=scan.nextInt();
        System.out.println("won="+won);
        
        int a=won/50000;
        System.out.printf("5������:%d��\n",a);
        won=won-(50000*a);
        
        a=won/10000;
        System.out.printf("1������:%d��\n",a);
        won=won-(10000*a);
        
        a=won/5000;
        System.out.printf("5õ����:%d��\n",a);
        won=won-(5000*a);
        
        a=won/1000;
        System.out.printf("1õ����:%d��\n",a);
        won=won-(1000*a);
        
        a=won/100;
        System.out.printf("1���:%d��\n",a);
        won=won-(100*a);
        
        a=won/50;
        System.out.printf("5�ʿ�:%d��\n",a);
        won=won-(50*a);
        
        a=won/10;
        System.out.printf("�ʿ�:%d��\n",a);
        won=won-(10*a);
        
        System.out.printf("1��:%d��\n",won);
        
        /*
        int[] value={50000,10000,5000,1000,100,50,10};
        for(int i=0;i<value.length;i++)
        {
        	int b=won/value[i];
        	if(i<=3)
        	  System.out.printf("%d��:%d��\n",value[i],b);
        	else
        	  System.out.printf("%d��:%d��\n",value[i],b);
        	won=won-(value[i]*b);
        }
        System.out.println("1:"+won+"��");*/
	}

}
