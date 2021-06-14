/*
 *   + , - , * , / , % => 자동형변환
 *   int + int = int
 *   int + long = long
 *   int + long + double = double
 *   char + int = int
 *   char + char = int
 *   byte + byte = int
 *   나누기 (/)
 *     = 정수/정수 = 정수  10/3 => 3 , 10/4 = 2
 *       소수점이 필요한 경우 => 정수/실수 = 실수
 *     = 0으로 나누면 오류발생한다 
 *   나머지 (%) 
 *     5%2 = 1    10%3 = 1 ==> 배수계산 
 *     부호의 문제 (왼쪽편 부호의 값이 남는다) 
 *     5%2=1
 *     5%-2=1  => 1+4/-2
 *     -5%2 = -1  -1-4/2
 *     -5%-2=-1   -1(-4/-2)
 *     
 *   
 */
public class 자바연산자_산술연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        /*int a=10;
        int b=3;
        System.out.println(a/b);*/
		int a=5;
		int b=2;
		System.out.println(a%b); // 1
		System.out.println(a%-b);// 1
		System.out.println(-a%b);// -1
		System.out.println(-a%-b);// -1
		System.out.println(a*-b); //-10
		System.out.println(-a*-b);//10
		byte b1=127;
		byte b2=127;
		byte b4=10+20+30; // 60
		long b3=(b1+b2); // 결과값이 int
		System.out.println(b3);
		System.out.println(Integer.toBinaryString(-2));
		//  1111 1110 
		/*
		 *    1111 1110
		 *    ========== 양수
		 *    0000 0001
		 *    ==========
		 *    +       1
		 *    ==========
		 *          2 ==> 음수 = -2
		 */
		//System.out.println(0b11111111111111111111111111111110);
		char c1='A';
		char c2='B';
		double c3=(char)(c1+c2); // 10+20 =>
		System.out.println(c3);
		/*
		 *   계산 결과 : short ==> short , int , long, float, double
		 *             long  ==> long , float, double
		 *             int   ==> int , long, float , double
		 *             
		 *    double d=10
		 *    float f=10
		 *    
		 */
		
	}

}
