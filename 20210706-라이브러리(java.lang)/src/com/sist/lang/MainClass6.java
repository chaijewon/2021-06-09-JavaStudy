package com.sist.lang;

import java.lang.reflect.Method;

// getClass() : Ŭ������ ���� �б� 
/*
 *    ��ü ���� ==> new 
 *    new => ������� �ʰ� ��ü ������ ���� (Ŭ������ �˰� ������)
 *    
 *    new => ���ռ��� ���� ���α׷� (�������̸� ������� �ʴ´�(�ǰ�))
 *    ====================================================
 *    Class.forName("com.sist.lang.MainClass6")
 *    
 */
class Board
{
	public void display()
	{
		System.out.println("Board:display() Call...");
	}
	public void display1()
	{
		System.out.println("Board:display() Call...");
	}
	public void display2()
	{
		System.out.println("Board:display() Call...");
	}
}
public class MainClass6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Board b=new Board();
        b.display();
        Class bb=b.getClass();// Ŭ������ ���� => ������(�������,������,�޼ҵ�)
        Method[] methods=bb.getDeclaredMethods();
        for(Method m:methods)
        {
        	System.out.println(m.getName());
        }
	}

}









