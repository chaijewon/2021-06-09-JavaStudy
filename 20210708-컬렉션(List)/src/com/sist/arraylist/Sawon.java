package com.sist.arraylist;
/*
 *   사번 , 이름 , 직위 , 근무지 , 연봉 => 한 사원에 대한 정보 ==> 사용자 정의 데이터형 => VO , DTO
 *   SawonVO SawonDTO
 */
public class Sawon {
	 // 공개 => 은닉화 (메소드를 통해서 접근 ==> 캡슐화)
	 private int sabun;
	 private String name;
	 private String job;
	 private String dept;
	 private String loc;
	 private long pay;
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
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public long getPay() {
		return pay;
	}
	public void setPay(long pay) {
		this.pay = pay;
	}
	public Sawon() {}
	public Sawon(int sabun, String name, String job, String dept, String loc, long pay) {
		this.sabun = sabun;
		this.name = name;
		this.job = job;
		this.dept = dept;
		this.loc = loc;
		this.pay = pay;
	}
	
}
