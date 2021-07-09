package com.sist.io;

import java.util.*;
import java.io.*;
// 객체단위로 저장 (객체(병렬)=>직렬 메모리에 저장이 가능) 
// 역직렬화 => 직렬=>병렬
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
        	s.setName("홍길동");
        	s.setDept("개발부");
        	s.setJob("대리");
        	s.setPay(3000);
        	list.add(s);
        	
        	s=new Sawon();
        	s.setSabun(2);
        	s.setName("심청이");
        	s.setDept("총무부");
        	s.setJob("대리");
        	s.setPay(3000);
        	list.add(s);
        	
        	s=new Sawon();
        	s.setSabun(3);
        	s.setName("이순신");
        	s.setDept("영업부");
        	s.setJob("대리");
        	s.setPay(3000);
        	list.add(s);
        	// list => 파일에 저장 
        	ObjectOutputStream ois=
        			new ObjectOutputStream(new FileOutputStream("c:\\javaDev\\sawon.txt"));
        	ois.writeObject(list);
        	ois.close();
        	System.out.println("저장 완료");
        	
        }catch(Exception ex){}
	}

}












