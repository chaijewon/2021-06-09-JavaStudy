package com.sist.io;
import java.io.*;
import java.util.*;
// ��ü ���� ���� implements Serializable �ݵ�� ����ȭ 
public class MainClass7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	ObjectInputStream ois=
        			new ObjectInputStream(new FileInputStream("c:\\javaDev\\sawon.txt"));
        	ArrayList<Sawon> list=(ArrayList<Sawon>)ois.readObject();
        	for(Sawon s:list)
        	{
        		System.out.println(s.getSabun()+" "
        				+s.getName()+" "
        				+s.getDept()+" "
        				+s.getJob()+" "
        				+s.getPay());
        	}
        }catch(Exception ex){}
	}

}
