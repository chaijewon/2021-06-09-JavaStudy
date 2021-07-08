package com.sist.dao;
// 오라클에서 데이터 읽기 ==> 제어는 ArrayList로 제어 
import java.util.*;
import java.sql.*;
/*
 *   객체지향 
 *     목적 : 재사용
 *     =========== 
 *           웹 => 사용자와 업체의 커뮤니케이션(소통) 
 *           게시판(2002) ====> 게시판(답변형) 2005 ====> 게시판(댓글) 2010 ====> 실시간 채팅 2016 =====>
 *           챗봇 (최근) 
 *      어떻게 사용 
 *      ========
 *       1. 변경할 것인지 ==> extends (상속)
 *       2. 있는 그대로  ===> 포함
 *                                                                
 */
public class MovieDAO {
   // 오라클 연결 객체
   private Connection conn; // 포함 클래스 => 만들어진 내용을 그대로 사용(변경없이 사용)
   // 오라클 SQL문장 객체
   private PreparedStatement ps;  // 송수신 
   // 오라클 연결 주소 
   private final String URL="jdbc:oracle:thin:@211.238.142.181:1521:XE";
   // XE => 데이터베이스 (폴더와 동일) , 파일 (테이블) ==> FROM table_name => naver_movie
   // 프로그램
   // 1. 드라이버 등록
   public MovieDAO()
   {
	   try
	   {
		   Class.forName("oracle.jdbc.driver.OracleDriver");
		   // forName(String s) throws ClassNotFoundException 
		   //                          ======================= Check Exception (반드시 예외처리)
		   // java.lang(생략이 가능) , java.util , java.io, java.sql, java.net (Check Exception)
	   }catch(Exception ex){}
	   
   }
   // 2. 오라클 연결
   public void getConnection()
   {
	   try
	   {
		   conn=DriverManager.getConnection(URL,"hr","happy");
		   // conn hr/happy
	   }catch(Exception ex) {}
   }
   // 3. 오라클 해제
   public void disConnection()
   {
	   try
	   {
		   if(ps!=null) ps.close(); // 통신 중이면 종료
		   if(conn!=null) conn.close();
		   // exit
	   }catch(Exception ex) {}
   }
   /*
    *    프로그램 
    *    ======= 개발자가 동일하게 소스코딩 (쉽다) : 데이터베이스 , 네트워크 
    *                                         =========
    *                                         구구단 => 이차 for
    *                                         =====
    *                                         페이징 => 일차 for
    */
   // 4. 네이버 영화 전체를 읽어 온다 => 메모리 저장 (고정(배열),가변(List)) => 1200 (페이징기법)
   public ArrayList<Movie> movieAllData()
   {
	   ArrayList<Movie> list=new ArrayList<Movie>(); // 1200개의 Movie데이터가 들어간다 
	   // 컬렉션=> 다수의 데이터가 있는 경우 , 관리를 쉽게하기 위해 , 모든 개발자가 동일하게 사용(표준화)
	   try
	   {
		   // 연결
		   getConnection();
		   /*
		    *   private int mno; // 영화 고유 번호
			    private String title;
			    private String genre;
			    private String director;
			    private String actor;
			    private String story;
			    private String key;
		    */
		   // SQL문장 제작
		   String sql="SELECT mno,title,genre,director,actor,story FROM naver_movie "
				     +"ORDER BY mno ASC"; // 데이터가 많은 경우에는 속도가 느려진다 => INDEX
		   /*
		    *  String sql="SELECT /*+ INDEX_ASC(naver_movie,nm_mno_pk) * / mno,title,genre,director,actor,story FROM naver_movie"    
		    */
		   // mno => rank
		   // 전송
		   ps=conn.prepareStatement(sql);
		   // 오라클로부터 데이터 받기
		   ResultSet rs=ps.executeQuery();  // 실행된 모든 데이터를 rs라는 메모리 공간에 저장 
		   // list,배열에 저장 
		   while(rs.next())
		   {
			   Movie m=new Movie();
			   m.setMno(rs.getInt(1));
			   m.setTitle(rs.getString(2));
			   m.setGenre(rs.getString(3));
			   m.setDirector(rs.getString(4));
			   m.setActor(rs.getString(5));
			   m.setStory(rs.getString(6));
			   list.add(m);
		   }
		   rs.close();
		   // rs있는 데이터를 읽어와서 ArrayList에 저장 
		   /*
		    *    =================================
		    *      id     name     sex   ....  
		    *    =================================
		    *     aaa     hong     man  =====> 여기서 => 밑으로 내려가면서 한줄씩 읽기(record) next()
		    *     bbb     shim     woman
		    *     ccc     park     man
		    *     ddd     kim      woman
		    *     eee     kang     man  =====> 여기서 => 위로 올라간다  (previous)
		    *    =================================
		    *    메모리에 저장 ==> 빈 메모리에 저장  1  2  3
		    *    ===========================
		    *             3 
		    *    ===========================
		    *             1
		    *    ===========================
		    *             2
		    *    ===========================
		    *    
		    *    ===========================
		    *    
		    *    ===========================
		    */
		   
	   }catch(Exception ex)
	   {
		   // 에러 확인 => 소스를 수정할 목적 
		   System.out.println(ex.getMessage());
	   }
	   finally
	   {
		   // 무조건 오라클 연결 닫는다 
		   disConnection();
	   }
	   return list;
   }
   // 5. 찾기 , 6. 상세보기 , 7. 예매하기 , 8. 영화 추가 , 9. 영화 수정 , 10. 영화삭제 , 11. 좌석....
   /*
    *    데이터 모아서 관리 
    *      = 데이터 고정 ===> 배열 
    *      = 데이터의 갯수가 알 수 없다 ==> 가변형 (컬렉션) => 기능 (클래스) 인덱스번호를 순차적으로 유지 
    *                                 =============
    */
}









