package com.sist.util;
import java.util.*;


// Calendar:���ϱ��� Ȯ�� , Date(����Ŭ)
/*
 *     ������
 *       CHAR
 *       VARCHAR2
 *       CLOB ====================> String
 *     ������
 *       NUMBER(4)=> ����  ======== int
 *       NUMBER(7,2)=> �Ǽ� ======= double
 *     ��¥��
 *       DATE 
 *       TIMESTAMP  ========= java.util.Date
 *     ��Ÿ�� 
 *       BFILE 
 *       BLOB  ============ InputStream (io)
 */
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // �� �� ���� �Է��� �޾Ƽ� => �ش����� ������ Ȯ�� 
		Scanner scan=new Scanner(System.in);
		System.out.print("�⵵ �Է�:");
		int year=scan.nextInt();
		System.out.print("�� �Է�:");
		int month=scan.nextInt();
		System.out.print("�� �Է�:");
		int day=scan.nextInt();
		/*
		 *   ���� ���ϱ� 
		 *   => ���⵵������ �� 1�⵵ 1�� 1�� => 2021.12.31 
		 *   => ���ޱ����� ��   2021.01.01 ~ 2021.06.30 
		 *   => day
		 *   ========================================= +
		 *   %7 ==> ���� 
		 */
		// ���⵵������ �� 
		/*int total=(year-1)*365
				 +(year-1)/4
				 -(year-1)/100
				 +(year-1)/400;
		// ���ޱ����� �� 
		int[] lastday={31,28,31,30,31,30,
				      31,31,30,31,30,31};
		// ���� ����
		if((year%4==0 && year%100!=0) || (year%400==0))
			  lastday[1]=29;
		else
			  lastday[1]=28;
		for(int i=0;i<month-1;i++)
		{
			total+=lastday[i];
		}
		
		total+=day;
		// ���� ���ϱ�
		int week=total%7;
		String[] strWeek={"��","��","ȭ","��","��","��","��"};
		System.out.printf("%d�� %d�� %d���� %s�����Դϴ�\n",year,month,day,strWeek[week]);
		*/
		Calendar cal=Calendar.getInstance(); // Calendar => �߻�Ŭ���� 
		// getInstance() , newInstance() => �̱��� => �ѹ��� ������ ��� 
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1); // 0~11
		cal.set(Calendar.DATE, 1);
		int week=cal.get(Calendar.DAY_OF_WEEK);//���� ==> 1~7
		int lastday=cal.getActualMaximum(Calendar.DATE);// ������ ������ ���� �о� �ö� 
		System.out.println(lastday);
		String[] strWeek={"��","��","ȭ","��","��","��","��"};
		System.out.printf("%d�⵵ %d�� %d���� %s�����Դϴ�\n",cal.get(Calendar.YEAR),
				cal.get(Calendar.MONTH)+1,cal.get(Calendar.DATE),strWeek[week-1]);
		for(int i=0;i<7;i++)
		{
			System.out.print(strWeek[i]+"\t");
		}
		System.out.println();
		week=week-1;
		// ��¥ ��� 
		for(int i=1;i<=lastday;i++)
		{
			if(i==1)
			{
				for(int j=0;j<week;j++)
				{
					System.out.print("\t");
				}
			}
			System.out.printf("%2d\t",i);
			
			week++;
			if(week>6)// �Ͽ����̸� 
			{
				week=0;// 0~6
				System.out.println();// ������ ��� 
			}
		}
	}

}








