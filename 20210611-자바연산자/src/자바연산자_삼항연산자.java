/*
 *    삼항연산자 
 *      형식) 
 *           조건 ? 값1 : 값2
 *           ===
 *            true일 경우 ==> 값1
 *            false일 경우 ==> 값2
 */
import java.util.Scanner; // 입력값을 받는 경우 
// 다른 클래스를 불러 올때 사용 
/*
 *    c/c++  => #include <io.h>
 *    java   => import 클래스명
 *    c#     => using 
 *    python => from 경로 import 
 *    kotlin => import 
 */
public class 자바연산자_삼항연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        char c='A';
        System.out.println(
           (c>='A' && c<='Z')||(c>='a' && c<='z')?"알파벳":"알파벳이 아니다"
        );
        char c1='1'; // '0'~'9'   '100'
        // [0-9]  [A-Za-z] [가-힣]
        System.out.println(
           	c1>='0' && c1<='9'?"숫자형 문자":"숫자형 문자가 아니다"
        );
        
        int i=100;
        System.out.println(
           i%3==0 || i%5==0 || i%7==0 ? "3의배수,5배수,7배수":"다른 배수"	
        );
	}

}






