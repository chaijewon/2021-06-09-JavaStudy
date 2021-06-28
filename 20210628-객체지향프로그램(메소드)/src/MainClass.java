// 메소드
/*
 *   메소드 
 *    1) 재사용 
 *    2) 프로그램 가독성 (문단 나누기) => 프로그램의 구조화 
 *    3) 메소드안에는 재사용을 목적으로 하기 때문에 한개의 기능만 수행이 가능하게 한다 
 *       예) 찾기 , 목록 , 데이터 추가 ....
 *          댓글 (댓글쓰기 , 댓글 보기 , 댓글 삭제, 댓글 수정...)
 *    4) 메소드 제작 방법
 *           리턴형      매개변수 
 *       =    O          O  =====> 가장 많이 사용되는 메소드 형식 
 *       =    O          X 
 *       =    X          O  =====> 많이 사용되는 상태 
 *       =    X          X  =====> 사용빈도가 낮다 
 *    5) 메소드 형식 
 *       (접근지정어) 리턴형 메소드(매개변수...)  ==> 매개변수는 없을 수도 있고 여러개 사용이 가능 , 
 *       단 리턴형은 한개만 사용 (리턴형이 없는 경우는 void를 사용한다)
 *       ==> 메소드 종료시점 : return이 있는 곳에서 종료  
 *       ==========
 *       public , protected , default , private  
 *       
 *       void display(int a)
 *       {
 *          if(a==0)
 *            return; 사용자가 0을 입력해주면 메소드 종료 ==> 사용자가 입력을 입력하지 않는 경우 
 *          else
 *            return;
 *       }
 *       
 *       형식)
 *            int display(int a)
 *            {
 *               === 매개변수로 처리
 *               ===
 *               ===
 *               return 값; => 값은 반드시 리턴형과 일치 ==> 처리 결과값
 *            }
 *            
 *            호출시 
 *            int a=display(10);
 *                  ==> 매개변수에 10을 입력시킨다 
 *            ======
 *             결과값을 받는다 
 *             
 *            *** return문이 있을때까지 메소드 {} 안에 있는 모든 내용을 수행 
 *            *** 메소드는 반복 제거 할수 있는 기능이 있다
 *            
 *     => class 
 *        Tv 
 *         = Tv에서만 사용하는 변수(속성) : 색상 , 상태(off,on) , channel
 *         = Tv에서만 사용하는 메소드(기능): 상태조절 (power()), channel=> 올리기 , 내리기 
 *         
 *         ======================
 *         사람 
 *           속성  : 이름 , 주민번호 , 성별 , 나이 , 키 , 몸무게 , 전화 , 주소 .... , 팔 ,다리,코,입...
 *           동작  : 먹는 기능 , 걷는 기능 , 뛰는 기능 , 냄새 기능 .... 
 *           ===================================== 시뮬레이션 
 */
/*
 *    1. 멤버변수는 멤버메소드 어떤 곳이든 상관없이 사용이 가능 
 *    2. static 메소드는 멤버변수를 사용 할 수 없다 
 *       => 객체를 생성후에 사용이 가능 
 */
class Temp
{
	int a=10;
	static int b=10;
	void aaa()
	{
		System.out.println("a="+a);
		System.out.println(b);
	}
	void bbb()
	{
	     a+=10;
	     b+=20;
	}
	static void ccc() // 클래스메소드,클래스변수 (static) => 정적,공유변수 , 공유메소드 
	{
		Temp t=new Temp();// 객체선언후에 사용이 가능  => 사용빈도가 극히 드물다 
		System.out.println("a="+t.a);
		System.out.println(b);
	}
}
class Tv
{
	//=============== Tv에 사용되는 변수 ==> class 전체에서 사용이 가능 
	  String color="검정색";
	  boolean power;// false
	  int channel;// 0
	//===============
	// Tv를 작동 => 동작 (메소드)
	  void setPower() // 전원 설정  => 실제 동작이 아니라 (가정) => power=true (Tv켜기) , power=false(Tv끄기)
	  {
		  power=!power;
	  }
	  // channel 이동 
	  void channelUp()
	  {
		  channel++;
	  }
	  void channelDown()
	  {
		  channel--;
	  }
	  // 인스턴스 (변수,메소드) => 생성시점 => new 생성자()
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Tv t=new Tv();// t(메모리 주소:41a4555e) => color,power,channel , setPower,channelUp,channelDown
        System.out.println("t="+t);
        t.setPower(); // t.power=true
        if(t.power)
        {
        	System.out.println("Tv 실행...");
        }
        else
        {
        	System.out.println("Tv 종료...");
        }
        
        t.channelUp();
        t.channelUp();
        t.channelUp();
        t.channelUp();
        t.channelUp();
        t.channelUp();
        t.channelUp();
        
        System.out.println("channel="+t.channel);
        
        t.channel=11;
        System.out.println("채널 변경");
        System.out.println("channel="+t.channel);
        
        
        /*t.setPower();
        if(t.power)
        {
        	System.out.println("Tv 실행...");
        }
        else
        {
        	System.out.println("Tv 종료...");
        }*/
        
        Tv t2=new Tv();
        System.out.println("t2="+t2);
        //t2.setPower();
        if(t2.power)
        {
        	System.out.println("t2 Tv 실행..");
        }
        else
        {
        	System.out.println("t2 Tv 종료..");
        }
        System.out.println("channel="+t2.channel);
        //  메모리 저장 (메모리 할당) => new (동적 메모리 할당)
        //  클래스명 객체명=new 생성자() => 생성자는 반드시 클래스명과 동일 
        //  저장된 멤버변수에 접근하는 방법 , static에 접근하는 방법 
        //  멤버메소드 : 객체명.메소드명(매개변수값...) 
        //  static메소드 : 객체명.메소드명(매개변수값..) , 클래스명.메소드명()
        //  => new을 이용하지 않아도 메모리에 저장 => 필요할때 마다 new를 사용하지 않고 사용이 가능 
        //  Scanner scan=new Scanner() => scan.nextInt() => 인스턴스 메소드 
        //  Math.random() => static 메소드 (Math=> 수학 처리 => static)
        //  Math.ceil() ; 올림 => 총페이지 구하기
        
	}

}










