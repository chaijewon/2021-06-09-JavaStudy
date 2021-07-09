package com.sist.lib;
import java.util.*;
// ListIterator => 꺼꾸로 출력 
public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
        Collections.addAll(list,"사과","포도","배","수박","자두");
        //  출력
        for(String s:list)
        {
        	System.out.println(s);
        }
        System.out.println("========");
        // Cookie ==> 최신방문 
        for(int i=list.size()-1;i>=0;i--)
        {
        	String s=list.get(i);
        	System.out.println(s);
        }
        System.out.println("=======");
        ListIterator<String> it=list.listIterator(); // 최신방문 ... 장바구니 ...
        while(it.hasNext()) // 처음부터
        {
        	System.out.println(it.next());
        }
        
        while(it.hasPrevious()) // 밑에서부터
        {
        	System.out.println(it.previous());
        }
	}

}








