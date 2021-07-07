package com.sist.math;
/*
 *   ������ ����ϴ� �ڹ� 3�� Ŭ���� 
 *   ========================== 1. String , 2. Integer , 3. ArrayList
 *   Wrapper Ŭ���� 
 *   => �⺻��������(int , long, char , boolean ,double , float,byte,short)
 *      ���ϰ� �ٷ�� ���ؼ� Ŭ���������� ���� 
 *      int a=10; => ������  => Integer
 *      
 *      ������ 
 *        byte ===== Byte
 *        short ===== Short
 *        ***int   ==== Integer
 *        long ==== Long
 *        char ==== Character
 *        float === Float
 *        ***double == Double 
 *        ***boolean == Boolean
 *                    ����� : ���� "30"
 *        ��(������)  ===================> int age=("30"==> ������ȯ)
 *                                           (int)"30" => �Ұ���   ===> int a=(int){"3","0"}(X)
 *                                           ���ڿ��� ���������� �����ϴ� �޼ҵ� 
 *                                           Integer.parseInt("30") ==> int a=30
 *                                           "true" ==> Boolean.parseBoolean("true") => true
 *                                           "10.5" ==> Double.parseDouble("10.5") => 10.5
 *        int a=10;
 *        String s="10"
 *        
 *        ==> a=>���ڿ� ��ȯ  String.valueOf(a) => "10"
 *        ==> s=>������ ��ȯ  Integer.parserInt(s) => 10 => ���� NumberFormatException
 *            board.jsp?page= 10  ==> " 10" 
 */
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(Integer.parseInt(" 10".trim()));
        int a=Integer.parseInt("30");
        int b=Integer.parseInt("1000",2);
        int c=Integer.parseInt("100",8);
        int d=Integer.parseInt("FF",16);
        System.out.println(a+" "+b+" "+c+" "+d);
        String s = "Hello welcome to the this place";
		
        //Ư�� ���ڿ� �˻�
        if(s.matches(".*welcome.*")) {
            System.out.println("���ڰ� ���ԵǾ� �ֽ��ϴ�.");
        }else {
            System.out.println("���ڰ� ���ԵǾ� ���� �ʽ��ϴ�.");
        }
        
        //�����ڰ� �ִ��� �˻�
        if(s.matches(".*[a-zA-Z].*")) {
            System.out.println("�����ڰ� ���ԵǾ� �ֽ��ϴ�.");
        }else {
            System.out.println("�����ڰ� ���ԵǾ� ���� �ʽ��ϴ�.");
        }
        
        //���ڰ� �ִ��� �˻�
        if(s.matches(".*[0-9].*")) {
            System.out.println("���ڰ� ���ԵǾ� �ֽ��ϴ�.");
        }else {
            System.out.println("���ڰ� ���ԵǾ� ���� �ʽ��ϴ�.");
        }
        
        s = "Hello welcome to the this place";
        System.out.println(s.indexOf("welcome")); //���ڿ� �˻�
        System.out.println(s.indexOf("t")); //�ܾ� �˻�
        System.out.println(s.indexOf("welcome",10)); //���ڿ��� 10��° index���� �˻�
        System.out.println(s.indexOf("t",10)); //�ܾ 10��° index���� �˻�
        
        if(s.indexOf("welcome")!=-1) {
            System.out.println("���ڰ� ���ԵǾ� �ֽ��ϴ�.");
        }else {
            System.out.println("���ڰ� ���ԵǾ� ���� �ʽ��ϴ�.");
        }
	}

}
