package com.sist.string;
// substring : ���ڸ� �ڸ� ��쿡 ��� 
/*
 *   substring => �����ε� 
 *   = String substring(int start) ==> ������ ��ġ�κ��� ���������� ������ �´�
 *     "Hello Java"
 *      0123456789  ==> 6  =>  Java
 *   = String substring(int start,int end) => �߰��� �ʿ��� ���ڿ��� �ڸ���
 *            => end�� ������(end-1)
 *      substring(6,9) => Jav
 *   => 
 */
public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String data="0123456789";
        String s=data.substring(5);//56789
        System.out.println(s);
        s=data.substring(3,7);// 3~6  => -1 => �տ��� ���� , �ڿ��� ������(end-1)
        System.out.println(s);
        String[] title={
        		"���� ��� ������ �Ұ�������",
        		"�ٽ� ������ ��"
        };
        for(String ss:title)
        {
        	//System.out.println(ss);
        	if(ss.length()>8)
        	{
        		String temp=ss.substring(0,8)+"...";
        		System.out.println(temp);
        	}
        	else
        	{
        		System.out.println(ss);
        	}
        }
	}

}










