package com.sist.main;
/*
 *    자바코딩 
 *    1. package package명 (한번만 사용이 가능)
 *    2. import 패키명.* , 패키지.클래스명
 *       import static 패키명.클래스명.* => 클래스가 가지고 있는 모든 메소드를 읽어 올때
 *       import => 여러번 사용이 가능 
 *    public class ClassName
 *    {
 *    }
 *    
 *    ==> 생략이 가능한 import => java.lang
 *                             ========== 자동 인식 (String,Math,System,Object..)
 *    ==> import를 사용할때
 *          같은 패키지에서 여러개의 클래스를 읽어 올때 *
 *          예)
 *               import java.util.Scanner
 *               import java.util.Date
 *               import java.util.ArrayList 
 *               ==========================
 *               => import java.util.* 
 */
import java.util.*;// 현재 컴퓨터 날짜,시간 => Date
import java.util.Date;
import java.sql.*; // Date
import java.text.SimpleDateFormat;// 변경
import static java.lang.Math.*;
import static java.lang.String.*;
import static java.lang.Integer.*;
// static메소드를 호출시에 => 클래스명을 생략할 수 있다 
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*Date date=new Date();
        System.out.println(date);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        // MM => 월 , mm => 분
        System.out.println(sdf.format(date));*/
		//java.util.Date date=new java.util.Date();
		//System.out.println(date);
		Date date=new Date();
		System.out.println(date);// 패키지위치가 다르다 , 같은 이름의 클래스명을 가지고 있을 수 있다 
		System.out.println(random()); // Math.random()
		System.out.println(ceil(10/3.0));// Math.ceil()
		System.out.println(PI);//Math.PI
		//System.out.println(valueOf(100));//String.valueOf()
		//System.out.println(trim());
		System.out.println(MAX_VALUE);//Integer.MAX_VALUE
		System.out.println(MIN_VALUE);//Integer.MIN_VALUE
		// 데이터형마다 => 클래스를 가지고 있다 (Double , Byte , Boolean ....) : Wrapper
	}

}








