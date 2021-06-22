
public class 자바메소드호출_방식 {
    static void a() {
    	System.out.println("2. a() 진입...");
    	
    	System.out.println("3. a() 종료...");
    }
    static void b() {
    	System.out.println("4. b() 진입...");
    	System.out.println("5. b() 종료...");
    	// a()에 호출했기 때문에 a() => 나머지 문장 수행
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("1. main() 진입...");
        a();
        b();
        System.out.println("6. main() 종료...(프로그램 종료)");
	}
	/*
	 *   main() 진입...
	 *   ==> a() 블록으로 이동 
	 *       a() 진입...
	 *       ==> b() 블록으로 이동 
	 *       b() 진입...
	 *       b() 종료...
	 *       a() 종료...
	 *   main() 종료...(프로그램 종료)
	 *       
	 *   
	 */

}
