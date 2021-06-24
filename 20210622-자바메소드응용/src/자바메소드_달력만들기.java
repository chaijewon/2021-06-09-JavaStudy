// 입력 
import java.util.Scanner;
/*
 *    달력 만들기 
 *    1. 사용자 입력  => year,month
 *    2. 요청한 달의 요일확인 (1일) 
 *    3. 달력을 출력 
 *    ============================
 *    = 중복 코딩을 제거 
 *    = 다음에 사용할 수 있는 기능 
 */
public class 자바메소드_달력만들기 {
    // 사용자 입력 => 메소드
	int year,month,week;
	static int input(String s)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print(s+" 입력:");
		return scan.nextInt();
	}
	// 처리 => 요일 구하기 
	static int getWeek(int year,int month)
	{
		        // 각달의 마지막 날짜
				int[] lastday={
						31,28,31,30,31,30,
						31,31,30,31,30,31
				};
				// 6월 1일자의 요일 구하기
				// 전년도까지의 총날 수
				int total=(year-1)*365 +(year-1)/4
						               -(year-1)/100
						               +(year-1)/400;
				// 전달까지의 총날 수 
				if((year%4==0 && year%100!=0)|| (year%400==0)) // 윤년 조건 (ERP) 
					// 2월달이 29
					lastday[1]=29;
				else
					lastday[1]=28;
				
				for(int i=0;i<month-1;i++)
				{
					total+=lastday[i];
				}
				// +1
				total++; // 6월 1일자 
				// %7 => 요일을 구할 수 있다 
				int week=total%7; // 1년도 1월 1일 => 월 
				return week;
	}
	static void datePrint(int year,int month)
	{
		int week=getWeek(year, month);
		
		int[] lastday={
				31,28,31,30,31,30,
				31,31,30,31,30,31
		};
		
		if((year%4==0 && year%100!=0)|| (year%400==0)) // 윤년 조건 (ERP) 
			// 2월달이 29
			lastday[1]=29;
		else
			lastday[1]=28;
		
		System.out.printf("%d년도 %d월\n",year,month);
		String[] strWeek={"일","월","화","수","목","금","토"};
		for(int i=0;i<strWeek.length;i++)
		{
			System.out.print(strWeek[i]+"\t");
		}
		System.out.println("\n");
		
		// 출력 (달력)
				for(int i=1;i<=lastday[month-1];i++)
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
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int year=input("년도");
        int month=input("월");
        datePrint(year, month);
	}

}







