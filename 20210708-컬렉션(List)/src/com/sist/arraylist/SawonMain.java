package com.sist.arraylist;
import java.text.MessageFormat;
import java.util.*;
public class SawonMain {

	public int menu()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("====== 메뉴 ======");
		System.out.println("1. 사원 전체 목록 출력");
		System.out.println("2. 사원 추가");
		System.out.println("3. 사원 수정");
		System.out.println("4. 사원 삭제");
		System.out.println("5. 사원 상세보기");
		System.out.println("6. 프로그램 종료");
		System.out.println("=================");
		System.out.print("메뉴 선택:");
		return scan.nextInt();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        SawonMain sm=new SawonMain(); //sm메모리 주소 => menu
        SawonManager ss=new SawonManager();
        while(true)
        {
        	int m=sm.menu();
        	if(m==6)
        	{
        		System.out.println("종료합니다!!");
        		break;
        	}
        	else if(m==1)
        	{
        		ArrayList<Sawon> list=ss.sawonListData();
        		System.out.println("========= 사원 목록 =================================");
        		String msg="{0}\t{1}\t{2}\t{3}\t{4}\t{5}";
        		for(Sawon s:list)
        		{
        			Object[] sa={s.getSabun(),s.getName(),s.getJob(),s.getDept(),
        					    s.getLoc(),s.getPay()};
        			String data=MessageFormat.format(msg, sa);
        			System.out.println(data);
        		}
        	}
        	else if(m==2)
        	{
        		Scanner scan=new Scanner(System.in);
        		System.out.print("이름 입력:");
        		String name=scan.next();
        		System.out.print("직위 입력:");
        		String job=scan.next();
        		System.out.print("부서 입력:");
        		String dept=scan.next();
        		System.out.print("근무지 입력:");
        		String loc=scan.next();
        		System.out.print("연봉 입력:");
        		long pay=scan.nextLong();
        		// 사번 
        		ArrayList<Sawon> list=ss.sawonListData();
        		int max=list.size();
        		Sawon sa=list.get(max-1);
        		int sabun=sa.getSabun()+1;
        		
        		Sawon in=new Sawon();
        		in.setSabun(sabun);
        		in.setName(name);
        		in.setJob(job);
        		in.setDept(dept);
        		in.setLoc(loc);
        		in.setPay(pay);
        		ss.sawonInsert(in);
        		System.out.println("사원 등록 완료!!");
        	}
        	else if(m==4)
        	{
        		Scanner scan=new Scanner(System.in);
        		System.out.print("삭제할 사번 입력:");
        		int sabun=scan.nextInt();
        		ss.sawonDelete(sabun);
        		System.out.println("사원 삭제 완료!!");
        	}
        }
	}

}







