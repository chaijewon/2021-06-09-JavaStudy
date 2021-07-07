package com.sist.main;
import java.util.*;
import java.text.*;
import com.sist.dao.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] limits={900,1000,2000,3000,4000};
		// if(sal>=900 && sal<1000) if(sal>=1000 && sal<2000)
		String[] grade={"A등급","B등급","C등급","D등급","E등급"};
        String msg="사번:{0}\n이름:{1}\n직위:{2}\n사수:{3}\n입사일:{4}\n급여:{5}\n성과급:{6}\n부서번호:{7}\n";
        // 데이터 읽기
        EmpDAO dao=new EmpDAO();
        Emp[] emp=dao.empListData();
        for(Emp e:emp)
        {
        	Object[] obj={e.getEmpno(),e.getEname(),e.getJob(),e.getMgr(),
        			new SimpleDateFormat("yyyy년도 MM월 dd일").format(e.getHiredate()),
        			e.getSal(),e.getComm(),e.getDeptno()};
        	String data=MessageFormat.format(msg, obj);
        	System.out.println(data);
        	ChoiceFormat cf=new ChoiceFormat(limits,grade);
        	System.out.println("급여등급:"+cf.format(e.getSal()));
        	System.out.println("==================================");
        }
	}

}
