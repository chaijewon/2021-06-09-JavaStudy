package com.sist.io;
// 파일 만들기 , 폴더 만들기 , 삭제하기 
import java.io.*;
/*
 *   IO관련 
 *   =====
 *     page 868 
 *     1) 스트림 : 데이터 이동 통로 => Queue (FIFO)
 *     2) 종류 (869page)
 *        바이트 스트림=> 1byte씩 읽어 온다 / 문자 스트림(한글을 포함한 파일을 읽을 경우) => 2byte씩 읽어 온다
 *        FileInputStream / FileOutputStream 
 *        = read() => 한글자씩 읽을때 사용 
 *        = read(byte[],int start, int len) => 여러글자를 동시에 읽을 때
 *        = write() => 한글자씩 입력 할때
 *        = write(byte[] , int start,int len) => 여러글자를 한번에 사용 할때 사용 
 *        = close()
 *        FileReader  / FileWriter => 파일에 한글 입력 / 출력 
 *        ========================
 *        = ***read() 한글자 
 *        = read(char[],int start,int len)
 *        = write()
 *        = ***write(String m) => 872page
 *        = close()
 *        객체스트림 : ObjectOutputStream() / ObjectInputStream()
 *                  => writeObject() /  readObject() ==> 저장시에는 반드시 직렬화 (934page)
 *                  => 직렬화할 클래스에 => inplements Serializable
 *     3) File 
 *        915page 
 *        =======
 *        getName() , getPath() , exists() , isFile() delete(),createNewFile()
 *        listFile() ,  mkdir() , length()
 *        
 *        => 다운로드/업로드 (복사) , 파일에 저장(카페,블로그에서 읽은 데이터 파일저장) 
 *           ===========================================================
 *           초창기 => 메모리 => 파일 (종속적) => RDBMS (오라클)
 *       ======================================================== JSP
 *           
 *     4) 람다/스트림/어노테이션 / 네트워크 
 *        ================= ========
 *          스프링(자바)      코틀린(자바)
 *     
 *        
 */
public class MainClass9 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
        /*File dir=new File("c:\\upload");
        if(!dir.exists())
        {
        	dir.mkdir();
        }
        System.out.println("폴더 만들기 완료");
        File file=new File("c:\\upload\\text.txt");
        if(!file.exists())
        {
        	file.createNewFile();
        }
        System.out.println("파일 만들기 완료");*/
		// 삭제 => 폴더삭제 (폴더안에 파일이나 폴더가 있는 경우에는 삭제가 안된다 => 안에 있는 모든 내용을 지운다음
		// 폴더 
		File dir=new File("c:\\upload");
		File[] list=dir.listFiles();
		for(File f:list)
		{
			f.delete();
		}
		dir.delete();
		System.out.println("삭제 완료!!");
	}

}
