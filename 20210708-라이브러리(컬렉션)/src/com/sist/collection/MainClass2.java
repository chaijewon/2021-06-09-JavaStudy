package com.sist.collection;
// java.util
import java.util.*;
import com.sist.dao.*;
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MovieDAO dao=new MovieDAO();
        ArrayList<Movie> list=dao.movieAllData(); // ���׸��� (���������� ����ȭ)
        // �⺻���������� ��� �� �� ����  ArrayList<Integer> <Ŭ������>
        // ArrayList<String> , ArrayList<Double> , ArrayList<Long> , ArrayList<Byte>
        // ArrayList<Movie> , ArrayList<Board> , ArrayList<Reserve>
        // ����� ���� Ŭ���� => �Ѱ��� ��� ������ �ѹ��� ���� �� �������� Ŭ���� 
        // 1. list�� ����� ��ȭ ������ �?
        System.out.println("����� ��ȭ ����:"+list.size());
        // 2. ��ȭ ��ü ��� 
        for(Movie m:list)
        {
        	System.out.println(m.getMno()+"."+m.getTitle());
        }
        System.out.println("=================================");
        // 3. �󼼺��� 
        Scanner scan=new Scanner(System.in);
        System.out.print("��ȭ ��ȣ�� Ŭ��:");
        int mno=scan.nextInt(); // 1~1281
        Movie m=list.get(mno-1);// mno = 1 ==> index��ȣ 0
        System.out.println("======= ��ȭ �󼼺��� ============================");
        System.out.println("����:"+m.getMno());
        System.out.println("��ȭ��:"+m.getTitle());
        System.out.println("�帣:"+m.getGenre());
        System.out.println("����:"+m.getDirector());
        System.out.println("�⿬:"+m.getActor());
        System.out.println("�ٰŸ�:"+m.getStory());
        System.out.println("================================================");
        System.out.println("=========== ���ΰ����� ��ȭã�� =====================");
        System.out.print("���� �Է�:");
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
        	System.out.println("�˻��� ��� �����ϴ�!!");
        }
        System.out.println("�˻��� ����� �� "+count+"�� �ֽ��ϴ�!!");
        System.out.println("===============================================");
        System.out.println("============= �帣�� ã�� =======================");
        System.out.print("�帣�� �Է�:");
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







