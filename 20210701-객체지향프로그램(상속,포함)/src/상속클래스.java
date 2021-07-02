/*
 *    상속 : 기존의 클래스를 재사용(import) => 새로운 클래스(기존의 클래스+새로운 추가)
 *          상속을 내리는 클래스 : 공통적인 내용 => 공통모듈  
 *          상속을 받는 클래스 
 *          => 유지보수가 쉽게 만든다 
 *          => 번복 코딩을 제거할 수 있다 
 *          => 관리하기 용이하다 
 *    => extends 
 *       형식)
 *            class 공통 => 기능을 추가 , 변경   ==> include 
 *            class A extends 공통
 *            class B extends 공통 
 *            
 *            예)
 *                  게시판 
 *                    글쓰기 , 내용보기 , 수정하기 , 삭제하기 , 찾기 ,목록
 *                  답변형게시판 
 *                    => 기능 (답변달기) => 추가
 *                    => 목록 ===============> 클래스에 맞게 재정의(오버라이딩)
 *                       =>
 *                         =>
 *                  갤러리게시판
 *                    => 업로드 => 추가 
 *                    => 목록 ===============> 오버라이딩 
 *                  ======================================== 기존에 클래스에서 만든 메소드 변경해서 사용이 가능
 *            재사용 기법 : 상속 , 포함(그대로 사용) Scanner,System 
 *                       ====
 *                       상위클래스의 기능 변경해서 사용 
 *                  ***** 부담 : 라이브러리 (기능 변경) .jar(.class) => 포함 
 *                        변경 : 스프링 (스프링 => 전자정부프레임워크,애니프레임워크)
 *                              ===== 자바소스 
 *                        라이브러리 VS 프레임워크  JSOUP => mvnrepositiory 
 *                        (완제품)      레고
 *            상속 : 상속(키워드 : extends => 확장된 클래스(다른 기능 추가 , 변수 추가 + 기존의 클래스 내용)
 *            => 상속이 있는 경우에만 클래스의 크기 결정
 *               상속이 없는 경우는 모든 클래스 (4byte) => 동일 
 *               상속을 내린 클래스 > 상속을 받는 클래스보다 크다 
 *               ======================================= 형변환
 *               => 모든 클래스는 Object 상속을 받는다 
 *                             ====== 최상위 클래스   => int a=(int)10.5
 *                                                    A a=(A)new Object()
 *            => 단일상속 
 *               예)
 *                   class A extends B,C ==> 오류
 *                                   === 다중 상속
 *                   => class B extends C ==> B,C
 *                      class A extends B ==> B,C,A
 *            => 상속의 예외
 *                   생성자 , 초기화 블록 , static (상속은 아니고 사용이 가능) , private (상속=>사용이 불가능)
 *                                                                    => protected
 *            => 메모리 크기는 상속을 받은 클래스가 크다 ( long < float )
 *                                                   8      4     => 표현수 
 *                                                   1    1.000000 1.000001
 *            => 클래스는 범위(포함)
 *                   동물 
 *                    |
 *                 -----------
 *                 |   |     |
 *               포유류 양서류 조류 
 *                 |
 *            -----------
 *            |   |     |
 *            개  말     인간
 *                       |
 *                     -----
 *                     |    |
 *                   남자   여자 
 *                   
 *          => 상속이 불가능한 클래스 : 종단클래스 (final) => String , Math , System...
 *                                 포함해서 사용 ....
 *                  
 */
/*
 *   오버라이딩 : 기존의 상속을 받은 클래스의 기능을 변경해서 사용 
 *              조건)
 *                   1. 상속관계 (상속이 없어도 오버라이딩이 가능) => 익명의 클래스 
 *                   2. 메소드명이 동일 
 *                   3. 매개변수가 동일 
 *                   4. 리턴형이 동일 
 *                   5. 접근지정어의 확장은 가능 , 축소는 불가능 
 *                      ========
 *                       접근지정어 접근 범위 
 *                       public > protected > default > private 
 *             class A
 *             {
 *                protected void display()
 *                {
 *                }
 *             }
 *             
 *             class B extends A
 *             {
 *                // A가 가지고 있는 display()가 변경하지 않아도 사용이 가능 (변경할 것이 없으면)
 *                // B에서는 다른 기능이 필요 => 오버라이딩
 *                protected void display()
 *                ========= public void display() (O) => 확장
 *                ========= void display() (X) => 축소 
 *                {
 *                    내용 변경
 *                }
 *             }
 */
import java.util.Scanner;
class 동물 // extends Object
{
	void run()
	{
		System.out.println("네발로 달린다");
	}
}
class 개 extends 동물
{
	// 그대로 사용
	/*
	 *   void run()
	     {
		  System.out.println("네발로 달린다");
	     }
	 */
}
class 사람 extends 동물
{   
	/*
	 *   void run()
	    {
		  System.out.println("네발로 달린다");
	    }
	 */
	//public void run()
	//protected void run()
	void run()
	//private void run()
	{
		System.out.println("두발로 달린다"); // 수정이 가능하게 만든다 => 유지보수시 사용이 가능 
	}
}
public class 상속클래스 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        개 dog=new 개();
        dog.run();
        사람 human=new 사람();
        human.run();
	}

}









