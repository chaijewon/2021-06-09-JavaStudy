package com.sist.io;
// 파일 이동 => 복사 (업로드 / 다운로드) 
// 추천 => 파일읽기 , 카페=> 읽어서 파일 
import java.io.*;
public class MainClass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	FileInputStream fis=new FileInputStream("C:\\javaDev\\javaStudy\\20210709-라이브러리(IO)\\src\\com\\sist\\io\\MainClass1.java");
        	FileOutputStream fos=new FileOutputStream("c:\\oracleDev\\MainClass1.java");
        	
        	byte[] buffer=new byte[1024];
        	int i=0;// 읽은 바이트 수 
        	while((i=fis.read(buffer, 0, 1024))!=-1)
        	{
        		fos.write(buffer,0,i);// 클라이언트로 전송
        	}
        	fis.close();
        	fos.close();
        	System.out.println("저장 완료");
        }catch(Exception ex){ex.printStackTrace();}
	}

}
