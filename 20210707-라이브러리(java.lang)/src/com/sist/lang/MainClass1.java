package com.sist.lang;
/*
 *    java.lang
 *    ==========
 *      Object(�ֻ��� Ŭ����)
 *        =  toString() : ��ü�� ���ڿ� ��ȯ  => (String)
 *           String toString()
 *        =  finalize() : �Ҹ��� �Լ� 
 *           GC��� (�޸� ����)
 *           => ��ü�� null
 *           A a=new A();
 *           a=null;
 *           => ��ü�� ���̻� ������� �ʴ� ���
 *        =  clone() : ���� => �ִ� �״��(������) => �ٸ� �޸𸮿� COPY => �ƹ�Ÿ 
 *           ���� : ���� �ּҸ� ���� (��Ī)
 *           A a=new A();
 *           A b=a;
 *           new 
 *           class A
 *           {
 *              int aa=10;
 *              int bb=20;
 *           }
 *           A a=new A(); // a���� => aa=100 , bb=200
 *             a.aa=100;
 *             a.bb=200;
 *           A b=new A(); ==> �ʱ�ȭ (Ŭ������ ����� ������ �ʱ�ȭ)
 *                        // b���� => aa=10 , bb=20
 *           clone()
 *           A a=new A(); // a���� => aa=100 , bb=200
 *             a.aa=100;
 *             a.bb=200;
 *           A b=a.clone() ==> �ʱ�ȭ (Ŭ������ ����� ������ �ʱ�ȭ)
 *                        // b���� => aa=100 , bb=200
 *        = getClass() => ���ռ��� ���� ���α׷� (�Ѱ��� Ŭ�������� ���� => �ٸ� Ŭ������ ������ ������)
 *          ========== Ŭ������ ������ ������ �ͼ� ó�� 
 *        = ��ü �� : equals
 *        = ����� ����,���̺귯�� Ŭ���� => Object��� (������ ��� �޼ҵ带 ����� �� �ִ� => ��쿡 ���� �������̵� ����)
 *        
 *      String(���ڿ� ����) : Ȯ���� �� ���� Ŭ���� (����� �� ����) => public final class String
 *          => char[]�� �����ϴ� ���α׷� 
 *          => ���ڿ��� ��ġ�� 0������ ���� 
 *          => Ŭ����=>Call By reference => String ���� (�̹� �⺻��ó�� ���)
 *          => ""(���ڿ�) => ���ڿ� ��ü�� �ּ�
 *             String s="Hello"
 *             String s1="Hello" => ���� �ּҸ� ������ �ִ� s==s1
 *          => �ֿ�޼ҵ� 
 *          1. ��ȯ
 *             replace => �ܾ� / ���� ���� 
 *              String s="Hello Java";
 *              s.replace('a','b') ==> Hello Jbvb
 *              s.replace("Java","Kotlin") ==> Hello Kotlin
 *             replaceAll => ������ ���� (HTML���� => ����)
 *              String s="123Hello";
 *              s.replaceAll("[0-9]",""); => Hello
 *              s.replaceAll("[^0-9]","") (^ ==> !) 123
 *                => ���Խ�
 *                [0-9] => ����
 *                {1,3} => ����  
 *                211.238.142.181 , 127.0.0.1 , 90.89.181.1
 *                [0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3} => �������� 
 *                "/watch?v=[^��-�R]+"
 *             toUpperCase : �빮�� ��ȯ
 *             toLowerCase : �ҹ��� ��ȯ 
 *          2. ���ڿ� ���� 
 *             +  
 *             concat 
 *             String s="Hello"
 *             String s1=" Java"
 *             s.concat(s1)  ===> Hello Java  ==> +
 *             s+s1=> Hello Java
 *             
 *          3. ���� ã�� 
 *             indexOf() => -1�̸� ���� => �տ������� ã�´� 
 *             lastIndexOf() => �ڿ������� ã�´� 
 *             => �����ε� 
 *             indexOf(int) , indexOf(String) , indexOf(int,int)
 *             String s="http://www.daum.net/main/main.jsp"
 *                                         ===
 *             s.indexOf('/',8) => ��ġã�� 
 *             
 *             contains() => ����  ===> LIKE %'�ܾ�'%   ==> .*�ܾ�.*
 *             startsWith() => ���۹��ڿ� => LIKE '�ܾ�'% ==> ^�ܾ�
 *             endsWith() => ������ ���ڿ� => LIKE %'�ܾ�' ==> �ܾ�$
 *             matches(String regex) => ���Խ����� ã�� ���
 *             
 *          4. ��Ÿ 
 *             trim() : ���鹮�� ���� (�¿�)
 *             valueOf() : ��� ���������� ���ڿ��� ��ȯ 
 *             length() : ���� ���� 
 *      StringBuffer/StringBuilder
 *        => ���� ���ڿ��� �о� �ö� �ַ� ��� 
 *        => append() ���ڿ� ����  *** Buffer(�ӽ� ������)
 *        => reverse() : ���ڸ� ���ٷ� ������ �޼ҵ� 
 *      Math 
 *        => ceil() : �ø� => �������� ���ϱ� (����Ŭ : �ζ��) : double
 *        => random() : ���Ƿ� ���� => 0.0~0.99 : double 
 *        
 *      Wrapper : �⺻ ���������� Ŭ����ȭ ��Ų �� : �����ϱ� ���� ����� �ش� 
 *         ��ȯ ==> ���ڿ��� �ش� ������������ ����
 *         ***int = Integer
 *            = 2����
 *            = 8����
 *            = 10����
 *            = 16���� 
 *            = ���ڿ� => ������ ��ȯ => parseInt() => static => Integer.parseInt("10") => 10
 *         long = Long 
 *         ***double = Double
 *         float = Float
 *         ***byte = Byte ======> �ڵ� 
 *         https://www.google.com/search?q=%EC%9E%90%EB%B0%94&rlz=1C1CHBD_koKR933KR933&oq=%EC%9E%90%EB%B0%94&aqs=chrome..69i57j69i59j35i39l2j0i433l2j0i131i433j0i433j0l2.1334j0j15&sourceid=chrome&ie=UTF-8
 *         �ڹ�=%EC%9E%90%EB%B0%94 ���ڵ� => ���ڵ� 
 *         char = Charecter
 *         short = Short
 *         ***boolean = Boolean
 *         ����ڽ� / ��ڽ� 
 *         
 *         int a=10;
 *         Integer i=a; Integer i=10 Boolean b=true
 *         int b=i
 *         int b=i
 *         ==> int�� Integer�� �����ϰ� ����� �ȴ� 
 *         
 *      System 
 *         println() , printf() ,  print() , gc() , System.currentTimeMillis():�ð�(long)
 *                                                  ===========================
 *      ==========================                    log���� 
 *    java.util
 *    =========
 *      Date , Calendar
 *      List , Set  , Map => Web,Spring => ���׸��� (���������� ����ȭ) <String>
 *      StringTokenizer 
 *    java.io
 *    =========
 *      File , FileReader , FileInputStream , FileWriter , FileOutputStream => �ڷ��(���ε�,�ٿ�ε�)
 *      ��õ 
 *    java.net 
 *    =========
 *      URL , URLEncoder  (Socket,Thread:�Ϲ���(X) ==> Kotlin)
 *    
 *    Stream(),���� 
 *    ============
 *    
 *    *****
 *    java.sql
 *    ========
 *     Connection , Statement , ResultSet
 *     
 *    ==========================================> �ܺζ��̺귯�� (lombok,simple-json,javax.xml.bind)
 *           Spring / Mybatis(DB ����) 
 *    ==========================================> 
 *           ������ ��  ==> ���Խ� (java.lang.reflect) Pattern/Matcher => ������ �м� 
 *                        ���¼� �м� ==> �ڸ��,������ (�ڹ� ���̺귯��)
 *                        ===================================================== ê�� , ���� ���� �˻���
 *                         ���� �м� 
 *                         =======
 */
public class MainClass1 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
        /*String data="SSG ���׶� ��� ������ 5�� ��õ �Ե����� 3�̴� ���� 3�Ǿ�Ÿ(1��Ȩ��) "
        		+ "1Ż���� 2���� 1�������� �� ������. 7-3���� �ռ� 5ȸ�� ���۰� �Բ� ����忡 �ö���. "
        		+ "Ÿ��Ʈ�� ��Ȳ�� �ƴϾ���. ��� ġ�� �λ󿡼� ���ƿ� �� ���̽��� ���������� �ʾҴ�. "
        		+ "������ ������ ġ���� �� ���� �±⵵ �ߴ�. ����, �ֱ� ���� �����ư� �¿� �������� ���̽��� "
        		+ "����� ����.";
        // matches=> ���Խ� => �̸��� , IP , ��ȭ��ȣ ...
        if(data.matches(".*����.*"))
        {
        	System.out.println("���ԵǾ� �ֽ��ϴ�");
        }
        else
        {
        	System.out.println("�������Դϴ�");
        }*/
        
        // ����� ���� data.matches(".*[a-zA-Z].*")
        // ���� ���� data.matches(".*[0-9].*")
        // �ѱ� ���� data.matches(".*[��-�R].*")  => ���Խ� 
		String data="ABCDEFGHIJKLMN";
		for(int i=0;i<data.length();i++)
		{
			System.out.print(data.charAt(i));
		}
		System.out.println();
		for(int i=data.length()-1;i>=0;i--)
		{
			System.out.print(data.charAt(i));
		}
		System.out.println();
		StringBuffer sb=new StringBuffer(data); // �׸��� ����
		System.out.println(sb.toString());
		String s=sb.reverse().toString();
		System.out.println(s);
	}

}








