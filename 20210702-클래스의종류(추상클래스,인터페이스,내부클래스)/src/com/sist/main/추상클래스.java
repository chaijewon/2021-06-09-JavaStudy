package com.sist.main;
/*
 *   추상 클래스 
 *   === 공통성을 가지고 있는 클래스 
 *   예)
 *        게시판 : 목록출력 , 찾기 , 글쓰기 , 내용보기 , 수정하기 , 삭제하기 
 *        묻고답하기 : 목록출력 , 찾기 , 글쓰기 , 내용보기 , 수정하기 , 삭제하기 , 답변하기 
 *        댓글게시판 : 목록출력 , 찾기 , 글쓰기 , 내용보기 , 수정하기 , 삭제하기 ,댓글
 *        후기게시판: 목록출력 , 찾기 , 글쓰기 , 내용보기 , 수정하기 , 삭제하기, 업로드 
 *        ===================================================================
 *        1. 공통으로 사용되는 메소드를 찾는다 
 *        2. 추상메소드 (구현이 안된 메소드)
 *        3. 상속받아 구현 
 *        4. 추상클래스 한개로 => 모든 게시판을 제어 할 수 있다  => 카페
 *        
 *        
 *        버튼 : 클릭한다 
 *              처리기능 틀리다 (로그인버튼,계산기)
 *        마우스 : 처리 내용 
 */
abstract class 도형
{
	public abstract void draw(); // 구현이 안된 메소드 => 상속시에 반드시 구현해서 사용
	public void select(String color) // 필요하면 오버라이딩 (구현된 메소드)
	{
		System.out.println("검정색을 사용한다");
	}
}
class 선 extends 도형
{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("선을 그린다");
	}
	/*
	 *   public void select(String color) // 필요하면 오버라이딩 (구현된 메소드)
	     {
		   System.out.println("검정색을 사용한다");
	     }
	 */
	
}
class 원 extends 도형
{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("원을 그린다");
	}
	/*
	 *   public void select(String color) // 필요하면 오버라이딩 (구현된 메소드)
	     {
		   System.out.println("검정색을 사용한다");
	     }
	 */
}
class 사각형 extends 도형
{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("삭각형을 그린다");
	}
	/*
	 *   public void select(String color) // 필요하면 오버라이딩 (구현된 메소드)
	     {
		   System.out.println("검정색을 사용한다");
	     }
	 */
}
public class 추상클래스 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*선 line=new 선();
        line.draw();
        line.select("검정색");
        
        원 c=new 원();
        c.draw();
        
        사각형 r=new 사각형();
        r.draw();*/
		// 관련된 클래스를 모아서 관리한 역할 => 관련된 클래스 (공통점) => 클래스 객체명=new 생성자()
		/*
		 *   추상 클래스는 객체(인스턴스)를 생성할 수 없기 때문에 
		 *   생성하기 위해서 반드시 상속을 통해서 구현된 클래스를 이용해서 메모리 할당을 한다 
		 *   
		 *   도형 a=new 선();
		 *   ===      ===
		 *   추상 클래스  구현된 클래스
		 *   변수        선이 가지고 있는 메소드 
		 *   
		 *   aaa()
		 *   aaa(int)
		 *   aaa(int ,int)
		 *   C언어 바인딩 (메소드 , 함수 => 주소값) 메소드 (메모리에 저장) => 메소드명이 주소
		 *        =====
		 *        동적바인딩 : 실행시에 메소드의 주소값이 변경 
		 *        정적바인딩 : 고정 ==> 가상함수 ==> 자바는 가상함수 (속도)
		 *        
		 *        도형 a=new 선() ==> 선이 가지고 메소드 주소 호출 
		 *        a=new 원()   ==> 원이 가지고 메소드 주소 호출 
		 */
		
		도형 a=new 선();
		a.draw();
		
		a=new 원();
		a.draw();
		
		a=new 사각형();
		a.draw();
	}

}








