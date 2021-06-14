/*
 *   국어 영어 수학 점수를 받아서 평균 , 총점 
 */
// => 직접 입력 , 사용자 입력값 , 난수(컴퓨터)
/*
 *    int kor=90;
 *    int eng=80;...
 *    
 *    scan.nextInt()
 *    
 *    Math.random()
 */
import java.util.Scanner;
public class 자바연산자정리3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Scanner를 생성  => 클래스는 생성 => new => 메모리에 저장 
		Scanner scan=new Scanner(System.in);
		// System.in(입력값을 읽는 경우 : inputStream), System.out(화면 출력 : outputStream) => IO
		System.out.print("국어 입력:");
		int kor=scan.nextInt();// 입력된 정수를 받아오는 기능  (nextInt())
		System.out.print("영어 입력:");
		int eng=scan.nextInt();
		System.out.print("수학 입력:");
		int math=scan.nextInt();
		
		System.out.println("=============결과===========");
		System.out.println("총점:"+(kor+eng+math));// 80+80+80  => 총점:808080
		//    ()안에 있는 연산을 수행 => 다음 결과값을 총점:뒤에 붙인다
		System.out.printf("평균:%.2f\n",(kor+eng+math)/3.0);
		/*
		 *   next()  ===> String  ====> String
		 *   nextInt() => 정수(int)
		 *   nextBoolean() => true/false
		 *   nextDouble() => 실수 
		 */
		
	}

	
	
	
	
	
	
	
}
