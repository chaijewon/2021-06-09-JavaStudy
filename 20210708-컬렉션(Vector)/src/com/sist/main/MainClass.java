package com.sist.main;
import java.util.*;
// MyClass m=new MyClass() ==> E(Object)
// MyClass<String> m=new MyClass<String> ==> E(String)
class MyClass<E>
{
	E e;
	public void add(E e)
	{
		this.e=e;
	}
	public E get()
	{
		return e;
	}
}
// 제네릭스 ==> 컬렉션에서 주로 사용 
// Vector => 동기화 (데이터 수집, 네트워크)
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Vector => Vector vec=new Vector() => Object (제네릭스 지정이 없으면 Object)
		Vector<String> vec=new Vector<String>();
		// 저장 => add() , addElement()
		vec.add("홍길동");//0
		vec.add("심청이");//1
		vec.add("박문수");//2
		vec.add("춘향이");//3
		vec.add(2,"이순신");//2 => 순차적으로 저장하기 위해 => add() ===
		vec.addElement("강감찬");//4 => 추가하는 메소드 (Vector에만 존재)
		
		// 출력
		for(String name:vec) // for-each는 형변환해서 받을 수가 없다 
		{
			System.out.println(name);
		}
		System.out.println("인원 몇명:"+vec.size());// 저장 갯수를 가지고 온다 
		// 삭제 
		//vec.remove(2);
		vec.removeElementAt(2);
		System.out.println("===================");
		for(String name:vec) // for-each는 형변환해서 받을 수가 없다 
		{
			System.out.println(name);
		}
		System.out.println("인원 몇명:"+vec.size());// 저장 갯수를 가지고 온다 
		
	    //vec.set(2, "박문자");
		vec.setElementAt("박문자", 2);
	    System.out.println("===================");
		for(String name:vec) // for-each는 형변환해서 받을 수가 없다 
		{
			System.out.println(name);
		}
		System.out.println("인원 몇명:"+vec.size());// 저장 갯수를 가지고 온다 
		
		//vec.clear();
		vec.removeAllElements();
		System.out.println("===================");
		for(String name:vec) // for-each는 형변환해서 받을 수가 없다 
		{
			System.out.println(name);
		}
		System.out.println("인원 몇명:"+vec.size());// 저장 갯수를 가지고 온다 
	    
	}

}









