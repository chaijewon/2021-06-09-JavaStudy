/*
 *    클래스 영역에 변수 선언 => 자동 초기화 
 *    int => 0
 *    int a; a=0;
 *    double => 0.0
 *    float => 0.0f
 *    byte , short => 0
 *    String => null (주소가 없는 경우) =-> 모든 클래스는 주소값을 저장하고 있다 => 주소값 배정 (new)
 *    boolean => false
 */
public class 변수초기화_메모리저장 {
    int a; // 0
    double d; // 0.0
    String name;//null
    float f;// 0.0f
    byte b;//0
    short s;//0
    boolean boo;  // false  ==> 기본 디폴트 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        변수초기화_메모리저장 a=new 변수초기화_메모리저장(); // 저장 a라는 메모리 공간에 클래스에 선언된 모든 변수 저장 
	    // . 을 이용한다  a.a ,a.boo..... (.주소안에 있는 메모리 접근 연산자)
        System.out.println(a.a);
        System.out.println(a.d);
        System.out.println(a.name);
        System.out.println(a.f);
        System.out.println(a.b);
        System.out.println(a.s);
        System.out.println(a.boo);
	}

}









