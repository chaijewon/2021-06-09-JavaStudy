/*
 *   논리연산자 ( && , || )
 *   
 *    조건 && 조건 
 *    조건 || 조건   ==> boolean (true/false)
 *    ===
 *     => 조건 (true/false) => 연산자 (비교연산자 , 부정연산자)
 *    
 *     => && : 범위, 기간이 포함이 되었는지 확인 
 *     => || : 범위, 기간에 포함이 안된 경우 주로 사용 (오류)
 *     
 *     int score=80
 *     100 90  ==>  score>=90 && score<=100
 *     0보다 작거나 100보다 크다면 다시...
 *     score<0 || score>100
 *     
 *     char c='A';
 *     
 *     c가 대문자라면 조건
 *     c>='A' && c<='Z'
 *     c가 소문자라면 조건 
 *     c>='a' && c<='z'
 *     
 *     c가 대문자가 아니라면 
 *     !(c>='A' && c<='Z')
 *     
 *     ==> char c='A';
 *     알파벳이라면 
 *     (c>='A' && c<='Z') || (c>='a' && c<='z')
 */
public class 자바연산자_논리연산자2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*char c='a';
        System.out.println(
        		(c>='A' && c<='Z') || (c>='a' && c<='z')?"알파벳입니다":"알파벳이 아닙니다"
        );*/
		int a;
		a=(int)(Math.random()*100)+1;
		//     =================== 0.0~0.99*100  ==> (0.0~99.0) => 0~99 + 1  => 1~100
		// ====
		// ==
		System.out.println(a);
		System.out.println(
		    a%2==0?"짝수입니다":"홀수입니다"		
		);
		
		// a가 1~50까지는 낮은수입니다 , 51~100 높은수입니다
		// 조건 ? "true일때":"false일때"
		System.out.println(
		    a>=1 && a<=50 ? "낮은수입니다":"높은수입니다"		
		);
	}

}










