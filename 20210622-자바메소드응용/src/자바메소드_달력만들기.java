// �Է� 
import java.util.Scanner;
/*
 *    �޷� ����� 
 *    1. ����� �Է�  => year,month
 *    2. ��û�� ���� ����Ȯ�� (1��) 
 *    3. �޷��� ��� 
 *    ============================
 *    = �ߺ� �ڵ��� ���� 
 *    = ������ ����� �� �ִ� ��� 
 */
public class �ڹٸ޼ҵ�_�޷¸���� {
    // ����� �Է� => �޼ҵ�
	int year,month,week;
	static int input(String s)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print(s+" �Է�:");
		return scan.nextInt();
	}
	// ó�� => ���� ���ϱ� 
	static int getWeek(int year,int month)
	{
		        // ������ ������ ��¥
				int[] lastday={
						31,28,31,30,31,30,
						31,31,30,31,30,31
				};
				// 6�� 1������ ���� ���ϱ�
				// ���⵵������ �ѳ� ��
				int total=(year-1)*365 +(year-1)/4
						               -(year-1)/100
						               +(year-1)/400;
				// ���ޱ����� �ѳ� �� 
				if((year%4==0 && year%100!=0)|| (year%400==0)) // ���� ���� (ERP) 
					// 2������ 29
					lastday[1]=29;
				else
					lastday[1]=28;
				
				for(int i=0;i<month-1;i++)
				{
					total+=lastday[i];
				}
				// +1
				total++; // 6�� 1���� 
				// %7 => ������ ���� �� �ִ� 
				int week=total%7; // 1�⵵ 1�� 1�� => �� 
				return week;
	}
	static void datePrint(int year,int month)
	{
		int week=getWeek(year, month);
		
		int[] lastday={
				31,28,31,30,31,30,
				31,31,30,31,30,31
		};
		
		if((year%4==0 && year%100!=0)|| (year%400==0)) // ���� ���� (ERP) 
			// 2������ 29
			lastday[1]=29;
		else
			lastday[1]=28;
		
		System.out.printf("%d�⵵ %d��\n",year,month);
		String[] strWeek={"��","��","ȭ","��","��","��","��"};
		for(int i=0;i<strWeek.length;i++)
		{
			System.out.print(strWeek[i]+"\t");
		}
		System.out.println("\n");
		
		// ��� (�޷�)
				for(int i=1;i<=lastday[month-1];i++)
				{
					if(i==1) // ù�ٿ� ��½ÿ��� ���ϱ��� ���� ��� 
					{
						// ����� ��� 
						for(int j=0;j<week;j++)
						{
							System.out.print("\t");
						}
					}
					// 1�Ϻ��� ���
					System.out.printf("%2d\t",i);
					week++;// ���� ����
					if(week>6) // �Ͽ����̸� (6=�����)
					{
						week=0;
						System.out.println();
					}
				}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int year=input("�⵵");
        int month=input("��");
        datePrint(year, month);
	}

}







