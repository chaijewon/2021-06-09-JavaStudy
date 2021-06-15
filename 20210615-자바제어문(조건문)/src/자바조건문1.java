/*
 *     140 PAGE
 *     if ~ else 
 *     : 조건이 true일때 false일때 처리하는 문장이 다른 경우 
 *       => 로그인 , 아이디 중복체크 , 우편번호(입력안된 경우,없는 데이터)
 *       
 *     형식)
 *           if(조건문)
 *           {
 *              // 조건이 true일때 처리하는 문장  => 아이디가 중복이 안된 경우
 *           }
 *           else
 *           {
 *              // 조건이 false일때 처리하는 문장 => 아이디가 중복이 되었다면 
 *           }
 *           
 *           
 *           ==> 정수를 입력받아서 짝수/홀수  ==> Scanner : 반드시 import java.util
 */
import java.util.Scanner;// 다른 클래스를 불러서 사용 => import 
public class 자바조건문1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner : 키보드 입력값을 받아서 => 받은 데이터를 메모리에 저장 (각 클래스 : 기능) : 오버라이딩(재정의)
		// 1. Scanner => 데이터형 (클래스:사용자 정의) 메모리에 저장해서 사용 => 저장할때 new 
		// 생성 => 클래스명 변수명=new 클래스명() ==> 클래스명() 생성자함수 => 클래스가 가지고 있는 변수 초기화
		/*
		 *    클래스의 구성 요소 
		 *      1. 변수  2. 메소드  3. 생성자  ==> 객체지향 프로그램 
		 */
		Scanner scan=new Scanner(System.in); // System.in(키보드 입력값을 받는 경우),System.out(화면 출력)
        /*
         *   사용자 입력 
         *     정수 =======> nextInt()
         *     문자열 ======> next()
         *     논리형 ======> nextBoolean()
         *     실수형 ======> nextDouble()
         */
		// 사용자 => 메세지 전송 
		System.out.print("정수 입력:"); // 입력된 정수를 읽어와서 저장되는 시점 : enter
		// 저장 
		int num=scan.nextInt();
		// num안에 사용자 입력한 값이 저장 
		if(num%2==0)// 짝수 조건 
		{
			System.out.println(num+"은(는) 짝수입니다!!");
		}
		else // 짝수가 아니면 
		{
			System.out.println(num+"은(는) 홀수입니다!!");
		}
	}

}











