package com.sist.dao;
import java.util.*;
import java.sql.*;
public class EmpDAO {
   private Connection conn; // ����Ŭ ���� 
   private PreparedStatement ps; // ����Ŭ ��� (SQL���� ���� = ������ �б�)
   private final String URL="jdbc:oracle:thin:@211.238.142.181:1521:XE";
   // ����(�����ͺ��̽�) , ����(���̺�)  => �����ؼ� ����� 
   //1. ����̹� ��� (�ѹ��� ����Ѵ�) => �ѹ��� ȣ���ϴ� �޼ҵ� = ������ 
   public EmpDAO()
   {
	   // ������ => �ʱ�ȭ
	   try
	   {
		   // ������ ���� => ClassNotFoundException 
		   Class.forName("oracle.jdbc.driver.OracleDriver");
	   }catch(Exception ex) {}
   }
   //2. ����Ŭ ���� 
   public void getConnection()
   {
	  try
	  {
		  conn=DriverManager.getConnection(URL,"hr","happy");
	  }catch(Exception ex) {}
   }   //3. ����Ŭ ���� ����
   public void disCinnection()
   {
	   try
	   {
		   //null�� �ƴϸ� ����
		   if(ps!=null) ps.close();
		   if(conn!=null) conn.close();
	   }catch(Exception ex) {}
   }
   //4. ��� => ������ �б� 
   public Emp[] empListData()
   {
	   Emp[] emp=new Emp[14];//ArrayList<Emp>
	   try
	   {
		   // 1. ����
		   getConnection();
		   // 2. ����Ŭ�� ������ ����
		   String sql="SELECT * FROM emp";
		   // 3. �����Ŀ� ������� �޴´� 
		   ps=conn.prepareStatement(sql);
		   ResultSet rs=ps.executeQuery();
		   // 4. ���� ���� Emp[]�� ���� 
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
		   // ������ġ 
		   ex.printStackTrace();
	   }
	   finally
	   {
		   // try , catch ������� ������ �ݱ� 
		   disCinnection();
	   }
	   return emp;
   }
}







