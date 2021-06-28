// 변수(멤버변수=> 클래스영역에 선언된 변수) 변수:초기값을 가지고 있다 
// 명시적 초기화 
// 10000부터 20000까지의 합 ==> int i=0 , int i=1 , int i=10000
// 자동 로그인 => String id; => null  id="admin"
// int sum=> 1~100까지의 합 누적 
public class 변수초기화2 {
    int a=100;
    String name="홍길동";
    double d=10.5;
    boolean b;
    int sum; //0 
    // 선언만 가능 => 클래스영역에서는 구현(X) => 제어문 ,메소드 호출 , 파일 읽기 , 네트워크 연결 , 오라클 연결
    // 1. 생성자 이용 => 명시적 포기화가 안되는 부분에서 생성자에서 초기화
    // 생성자 => 멤버변수=> 초기화
    // 생성자 => 오버로딩을 지원한다 (생성자 1개라 아니라 여러개 만들 수 있다)
    // 사용자부터 입력을 받아서 처리 => 매개변수 
    /*
     *   초기화 : 직접 값을 입력해서 메모리 저장 (클래스에서 값을 지정) int a=10;
     *   사용자 : 입력값을 받아서 메모리 저장 => 생성자
     *   컴퓨터 난수 메모리 저장 => 생성자 
     *   
     *   생성자는 클래스를 메모리에 저장 할 때 처음으로 호출되는 메소드 
     *   ***** 생성자는 호출시에 
     *   class A
     *   {
     *      A(){} => 클래스명과 동일 , 리턴형이 없다 
     *      void A(){} => 일반 메소드 
     *      void display(){} => 메소드 
     *           ===========
     *   }
     *   
     *   A a=new A();
     *   a.display(); 
     *     =========
     *   A() => 오류 ==> 생성자는 단독으로 호출시 반드시 new A();
     */
   변수초기화2() {
		// TODO Auto-generated constructor stub
    	System.out.println("생성자 호출...");
    	// 명시적인 초기값이 아닌 경우에 생성자 {}을 이용해서 구현 
    	for(int i=1;i<=100;i++)
    	{
    		sum+=i;
    	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 변수 => 메모리에 저장 
		변수초기화2 a=new 변수초기화2(); // new 생성자() => 컴파일러가 자동으로 생성자 생성()
		System.out.println(a.a);//100
		System.out.println(a.name);//홍길동
		System.out.println(a.d);
		System.out.println(a.b);
		System.out.println(a.sum);
		
		
	}

}








