/*
 *     변수 : 속성 
 *     메소드 : 동작,행위 
 *     ====== 부품 (클래스:구성요소)
 *     
 *     예) 
 *         기능 => 영화시스템 
 *          로그인 , 회원가입 , 영화목록 , 예매하기 , 추천하기, 상세보기 
 *          ================================================= 메소드 
 *     메소드 : 특정작업을 수행하는 명령문의 집합(관련된 명령만 모아서 처리)
 *             = 입력 기능 
 *             = 처리 기능 
 *             = 출력 기능 
 *             사용하는 목적 
 *             = 재사용의 목적 ==> 다른 클래스에서 호출해서 사용이 가능 
 *             = 중복된 코드를 제거 할 수 있다 
 *             = 프로그램을 구조화 
 *               = 가독성 , 속도성
 *                 =====
 *                 헌책방 / 교보문고
 *     메소드의 선언과 구현 
 *     형식) 
 *           결과값(리턴형) 메소드명(변수명,변수명...) => 메소드 선언 
 *           ===========
 *           {
 *                 구현부
 *                 return 결과값;
 *                        ====== 일치 ==> 결과값은 반드시 한개만 사용하다 
 *                                       여러개가 있는 => 배열 / 클래스를 이용한다 
 *                                                     ===
 *           }
 *           
 *           1) 결과값(리턴형) : 요청에 대한 처리 ==> 결과값 ==> 경우의 수 (2개=> boolean , 
 *                                        3개이상 => String,int) 
 *                있는 경우 
 *                없는 경우 : 자체에서 출력  void  ==> return을 생략할 수 있다
 *           2) 메소드명 => 식별자 (변수,클래스,메소드 ==> 적용)
 *                        약속 : 메소드,변수 => 소문자 시작 
 *                        클래스 : 대문자 시작 
 *           3) 매개변수 : 사용자가 입력한 값 
 *      호출과정)
 *           static : 자동 저장 
 *           static int add(int a, int b) ==> 사용자로부터 정수 2개를 받아서 처리후 결과값을 정수로 넘긴다
 *           {                a=10  b=20
 *               int c=a+b;
 *               return c; => c=30
 *           }
 *           
 *           int result=add(10,20);
 *               ===== 30
 *           static boolean login(String id,String password)
 *           {
 *               ---
 *               ---
 *               ---
 *               return true/false
 *           }
 *           
 *           호출 
 *           사용자가 입력한 id , password
 *           boolean bCheck=login(id,password);
 *           if(bCheck==true)
 *           {
 *                메인 페이지 이동
 *           }
 *           else
 *           {
 *                다시 입력하시오 (메세지)
 *           }
 */
import java.util.Scanner;

// 사용자가 단을 입력하면 => 해당 구구단 출력 
//        =======매개변수     ========= 메소드안에서 출력  ==> 리턴형(X) ==> void
//                          ========= 받아 본다 (O) ==> String 
public class 자바메소드_형식 {

	static void gugudan(int dan)
	{
		for(int i=1;i<=9;i++)
        {
        	System.out.printf("%d * %d = %d\n",dan,i,dan*i);
        }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*Scanner scan=new Scanner(System.in);
        System.out.print("단 입력?");
        int dan=scan.nextInt();*/
        gugudan(2);
        gugudan(3);
        gugudan(4);
        gugudan(5);
        gugudan(6);
        // 반복 
        
	}

}














