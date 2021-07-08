package com.sist.dao;
// ����Ŭ���� ������ �б� ==> ����� ArrayList�� ���� 
import java.util.*;
import java.sql.*;
/*
 *   ��ü���� 
 *     ���� : ����
 *     =========== 
 *           �� => ����ڿ� ��ü�� Ŀ�´����̼�(����) 
 *           �Խ���(2002) ====> �Խ���(�亯��) 2005 ====> �Խ���(���) 2010 ====> �ǽð� ä�� 2016 =====>
 *           ê�� (�ֱ�) 
 *      ��� ��� 
 *      ========
 *       1. ������ ������ ==> extends (���)
 *       2. �ִ� �״��  ===> ����
 *                                                                
 */
public class MovieDAO {
   // ����Ŭ ���� ��ü
   private Connection conn; // ���� Ŭ���� => ������� ������ �״�� ���(������� ���)
   // ����Ŭ SQL���� ��ü
   private PreparedStatement ps;  // �ۼ��� 
   // ����Ŭ ���� �ּ� 
   private final String URL="jdbc:oracle:thin:@211.238.142.181:1521:XE";
   // XE => �����ͺ��̽� (������ ����) , ���� (���̺�) ==> FROM table_name => naver_movie
   // ���α׷�
   // 1. ����̹� ���
   public MovieDAO()
   {
	   try
	   {
		   Class.forName("oracle.jdbc.driver.OracleDriver");
		   // forName(String s) throws ClassNotFoundException 
		   //                          ======================= Check Exception (�ݵ�� ����ó��)
		   // java.lang(������ ����) , java.util , java.io, java.sql, java.net (Check Exception)
	   }catch(Exception ex){}
	   
   }
   // 2. ����Ŭ ����
   public void getConnection()
   {
	   try
	   {
		   conn=DriverManager.getConnection(URL,"hr","happy");
		   // conn hr/happy
	   }catch(Exception ex) {}
   }
   // 3. ����Ŭ ����
   public void disConnection()
   {
	   try
	   {
		   if(ps!=null) ps.close(); // ��� ���̸� ����
		   if(conn!=null) conn.close();
		   // exit
	   }catch(Exception ex) {}
   }
   /*
    *    ���α׷� 
    *    ======= �����ڰ� �����ϰ� �ҽ��ڵ� (����) : �����ͺ��̽� , ��Ʈ��ũ 
    *                                         =========
    *                                         ������ => ���� for
    *                                         =====
    *                                         ����¡ => ���� for
    */
   // 4. ���̹� ��ȭ ��ü�� �о� �´� => �޸� ���� (����(�迭),����(List)) => 1200 (����¡���)
   public ArrayList<Movie> movieAllData()
   {
	   ArrayList<Movie> list=new ArrayList<Movie>(); // 1200���� Movie�����Ͱ� ���� 
	   // �÷���=> �ټ��� �����Ͱ� �ִ� ��� , ������ �����ϱ� ���� , ��� �����ڰ� �����ϰ� ���(ǥ��ȭ)
	   try
	   {
		   // ����
		   getConnection();
		   /*
		    *   private int mno; // ��ȭ ���� ��ȣ
			    private String title;
			    private String genre;
			    private String director;
			    private String actor;
			    private String story;
			    private String key;
		    */
		   // SQL���� ����
		   String sql="SELECT mno,title,genre,director,actor,story FROM naver_movie "
				     +"ORDER BY mno ASC"; // �����Ͱ� ���� ��쿡�� �ӵ��� �������� => INDEX
		   /*
		    *  String sql="SELECT /*+ INDEX_ASC(naver_movie,nm_mno_pk) * / mno,title,genre,director,actor,story FROM naver_movie"    
		    */
		   // mno => rank
		   // ����
		   ps=conn.prepareStatement(sql);
		   // ����Ŭ�κ��� ������ �ޱ�
		   ResultSet rs=ps.executeQuery();  // ����� ��� �����͸� rs��� �޸� ������ ���� 
		   // list,�迭�� ���� 
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
		   // rs�ִ� �����͸� �о�ͼ� ArrayList�� ���� 
		   /*
		    *    =================================
		    *      id     name     sex   ....  
		    *    =================================
		    *     aaa     hong     man  =====> ���⼭ => ������ �������鼭 ���پ� �б�(record) next()
		    *     bbb     shim     woman
		    *     ccc     park     man
		    *     ddd     kim      woman
		    *     eee     kang     man  =====> ���⼭ => ���� �ö󰣴�  (previous)
		    *    =================================
		    *    �޸𸮿� ���� ==> �� �޸𸮿� ����  1  2  3
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
		   // ���� Ȯ�� => �ҽ��� ������ ���� 
		   System.out.println(ex.getMessage());
	   }
	   finally
	   {
		   // ������ ����Ŭ ���� �ݴ´� 
		   disConnection();
	   }
	   return list;
   }
   // 5. ã�� , 6. �󼼺��� , 7. �����ϱ� , 8. ��ȭ �߰� , 9. ��ȭ ���� , 10. ��ȭ���� , 11. �¼�....
   /*
    *    ������ ��Ƽ� ���� 
    *      = ������ ���� ===> �迭 
    *      = �������� ������ �� �� ���� ==> ������ (�÷���) => ��� (Ŭ����) �ε�����ȣ�� ���������� ���� 
    *                                 =============
    */
}









