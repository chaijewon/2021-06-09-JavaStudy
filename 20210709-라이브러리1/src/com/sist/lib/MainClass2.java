package com.sist.lib;
// HashSet : 순서가 없다 , 데이터중복 허용하지 않는다
// HashSet : ArrayList에 값을 채운다 (중복된 데이터를 지우고 싶다)
// 관리 => 부서명 , 직위 , 장르 , 등급 (중복이 없는 상태) , 근무지 , 극장명 => 난수
import java.util.*;
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<String> list=new ArrayList<String>();
        list.add("액션");
        list.add("드라마");
        list.add("SF");
        list.add("멜로");
        list.add("판타지");
        list.add("코믹");
        list.add("액션");
        list.add("판타지");
        list.add("SF");
        
        System.out.println("====== 장르(중복) ======");
        for(String genre:list)
        {
        	System.out.println(genre);
        }
        // 중복을 제거 HashSet
        HashSet<String> set=new HashSet<String>();
        set.addAll(list);
        /*for(int i=0;i<list.size();i++)
        {
        	String genre=list.get(i);
        	set.add(genre);
        }*/
        System.out.println(set);
        list.clear();// 이전 데이터 삭제
        list.addAll(set);//다시 새로운 데이터를 추가 ==> list를 브라우저에 전송 
        for(String genre:list)
        {
        	System.out.println(genre);
        }
	}

}







