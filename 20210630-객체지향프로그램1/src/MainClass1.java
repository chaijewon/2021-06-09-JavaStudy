/*
 *   클래스 구성요소 : 필요할때 사용 
 *   ============ 객체지향답게 프로그램 (데이터 보호(캡슐화),재사용(상속,포함),수정,추가(다형성))
 *                ========== 문법사항은 아니다 , 권장사항 
 *   1. 클래스의 구성요소 
 *      1) 변수 => 초기값을 지정 (메모리에 저장하기 위해서는 반드시 초기화)
 *          = 멤버변수 (클래스 블록안에 선언) : 프로그램 종료시까지 메모리 유지 
 *             => 여러개를 따로 저장이 가능 (인스턴스 변수)
 *                                      ======(객체)  => new 사용시마다 메모리 각자 생성 (가장 많이 사용하는 변수)
 *             게임 : 비행기 좌표 , 총알 ...
 *          = 공통변수(공유변수,정적변수:static) : 한개의 메모리에서 사용 (점수)
 *          = 지역변수 : 메소드안에서 사용 (메소드 호출시마다 메모리 저장) => 메소드 종료를 하면 자동으로 사라진다 
 *            ======= 메소드안에 선언 , 매개변수 (사용자가 처리를 요청할 때)
 *            ** 멤버변수,공통변수는 자동 초기화가 된다 
 *               ==============================
 *               정수형(int , byte,short) = 0
 *               실수형(float,double) = 0.0
 *               문자형(char) = ' '
 *               논리형(boolean) = false
 *               모든클래스 (String..) = null (클래스에 저장되는 것은 메모리 주소(메모리 주소가 없는 상태)
 *                  int[] arr; arr=null
 *                  A a;  a=null
 *                  String s; s=null 
 *                  ================= 참조형 데이터 (배열,클래스)
 *            ** 다른 값을 가지고 초기화 
 *               = 직접 변수 초기화 : 명시적 초기화 
 *                 class A
 *                 {
 *                    int a=100;  int a;(a=0) => 이미지출력 (좌표점,자동로그인:id)
 *                    ========= 캡슐화 위반 (데이터 보호 => 공개)
 *                    id,pwd ==> 파일에 저장 , cookie 
 *                    String id="hong";
 *                    String pwd="1234";
 *                 }
 *               = 직접 변수값을 설정하지 못하는 경우 
 *                 ** class A{선언만 가능 (구현이 불가능 : 연산처리,제어문 , 메소드 호출 .....)}
 *                 초기화 블록 : 실행시에 자동 호출 (인식)
 *                 class A
 *                 {
 *                    ==============================
 *                    스프링
 *                    마이바티스(오라클 연동하는 라이브러리) : 답변형 게시판 (자바코딩 => 700줄)
 *                                                     마이바티스 (자바코딩 => 52줄)
 *                    ============================== 동작이 셋팅 => XML 
 *                    인스턴스 블록 (인스턴스 변수 초기화)
 *                    {
 *                        구현이 가능 
 *                    }
 *                    
 *                    static (static 변수 초기화)
 *                    {
 *                        구현이 가능 
 *                    }
 *                 }  
 *               
 *      2) 생성자 :멤버변수가 명시적인 초기화가 안될 경우 
 *               = 변수에 대한 초기화 
 *               = 변수값을 다르게 생성 => 매개변수
 *               = 매개변수 없는 생성자(디폴트 생성자)
 *                 ** 생성자가 없는 경우에는 컴파일러가 자동으로 디폴트 생성자 자동 추가 
 *               = 매개변수가 있는 생성자 : 저장시마다 변수값을 다르게 저장할 때 
 *           생성자 
 *            특징 
 *             1. 클래스명 동일 class A ==> A() A(매개변수)...
 *             2. 리턴형이 없다 (리턴형을 사용하면 => 생성자아니라 일반메소드)  void A()
 *             3. 오버로딩 : 중복함수정의 (생성자이름이 동일 => 여러개 동시에 만들 수 있다)
 *                =======
 *                 메소드명 동일 
 *                 매개변수의 갯수나 데이터형이 다르다 
 *                 리턴형은 관계없다 
 *                 =========================== 다형성(한개를 가지고 여러개 기능을 만든다) => 기능 추가 (new)
 *      3) 메소드 : 기능 처리 (멤버변수,지역변수를 이용해서 기능 처리)
 *                 리턴형 메소드명(매개변수...) => 메소드 선언 
 *                 {
 *                     메소드 구현 
 *                 }
 *                 
 *      => 접근시에 
 *         class A
 *         {
 *            int a=10; 인스턴스
 *            static int b=20;
 *            A()
 *            {
 *            }
 *            void display() : 인스턴스
 *            {
 *            }
 *            static void print()
 *            {
 *            }
 *         }
 *         1) 클래스 객체 생성  
 *             A에 설정 변수와 메소드를 메모리에 저장 => new
 *             컴파일러에 의해 자동 저장 : static ===> b변수, print() 
 *             a,display()를 저장하기 위해서는 반드시 new를 이용해서 저장 
 *             =================================================
 *              A aa=new A();  aa(주소)라는 공간 => a,display()
 *              
 *              1) 인스턴스
 *                 aa.메소드명 (aa.display()), aa.변수명 (aa.a)
 *              2) 정적변수,메소드
 *                 aa.메소드명(aa.print()), aa.변수(aa.b)
 *                 클래스명.메소드명 (A.print()) , A.b
 *              ================================================
 *       클래스 
 *        = 데이터만 선언 (사용자 정의 데이터형) : 변수만 가지고 있다 (~VO, ~DTD) => 데이터 저장용으로 사용
 *          => 데이터형 클래스 
 *        = 메소드만 가지고 있는 클래스 : 서버 ( ~DAO , ~Manager) => 액션 클래스
 *        = 데이터+기능 (변수+메소드)
 *               
 *                 
 *                 
 */
class Card
{
	String type="◆"; // ◆ ♤ ♣ ♥
    int number=1; 
    static int width=300;
    static int height=350;// 공유변수 ...
    // 생성자 ==> 카드 3장 (다른 카드) => 3개를 생성 => 다른 값으로 초기화 
	Card(String type,int number)
	{
		//int w=100;
		//System.out.println(width);
		this.type=type;
		this.number=number; // this=> 클래스가 가지고 있는 변수
		// 멤버변수(전역변수:클래스 전체에서 사용되는 변수,프로그램 종료시까지 유지 하는 메모리) , 
		// 지역변수(메소드 종료시 사라진다)
		// 우선시 (지역변수 => 멤버변수) => 지역변수 우선순위
	}
}
public class MainClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Card c1=new Card("♤",3);
        System.out.println("모양:"+c1.type);
        System.out.println("숫자:"+c1.number);
        System.out.println("Width:"+c1.width);
        System.out.println("Height:"+c1.height);
        Card c2=new Card("♣",5);
        System.out.println("모양:"+c2.type);
        System.out.println("숫자:"+c2.number);
        System.out.println("Width:"+c2.width);
        System.out.println("Height:"+c2.height);
        Card c3=new Card("♥",7);
        System.out.println("모양:"+c3.type);
        System.out.println("숫자:"+c3.number);
        System.out.println("Width:"+c3.width);
        System.out.println("Height:"+c3.height);
        c3.width=250;
        c3.height=300;
        
        System.out.println("Width_1:"+c1.width);
        System.out.println("Height_1:"+c1.height);
        System.out.println("Width_2:"+c2.width);
        System.out.println("Height_2:"+c2.height);
        System.out.println("Width_3:"+c3.width);
        System.out.println("Height_3:"+c3.height);
	}

}











