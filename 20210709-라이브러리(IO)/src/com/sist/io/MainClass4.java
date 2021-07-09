package com.sist.io;
import java.io.*;
// 파일에 쓰기 => 파일읽기 ==> 1) 쓰기 : write , 2) 읽기 : read  , 3) 닫기 : close
// 파일 복사 => 다른 폴더에 저장 
// 객체를 저장 => 객체 읽기 
// 파일 쓰기   r(읽기전용) : FileReader , w(쓰기전용) FileWriter , a 
public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			// 파일을 새롭게 생성
           /*FileWriter fw=new FileWriter("c:\\javaDev\\hello.txt",true);// 뉴스읽기...
           // create (default), append(붙인다):true
           String msg="Hello Java IO!!";
           fw.write(msg);
           fw.close();
           System.out.println("파일 저장 완료!!");*/
			// Reader=> 한글 /알파벳 / 숫자
			// InputStream => 알파벳/숫자/한글깨짐 
			FileReader fr=new FileReader("c:\\javaDev\\hello.txt");
			int i=0;
			while((i=fr.read())!=-1)
			{
				System.out.print((char)i);
			}
		}catch(Exception ex){}
        
	}

}
