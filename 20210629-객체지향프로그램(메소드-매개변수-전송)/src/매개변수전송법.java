/*
 *   기본데이터형 : 정수형(int,long),실수형(float,double), 논리형(boolean) => 값만 전송 (read only)
 *               => Call By Value (*** String) => 복사본 (원본은 그대로) ==> 결과값 (리턴형)
 *   참조데이터형 (사용자 정의) : 데이터형 크기를 프로그램에 맞게 직접 제작 => 주소값 전송 (read & write)
 *                          ========== 배열 , 클래스 => 원본 (원본 자체가 변경) 
 *               => Call By Refernece  => 리턴형 거의 없다 
 */
class A
{
	int a=10;
	int b=20;
}
public class 매개변수전송법 {
	void change(String s1,String s2) // String (클래스) => Call By Value (String은 기본 데이터형 취급)
	{
		String temp=s1;
		s1=s2;
		s2=temp;
		System.out.println("s1="+s1+",s2="+s2);
		
	}
	void change(A aa)
	{
		System.out.println("aa="+aa);
		int temp=aa.a;
		aa.a=aa.b;
		aa.b=temp;
		System.out.println("aa.a="+aa.a+",aa.b="+aa.b);
	}
    void change(int x,int y) // 기본형 매개변수 => 전송시 메모리, 받는 메모리 위치가 다르다 // read
    {
    	int temp=x;
    	x=y;
    	y=temp;
    	System.out.println("x="+x+",y="+y);
    }
    void change(int[] brr) // read,write
    { 
    	System.out.println("brr="+brr);
    	int temp=brr[0];
    	brr[0]=brr[1];
    	brr[1]=temp;
    	System.out.println("brr[0]="+brr[0]+",brr[1]="+brr[1]);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=10;
        int b=20;
        매개변수전송법 aa=new 매개변수전송법(); // aa=>change
        aa.change(a, b);
        System.out.println("a="+a+",b="+b);
        // 주소값 전송 (참조형 매개변수)
        int[] arr= {10,20};
        System.out.println("arr="+arr);
        aa.change(arr);
        System.out.println("arr[0]="+arr[0]+",arr[1]="+arr[1]);
        A ccc=new A();// ccc=> a, b
        System.out.println("ccc="+ccc); // 클래스 객체 => 실제 저장 주소
        aa.change(ccc);
        System.out.println("ccc.a="+ccc.a+",ccc.b="+ccc.b);
        String s1="Hello";
        String s2="Java";
        aa.change(s1,s2);
        System.out.println("s1="+s1+",s2="+s2);
        
	}

}




