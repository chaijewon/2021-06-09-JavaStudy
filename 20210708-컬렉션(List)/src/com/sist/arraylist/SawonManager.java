package com.sist.arraylist;
// ��� ��ü ��� 
import java.util.*;
// ���׸��� => default (Object) 
/*
 *     = ���������� ����ȭ 
 *     = �ҽ��� ������ ���� (����ȯ�� �� �ʿ䰡 ����)
 *     = �÷��� (���õ� ������)
 *     = Object�� ������ ���� ==> ������� ��� ��ƴ� => ������������ ���� 
 *     ArrayList
 *     =========
 *      add(Object)
 *      Object get(int) ==> ����ȯ 
 *      
 *     ArrayList<String> => String[]
 *     =================
 *      add(String)
 *      String get(int)
 *     
 *      ArrayList<Sawon> => Sawon[]
 *     =================
 *      add(Sawon)
 *      Sawon get(int)
 *      
 */
public class SawonManager {
    private static ArrayList<Sawon> list=
    		         new ArrayList<Sawon>();
    public SawonManager()
    {
    	// ��� ��� 
    	list.add(new Sawon(1,"ȫ�浿","�븮","���ߺ�","����",3600));
    	list.add(new Sawon(2,"��û��","����","��ȹ��","�λ�",4500));
    	list.add(new Sawon(3,"�ڹ���","���","������","��õ",3200));
    	list.add(new Sawon(4,"������","���","�����","���",3200));
    	list.add(new Sawon(5,"�̼���","����","�ѹ���","���ֵ�",6000));
    	
    }
    // ��� ��� 
    public ArrayList<Sawon> sawonListData()
    {
    	return list;
    }
    // ��� �߰� 
    public void sawonInsert(Sawon sa)
    {
    	list.add(sa);
    }
    // ��� ���� 
    public void sawonDelete(int sabun)
    {
    	for(int i=0;i<list.size();i++)
    	{
    		Sawon s=list.get(i);
    		if(s.getSabun()==sabun)
    		{
    			list.remove(i);
    			break;
    		}
    	}
    }
    // ��� ���� 
    public void sawonUpdate(Sawon sa)
    {
    	for(int i=0;i<list.size();i++)
    	{
    		Sawon s=list.get(i);
    		if(s.getSabun()==sa.getSabun())
    		{
    			list.set(i, sa);
    			break;
    		}
    	}
    }
    
    
}
