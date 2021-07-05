package com.sist.exception;
import java.io.*; // 입출력  ==> 반드시 예외처리를 해야 된다 
// java.io , java.net , java.sql , javax....(jdk1.2) => xml , web ...
/*
 *     public static void main(String[] args) {
 *         try
 *         {
 *             int a=10/0; => ArithmeticException => RuntimeException => Exception => Throwable 
 *             System.out.println("Hello"); (X)
 *         }catch(NumberFormatException e){}  case 1:
 *          catch(ArrayIndexOutOfBoundsException e){} case 2:
 *          catch(NullPointerException ex){}  case 3:
 *          ==================================
 *          catch(Exception ex){} => 수행     default
 *          ==================================
 *         ==> 오류(비정상 종료) : 예외처리의 크기는 상속(위로 올라 갈수록 크다(에러처리부분이 커진다)
 *     }
 *     
 *     throws : 라이브러리 (자바에서 지원하는 메소드에서 주로 사용)
 *              ========
 *              throws 선언할 것인지 
 *              try
 *              {
 *              }catch(Exception)
 */
public class MainClass5 {

	public static void main(String[] args) throws Throwable  {
		// TODO Auto-generated method stub
		
			Thread.sleep(100);
		
        /*FileReader fr=null;
        try
        {
        	// 예외 : 소스상에서 처리 할 수 있는 가벼운 에러 (파일깨짐,파일보안...:에러)
        	int i=0; // 파일읽기 => 한글자씩 읽어 온다 (한글자=>정수) => char변환해서 처리 
        	         // -1 EOF(End Of File)
        	fr=new FileReader("c:\\javaDev\\text.txt");
        	while((i=fr.read())!=-1)
        	{
        		System.out.print((char)i);// 에러 발생 =>catch
        	}
        	=====에러 => catch
        	fr.close()
        }catch(Exception ex)
        {
        	// 오류 처리 => 경로명,파일명 => 수정이 가능 
        	ex.printStackTrace(); // 오류 확인 
        }
        finally
        {
        	// 파일 닫기 
        	try
        	{
        	  fr.close();
        	}catch(Exception ex) {} 
        }*/
		// try-with-resource => file,오라클 try(객체생성)=> try{}이 종료하면 자동 close()를 호출한다
		try(FileReader fr=new FileReader("c:\\javaDev\\text.txt"))// fr.close()가 자동으로 호출된다 
		{
			int i=0;
			while((i=fr.read())!=-1)
			{
				System.out.print((char)i);
			}
		}catch(Exception ex) 
		{
			ex.printStackTrace();
		}
	}

}
