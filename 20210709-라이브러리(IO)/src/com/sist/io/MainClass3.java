package com.sist.io;
import java.io.*;
// ���� �б� 
/*
 *   BufferedReader , BufferedWriter
 *   FileInputStream , FileOutputStream
 *   FileReader , FileWriter
 *   File 
 */
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	// FileInputStream�� �о�ö� 1byte�� �о�´� (�ѱ� 2byte) => �ѱ��� ������
        	// png,jpg , zip => FileInputStream
        	//FileInputStream in=
        			//new FileInputStream("C:\\Users\\SIST\\git\\0609_javaStudy\\20210709-���̺귯��1\\src\\com\\sist\\lib\\MainClass1.java");
        	
        	
        	FileReader in=
			   new FileReader("C:\\Users\\SIST\\git\\0609_javaStudy\\20210709-���̺귯��1\\src\\com\\sist\\lib\\MainClass1.java");
  
        	int i=0; // �����б� => 1���ھ� �о�´� (char(X),int(O))
            String data="";
            while((i=in.read())!=-1) //-1 EOF(������ ��)
            {
            	data+=String.valueOf((char)i);
            }
            in.close();
            System.out.println(data);
        }catch(Exception ex) {}
	}

}
