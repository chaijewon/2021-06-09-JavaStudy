package com.sist.lib;
// HashSet : ������ ���� , �������ߺ� ������� �ʴ´�
// HashSet : ArrayList�� ���� ä��� (�ߺ��� �����͸� ����� �ʹ�)
// ���� => �μ��� , ���� , �帣 , ��� (�ߺ��� ���� ����) , �ٹ��� , ����� => ����
import java.util.*;
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<String> list=new ArrayList<String>();
        list.add("�׼�");
        list.add("���");
        list.add("SF");
        list.add("���");
        list.add("��Ÿ��");
        list.add("�ڹ�");
        list.add("�׼�");
        list.add("��Ÿ��");
        list.add("SF");
        
        System.out.println("====== �帣(�ߺ�) ======");
        for(String genre:list)
        {
        	System.out.println(genre);
        }
        // �ߺ��� ���� HashSet
        HashSet<String> set=new HashSet<String>();
        set.addAll(list);
        /*for(int i=0;i<list.size();i++)
        {
        	String genre=list.get(i);
        	set.add(genre);
        }*/
        System.out.println(set);
        list.clear();// ���� ������ ����
        list.addAll(set);//�ٽ� ���ο� �����͸� �߰� ==> list�� �������� ���� 
        for(String genre:list)
        {
        	System.out.println(genre);
        }
	}

}







