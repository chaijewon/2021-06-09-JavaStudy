package com.sist.io;
// ���� �̵� => ���� (���ε� / �ٿ�ε�) 
// ��õ => �����б� , ī��=> �о ���� 
import java.io.*;
public class MainClass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	FileInputStream fis=new FileInputStream("C:\\javaDev\\javaStudy\\20210709-���̺귯��(IO)\\src\\com\\sist\\io\\MainClass1.java");
        	FileOutputStream fos=new FileOutputStream("c:\\oracleDev\\MainClass1.java");
        	
        	byte[] buffer=new byte[1024];
        	int i=0;// ���� ����Ʈ �� 
        	while((i=fis.read(buffer, 0, 1024))!=-1)
        	{
        		fos.write(buffer,0,i);// Ŭ���̾�Ʈ�� ����
        	}
        	fis.close();
        	fos.close();
        	System.out.println("���� �Ϸ�");
        }catch(Exception ex){ex.printStackTrace();}
	}

}
