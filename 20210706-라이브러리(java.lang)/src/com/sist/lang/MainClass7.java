package com.sist.lang;
// equals : Ŭ������ ������ �ִ� ���ڿ����� ������ Ȯ�� 
//  == : Ŭ������ ���Ҷ� �ּҰ��� ���Ѵ�
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
        Human h1=new Human("ȫ�浿");
        Human h2=new Human("ȫ�浿");
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
        	System.out.println("h1�� h2�� ����");
        }
        else
        {
        	System.out.println("h1�� h2�� �ٸ���");
        }
        
        if(h1.equals(h2))//���ڿ� �� => ���ڿ� String (equals)
        {
        	System.out.println("h1�� ������ �ִ� �̸��� h2�� ������ �ִ� �̸��� ����");
        }
        else
        {
        	System.out.println("h1�� ������ �ִ� �̸��� h2�� ������ �ִ� �̸��� �ٸ���");
        }
	}

}
