// ���� �ʱ�ȭ 
/*
 *    class A
 *    {
 *       ===========
 *        ���� => �ʱ�ȭ (���۰��� ����)
 *        = ����� �ʱ�ȭ
 *        = �����Ŀ� �� �ʱ�ȭ 
 *          = ������
 *          = �ʱ�ȭ ��� 
 *       ===========
 *    }
 *    
 *    boolean bCheck=false;
 *    for(int i=1;i<=10;i++)
 *    {
 *       if(i%2==0)
 *       {
 *          bCheck=true; =. 2,4,6,8,10
 *          break;
 *       }
 *       
 *    }
 */
/*
 *    ���� ��� 
 *    =======
 *     ������� : ������ ����  
 *     �޼ҵ�  : ����� ������ ���� 
 *     ������  : �޸� �Ҵ� => �����ͺ��̽� ���� (�ڹ� <===> ����Ŭ)
 */
import java.util.Scanner;
public class �����ʱ�ȭ3 {
	String[] data=new String[10];
	
	// ������� �ʱ�ȭ ���  => �ڵ�ȣ�� (����� �ʱ�ȭ => �ʱ�ȭ ��� => ������ (Ư���� ��찡 �ƴϸ� �����ڸ� �̿��Ѵ�)
	{
	   	data[0]="ȫ�浿";
	   	data[1]="��û��";
	   	data[2]="������";
	   	data[3]="�ڹ���";
	   	data[4]="�̼���";
	   	data[5]="�����";
	   	data[6]="��������";
	   	data[7]="������";
	   	data[8]="�̻�";
	   	data[9]="�Ҽ���";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // ��� => �ݵ�� �޸𸰿� ���� 
		�����ʱ�ȭ3 a=new �����ʱ�ȭ3();// a.data
		// ��� 
		for(String name:a.data)
		{
			System.out.println(name);
		}
		System.out.println("==========");
		Scanner scan=new Scanner(System.in);
		System.out.print("�̸� �Է�:");
		String n=scan.next();
		// �̸��� �ִ� ��쿡�� �̸��� ��� , ���� ���� �̸��� ���� => ȫ�浿,��û��
		boolean bCheck=false;
		for(String name:a.data)
		{
			if(n.equals(name))
			{
				System.out.println("ã�� �̸�:"+name);// 1�� ����
				bCheck=true;
				
			}
			
			else { System.out.println("ã�� �̸��� �����ϴ�"); bCheck=false;}//9�� ���� //break; }
			 
		}
		
		if(bCheck==false)
		{
			System.out.println("ã�� �̸��� �����ϴ�");
		}
	}

}











