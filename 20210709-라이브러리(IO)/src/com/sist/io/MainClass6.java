package com.sist.io;

import java.util.*;
import java.io.*;
// ��ü������ ���� (��ü(����)=>���� �޸𸮿� ������ ����) 
// ������ȭ => ����=>����
class Sawon implements Serializable
{
	private int sabun;
	private String name;
	private String dept;
	private String job;
	private int pay;
	public int getSabun() {
		return sabun;
	}
	public void setSabun(int sabun) {
		this.sabun = sabun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	
}
public class MainClass6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	ArrayList<Sawon> list=new ArrayList<Sawon>();
        	Sawon s=new Sawon();
        	s.setSabun(1);
        	s.setName("ȫ�浿");
        	s.setDept("���ߺ�");
        	s.setJob("�븮");
        	s.setPay(3000);
        	list.add(s);
        	
        	s=new Sawon();
        	s.setSabun(2);
        	s.setName("��û��");
        	s.setDept("�ѹ���");
        	s.setJob("�븮");
        	s.setPay(3000);
        	list.add(s);
        	
        	s=new Sawon();
        	s.setSabun(3);
        	s.setName("�̼���");
        	s.setDept("������");
        	s.setJob("�븮");
        	s.setPay(3000);
        	list.add(s);
        	// list => ���Ͽ� ���� 
        	ObjectOutputStream ois=
        			new ObjectOutputStream(new FileOutputStream("c:\\javaDev\\sawon.txt"));
        	ois.writeObject(list);
        	ois.close();
        	System.out.println("���� �Ϸ�");
        	
        }catch(Exception ex){}
	}

}












