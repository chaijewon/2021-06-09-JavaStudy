package com.sist.main;
// LinkedList
import java.util.*;
/*
 *    interface List
 *    {
 *        add()
 *        remove()
 *        get()
 *        size()
 *        set()
 *    }
 *    class Vector implements List
 *    class ArrayList implements List
 *    class LinkedList implements List
 *    class Stack implements List
 *    
 *    ==> List list=new ArrayList()
 *             list=new Vector()
 *             list=new Stack()
 *             list=new LinkedList()
 *             ===================== add,get,size,remove,set,clear
 */
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        LinkedList<String> list=
        		new LinkedList<String>();
        // �߰� 
        list.add("���");
        list.add("����");
        list.add(1,"����");
        
        for(String f:list)
        {
        	System.out.println(f);
        }
        
        System.out.println("������ ����:"+list.size());
        
        list.remove(1);
        for(String f:list)
        {
        	System.out.println(f);
        }
        
        System.out.println("������ ����:"+list.size());
        
        list.clear();
        for(String f:list)
        {
        	System.out.println(f);
        }
        
        System.out.println("������ ����:"+list.size());
	}

}
