package com.sist.main3;
/*
 *   다중상속 
 *   ======
 *   class 에는 존재하지 않는다(단일 상속) 
 *   interface에만 존재 (다중 상속)
 *   
 *   
 */
interface A
{
	public void aaa();
}
interface B extends A
{
	// public void aaa();
	public void bbb();
}
class C implements B // 단일 상속
{

	@Override
	public void aaa() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bbb() {
		// TODO Auto-generated method stub
		 
	}
	
}

interface D
{
	public void ddd();
}
interface E
{
	public void eee();
}
class K implements D,E //다중 상속
{

	@Override
	public void eee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ddd() {
		// TODO Auto-generated method stub
		
	}
	
}
interface Q
{
	
}
interface W
{
	
}
interface Y extends Q,W
{
	
}
class J implements Y
{
	// Q,W,Y
}
class O implements Q,W,Y
{
	
}
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
