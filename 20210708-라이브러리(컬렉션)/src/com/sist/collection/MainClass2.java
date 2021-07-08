package com.sist.collection;
// java.util
import java.util.*;
import com.sist.dao.*;
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MovieDAO dao=new MovieDAO();
        ArrayList<Movie> list=dao.movieAllData(); // 제네릭스 (데이터형의 통일화)
        // 기본데이터형은 사용 할 수 없다  ArrayList<Integer> <클래스명>
        // ArrayList<String> , ArrayList<Double> , ArrayList<Long> , ArrayList<Byte>
        // ArrayList<Movie> , ArrayList<Board> , ArrayList<Reserve>
        // 사용자 정의 클래스 => 한개의 모든 정보를 한번에 저장 할 목적으로 클래스 
        // 1. list에 저장된 영화 정보가 몇개?
        System.out.println("저장된 영화 갯수:"+list.size());
        // 2. 영화 전체 출력 
        for(Movie m:list)
        {
        	System.out.println(m.getMno()+"."+m.getTitle());
        }
        System.out.println("=================================");
        // 3. 상세보기 
        Scanner scan=new Scanner(System.in);
        System.out.print("영화 번호를 클릭:");
        int mno=scan.nextInt(); // 1~1281
        Movie m=list.get(mno-1);// mno = 1 ==> index번호 0
        System.out.println("======= 영화 상세보기 ============================");
        System.out.println("순위:"+m.getMno());
        System.out.println("영화명:"+m.getTitle());
        System.out.println("장르:"+m.getGenre());
        System.out.println("감독:"+m.getDirector());
        System.out.println("출연:"+m.getActor());
        System.out.println("줄거리:"+m.getStory());
        System.out.println("================================================");
        System.out.println("=========== 주인공으로 영화찾기 =====================");
        System.out.print("배우명 입력:");
        String actor=scan.next();
        boolean bCheck=false;
        int count=0;
        for(Movie mm:list)
        {
        	if(mm.getActor().contains(actor))
        	{
        		bCheck=true;
        		count++;
        		System.out.println(mm.getTitle());
        	}
        }
        
        if(!bCheck)
        {
        	System.out.println("검색된 결과 없습니다!!");
        }
        System.out.println("검색된 결과가 총 "+count+"건 있습니다!!");
        System.out.println("===============================================");
        System.out.println("============= 장르별 찾기 =======================");
        System.out.print("장르를 입력:");
        String genre=scan.next();
        for(Movie mm:list)
        {
        	if(mm.getGenre().contains(genre))
        	{
        		System.out.println(mm.getTitle()+"("+mm.getGenre()+")");
        	}
        }
        
	}

}







