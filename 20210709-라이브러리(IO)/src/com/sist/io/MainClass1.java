package com.sist.io;
import java.io.*;
/*
 *   IO => InputStream / OutputStream
 *            입력           출력 
 *   => 입출력시 사용하는 라이브러리 
 *      ======
 *      1. 메모리 입출력 
 *      2. 파일 입출력 (*****) 업로드 / 다운로드 => XML파일 / JSON파일 / properties
 *      3. 네트워크 입출력 : 웹서버가 이미 구현(아파치,톰캣)
 *   => 단점 : 단방향 (입력과 출력을 동시에 할 수 없다 => 동시작업시에는 쓰레드)
 *            입출력은 빨대 
 *            ==========
 *            객체 => 메모리주소
 *   => 스트림 => 데이터를 이동하는 통로 
 *   => 1byte / 2byte 
 *      ==============
 *        1byte => 바이트 스트림 
 *        2byte => 문자 스트림 
 *        1byte => 업로드/다운로드시 일반 파일 (zip,ppt...)
 *        2byte => 한글이 들어가 있는 파일 (txt)
 *        
 *          바이트 스트림 : ~InputStream , ~OutputStream 
 *                       FileInputStream , FileOutputStream
 *          문자 스트림   : ~Reader , ~Writer
 *                       FileReader , FileWriter
 *          => 기타 : 객체스트림 
 *                   ObjectInputStream , ObjectOutputStream 
 *                   => 저장(직렬화) => 병렬화 (객체)  => 시리얼라이즈 
 *          바이트 스트림의 최상위 클래스 
 *             InputStream / OutputStream 
 *               |              |
 *            FileInputStream  FileOutputStream
 *          문자 스트림의 최상위 클래스 
 *             Reader   / Writer
 *              |           |
 *            FileReader   FileWriter
 *    
 */
public class MainClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// java.io는 라이브러리는 컴파일 예외 => 무조건 예외처리를 해야된다 
		// java.io,java.net,java.sql 
		// java.io => 파일 존재여부 , java.net => IP설정 , java.sql => SQL
		// java.io => IOException , java.net => MalformedURLException , java.sql=>SQLException 
        try 
        {
			// 메모리에 저장 
        	BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        	// BufferReader => 사용자 입력한 모든 데이터를 모아서 한번 전송 
        	// InputStreamReader는 필터 스트림 => 1byte=>2byte변환 
        	//  아스키코드(C) => 유니코드(자바)
        	//  char => 1byte  char => 2byte *** 한글은 1글자당 2byte => UTF-8
        	// ? ? 
        	System.out.print("검색어 입력:");
        	String data=in.readLine();
        	System.out.println(data);
		}catch(Exception ex) {}
	}

}







