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
// ���׸��� ==> �÷��ǿ��� �ַ� ��� 
// Vector => ����ȭ (������ ����, ��Ʈ��ũ)
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Vector => Vector vec=new Vector() => Object (���׸��� ������ ������ Object)
		Vector<String> vec=new Vector<String>();
		// ���� => add() , addElement()
		vec.add("ȫ�浿");//0
		vec.add("��û��");//1
		vec.add("�ڹ���");//2
		vec.add("������");//3
		vec.add(2,"�̼���");//2 => ���������� �����ϱ� ���� => add() ===
		vec.addElement("������");//4 => �߰��ϴ� �޼ҵ� (Vector���� ����)
		
		// ���
		for(String name:vec) // for-each�� ����ȯ�ؼ� ���� ���� ���� 
		{
			System.out.println(name);
		}
		System.out.println("�ο� ���:"+vec.size());// ���� ������ ������ �´� 
		// ���� 
		//vec.remove(2);
		vec.removeElementAt(2);
		System.out.println("===================");
		for(String name:vec) // for-each�� ����ȯ�ؼ� ���� ���� ���� 
		{
			System.out.println(name);
		}
		System.out.println("�ο� ���:"+vec.size());// ���� ������ ������ �´� 
		
	    //vec.set(2, "�ڹ���");
		vec.setElementAt("�ڹ���", 2);
	    System.out.println("===================");
		for(String name:vec) // for-each�� ����ȯ�ؼ� ���� ���� ���� 
		{
			System.out.println(name);
		}
		System.out.println("�ο� ���:"+vec.size());// ���� ������ ������ �´� 
		
		//vec.clear();
		vec.removeAllElements();
		System.out.println("===================");
		for(String name:vec) // for-each�� ����ȯ�ؼ� ���� ���� ���� 
		{
			System.out.println(name);
		}
		System.out.println("�ο� ���:"+vec.size());// ���� ������ ������ �´� 
	    
	}

}









