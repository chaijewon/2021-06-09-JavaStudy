package com.sist.io;
import java.io.*;
/*
 *   IO => InputStream / OutputStream
 *            �Է�           ��� 
 *   => ����½� ����ϴ� ���̺귯�� 
 *      ======
 *      1. �޸� ����� 
 *      2. ���� ����� (*****) ���ε� / �ٿ�ε� => XML���� / JSON���� / properties
 *      3. ��Ʈ��ũ ����� : �������� �̹� ����(����ġ,��Ĺ)
 *   => ���� : �ܹ��� (�Է°� ����� ���ÿ� �� �� ���� => �����۾��ÿ��� ������)
 *            ������� ���� 
 *            ==========
 *            ��ü => �޸��ּ�
 *   => ��Ʈ�� => �����͸� �̵��ϴ� ��� 
 *   => 1byte / 2byte 
 *      ==============
 *        1byte => ����Ʈ ��Ʈ�� 
 *        2byte => ���� ��Ʈ�� 
 *        1byte => ���ε�/�ٿ�ε�� �Ϲ� ���� (zip,ppt...)
 *        2byte => �ѱ��� �� �ִ� ���� (txt)
 *        
 *          ����Ʈ ��Ʈ�� : ~InputStream , ~OutputStream 
 *                       FileInputStream , FileOutputStream
 *          ���� ��Ʈ��   : ~Reader , ~Writer
 *                       FileReader , FileWriter
 *          => ��Ÿ : ��ü��Ʈ�� 
 *                   ObjectInputStream , ObjectOutputStream 
 *                   => ����(����ȭ) => ����ȭ (��ü)  => �ø�������� 
 *          ����Ʈ ��Ʈ���� �ֻ��� Ŭ���� 
 *             InputStream / OutputStream 
 *               |              |
 *            FileInputStream  FileOutputStream
 *          ���� ��Ʈ���� �ֻ��� Ŭ���� 
 *             Reader   / Writer
 *              |           |
 *            FileReader   FileWriter
 *    
 */
public class MainClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// java.io�� ���̺귯���� ������ ���� => ������ ����ó���� �ؾߵȴ� 
		// java.io,java.net,java.sql 
		// java.io => ���� ���翩�� , java.net => IP���� , java.sql => SQL
		// java.io => IOException , java.net => MalformedURLException , java.sql=>SQLException 
        try 
        {
			// �޸𸮿� ���� 
        	BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        	// BufferReader => ����� �Է��� ��� �����͸� ��Ƽ� �ѹ� ���� 
        	// InputStreamReader�� ���� ��Ʈ�� => 1byte=>2byte��ȯ 
        	//  �ƽ�Ű�ڵ�(C) => �����ڵ�(�ڹ�)
        	//  char => 1byte  char => 2byte *** �ѱ��� 1���ڴ� 2byte => UTF-8
        	// ? ? 
        	System.out.print("�˻��� �Է�:");
        	String data=in.readLine();
        	System.out.println(data);
		}catch(Exception ex) {}
	}

}







