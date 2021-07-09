package com.sist.lib;
import java.util.*;
// Map => key,value ===> JSON(웹/앱) => 서버는 동일(스프링) => JSP/Koklin
// 웹 => 80% Map 
public class MainClass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HashMap<String,String> map=new HashMap<String, String>();
        // key는 숫자로 시작할 수 없다 
        // 저장 => put() , 읽기 => get(key) => 클래스 관리 
        // key는 중복을 허용하지 않는다 , value는 중복을 허용한다 (키가 동일한 경우에는 덮어쓴다)
        // 장바구니 구현 => cookie (map=> key,value) 
        // 순서가 없다 
        map.put("one", "하나");
        map.put("two", "둘");
        map.put("three", "셋");
        map.put("four", "넷");
        map.put("five", "다섯");
        
        // 출력 
        /*System.out.println(map.get("one"));
        System.out.println(map.get("two"));
        System.out.println(map.get("three"));
        System.out.println(map.get("four"));
        System.out.println(map.get("five"));*/
        // 전체 key를 가지고 올때 
        Set<String> keys=map.keySet();
        Iterator<String> i=keys.iterator();
        while(i.hasNext())
        {
        	String key=i.next();
        	System.out.println(key+":"+map.get(key));
        }
	}

}









