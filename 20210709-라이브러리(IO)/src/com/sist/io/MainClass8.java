package com.sist.io;
// File���� 
/*
 *   File 
 *    = file
 *    = directory 
 *    File file= new File("c:\\javaDev") => dir
 *    File file= new File("c:\\javaDev\\MainClass.java")=>����
 *    
 *    ==> ������ �̸�  : String getName()
 *    ==> ���� ũ��  : long length()
 *    ==> ���� ���  : String getPath() 
 *    ==> ���� => �����ȿ� �ִ� ��� ���� �б� : File[] listFiles()
 *    ==> ���ϸ���� , ��������� 
 *        createNewFile() mkdir()
 *    ==> ���� ���翩�� : isExist()
 *    
 */
import java.io.*;
public class MainClass8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	File dir=new File("c:\\javaDev");
        	// ��� ���� �б�
        	File[] list=dir.listFiles();
        	for(File f:list)
        	{
        		if(f.isFile())// ���� ����
        		{
        			System.out.println(f.getPath());
        		}
        		if(f.isDirectory()) // ���� ���� Ȯ�� 
        		{
        			System.out.println("<DIR>"+f.getPath());
        		}
        		//System.out.println(f.getName());
        	}
        }catch(Exception ex) {}
	}

}









