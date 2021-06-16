/*
 *  3) Scanner 클래스를 이용하여 한 개의 정수를 입력 받아 정수의 절대값을 출력하라 양수 
 *     if(num<0) 
 *         System.out.println(num+"의 절대값은 "+ -num +"입니다")
 *     else 
 *         System.out.println(num+"의 절대값은 "+ num +"입니다")
 *         
 *      ==> Math.abs(num) => 절대값 출력하는 기능 
 */
import java.util.Scanner;
public class 문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //System.out.println(Math.abs(-1));
        //System.out.println(Math.abs(1));
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
		int num=scan.nextInt();
		
		if(num<0)
			System.out.println(num+"의 절대값은 "+(-num)+"입니다");
		else
			System.out.println(num+"의 절대값은 "+(num)+"입니다");
		
		System.out.println(
		   num<0?num+"의 절대값은 "+(-num)+"입니다":num+"의 절대값은 "+(num)+"입니다"		
		);
		
	}

}








