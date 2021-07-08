package com.sist.arraylist;
// 사원 전체 목록 
import java.util.*;
// 제네릭스 => default (Object) 
/*
 *     = 데이터형의 통일화 
 *     = 소스가 간결해 진다 (형변환을 할 필요가 없다)
 *     = 컬렉션 (관련된 데이터)
 *     = Object로 저장이 가능 ==> 제어문으로 제어가 어렵다 => 데이터유형을 통일 
 *     ArrayList
 *     =========
 *      add(Object)
 *      Object get(int) ==> 형변환 
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
    	// 사원 등록 
    	list.add(new Sawon(1,"홍길동","대리","개발부","서울",3600));
    	list.add(new Sawon(2,"심청이","과장","기획부","부산",4500));
    	list.add(new Sawon(3,"박문수","사원","영업부","인천",3200));
    	list.add(new Sawon(4,"춘향이","사원","자재부","경기",3200));
    	list.add(new Sawon(5,"이순신","부장","총무부","제주도",6000));
    	
    }
    // 사원 목록 
    public ArrayList<Sawon> sawonListData()
    {
    	return list;
    }
    // 사원 추가 
    public void sawonInsert(Sawon sa)
    {
    	list.add(sa);
    }
    // 사원 삭제 
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
    // 사원 수정 
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
