package com.sist.io;
import java.io.*;
// ���Ͽ� ���� => �����б� ==> 1) ���� : write , 2) �б� : read  , 3) �ݱ� : close
// ���� ���� => �ٸ� ������ ���� 
// ��ü�� ���� => ��ü �б� 
// ���� ����   r(�б�����) : FileReader , w(��������) FileWriter , a 
public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			// ������ ���Ӱ� ����
           /*FileWriter fw=new FileWriter("c:\\javaDev\\hello.txt",true);// �����б�...
           // create (default), append(���δ�):true
           String msg="Hello Java IO!!";
           fw.write(msg);
           fw.close();
           System.out.println("���� ���� �Ϸ�!!");*/
			// Reader=> �ѱ� /���ĺ� / ����
			// InputStream => ���ĺ�/����/�ѱ۱��� 
			FileReader fr=new FileReader("c:\\javaDev\\hello.txt");
			int i=0;
			while((i=fr.read())!=-1)
			{
				System.out.print((char)i);
			}
		}catch(Exception ex){}
        
	}

}
