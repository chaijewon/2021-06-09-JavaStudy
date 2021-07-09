package com.sist.io;
import java.io.*;
import java.net.*;
// BufferReader : 키보드입력값(Scanner), 외부데이터를 읽어서 한번에 저장한 다음 제어

public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	// Document doc=Jsoup.connection("https://www.daum.net").get() Jsoup
        	URL url=new URL("http://newssearch.naver.com/search.naver?where=rss&query=%EC%98%81%ED%99%94");
        	HttpURLConnection conn=(HttpURLConnection)url.openConnection();
        	// 프로그램에서 다음을 연결 
        	if(conn!=null) // 연결되었다면
        	{
        		BufferedReader in=
        				new BufferedReader(new InputStreamReader(conn.getInputStream(),"UTF-8"));
        		// conn.getInputStream() => conn(다음)에 있는 메모리에서 데이터를 읽어 온다 
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
