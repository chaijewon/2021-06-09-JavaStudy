package com.sist.main3;
/*
 *   ���߻�� 
 *   ======
 *   class ���� �������� �ʴ´�(���� ���) 
 *   interface���� ���� (���� ���)
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
class C implements B // ���� ���
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
class K implements D,E //���� ���
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
