package com.sist.lang;

import java.lang.reflect.Method;

// getClass() : 클래스의 정보 읽기 
/*
 *    객체 생성 ==> new 
 *    new => 사용하지 않고 객체 생성이 가능 (클래스명 알고 있으면)
 *    
 *    new => 결합성이 높은 프로그램 (가급적이면 사용하지 않는다(권고))
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
        Class bb=b.getClass();// 클래스의 정보 => 스프링(멤버변수,생성자,메소드)
        Method[] methods=bb.getDeclaredMethods();
        for(Method m:methods)
        {
        	System.out.println(m.getName());
        }
	}

}









