package com.sist.string;
// substring : 문자를 자를 경우에 사용 
/*
 *   substring => 오버로딩 
 *   = String substring(int start) ==> 지정된 위치로부터 마지막까지 가지고 온다
 *     "Hello Java"
 *      0123456789  ==> 6  =>  Java
 *   = String substring(int start,int end) => 중간에 필요한 문자열을 자른다
 *            => end는 미포함(end-1)
 *      substring(6,9) => Jav
 *   => 
 */
public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String data="0123456789";
        String s=data.substring(5);//56789
        System.out.println(s);
        s=data.substring(3,7);// 3~6  => -1 => 앞에는 포함 , 뒤에는 미포함(end-1)
        System.out.println(s);
        String[] title={
        		"좋은 사람 있으면 소개시켜줘",
        		"다시 만날까 봐"
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










