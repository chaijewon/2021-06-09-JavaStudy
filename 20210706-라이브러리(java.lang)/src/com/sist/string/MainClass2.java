package com.sist.string;
// indexOf , lastIndexOf : ������ ���ڳ� ���ڿ��� ã�� �� ��� => int(��ġ) 
/*
 *     String s="http://localhost:8080 /JSPProject/main/main.jsp";
 *               ===================== ==========================
 *                                           URI
 *               ================================================ URL
 *     
 *     
 */
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="http://localhost:8080/JSPProject/main/main.jsp";
        int start=s.indexOf("/");
        System.out.println(start);
        int last=s.lastIndexOf("/");
        System.out.println(last);
        String s1=s.substring(s.lastIndexOf("/")+1); // Ȯ���� 
        System.out.println(s1);
	}

}
