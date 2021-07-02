package com.sist.main2;
interface 동물
{
	public void eat();
	public void run();
	public void 말한다();
	public default void 숨을쉰다() 
	{
		// 일반 메소드 => 필요시마다 오버라이딩이 가능하다 
	}
}
class 개 implements 동물
{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void 말한다() {
		// TODO Auto-generated method stub
		
	}
	
}
class 돼지 implements 동물
{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void 말한다() {
		// TODO Auto-generated method stub
		
	}
	
}
class 소 implements 동물
{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void 말한다() {
		// TODO Auto-generated method stub
		
	}
	
}
class 사람 implements 동물
{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void 말한다() {
		// TODO Auto-generated method stub
		
	}
	
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
