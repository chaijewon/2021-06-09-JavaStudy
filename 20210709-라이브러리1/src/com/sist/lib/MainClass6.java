package com.sist.lib;
import java.util.*;
interface III
{
	public void display();
}
class AAA implements III
{
	public void display()
	{
		System.out.println("AAA:display() Call...");
	}
}
class BBB implements III
{
	public void display()
	{
		System.out.println("BBB:display() Call...");
	}
}
class CCC implements III
{
	public void display()
	{
		System.out.println("CCC:display() Call...");
	}
}
class DDD implements III
{
	public void display()
	{
		System.out.println("DDD:display() Call...");
	}
}
class EEE implements III
{
	public void display()
	{
		System.out.println("EEE:display() Call...");
	}
}
// 인터페이스는 관련된 모든 클래스를 모아서 한개의 이름으로 제어할때
// Controller (클래스 제어) => 
/*
 *   객체 
 *   ===
 *    오버로딩 /오버라이딩 => 유지보수
 *    인터페이스 => 스프링
 */
// 클래스를 효율적으로 관리 => 인터페이스 , 맵
// put(): 저장 , get(key) : 읽기 
public class MainClass6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,III> map=new HashMap<String, III>();
		map.put("aaa", new AAA());
		map.put("bbb", new BBB());
		map.put("ccc", new CCC());
		map.put("ddd", new DDD());
		map.put("eee", new EEE()); 
		// 스프링(클래스 관리)
        Scanner scan=new Scanner(System.in);
        System.out.print("명령어 입력(aaa,bbb,ccc,ddd,eee):");
        String cmd=scan.next();
        III i=map.get(cmd);
        i.display();
        /*if(cmd.equals("aaa"))
        {
        	AAA a=new AAA();
        	a.display();
        }
        else if(cmd.equals("bbb"))
        {
        	BBB a=new BBB();
        	a.display();
        }
        else if(cmd.equals("ccc"))
        {
        	CCC a=new CCC();
        	a.display();
        }
        else if(cmd.equals("ddd"))
        {
        	DDD a=new DDD();
        	a.display();
        }
        else if(cmd.equals("eee"))
        {
        	EEE a=new EEE();
        	a.display();
        }*/
	}

}


