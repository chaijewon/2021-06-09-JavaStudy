/*
 *     논리연산자 => && , || 
 *       => 결과값 ==> boolean (true/false)
 *    
 *       형식)
 *            조건 && 조건   ,  조건 || 조건 
 *     ====================================
 *                          &&       ||
 *     ====================================
 *      true true          true     true
 *     ====================================
 *      true false         false    true
 *     ====================================
 *      false true         false    true
 *     ====================================
 *      false false        false    false 
 *     ====================================
 *     
 *     => 논리연산자 (효율적인 연산을 한다)
 *                 ===========
 *                 
 *        &&는 왼쪽조건 false일 확률이 있는 조건을 사용 
 *              (false) && (조건)
 *              =======    =====(처리하지 않는다)
 *        ||는 왼쪽조건 true     
 */
public class 자바연산자_논리연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=10;
        int b=9;
        boolean bCheck=(a<b) || (++b==a);
        System.out.println(bCheck);
        System.out.println(b);
	}

}
