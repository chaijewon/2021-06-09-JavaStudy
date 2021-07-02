package com.sist.control;
/*
 *   조합 
 *   class  => public(default) , final , abstract
 *   method => public , default, private , protected , final ,abstract, static
 *                                                            =========
 *                                                            추상적(공통성) => 메소드 선언(설계)
 *   멤버변수 => public , default, private , protected , final, static
 *   지역변수 => final
 */
class Card
{
	private static Card card;// card저장되는 공간 1개 
	public static Card newInstance() //새로운 객체를 생성 
	{
		if(card==null)
			card=new Card();
		
		return card;
	}
}
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         /*Card card=new Card();
         System.out.println("card="+card);
         Card card1=new Card();
         System.out.println("card1="+card1);
         Card card2=new Card();
         System.out.println("card2="+card2);*/
		Card c1=Card.newInstance();
		System.out.println("c1="+c1);
		
		Card c2=Card.newInstance();
		System.out.println("c2="+c2);
		
		Card c3=Card.newInstance();
		System.out.println("c3="+c3);
         
         
	}

}
