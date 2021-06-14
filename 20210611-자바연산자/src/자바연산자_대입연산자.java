/*
 *    대입연산자 
 *      =(값을 대입,결과값 대입)
 *      
 *      +=  
 *        예)   int a=10;
 *              a+=5;  ====> a=a+5;  => 15
 *                            <===
 *      -=
 *        예)   int a=10;
 *              a-=5; =====> a=a-5  ==> 5
 *      *=
 *        예) 
 *             int a=10;
 *             a*=5;  =====> a=a*5  ==> 50
 *      /=
 *        예)  int a=10;
 *             a/=3;  =====> a=a/3  ==> 3
 *      %=
 *        예)  int a=10;
 *            a%=3;   ====> a=a%3   ==> 1
 *      <<=
 *        예)  int a=10;
 *            a<<=2   ===> a=a<<2   ==> 40
 *                           101000  (32+8)=40
 *      >>=
 *        예)  int a=10;
 *            a>>=2   ===> a=a>>2   ==> 2
 *                         1010 => 10 ==> 2
 *      &=
 *        예)
 *             int a=10;
 *             a&=5;   ===> a=a&5  
 *                          1010 (10)
 *                          0101
 *                          =====
 *                          0000  ==> 0
 *      |=
 *        예)  int a=10;
 *             a|=5     ===> a=a|5
 *                       1010
 *                       0101
 *                       ====
 *                       1111 ==> 15
 *      ^=
 *        예)  int a=10;
 *             a^=5;    ===> a=a^5
 *                       1010
 *                       0101
 *                       ====
 *                       1111  ==> 15
 *                       
 *                       
 *        1씩 증가 
 *        a++
 *        ++a
 *        a+=1
 *        a=a+1
 *      
 *      
 */
public class 자바연산자_대입연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		a+=10;
		/*a++;
		a++;
		a++;
		a++;
		a++;
		a++;
		a++;
		a++;
		a++;
		a++;*/
		System.out.println(a);

	}

}
