package com.sist.lib;
import java.util.*;
// Map => key,value ===> JSON(��/��) => ������ ����(������) => JSP/Koklin
// �� => 80% Map 
public class MainClass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HashMap<String,String> map=new HashMap<String, String>();
        // key�� ���ڷ� ������ �� ���� 
        // ���� => put() , �б� => get(key) => Ŭ���� ���� 
        // key�� �ߺ��� ������� �ʴ´� , value�� �ߺ��� ����Ѵ� (Ű�� ������ ��쿡�� �����)
        // ��ٱ��� ���� => cookie (map=> key,value) 
        // ������ ���� 
        map.put("one", "�ϳ�");
        map.put("two", "��");
        map.put("three", "��");
        map.put("four", "��");
        map.put("five", "�ټ�");
        
        // ��� 
        /*System.out.println(map.get("one"));
        System.out.println(map.get("two"));
        System.out.println(map.get("three"));
        System.out.println(map.get("four"));
        System.out.println(map.get("five"));*/
        // ��ü key�� ������ �ö� 
        Set<String> keys=map.keySet();
        Iterator<String> i=keys.iterator();
        while(i.hasNext())
        {
        	String key=i.next();
        	System.out.println(key+":"+map.get(key));
        }
	}

}









