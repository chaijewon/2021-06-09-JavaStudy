package com.sist.io;
import java.io.*;
// 파일 읽기 
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
        	// FileInputStream은 읽어올때 1byte씩 읽어온다 (한글 2byte) => 한글이 깨진다
        	// png,jpg , zip => FileInputStream
        	//FileInputStream in=
        			//new FileInputStream("C:\\Users\\SIST\\git\\0609_javaStudy\\20210709-라이브러리1\\src\\com\\sist\\lib\\MainClass1.java");
        	
        	
        	FileReader in=
			   new FileReader("C:\\Users\\SIST\\git\\0609_javaStudy\\20210709-라이브러리1\\src\\com\\sist\\lib\\MainClass1.java");
  
        	int i=0; // 파일읽기 => 1글자씩 읽어온다 (char(X),int(O))
            String data="";
            while((i=in.read())!=-1) //-1 EOF(파일의 끝)
            {
            	data+=String.valueOf((char)i);
            }
            in.close();
            System.out.println(data);
        }catch(Exception ex) {}
	}

}
