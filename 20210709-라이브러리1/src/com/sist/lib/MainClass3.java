package com.sist.lib;
import java.util.*;
// Iterator : �ַ� �б� ���� (��ü�� ��Ƽ� �ѹ��� ó��)
// hasNext()=> �����Ͱ� �ִ� ���(true),�����Ͱ� ���� ���(false) , next():���� �����Ͱ� �б�
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<String> list=new ArrayList<String>();
        Collections.addAll(list,"���","����","��","����","�ڵ�");
        // ��� 
        for(int i=0;i<list.size();i++)
        {
        	System.out.println(list.get(i));
        }
        System.out.println("======");
        for(String s:list)
        {
        	System.out.println(s);
        }
        System.out.println(list);
        System.out.println("======");
        Iterator<String> i=list.iterator();
        while(i.hasNext())
        {
        	System.out.println(i.next()); // �����ϰų� ������ �� �𸣴� ��� (������ ����)
        }
	}

}
