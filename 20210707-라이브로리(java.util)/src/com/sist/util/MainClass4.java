package com.sist.util;
// Date => ��¥ ���� (�ð�) 
import java.util.*; // ��(�����ͺ��̽� : int ,String ,Date)
import java.text.*;
public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(;;)
		{
	        Date date=new Date(); // �Ϲ� Ŭ���� 
	        //System.out.println(date); yyyy-MM-dd yyyy/MM/dd
	        SimpleDateFormat sdf=new SimpleDateFormat("yy�⵵ MM�� dd�� hh�� mm�� ss��");//����Ŭ
	        System.out.println(sdf.format(date));
	        try
	        {
	        	Thread.sleep(1000);
	        }catch(Exception ex) {}
		}
        /*
         *    ��¥ ��� 
         *      �⵵ : y (4�ڸ�: yyyy,2�ڸ�:yy)
         *      �� : M (1�ڸ�: M , 2�ڸ� : MM) 
         *             ========  ==========
         *             12 => 12       1 => 01  ==> 07   ==> 08,09 => 0(8����) 010 011 
         *             1 => 1
         *      �� : d , dd
         *      �ð� : h , hh
         *      �� : m , mm
         *      �� : s , ss
         */
        //int a=08;
        //System.out.println(a);
	}

}
