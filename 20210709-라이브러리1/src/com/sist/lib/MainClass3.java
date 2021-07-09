package com.sist.lib;
import java.util.*;
// Iterator : 주로 읽기 전용 (전체를 모아서 한번에 처리)
// hasNext()=> 데이터가 있는 경우(true),데이터가 없는 경우(false) , next():실제 데이터값 읽기
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<String> list=new ArrayList<String>();
        Collections.addAll(list,"사과","포도","배","수박","자두");
        // 출력 
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
        	System.out.println(i.next()); // 복잡하거나 갯수를 잘 모르는 경우 (데이터 수집)
        }
	}

}
