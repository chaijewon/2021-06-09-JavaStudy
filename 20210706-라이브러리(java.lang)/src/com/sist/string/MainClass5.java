package com.sist.string;
/*
 *   replace  : ��ȯ 
 *     String s="Hello"
 *     s.replace('l','k');  ==> Hekko
 *               old  new 
 *   replaceAll
 *   trim
 *   valueOf
 *   length
 *   
 *   String s="Hello Java";
 *   s="Hekko Java";
 *   
 *   int a=10;
 *   int b=a; b=100;
 *   a=100;
 *   
 *   ==> �ڹ� (StringŬ���� => call by reference(X)) => Call by Value => �Ϲ� �⺻�� ������ 
 *   
 */
public class MainClass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String data="Hello Java";
        // ��ȯ�� ���ڿ� �ޱ� 
        String s=data.replace('l', 'k');
        System.out.println(s);
        s=data.replace("Java", "Kotlin");// ���ڿ� ��ü ����
        System.out.println(s);
        System.out.println(data);
        int rank=(int)(Math.random()*500)+1;
        String data2=rank+"���� ��� ������ �Ұ�������";
        System.out.println(data2);
        String num=data2.replaceAll("[^0-9]", ""); //���ڸ� �����ϰ� ������ ""
        String title=data2.replaceAll("[^��-�R]", "");
        System.out.println("Rank:"+num);
        System.out.println("Title:"+title);
        
        // trim() => �¿��� ������ ���� : ����� �Է°� => ȸ������ , �α��� ,���̵�üũ , ��й�ȣ... => ����Ŭ�� ����
        String data3=" Hello Java ";
        System.out.println(data3.length());
        System.out.println(data3);
        String s2=data3.trim(); // "Hello Java" => �߰��� �ִ� ������ ���� �� �� ���� 
        // s2.replace(" ","")
        System.out.println(s2.length());
        System.out.println(s2);
        System.out.println(s2.replace(" ",""));// �߰��� �ִ� ������ ����
        // valueOf() => static => String.valueOf(10) = "10" 
        // String.valueOf(true) => "true" 
        // String.valueOf(10.5) => "10.5" 
        // ��� ���������� ���ڿ��� ��ȯ  ==> ������ , �� (���ڿ�) 
        
        
	}

}








