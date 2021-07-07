package com.sist.dao;
import java.util.*;
import java.sql.*;
public class EmpDAO {
   private Connection conn; // 오라클 연결 
   private PreparedStatement ps; // 오라클 통신 (SQL문장 전송 = 데이터 읽기)
   private final String URL="jdbc:oracle:thin:@211.238.142.181:1521:XE";
   // 폴더(데이터베이스) , 파일(테이블)  => 구분해서 저장됨 
   //1. 드라이버 등록 (한번만 등록한다) => 한번만 호출하는 메소드 = 생성자 
   public EmpDAO()
   {
	   // 생성자 => 초기화
	   try
	   {
		   // 컴파일 예외 => ClassNotFoundException 
		   Class.forName("oracle.jdbc.driver.OracleDriver");
	   }catch(Exception ex) {}
   }
   //2. 오라클 연결 
   public void getConnection()
   {
	  try
	  {
		  conn=DriverManager.getConnection(URL,"hr","happy");
	  }catch(Exception ex) {}
   }   //3. 오라클 연결 해제
   public void disCinnection()
   {
	   try
	   {
		   //null이 아니면 연결
		   if(ps!=null) ps.close();
		   if(conn!=null) conn.close();
	   }catch(Exception ex) {}
   }
   //4. 기능 => 데이터 읽기 
   public Emp[] empListData()
   {
	   Emp[] emp=new Emp[14];//ArrayList<Emp>
	   try
	   {
		   // 1. 연결
		   getConnection();
		   // 2. 오라클로 문장을 전송
		   String sql="SELECT * FROM emp";
		   // 3. 실행후에 결과값을 받는다 
		   ps=conn.prepareStatement(sql);
		   ResultSet rs=ps.executeQuery();
		   // 4. 받은 값을 Emp[]에 저장 
		   int i=0;
		   while(rs.next())
		   {
			   emp[i]=new Emp();
			   emp[i].setEmpno(rs.getInt(1)); // getInt() getString() getDouble() getDate()
			   emp[i].setEname(rs.getString(2));
			   emp[i].setJob(rs.getString(3));
			   emp[i].setMgr(rs.getInt(4));
			   emp[i].setHiredate(rs.getDate(5));
			   emp[i].setSal(rs.getInt(6));
			   emp[i].setComm(rs.getInt(7));
			   emp[i].setDeptno(rs.getInt(8));
			   i++;
		   }
	   }catch(Exception ex)
	   {
		   // 에러위치 
		   ex.printStackTrace();
	   }
	   finally
	   {
		   // try , catch 상관없이 무조건 닫기 
		   disCinnection();
	   }
	   return emp;
   }
}







