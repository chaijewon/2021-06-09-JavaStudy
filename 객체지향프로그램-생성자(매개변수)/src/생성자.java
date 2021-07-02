/*
 *   매개변수를 가지고 있는 생성자 => 입력값을 받아서 변수의 초기화 
 *                          => 다른 클래스의 주소값을 받아서 처리(윈도우에 주로 사용(X),스프링)
 *                          => 스프링(메모리 할당=> 스프링 자체에서 처리) => 생성자 ,setter이용 
 *                             => new를 사용하지 않는다 (싱글턴)
 *   class ClassName
 *   {
 *      ClassName(){} ============> 기본 생성자
 *      ClassName(매개변수...){} ===> 매개변수가 있는 생성자 
 *   }
 *   ====> 생성자 멤버에 대한 초기화 
 *         일반값 : 명시적   int a=100
 *         ===================
 *         = 입력값을 처리
 *         = 난수 
 *         =================== 선언 (X), 구현(O) => 클래스 블록안에서는 사용이 안된다
 *         ==> 생성자 => 클래스를 메모리에 저장할때 (가장 처음에 호출되는 함수)
 */
import java.util.Scanner;
class Student{
	String name="홍길동";
	int hakbun=3;
	Student(int h,String n) {
		hakbun=h;
		name=n;
	}
}
public class 생성자 {
    // {}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
	    for(int i=0;i<5;i++)
	    {
			System.out.print("학번 입력:");
			int h=scan.nextInt();
			System.out.print("이름 입력:");
			String n=scan.next();
			
			Student s1=new Student(h, n);
			System.out.println("s"+(i+1)+".hakbun="+s1.hakbun+",s"+(i+1)+".name="+s1.name);
	    }
        /*Student s1=new Student();
        System.out.println("s1.hakbun="+s1.hakbun+",s1.name="+s1.name);
        
        Student s2=new Student();
        System.out.println("s2.hakbun="+s2.hakbun+",s2.name="+s2.name);
        
        Student s3=new Student();
        System.out.println("s3.hakbun="+s3.hakbun+",s3.name="+s3.name);
        */
		
        
	}

}






