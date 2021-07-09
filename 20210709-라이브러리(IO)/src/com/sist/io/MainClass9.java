package com.sist.io;
// ���� ����� , ���� ����� , �����ϱ� 
import java.io.*;
/*
 *   IO���� 
 *   =====
 *     page 868 
 *     1) ��Ʈ�� : ������ �̵� ��� => Queue (FIFO)
 *     2) ���� (869page)
 *        ����Ʈ ��Ʈ��=> 1byte�� �о� �´� / ���� ��Ʈ��(�ѱ��� ������ ������ ���� ���) => 2byte�� �о� �´�
 *        FileInputStream / FileOutputStream 
 *        = read() => �ѱ��ھ� ������ ��� 
 *        = read(byte[],int start, int len) => �������ڸ� ���ÿ� ���� ��
 *        = write() => �ѱ��ھ� �Է� �Ҷ�
 *        = write(byte[] , int start,int len) => �������ڸ� �ѹ��� ��� �Ҷ� ��� 
 *        = close()
 *        FileReader  / FileWriter => ���Ͽ� �ѱ� �Է� / ��� 
 *        ========================
 *        = ***read() �ѱ��� 
 *        = read(char[],int start,int len)
 *        = write()
 *        = ***write(String m) => 872page
 *        = close()
 *        ��ü��Ʈ�� : ObjectOutputStream() / ObjectInputStream()
 *                  => writeObject() /  readObject() ==> ����ÿ��� �ݵ�� ����ȭ (934page)
 *                  => ����ȭ�� Ŭ������ => inplements Serializable
 *     3) File 
 *        915page 
 *        =======
 *        getName() , getPath() , exists() , isFile() delete(),createNewFile()
 *        listFile() ,  mkdir() , length()
 *        
 *        => �ٿ�ε�/���ε� (����) , ���Ͽ� ����(ī��,��α׿��� ���� ������ ��������) 
 *           ===========================================================
 *           ��â�� => �޸� => ���� (������) => RDBMS (����Ŭ)
 *       ======================================================== JSP
 *           
 *     4) ����/��Ʈ��/������̼� / ��Ʈ��ũ 
 *        ================= ========
 *          ������(�ڹ�)      ��Ʋ��(�ڹ�)
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
        System.out.println("���� ����� �Ϸ�");
        File file=new File("c:\\upload\\text.txt");
        if(!file.exists())
        {
        	file.createNewFile();
        }
        System.out.println("���� ����� �Ϸ�");*/
		// ���� => �������� (�����ȿ� �����̳� ������ �ִ� ��쿡�� ������ �ȵȴ� => �ȿ� �ִ� ��� ������ �������
		// ���� 
		File dir=new File("c:\\upload");
		File[] list=dir.listFiles();
		for(File f:list)
		{
			f.delete();
		}
		dir.delete();
		System.out.println("���� �Ϸ�!!");
	}

}
