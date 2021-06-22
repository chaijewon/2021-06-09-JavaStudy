import java.util.Scanner;


public class 달력메소드 {
    // 입력 
	static int input(String s)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print(s+" 입력:");
		return scan.nextInt();
	}
	static int lastday(int year,int month)
	{
		int[] lastday={
				31,28,31,30,31,30,
				31,31,30,31,30,31
		};
		if((year%4==0 && year%100!=0)|| (year%400==0)) // 윤년 조건 (ERP) 
			// 2월달이 29
			lastday[1]=29;
		else
			lastday[1]=28;
		
		return lastday[month];
	}
	
	// 처리
	static int getWeek(int year,int month)
	{
		int total=(year-1)*365 +(year-1)/4
				               -(year-1)/100
				               +(year-1)/400;
		for(int i=0;i<month-1;i++)
		{
			total+=lastday(year,i);
		}
		// +1
		total++; // 6월 1일자 
		// %7 => 요일을 구할 수 있다 
		int week=total%7; // 1년도 1월 1일 => 월  
		return  week;
	}
	// 출력 
	static void datePrint(int year,int month)
	{
		int week=getWeek(year, month);
		
		System.out.printf("%d년도 %d월\n",year,month);
		String[] strWeek={"일","월","화","수","목","금","토"};
		for(int i=0;i<strWeek.length;i++)
		{
			System.out.print(strWeek[i]+"\t");
		}
		System.out.println("\n");
		
		for(int i=1;i<=lastday(year,month-1);i++)
		{
			if(i==1) // 첫줄에 출력시에는 요일까지 공백 출력 
			{
				// 빈공백 출력 
				for(int j=0;j<week;j++)
				{
					System.out.print("\t");
				}
			}
			// 1일부터 출력
			System.out.printf("%2d\t",i);
			week++;// 요일 증가
			if(week>6) // 일요일이면 (6=토요일)
			{
				week=0;
				System.out.println();
			}
		}
		System.out.println();
	}
	static void process()
	{
		    int year=input("년도");
	        int month=input("월");
	        datePrint(year, month);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       while(true)
       {
    	   process();
       }
	}

}
