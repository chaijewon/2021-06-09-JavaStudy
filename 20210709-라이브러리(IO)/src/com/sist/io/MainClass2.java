package com.sist.io;
import java.io.*;
import java.net.*;
// BufferReader : Ű�����Է°�(Scanner), �ܺε����͸� �о �ѹ��� ������ ���� ����

public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	// Document doc=Jsoup.connection("https://www.daum.net").get() Jsoup
        	URL url=new URL("http://newssearch.naver.com/search.naver?where=rss&query=%EC%98%81%ED%99%94");
        	HttpURLConnection conn=(HttpURLConnection)url.openConnection();
        	// ���α׷����� ������ ���� 
        	if(conn!=null) // ����Ǿ��ٸ�
        	{
        		BufferedReader in=
        				new BufferedReader(new InputStreamReader(conn.getInputStream(),"UTF-8"));
        		// conn.getInputStream() => conn(����)�� �ִ� �޸𸮿��� �����͸� �о� �´� 
        		while(true)
        		{
        			String data=in.readLine();
        			if(data==null) break;
        			System.out.println(data);
        		}
        	}
        }catch(Exception ex) {}
	}

}
