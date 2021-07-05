package com.sist.exception;
/*
 *   throws : 예외 회피,간접 처리 
 *   =======
 *     예상되는 에러가 이런 것들이 있다 , 그냥 넘어간다 (시스템에 의해서 처리)
 *   형식) 리턴형 메소드명() throws 예외처리종류..........
 *                             NumberFormatException,NullPointerException,Exception...
 *                             ========================================================
 *                               순서가 존재하지 않는다 
 *        => throws가 들어가 있는 메소드를 호출할때 (호출해서 사용하는 메소드에서 처리)
 *            => 회피 
 *            => 직접처리 
 *            
 *        예외가 발생 : ArrayIndexOutOfException ==> 배열이 큰 경우 ==> 인덱스번호 문제가 발생 할 수 있다
 *        public static void display1() throws ArrayIndexOutOfException // RuntimeException
 *        {
 *        }
 *        
 *        public static void display2() throws Exception // 컴파일에러 => 나중에 호출시에 처리 한다 
 *        {
 *        }
 *        public static void main(String[] arg) throws Exception
 *                                              ================= 회피
 *        {
 *             display1(); // 예외처리를 하지 않고 사용해도 오류가 없다,생략 
 *             try
 *             {
 *               display2(); // 예외처리 하지 않고 사용하면 오류를 발생한다 
 *             }catch(Exception ex){}
 *        }
 */
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
	}

}
