package com.sist.lib;
import java.util.*;
// ListIterator => ���ٷ� ��� 
public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
        Collections.addAll(list,"���","����","��","����","�ڵ�");
        //  ���
        for(String s:list)
        {
        	System.out.println(s);
        }
        System.out.println("========");
        // Cookie ==> �ֽŹ湮 
        for(int i=list.size()-1;i>=0;i--)
        {
        	String s=list.get(i);
        	System.out.println(s);
        }
        System.out.println("=======");
        ListIterator<String> it=list.listIterator(); // �ֽŹ湮 ... ��ٱ��� ...
        while(it.hasNext()) // ó������
        {
        	System.out.println(it.next());
        }
        
        while(it.hasPrevious()) // �ؿ�������
        {
        	System.out.println(it.previous());
        }
	}

}








