package com.sist.dao;
import java.util.*;
/*
 *    empno (사번) int
 *    ename (이름) String
 *    job   (직위) String 
 *    mgr   (사수사번) int
 *    hiredate (입사일) Date
 *    sal   (급여)  int
 *    comm  (성과급) int 
 *    deptno (부서번호) ==> 14명 int
 *    
 *    int a,b,c,d,e,f~z => 26
 */
public class Emp {
    private int empno,mgr,sal,comm,deptno;
    private String ename,job;
    private Date hiredate;
    // 접근 (읽기/쓰기 => getter/setter)
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public int getMgr() {
		return mgr;
	}
	public void setMgr(int mgr) {
		this.mgr = mgr;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getComm() {
		return comm;
	}
	public void setComm(int comm) {
		this.comm = comm;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	   
   
}
