package com.sist.util;
import java.util.*;
import java.text.*;// ��ȯ 
public class MainClass6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String msg="�̸�:{0}\n��ȭ:{1}\n����:{2}\n����:{3}\n�ּ�:{4}\n";
        //Object[] obj={"ȫ�浿","010-1111-1111",25,"����","����� ������"};
        String s=MessageFormat.format(msg, "ȫ�浿","010-1111-1111",25,"����","����� ������");
        System.out.println(s);
        
	}

}
