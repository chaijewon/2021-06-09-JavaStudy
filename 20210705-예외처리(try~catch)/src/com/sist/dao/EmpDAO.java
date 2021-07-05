package com.sist.dao;
import java.sql.*;
import java.util.*;
/*
 *    자바응용그램    <===========>  오라클 
 *                                데이터 저장 
 *    ==> 네트워크 (반드시 예외처리 해야 된다)
 *    1. 드라이버 설정 
 *    2. 연결 
 *    3. SQL문장 전송 
 *    4. 결과값 받기 
 *    5. 연결 해제 
 */
public class EmpDAO {
   private Connection conn; // 오라클 연결 => 포함 클래스 
   private PreparedStatement ps; // SQL문장 전송 => 결과값을 받아온다 
   private final String URL="jdbc:oracle:thin:@211.238.142.181:1521:XE";// 오라클 주소
   // XE : 데이터베이스 (저장장소(폴더) ==> 파일 , 데이터베이스 => 테이블)
   // 초기화 : 드라이버 등록 => 구현 
   public EmpDAO()
   {
	  try
	  {
	   Class.forName("oracle.jdbc.driver.OracleDriver"); // ClassNotFoundException (컴파일)
	  }catch(ClassNotFoundException ex) 
	  {
		  ex.printStackTrace();
	  }
   }
   // 연결 
   public void getConnection()
   {
	   try
	   {
		   conn=DriverManager.getConnection(URL,"hr","happy");
		   // Connection java.sql.DriverManager.getConnection(String url, String user, String password) 
		   // throws SQLException
	   }catch(SQLException ex) 
	   {
		   ex.printStackTrace();
	   }
   }
   // 연결해제
   public void disConnection()
   {
	   try
	   {
		   if(ps!=null)
			   ps.close(); // 통신선 
		   //void java.sql.Statement.close() throws SQLException
		   if(conn!=null)
			   conn.close();  // 연결이 되어 있다면 => 종료 => 전화기 
	   }catch(SQLException ex)
	   {
		   //ex.printStackTrace();
	   }
   }
   public Emp[] empAllData() 
   {
	   Emp[] emp=new Emp[14];// 가변형 배열 => ArrayList
	   try
	   {
		   // 연결
		   getConnection();
		   String sql="SELECT empno,ename,job,sal FROM emp ORDER BY empno";// SQL (데이터 검색 : SELECT)
		   // 오라클로 전송할 문장 
		   ps=conn.prepareStatement(sql);
		   // 결과값 읽기
		   ResultSet rs=ps.executeQuery();
		   int i=0;
		   while(rs.next())
		   {
			   emp[i]=new Emp();
			   emp[i].setEmpno(rs.getInt(1));
			   emp[i].setEname(rs.getString(2));
			   emp[i].setJob(rs.getString(3));
			   emp[i].setSal(rs.getInt(4));
			   i++;
		   }
		   rs.close();
	   }catch(Exception ex)
	   {
		   ex.printStackTrace();
	   }
	   finally /// 무조건 수행문장 => 서버종료,파일 닫기 ==> 오라클 서버 연결 해제
	   {
		   disConnection();
	   }
	   return emp;
   }
   
}











