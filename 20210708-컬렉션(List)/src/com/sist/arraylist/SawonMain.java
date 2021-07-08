package com.sist.arraylist;
import java.text.MessageFormat;
import java.util.*;
public class SawonMain {

	public int menu()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("====== �޴� ======");
		System.out.println("1. ��� ��ü ��� ���");
		System.out.println("2. ��� �߰�");
		System.out.println("3. ��� ����");
		System.out.println("4. ��� ����");
		System.out.println("5. ��� �󼼺���");
		System.out.println("6. ���α׷� ����");
		System.out.println("=================");
		System.out.print("�޴� ����:");
		return scan.nextInt();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        SawonMain sm=new SawonMain(); //sm�޸� �ּ� => menu
        SawonManager ss=new SawonManager();
        while(true)
        {
        	int m=sm.menu();
        	if(m==6)
        	{
        		System.out.println("�����մϴ�!!");
        		break;
        	}
        	else if(m==1)
        	{
        		ArrayList<Sawon> list=ss.sawonListData();
        		System.out.println("========= ��� ��� =================================");
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
        		System.out.print("�̸� �Է�:");
        		String name=scan.next();
        		System.out.print("���� �Է�:");
        		String job=scan.next();
        		System.out.print("�μ� �Է�:");
        		String dept=scan.next();
        		System.out.print("�ٹ��� �Է�:");
        		String loc=scan.next();
        		System.out.print("���� �Է�:");
        		long pay=scan.nextLong();
        		// ��� 
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
        		System.out.println("��� ��� �Ϸ�!!");
        	}
        	else if(m==4)
        	{
        		Scanner scan=new Scanner(System.in);
        		System.out.print("������ ��� �Է�:");
        		int sabun=scan.nextInt();
        		ss.sawonDelete(sabun);
        		System.out.println("��� ���� �Ϸ�!!");
        	}
        }
	}

}







