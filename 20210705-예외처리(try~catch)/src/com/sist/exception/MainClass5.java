package com.sist.exception;
import java.io.*; // �����  ==> �ݵ�� ����ó���� �ؾ� �ȴ� 
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
 *          catch(Exception ex){} => ����     default
 *          ==================================
 *         ==> ����(������ ����) : ����ó���� ũ��� ���(���� �ö� ������ ũ��(����ó���κ��� Ŀ����)
 *     }
 *     
 *     throws : ���̺귯�� (�ڹٿ��� �����ϴ� �޼ҵ忡�� �ַ� ���)
 *              ========
 *              throws ������ ������ 
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
        	// ���� : �ҽ��󿡼� ó�� �� �� �ִ� ������ ���� (���ϱ���,���Ϻ���...:����)
        	int i=0; // �����б� => �ѱ��ھ� �о� �´� (�ѱ���=>����) => char��ȯ�ؼ� ó�� 
        	         // -1 EOF(End Of File)
        	fr=new FileReader("c:\\javaDev\\text.txt");
        	while((i=fr.read())!=-1)
        	{
        		System.out.print((char)i);// ���� �߻� =>catch
        	}
        	=====���� => catch
        	fr.close()
        }catch(Exception ex)
        {
        	// ���� ó�� => ��θ�,���ϸ� => ������ ���� 
        	ex.printStackTrace(); // ���� Ȯ�� 
        }
        finally
        {
        	// ���� �ݱ� 
        	try
        	{
        	  fr.close();
        	}catch(Exception ex) {} 
        }*/
		// try-with-resource => file,����Ŭ try(��ü����)=> try{}�� �����ϸ� �ڵ� close()�� ȣ���Ѵ�
		try(FileReader fr=new FileReader("c:\\javaDev\\text.txt"))// fr.close()�� �ڵ����� ȣ��ȴ� 
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
