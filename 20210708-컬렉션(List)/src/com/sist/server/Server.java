package com.sist.server;
import java.util.*;
import java.net.*;
import java.io.*;
public class Server implements Runnable{
    private Vector waitVc=new Vector();// ������ ��� ���� ���� ==> ip,port
    private ServerSocket ss;
    public Server()
    {
    	try
    	{
    		ss=new ServerSocket(3355); 
    		System.out.println("���� ����");
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
				Socket s=ss.accept();// ���� ���
				System.out.println("������ Ŭ���̾�Ʈ IP:"+s.getInetAddress().getHostAddress());
				System.out.println("PORT:"+s.getPort());
				waitVc.add(s);
			}
		}catch(Exception ex) {}
	}

}
