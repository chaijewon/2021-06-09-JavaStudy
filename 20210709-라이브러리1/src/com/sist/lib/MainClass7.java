package com.sist.lib;
/*
 *    Collection => List , Set , Map
 *    List (interface) 
 *     
 *     interface List
 *     {
 *         add()
 *         remove()
 *         set()
 *         get()
 *         size()
 *         clear()
 *     }
 *     class ArrayList implements List
 *     {
 *         add()
 *         remove()
 *         set()
 *         get()
 *         size()
 *         clear()
 *     }
 *     class Vector implements List
 *     {
 *         add()
 *         remove()
 *         set()
 *         get()
 *         size()
 *         clear()
 *     }
 *     class LinkedList implements List
 *     {
 *         add()
 *         remove()
 *         set()
 *         get()
 *         size()
 *         clear()
 *     }
 *     class Stack implements List
 *     {
 *         add()
 *         remove()
 *         set()
 *         get()
 *         size()
 *         clear()
 *     }
 *     
 *     => List list=new ArrayList()  => List라는 인터페이스 통합 
 *             list=new Vector()
 *             list=new LinkedList()
 *             list=new Stack()
 *     => Map => put() , get() ==> HashMap,Hashtable
 *                                 ======== Hashtable클래스의 단점을 보완
 *     => Set => HashSet (컬렉션 클래스의 중복제거)
 *     => 읽기전용 : Iterator , ListIterator 
 *     => 데이터형을 통일 => 제네릭스 사용한다 <기본데이터형사용금지,클래스>
 *            기본데이터형을 사용하기 위해서 반드시 Wrapper를 이용한다 
 *                                         ========
 *                                         일반 기본형과 동일하게 사용한다 : 오토박싱 
 *                                         Integer i=10;
 *                                         int k=i : 언박싱
 *     ========================================================================
 */
public class MainClass7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
