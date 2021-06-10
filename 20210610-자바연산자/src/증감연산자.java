/*
 *   정수 데이터를 1개 저장 
 *   int a=10; 
 *   ===   ==
 *   1     2
 *       =
 *       a
 *       
 *   int => 4byte메모리를 생성 
 *          =============== 
 *          10을 메모리에 저장 
 *          ===============
 *          저장된 위치를 a라는 이름으로 사용 
 *          a=1000;
 *          
 *    byte b=100;
 *    ====
 *         1byte 메모리 공간을 만든다
 *         만들어진 공간에 100을 저장한다 
 *         저장된 값을 사용하려면 => b라는 이용한다 
 *         b=1000; // 오버플러워
 *         
 *    boolean b=true;
 *    =======
 *         1byte 메모리 공간을 만든다 
 *         만진들어 공간에 true를 저장한다
 *         저장된 값을 사용하려면 => b라는 이름을 이용한다 
 *         b=false;
 *         
 *    char c='A';
 *         2byte 메모리 공간을 만든다 
 *         'A'를 저장 해라 
 *         'A'라는 값을 사용 => c라는 이름으로 사용 
 *         c='B'
 *         
 *    float f=10.5f; ==> float f  =  10.5 (10.5=>float => 10.5f)
 *                       ========    ====
 *                         4          double(8)
 *         // 오류 발생 
 *         4byte 메모리를 생성 => 이름을 f로 사용
 *         f 라는 공간에 10.5f을 저장 한다 
 *         
 *         f=20.0f을 저장 한다  10.5f(X) => 20.0f
 */
public class 증감연산자 {
    //int a=20;//heap
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 같은 블록안에서는 같은 이름의 변수를 사용할 수 없다
        /*int a=10;//stack
        System.out.println(a); 
        a=20;
        System.out.println(a);
        a=30;
        System.out.println(a);
        */
		// 문자 ='A'를 저장 한다  ==> 'B'로 변경 => 'C'로 변경해서 출력 
		char c='A';
		System.out.println(c);
		c='B';
		System.out.println(c);
		c='C';
		System.out.println(c);
		
		// 논리형 = false  => true로 변경해서 출력 (boolean)
		// 모든 데이터형 ==> 제어하기 쉽게 자바에 클래스화 boolean => Boolean
		boolean b=false;
		b=true;// 수정 
		
		// 실수형 
		// 4byte에 10.5 실수저장 한다 출력한다 
		float f=10.5f;
		// f,F=> float 데이터 표현 
		System.out.println(f);
		
		// int에 (4byte) => 2150000000
		long won=2150000000L; // 자바에서는 모든 정수은 int 
		System.out.println(2150000000L);
		
		byte b1=100;// 일반 숫자를 적용 (단 => 127을 벗어나면 안된다)
		short s=200; // 일반 숫자를 적용 (단 => 32767를 벗어나면 안된다)
		// byte , short , char => 연산 => 결과값 => int
		byte b2=100;
		byte b3=10;
		//int b4=b2+b3;
		
	}

}
