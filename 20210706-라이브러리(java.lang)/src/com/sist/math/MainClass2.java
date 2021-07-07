package com.sist.math;
/*
 *   웹에서 사용하는 자바 3대 클래스 
 *   ========================== 1. String , 2. Integer , 3. ArrayList
 *   Wrapper 클래스 
 *   => 기본데이터형(int , long, char , boolean ,double , float,byte,short)
 *      편하게 다루기 위해서 클래스형으로 제작 
 *      int a=10; => 이진법  => Integer
 *      
 *      정수형 
 *        byte ===== Byte
 *        short ===== Short
 *        ***int   ==== Integer
 *        long ==== Long
 *        char ==== Character
 *        float === Float
 *        ***double == Double 
 *        ***boolean == Boolean
 *                    사용자 : 나이 "30"
 *        웹(윈도우)  ===================> int age=("30"==> 정수변환)
 *                                           (int)"30" => 불가능   ===> int a=(int){"3","0"}(X)
 *                                           문자열을 정수형으로 변경하는 메소드 
 *                                           Integer.parseInt("30") ==> int a=30
 *                                           "true" ==> Boolean.parseBoolean("true") => true
 *                                           "10.5" ==> Double.parseDouble("10.5") => 10.5
 *        int a=10;
 *        String s="10"
 *        
 *        ==> a=>문자열 변환  String.valueOf(a) => "10"
 *        ==> s=>정수형 변환  Integer.parserInt(s) => 10 => 에러 NumberFormatException
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
		
        //특정 문자열 검색
        if(s.matches(".*welcome.*")) {
            System.out.println("문자가 포함되어 있습니다.");
        }else {
            System.out.println("문자가 포함되어 있지 않습니다.");
        }
        
        //영문자가 있는지 검색
        if(s.matches(".*[a-zA-Z].*")) {
            System.out.println("영문자가 포함되어 있습니다.");
        }else {
            System.out.println("영문자가 포함되어 있지 않습니다.");
        }
        
        //숫자가 있는지 검색
        if(s.matches(".*[0-9].*")) {
            System.out.println("숫자가 포함되어 있습니다.");
        }else {
            System.out.println("숫자가 포함되어 있지 않습니다.");
        }
        
        s = "Hello welcome to the this place";
        System.out.println(s.indexOf("welcome")); //문자열 검색
        System.out.println(s.indexOf("t")); //단어 검색
        System.out.println(s.indexOf("welcome",10)); //문자열을 10번째 index부터 검색
        System.out.println(s.indexOf("t",10)); //단어를 10번째 index부터 검색
        
        if(s.indexOf("welcome")!=-1) {
            System.out.println("문자가 포함되어 있습니다.");
        }else {
            System.out.println("문자가 포함되어 있지 않습니다.");
        }
	}

}
