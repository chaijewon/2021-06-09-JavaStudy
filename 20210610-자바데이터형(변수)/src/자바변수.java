
public class 자바변수 {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 변수 / 상수 
		/*
		 *   데이터형 변수명=값  ==> 변수 (변경이 가능한 값)
		 *          =====
		 *   final 데이터형 상수명=값  ==> 상수 (변경할 수 없는 값)
		 *   
		 *   식별자 (변수명,상수명 설정 방법) : 문법 사항  => 클래스,메소드 
		 *    1. 알파벳이나 한글로 시작한다 (알파벳은 대소문자를 구분)
		 *    2. 숫자를 사용할 수 있다 (단 앞에 사용 금지) => 2a(X) , a1 ,a1b
		 *    3. 특수문자 사용이 가능 ( _ , $ ) : _ (두개의 단어가 있는 경우)
		 *                      file_size, file_name... , fileName...
		 *                      max_value , min_value
		 *    4. 키워드는 사용 할 수 없다 (자바에서 사용하는 단어)
		 *       int int;  int public   int int1 , int int2...(O)
		 *       
		 *    int a=10;
		 *    final b=20;
		 *   약속사항 
		 *     1) 변수,메소드는 소문자로 시작한다 
		 *     2) 클래스는 첫자를 대문자 
		 *     3) 상수는 전체 대문자
		 *    
		 *   final int MAX_VALUE=21...
		 *   
		 *   class Sawon
		 *   
		 *   Sawon sawon=
		 */
	    
		//System.out.println(Integer.MAX_VALUE);
		//System.out.println(Integer.MIN_VALUE);
		{
			int a=10;
		}
		//System.out.println(a);
		System.out.println(9+10);
		System.out.println(9+""+10);
		int a=10;
		System.out.println(a);
		a=20;
		System.out.println(a);
		//System.out.println(a);
		//System.out.println(b);
	}

}
