package com.sist.io;
// File정보 
/*
 *   File 
 *    = file
 *    = directory 
 *    File file= new File("c:\\javaDev") => dir
 *    File file= new File("c:\\javaDev\\MainClass.java")=>파일
 *    
 *    ==> 파일의 이름  : String getName()
 *    ==> 파일 크기  : long length()
 *    ==> 파일 경로  : String getPath() 
 *    ==> 폴더 => 폴더안에 있는 모든 파일 읽기 : File[] listFiles()
 *    ==> 파일만들기 , 폴더만들기 
 *        createNewFile() mkdir()
 *    ==> 파일 존재여부 : isExist()
 *    
 */
import java.io.*;
public class MainClass8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	File dir=new File("c:\\javaDev");
        	// 모든 파일 읽기
        	File[] list=dir.listFiles();
        	for(File f:list)
        	{
        		if(f.isFile())// 파일 여부
        		{
        			System.out.println(f.getPath());
        		}
        		if(f.isDirectory()) // 폴더 여부 확인 
        		{
        			System.out.println("<DIR>"+f.getPath());
        		}
        		//System.out.println(f.getName());
        	}
        }catch(Exception ex) {}
	}

}









