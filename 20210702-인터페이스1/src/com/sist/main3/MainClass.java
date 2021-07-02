package com.sist.main3;
interface 영화관
{
	public void 목록출력();
	public void 상세보기();
	public void 찾기();
	public void 이벤트(); 
	public default void 예매하기() {}
	// default ==> 이미 구현 클래스에 영향을 미치지 않게 하기 위해 => 구현된 메소드 필요시마다 오버라이딩 
}
class CGV implements 영화관 // 이벤트 
{

	@Override
	public void 목록출력() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void 상세보기() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void 찾기() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void 이벤트() {
		// TODO Auto-generated method stub
		
	}
	
}
class 메가박스 implements 영화관
{

	public void 예매하기() {}
	@Override
	public void 목록출력() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void 상세보기() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void 찾기() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void 이벤트() {
		// TODO Auto-generated method stub
		
	}
	
}
class 롯데시네마 implements 영화관
{

	
	@Override
	public void 목록출력() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void 상세보기() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void 찾기() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void 이벤트() {
		// TODO Auto-generated method stub
		
	}
	
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
