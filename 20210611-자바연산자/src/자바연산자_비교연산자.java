/*
 *   비교연산자 ( 숫자 비교 
 *             기본 데이터형 포함 (int,byte...)
 *             문자열은 비교할 수 없다 (문자열은 주소)
 *   종류 
 *   
 *   같다   == ,
 *   같지 않다 != , 
 *   작다      <
 *   크다      >
 *   작거나 같다 <=  < || ==   6<=6
 *   크거나 같다 >=  > || ==    6>=6  => 6>6 || 6==6
 *   
 *   ====> 결과값 : boolean (true/false)
 *   
 */
public class 자바연산자_비교연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*System.out.println(6==7); 
        boolean b=7==7;
        System.out.println(b);
        b=10!=10;
        System.out.println(b);
        b=10<10;
        System.out.println(b);
        b=10>10;
        System.out.println(b);
        b=10<=10; // 10<10 || 10==10
        System.out.println(b);
        b=10>=10; // 10>10 || 10==10
        System.out.println(b);*/
		int a=10;
		int b=9;
		boolean bCheck = a==++b; // b를 1개 증가후 비교한다 
		System.out.println(bCheck);
        bCheck= a==b++; // 비교한후에 증가 
        System.out.println(bCheck);  // 조건문 
        
	}

}
