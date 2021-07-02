/*
 *    변수의 초기화 
 *     변수 : 한개를 저장하는 공간 (반드시 값을 입력)
 *     멤버변수 => 자동 초기화
 *               class A
 *               {
 *                  int a; ==> 0
 *                  double d;=> 0.0
 *                  boolean b;=> false
 *                  String s; => null
 *                  long l; => 0L
 *               }
 *     지역변수 => 자동 초기화 (X) : 사용전까지 반드시 값을 설정 
 *                              ======
 *                              연산처리전 , 출력전 ...
 *                              
 *    멤버변수에 대한 초기값 
 *      1.명시적 초기화 
 *        class A
 *        {
 *            int a; = 0
 *            int b=100;// 게임 , 위치(출력)
 *            String name; null=> 나중에 변경해서 사용 
 *            String n="홍길동";
 *        }
 *      2.생성자 : 외부에서 데이터를 읽어서 초기화 
 *                => 자동 로그인 
 *               파일 읽기 => 데이터를 초기화 
 *      3.초기화블록 
 *        class A
 *        {
 *            int sum;
 *            
 *            인스턴스블록 
 *            {
 *               for(int i=1;i<=1000;i++)
                 {
        	        sum+=i;
                 }
 *            }
 *            
 *            // 공유변수 일 경우(static)
 *            static  ==> 마이바티스 (XML을 읽어 초기화)
 *            {
 *               
 *            }
 *            
 *        }           
 *        
 *         a => 10 => 100 => 1000
 *         b => 20 => 200 => 2000
 */
class B
{
	int a=1000; 
	static int b=2000;
	
	    // 복잡한 초기화 => for, 난수 ... , 객체마다 변수 초기값이 다르게 만든다 
	    // 2
		{
			System.out.println("인스턴스 초기화 블록");
			a=100;
		}
		// 1
		static
		{
			System.out.println("static 초기화 블록");
			b=200;
		}
		// 3
		B()
		{
			System.out.println("생성자에서 초기화");
			a=1000;
			b=2000;
		}
	
}
public class 변수초기화 {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        B b=new B();
        System.out.println(b.b);
        System.out.println(b.a);
	}

}






