package com.sist.string;
// StringBuffer , StringBuilder => 대용량 문자열을 결합 
// Buffer => 임시저장 공간 
// append : 문자열 결합 (String +,concat) => 오라클 ||
import java.io.*;
public class MainClass8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	FileReader fr=new FileReader("c:\\javaDev\\news.txt");
        	int i=0; // char번호  => int read() => A => 65
        	long start=System.currentTimeMillis();
        	/*String news="";
        	while((i=fr.read())!=-1) //-1은 파일의 끝
        	{
        		news+=String.valueOf((char)i);
        	}*/
        	//StringBuffer sb=new StringBuffer();
        	StringBuilder sb=new StringBuilder();
        	while((i=fr.read())!=-1)
        	{
        		sb.append(String.valueOf((char)i));
        	}
        	long end=System.currentTimeMillis();
        	fr.close();
        	System.out.println(sb.toString());
        	System.out.println("걸린 시간:"+(end-start));
        }catch(Exception ex) {}
	}

}
