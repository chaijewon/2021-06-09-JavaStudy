/*
 * 윤년 (로마시대) => 윤년 , 암호화...(시저스암호화) => 대칭  => RAS , DES , AES => 복호화 
 *   윤년 계산 => 4년 마다 
 *              100년 마다 제외 
 *              400년 마다
 *              
 *               ===> 자바로 구현 
 *                    (year%4==0) && (year%100!=0) || (year%400==0) ==> 공식  => 달력 
 *                      => 예매 , 호텔(체크인,체크아웃) => ERP (관리)
 *                      => Calendar 
 */
import java.util.Scanner;
public class 문제4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("년도 입력:");
        int year=scan.nextInt();
        // 결과 
        if((year%4==0 && year%100!=0)||(year%400==0))
        	System.out.println(year+"는(은) 윤년입니다");
        else
        	System.out.println(year+"는(은) 윤년이 아닙니다");
	}

}










