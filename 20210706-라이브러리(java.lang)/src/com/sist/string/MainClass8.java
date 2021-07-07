package com.sist.string;
// StringBuffer , StringBuilder => ��뷮 ���ڿ��� ���� 
// Buffer => �ӽ����� ���� 
// append : ���ڿ� ���� (String +,concat) => ����Ŭ ||
import java.io.*;
public class MainClass8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	FileReader fr=new FileReader("c:\\javaDev\\news.txt");
        	int i=0; // char��ȣ  => int read() => A => 65
        	long start=System.currentTimeMillis();
        	/*String news="";
        	while((i=fr.read())!=-1) //-1�� ������ ��
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
        	System.out.println("�ɸ� �ð�:"+(end-start));
        }catch(Exception ex) {}
	}

}
