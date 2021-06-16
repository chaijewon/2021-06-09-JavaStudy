/*
 *    반복문 => 동일한 패턴 여러개가 있는 경우 (수행하는 문장)
 *            ==========
 *              => 수열 
 *            -1+2-3+4-5+6-7+8-9+10
 *     = for : 반복 횟수가 지정된 경우 (주로) 
 *     = while : 반복 횟수가 없는 경우 (무한루프) => 선조건
 *     = do~while : 반복 횟수가 없는 경우 => 후조건 (1개의 문장은 반드시 수행)
 *     
 *     ==> 자바 
 *         = 네트워크 (Application,Mobile)
 *         = 데이터베이스 (WebApplication) ******* 웹(Java)앱(Kotlin)  ====> for(2차) , if
 *                                                        var => 변수
 *                                                        var a=10 
 *                                                        val => 상수
 *     ==> 1. 형식 
 *         2. 순서
 *         
 *         for 
 *            형식)
 *                         1    2     4
 *                   for(초기값;조건문;증가식)
 *                   {
 *                        반복 실행문장  3
 *                   }
 *                   1-2-3-4
 *                     2-3-4
 *                     2-3-4
 *                    ==
 *                    false=> 반복 중단
 *         while
 *                  초기값    ======  1
 *                  while(조건식) == 2
 *                  {
 *                      실행문장   == 3
 *                      증가식     == 4  ===> 증가한 후 => 조건 2
 *                  }
 *         do~while
 *                  초기값    ======  1
 *                  do{
 *                      실행문장 === 2
 *                      증가식   === 3
 *                  }while(조건식);== 4 ==> 조건식 => false일때 종료하는 문장 
 *                                              
 */
public class 자바제어문_반복문1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // -1+2-3+4-5+6-7+8-9+10 => 결과값 
		// -1-2+3-4+5+6-7-8+9+10
		int sum=0; // 결과값 누적 변수 
		
		// 루프 변수 ==> 반복문 
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
				sum+=i; // 짝수면 더해서 누적  ==> sum=sum+i
			else
				sum-=i; // 홀수면 누적된 수에서 빼기 ==> sum=sum-i
		}
		System.out.println(-1+2-3+4-5+6-7+8-9+10);
		System.out.println("sum="+sum);
	}

}












