package com.sist.dao;
// 캡슐화 => 데이터 은닉화 => 접근은 메소드로 접근
/*
 *    Emp 사원 정보(오라클 14명) 
 *    empno : 사번
 *    ename : 이름
 *    job   : 직위
 *    mgr   : 사수번호
 *    hiredate : 입사일
 *    sal   : 급여
 *    comm  : 성과급 
 *    deptno : 부사번호
 *    ==> 오라클 (예외처리 => 네트워크 (컴파일 예외)
 *    
 *    1. 사원 1명에 대한 정보 저장 => 사용자 정의 데이터형 => 변수 설정 (읽기(getter),쓰기(setter))
 */
public class Emp {
    private int empno;
    private String ename;
    private String job;
    private int sal;
    private int comm;
    private int deptno;
    
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
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
	   
   
   
}
