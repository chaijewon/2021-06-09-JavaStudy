package com.sist.string;
/*
 *   ��� Ŭ������ Object�κ��� ����� �޴´� 
 *   =========
 *     ��ü�� ��ü�� �� : equals
 *     ���ο� �޸� (�޸� ����) : clone
 *     ��ü�� ���ڿ� ��ȯ : toString
 *     Ŭ������ ������ �о� �´� : getClass
 *     �޸� ���� ���� Ȯ�� : finalize()
 *        Object
 *          |
 *    ------------------- java.lang
 *     String , StringBuffer , StringBuilder 
 *     System, Wrapper , Math
 *    ------------------- java.util
 *     Date , Calendar , StringTokenizer , Scanner , Random
 *     ArrayList , Vector , LinkedList , HashSet , HashMap
 *    ------------------- java.io
 *    ------------------- java.net
 *    ------------------- Web (JSON,XML,CSV)
 *                            ===== Spring => Kotlin,Python,Java,JavaScript
 *                            {"name":"ȫ�浿","":""} => Map
 *    String :  ���ڿ� ���� (464page) => ����) public final class String:����� ���� �� ���� Ŭ���� 
 *    ====== �ִ� �״�� ��� (Ȯ���� �� ���� Ŭ����)
 *    ***** ���ڿ� "" => ��ü�� �ּҰ��̴� 
 *          => char[]�� �����ϴ� ���α׷�  
 *          String s="Hello"; => char[] s={'H','e','l','l','o'} => char* s="Hello"
 *          => ���ڿ� ���� ��� 
 *             String s="Hello"; �ַ� ��� 
 *             String s=new String("Hello"); // new�� ����ϸ� �޸� ������ ���Ӱ� ����� 
 *            ���ڿ��� �ּҸ� ������ �ʰ� ����� ���ڿ� ��
 *            =======================      ========= equals
 *               ==(X) 
 *    ***** ���ڿ��� ������ �ִ� ��� (�޼ҵ�) 
 *    1) �� (���ڿ��� ���ڿ� ��)
 *       equals => ��ҹ��� ���� (���̵�,��й�ȣ) ==> ����Ŭ�� ��ҹ������� ����
 *                             select selECT SELECT Select.... (����Ŭ���� ��ҹ��� ����=����� ������)
 *       equalsIgnoreCase => ��ҹ��� ���� ���� �� (����� �����̸�)
 *       compare() => ���� (ũ�� ��) 0(����)  ���� / ���  =========> ����Ŭ (Order BY name DESC|ASC)
 *                                  "ABC" "ABC"  "AB" "CD"
 *                                  ===========   A-C => -2
 *                                  A-A=0
 *                                  B-B=0
 *                                  C-C=0
 *    2) ã�� 
 *       =============================
 *       indexOf
 *       lastIndexOf ==> ������ġ (��ȣ)
 *       ============================= MVC (url�ּ�)
 *       contains : ���Կ��� 
 *       ============================= �м� => ���������� ã��
 *       startsWith:���۹��ڿ�
 *       endWidth:�����ڿ�
 *       ============================= �˻�
 *    3) ���ڿ� ���� 
 *       split => String[]
 *       substring() : 
 *       ============================= ���ڿ� ���� 
 *       
 *    4) ��Ÿ 
 *       replace : �ѱ��� 
 *       replaceAll => ��ȯ(���Խ�)
 *       ========================================
 *         [0-9] : ���� ��ü
 *         [A-Z] : �빮��
 *         [a-z] : �ҹ���
 *         [A-Za-z] : ��ҹ���
 *         [��-�R] : �ѱ���ü
 *         + �ѱ��� �̻�
 *         * 0���� �̻�
 *         | ���߿� �Ѱ� ����
 *         ? 
 *         ^ ���� , ����   ^A  ^��ȭ  [^��-�R]
 *         $ ������  A$
 *       ========================================= AI (30%) ê�� + ���¼Һм�
 *         regexp_like()
 *         
 *         ==> ���ڿ� ���� ���� 
 *       trim() : ���� ���� ===> ����� �Է� (space)          ���ڿ�
 *       valueOf : ��� ���������� ���ڿ��� ���� ========> �ڹ�=========>��(���ڿ�)
 *                                                   �� =========> �ڹ�
 *                                                       true  (String)
 *                                                    String s="true";
 *                                                    boolean b=(boolean)s; (X)
 *                                                    Boolean.parseBoolean(s) ==> wrapper
 *       length() : ���ڿ� ���� => ȭ�� UI     ...
 *       
 *    5) ���ڿ� ���� 
 *       +
 *       concat()  ... => ���ڿ� ���� (+) "Hello"+"Java"="HelloJava" => 7+"7"="77"
 *       
 *    ===========================================
 *    
 *    ******* ���ڿ��� ��ȣ�� 0���� ���� (����Ŭ�� 1������ ����)
 *    "Hello Java"
 *     0123456789  ==>  char[]={'H','e'.....}
 *    ******* String���� �����ϴ� ��� �޼ҵ�� �ν��Ͻ� �޼ҵ�� (���� : static => valueOf())
 *            String.valueOf()
 *             
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // equals : ���ڿ� �� 
		String s1="Hello";
		String s2="Hello";
		//   s1�� s2�� �ּҰ��� ���� �ϴ� => ���ڿ� ��ü�� �ּҸ� ������ �ִ� 
		String s3=new String("hello"); // Hello�ּ� �ƴ� ���ο� �ּҿ� �����Ѵ� 
		
		if(s1==s2)
			System.out.println("s1�� s2�� ������ �ּҸ� ������ �ִ�");
		else
			System.out.println("s1�� s2�� �ٸ� �ּҸ� ������ �ִ�");
		
		// == ������ (�⺻��������,�ּҰ� ��)
		if(s1==s3)
			System.out.println("s1�� s3�� ������ �ּҸ� ������ �ִ�");
		else
			System.out.println("s1�� s3�� �ٸ� �ּҸ� ������ �ִ�");
		
		// ���� �޸𸮿� ����Ǿ� �ִ� ���ڿ� �� => equals
		// public boolean equals(String s)
		// ��ҹ��� ����:equals / ��ҹ��� ���� ���� :equalsIgnoreCase
		// �˻��� : equalsIgnoreCase
		// ��й�ȣ : equals
		if(s1.equalsIgnoreCase(s3)) // ����� ���ڿ� ��ü�� ��
		{
			System.out.println("s1�� ����� �����Ϳ� s3�� ����� �����Ͱ� ����");
		}
		else 
		{
			System.out.println("s1�� ����� �����Ϳ� s3�� ����� �����Ͱ� �ٸ���");
		}
	}

}












