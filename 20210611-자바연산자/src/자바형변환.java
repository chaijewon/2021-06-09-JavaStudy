/*
 *   1. 형변환 => 데이터형을 변경 (제외 : boolean)
 *      int => double ==> 10 => 10.0
 *      double=> int (******) 10.5 => 10 (소수점 제외)
 *      int => char ==> 65 ==> 'A'
 *      char=> int  ==> 'A' ==> 65
 *   2. 연산처리 
 *      => 같은 데이터형을 만든다 (가장 큰 데이터형으로 변경)
 *         int + double = double
 *         ===
 *         double  ===> 자동형변환 
 *         
 *         double d=10 ==> 10.0
 *                  ==
 *                  10.0
 *         int a= 'A' ==> 65
 *                ===
 *                65
 *      => int이하 (byte,short,char) => 연산결과값 int
 *      => 강제 변환 (데이터형)값
 *         (int)10.5 ==> 10
 *         (char)65
 *         => 라이브러리 
 *            Math.random() ==> 0.0~0.99
 *            
 *       변수 설정 
 *       1) 선언
 *          int a;
 *       2) 초기값
 *          a=10     ===> 1. 사용자의 입력값을 받아서 저장 Scanner
 *                   ===> 2. 컴퓨터에서 난수 
 *       ========
 *       선언과 동시 초기값 
 *       int a=10;
 *       
 *            
 */
public class 자바형변환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // double => int
		// 변수 선언 
		int a;
		// 초기화 
		a=(int)(Math.random()*100);  // 0.0~0.99 * 100  => 0.0~99.0
		// 0.0 and less than 1.0
		// 0~99
		System.out.println(a);
		
		int b='A'+32;
		// b=97 ==> 알파벳 
		System.out.println((char)b);
	}

}
