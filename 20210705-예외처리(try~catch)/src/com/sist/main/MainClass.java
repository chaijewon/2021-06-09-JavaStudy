package com.sist.main;
import com.sist.dao.*;// ��Ű���� �ٸ��� import�� ����Ѵ� 
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        EmpDAO dao=new EmpDAO();
        Emp[] emp=dao.empAllData();// => ������ 
        for(Emp e:emp)
        {
        	System.out.println(e.getEmpno()+" "
        			+e.getEname()+" "
        			+e.getJob()+" "
        			+e.getSal()+" ");
        }
	}

}
