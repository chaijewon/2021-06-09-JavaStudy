package com.sist.main;
import java.util.*;
import java.text.*;
import com.sist.dao.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] limits={900,1000,2000,3000,4000};
		// if(sal>=900 && sal<1000) if(sal>=1000 && sal<2000)
		String[] grade={"A���","B���","C���","D���","E���"};
        String msg="���:{0}\n�̸�:{1}\n����:{2}\n���:{3}\n�Ի���:{4}\n�޿�:{5}\n������:{6}\n�μ���ȣ:{7}\n";
        // ������ �б�
        EmpDAO dao=new EmpDAO();
        Emp[] emp=dao.empListData();
        for(Emp e:emp)
        {
        	Object[] obj={e.getEmpno(),e.getEname(),e.getJob(),e.getMgr(),
        			new SimpleDateFormat("yyyy�⵵ MM�� dd��").format(e.getHiredate()),
        			e.getSal(),e.getComm(),e.getDeptno()};
        	String data=MessageFormat.format(msg, obj);
        	System.out.println(data);
        	ChoiceFormat cf=new ChoiceFormat(limits,grade);
        	System.out.println("�޿����:"+cf.format(e.getSal()));
        	System.out.println("==================================");
        }
	}

}
