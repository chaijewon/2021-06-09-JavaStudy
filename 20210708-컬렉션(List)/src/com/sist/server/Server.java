package com.sist.server;
import java.util.*;
import java.net.*;
import java.io.*;
public class Server implements Runnable{
    private Vector waitVc=new Vector();// 접속한 사람 정보 저장 ==> ip,port
    private ServerSocket ss;
    public Server()
    {
    	try
    	{
    		ss=new ServerSocket(3355); 
    		System.out.println("서버 가동");
    	}catch(Exception ex) {}
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try
		{
			while(true)
			{
				Socket s=ss.accept();// 접속 대기
				System.out.println("접근한 클라이언트 IP:"+s.getInetAddress().getHostAddress());
				System.out.println("PORT:"+s.getPort());
				waitVc.add(s);
			}
		}catch(Exception ex) {}
	}

}
