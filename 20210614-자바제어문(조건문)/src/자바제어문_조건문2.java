import java.util.Scanner;
public class 자바제어문_조건문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 컴퓨터가 임의로 숫자를 저장 
		// 1~100까지 사이의 수를 임의로 추출 
		
		//int com=(int)(Math.random()*100)+1; // 1~100사이의 임의의 수 
		/*
		 *   Math.random() => 0.0~0.99 => 임의로 추출 
		 *      0.0~0.99 * 100 ==> 0.0~99.0+1 ==> 1.0~100.0
		 *      
		 *   (int)(Math.random()*100)+1
		 *        ===================
		 *              1  0.81*100 ==> 81.0
		 *   =====
		 *     2   ==> 81
		 *                           ==
		 *                           3  ==> 82
		 *   ** 자바에서 지원하는 메소드는 반드시 결과값 (결과값이 없는 경우 void)
		 */
		int com=105;
		// 단일 조건문은 따라 따로 독립적으로 실행 
		
		if(com%3==0)
			System.out.println(com+"는(은) 3의 배수입니다");
		
		
		if(com%5==0)
			System.out.println(com+"는(은) 5의 배수입니다");
		
		
		if(com%7==0)
			System.out.println(com+"는(은) 7의 배수입니다");
		
		
		if( !(com%3==0 || com%5==0 || com%7==0) )
			System.out.println(com+"는(은) 3,5,7배수가 아닙니다");
	}

}







