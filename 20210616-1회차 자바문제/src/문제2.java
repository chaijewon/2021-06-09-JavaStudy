/*
 *   2) 한 개의 정수를 입력 받아 3의 배수인지 판별하여 출력하라
 *      if~else 
 *      if(num%3==0)
 *         3의 배수
 *      else
 *         3의 배수가 아니다 
 *         
 *      ==> 삼항연산자 
 */
public class 문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num=(int)(Math.random()*100)+1; // 1~100 난수 발생
        System.out.println(num%3==0?num+"은(는) 3의 배수입니다":num+"은(는) 3의 배수가 아닙니다");
        
        if(num%3==0)
        	System.out.println(num+"은(는) 3의 배수입니다");
        else
        	System.out.println(num+"은(는) 3의 배수가 아닙니다");
	}

}
