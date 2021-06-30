// page 283 오버로딩 
/*
 *   오버로딩 : 중복메소드 정의 (같은 메소드 이름으로 여러개 메소드를 제작) : new 
 *   오버로딩 (다형성) 
 *     1. 한개의 클래스안에서 같은 이름의 메소드를 여러개 정의 
 *        =============== ==============
 *     2. 매개변수가 갯수나 데이터형이 다르다 
 *     3. 리턴형은 관계없다 
 *     int plus(int a, int b)
 *     double plus(double d,double d2)
 *     String plus(String s1,String s2)
 *     char plus(char c1,char c2)
 *     void plus(int a,int b) => 오류 발생  void plus(int k,int m) ==> plus(int,int)
 *     void plus(int a) 
 *     ===========================================================================
 *     void print(int a, String s,double d,long l)
 *     void print(char a, byte s,float d,boolean l) ==> 가변형 매개변수 
 *     void print(int a)
 *     void print(int a, int b)
 *     void print(int a, String s)
 *     void print(Object... arg) ==> Object (모든 데이터형을 받을 수 있는 클래스)
 *                      === 가변  ...
 */
public class 오버로딩 {
    void print(Object...args )
    {
    	for(Object obj:args)
    	{
    		System.out.println(obj);
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        오버로딩 a=new 오버로딩();
        a.print("홍길동","심청이","박문수",10,20,30,'A','B','C',10.5,20.3,30.5);
	}

}
