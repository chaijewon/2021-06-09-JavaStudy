package com.sist.main;
/*
 *    �ڹ��ڵ� 
 *    1. package package�� (�ѹ��� ����� ����)
 *    2. import ��Ű��.* , ��Ű��.Ŭ������
 *       import static ��Ű��.Ŭ������.* => Ŭ������ ������ �ִ� ��� �޼ҵ带 �о� �ö�
 *       import => ������ ����� ���� 
 *    public class ClassName
 *    {
 *    }
 *    
 *    ==> ������ ������ import => java.lang
 *                             ========== �ڵ� �ν� (String,Math,System,Object..)
 *    ==> import�� ����Ҷ�
 *          ���� ��Ű������ �������� Ŭ������ �о� �ö� *
 *          ��)
 *               import java.util.Scanner
 *               import java.util.Date
 *               import java.util.ArrayList 
 *               ==========================
 *               => import java.util.* 
 */
import java.util.*;// ���� ��ǻ�� ��¥,�ð� => Date
import java.util.Date;
import java.sql.*; // Date
import java.text.SimpleDateFormat;// ����
import static java.lang.Math.*;
import static java.lang.String.*;
import static java.lang.Integer.*;
// static�޼ҵ带 ȣ��ÿ� => Ŭ�������� ������ �� �ִ� 
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*Date date=new Date();
        System.out.println(date);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        // MM => �� , mm => ��
        System.out.println(sdf.format(date));*/
		//java.util.Date date=new java.util.Date();
		//System.out.println(date);
		Date date=new Date();
		System.out.println(date);// ��Ű����ġ�� �ٸ��� , ���� �̸��� Ŭ�������� ������ ���� �� �ִ� 
		System.out.println(random()); // Math.random()
		System.out.println(ceil(10/3.0));// Math.ceil()
		System.out.println(PI);//Math.PI
		//System.out.println(valueOf(100));//String.valueOf()
		//System.out.println(trim());
		System.out.println(MAX_VALUE);//Integer.MAX_VALUE
		System.out.println(MIN_VALUE);//Integer.MIN_VALUE
		// ������������ => Ŭ������ ������ �ִ� (Double , Byte , Boolean ....) : Wrapper
	}

}








