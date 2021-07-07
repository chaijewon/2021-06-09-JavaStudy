package com.sist.lang;
// equals : 클래스가 가지고 있는 문자열값이 같은지 확인 
//  == : 클래스를 비교할때 주소값을 비교한다
class Human
{
	String name;
	public Human(String name)
	{
		this.name=name;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Human)
			return name.equals(((Human)obj).name);
		else
			return false;
	}
	
}
public class MainClass7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Human h1=new Human("홍길동");
        Human h2=new Human("홍길동");
        Human h3=h1;
        // h3=39ed3c8d
        /*
         *   h1=com.sist.lang.Human@39ed3c8d
             h2=com.sist.lang.Human@71dac704
         */
        System.out.println("h1="+h1);// h1.toString()
        System.out.println("h2="+h2);
        System.out.println("h3="+h3);
        // h1 (39ed3c8d) h2(71dac704)  39ed3c8d==71dac704
        if(h1==h2)
        {
        	System.out.println("h1과 h2는 같다");
        }
        else
        {
        	System.out.println("h1과 h2는 다르다");
        }
        
        if(h1.equals(h2))//문자열 비교 => 문자열 String (equals)
        {
        	System.out.println("h1이 가지고 있는 이름과 h2가 가지고 있는 이름이 같다");
        }
        else
        {
        	System.out.println("h1이 가지고 있는 이름과 h2가 가지고 있는 이름이 다르다");
        }
	}

}
