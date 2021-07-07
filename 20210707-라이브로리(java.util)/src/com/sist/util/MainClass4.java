package com.sist.util;
// Date => 날짜 관리 (시간) 
import java.util.*; // 웹(데이터베이스 : int ,String ,Date)
import java.text.*;
public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(;;)
		{
	        Date date=new Date(); // 일반 클래스 
	        //System.out.println(date); yyyy-MM-dd yyyy/MM/dd
	        SimpleDateFormat sdf=new SimpleDateFormat("yy년도 MM월 dd일 hh시 mm분 ss초");//오라클
	        System.out.println(sdf.format(date));
	        try
	        {
	        	Thread.sleep(1000);
	        }catch(Exception ex) {}
		}
        /*
         *    날짜 출력 
         *      년도 : y (4자리: yyyy,2자리:yy)
         *      월 : M (1자리: M , 2자리 : MM) 
         *             ========  ==========
         *             12 => 12       1 => 01  ==> 07   ==> 08,09 => 0(8진법) 010 011 
         *             1 => 1
         *      일 : d , dd
         *      시간 : h , hh
         *      분 : m , mm
         *      초 : s , ss
         */
        //int a=08;
        //System.out.println(a);
	}

}
