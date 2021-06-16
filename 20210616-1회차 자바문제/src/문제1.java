/*
 *  1) Scanner 클래스를 이용하여 한 개의 정수를 입력 받아 양수인지 
 *     음수인지 판별하여 출력하라
 *     
 *     if~else 
 *     
 *     형식)
 *          if(조건문) => 음수 => <0
 *          {
 *             조건이 true 처리
 *          }
 *          else => 양수
 *          {
 *             조건이 false 
 *          }
 *          
 *          ==> 삼항연산자 (조건)?"양수":"음수"
 */
import java.util.Scanner;
public class 문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 정수를 받는다 
		Scanner scan=new Scanner(System.in); //System.in => 키보드 입력값을 받는다 
		System.out.print("정수 입력:");
		int num=scan.nextInt();
		// 요청한 데이터에 대한 결과값 출력 
		if(num<0)
			System.out.println(num+"는(은) 음수입니다");
		else
			System.out.println(num+"는(은) 양수입니다");
		
		// if~else ==> 연산자를 이용할 때는 삼항연산자를 이용한다 
		System.out.println(num<0?num+"는(은) 음수입니다":num+"는(은) 양수입니다");
	}

}









