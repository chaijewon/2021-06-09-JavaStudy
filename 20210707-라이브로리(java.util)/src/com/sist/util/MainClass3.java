package com.sist.util;
import java.util.*;


// Calendar:요일까지 확인 , Date(오라클)
/*
 *     문자형
 *       CHAR
 *       VARCHAR2
 *       CLOB ====================> String
 *     숫자형
 *       NUMBER(4)=> 정수  ======== int
 *       NUMBER(7,2)=> 실수 ======= double
 *     날짜형
 *       DATE 
 *       TIMESTAMP  ========= java.util.Date
 *     기타형 
 *       BFILE 
 *       BLOB  ============ InputStream (io)
 */
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 년 월 일을 입력을 받아서 => 해당일의 요일을 확인 
		Scanner scan=new Scanner(System.in);
		System.out.print("년도 입력:");
		int year=scan.nextInt();
		System.out.print("월 입력:");
		int month=scan.nextInt();
		System.out.print("일 입력:");
		int day=scan.nextInt();
		/*
		 *   요일 구하기 
		 *   => 전년도까지의 합 1년도 1월 1일 => 2021.12.31 
		 *   => 전달까지의 합   2021.01.01 ~ 2021.06.30 
		 *   => day
		 *   ========================================= +
		 *   %7 ==> 요일 
		 */
		// 전년도까지의 합 
		/*int total=(year-1)*365
				 +(year-1)/4
				 -(year-1)/100
				 +(year-1)/400;
		// 전달까지의 합 
		int[] lastday={31,28,31,30,31,30,
				      31,31,30,31,30,31};
		// 윤년 조건
		if((year%4==0 && year%100!=0) || (year%400==0))
			  lastday[1]=29;
		else
			  lastday[1]=28;
		for(int i=0;i<month-1;i++)
		{
			total+=lastday[i];
		}
		
		total+=day;
		// 요일 구하기
		int week=total%7;
		String[] strWeek={"일","월","화","수","목","금","토"};
		System.out.printf("%d년 %d월 %d일은 %s요일입니다\n",year,month,day,strWeek[week]);
		*/
		Calendar cal=Calendar.getInstance(); // Calendar => 추상클래스 
		// getInstance() , newInstance() => 싱글턴 => 한번반 생성후 사용 
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1); // 0~11
		cal.set(Calendar.DATE, 1);
		int week=cal.get(Calendar.DAY_OF_WEEK);//요일 ==> 1~7
		int lastday=cal.getActualMaximum(Calendar.DATE);// 각달의 마지막 날을 읽어 올때 
		System.out.println(lastday);
		String[] strWeek={"일","월","화","수","목","금","토"};
		System.out.printf("%d년도 %d월 %d일은 %s요일입니다\n",cal.get(Calendar.YEAR),
				cal.get(Calendar.MONTH)+1,cal.get(Calendar.DATE),strWeek[week-1]);
		for(int i=0;i<7;i++)
		{
			System.out.print(strWeek[i]+"\t");
		}
		System.out.println();
		week=week-1;
		// 날짜 출력 
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
			if(week>6)// 일요일이면 
			{
				week=0;// 0~6
				System.out.println();// 다음을 출력 
			}
		}
	}

}








