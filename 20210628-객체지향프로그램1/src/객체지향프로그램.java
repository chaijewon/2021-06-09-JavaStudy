/*
 *   웹 / 앱 
 *   ======
 *   1. 클래스 제작 
 *      => 캡슐화 , 오버라이딩 
 *         (변수)   (메소드)
 *      => 포함 클래스 (재사용)
 *   2. 데이터연결 => 제어 
 *   3. 예외처리 
 *   4. IO,컬렉션 
 *   5. 인터페이스 
 *   ======================= 변수/메소드 (라이브러리 : XML ,HTML , JSON)
 */
/*
 *    1. 문법 
 *       변수 , 클래스 (배열 가끔...) => 문자열 분리 
 *       메소드 제작방법 
 *       ===== 처리 (연산,제어문)
 *       ======================================== 절차적언어 (동작 순서로 일괄 코딩:재사용(X))
 *       ======================================== 간단한 프로그램 (계산기...)
 *    2. 객체지향 프로그램 : 대규모 
 *       CGV / 롯데시네마 / 메가박스 => 재사용  ==> 예매
 *       지니뮤직 / 멜론 / mnet ==> 음반 판매 
 *       서적 (출판사) ==> 장바구니 
 *       ==> 포함 , 상속 (속도가 늦다) : Spring에서는 상속이 없다  => POJO 
 *          ==== 
 *    3. 객체지향 프로그램 
 *       = 클래스 자체를 보관 (재사용) => 상속
 *       = 수정,추가 가능 => 유수보수 => 다형성 
 *         === 오버라이딩(modify) , 오버로딩(new) 
 *       = 데이터를 보호 (은닉화 / => 캡슐화 )
 *         캡슐화 : 데이터 감춘다 => 필요시 마다 사용이 가능 , 경계선 
 *       ===================================================== 객체지향의 3대 요소
 *       page 231
 *         => 목적 : 재사용 , 데이터 보호 
 *                  ===== 있는 그대로(포함) , 변경(상속) 
 *         => 뜻 : 상속 , 다형성 , 캡슐화 
 *         
 *    1) 클래스의 구성요소 
 *    2) 변수 => 초기화하는 방법 
 *       => 명시적 초기화 
 *       => 생성자 
 *       => 초기화 블록 
 *    3) 메소드에서 변수를 제어 
 *    ==============================
 *    
 *    데이터 저장   =======> 데이터 활용(가공) ========> 출력 (윈도우,도스,모바일,브라우저)
 *    =========           ==============
 *      변수                 요청처리(유저) => 필요하면 변경 (메소드)
 *      변수를 관련된 내용 묶어서 저장 => 찾기(클래스 ,배열) 
 *    
 *    1. 구성요소 (클래스) => 한개만 선언 ==> 저장을 여러개 해서 사용 
 *       학생 => 100명 
 *       class ClassName
 *       {
 *          // 선언만 가능 : 변수 , 메소드  
 *          =====================================
 *            필요한 데이터 저장 : 변수 , 배열 , 클래스 ....
 *            1) 따로 사용 변수 (인스턴스 변수,객체변수)
 *            2) 공통으로 사용하는 변수 (정적변수, 공통변수) ===> static 
 *            int a;// 선언
 *            for(int i=1;i<=100;i++) //구현 (제어문 , 라잉브러리 메소드 호출)
 *            {
 *               a+=i;
 *            }
 *            
 *            int a=10+20;
 *          =====================================
 *          // 구현 : 연산자 , 제어문 , 화면 출력 => 메소드 
 *             구현은 => class블록안에 {구현이 가능}
 *          =====================================
 *          메소드의 종류 
 *          ***1. 선언(구현(X)) : 추상메소드  abstract => 프로그램에 맞게 구현해서 사용 
 *                           button : actionPerfromed() 
 *          ***2. 선언과 동시에 구현 : void display(){}
 *          3. 미리 메모리 저장 (공통) : static void display(){}
 *          4. 상속=> 수정이 없는 방법 : final void display(){}
 *                             => String ,Math ,System....
 *                             
 *         ==================================================================
 *          생성자 함수 
 *           = 특징 : 클래스명과 동일 
 *           = 메모리에 저장시 호출 => new 다음에 붙는다
 *           = 생략을 하면 컴퍼일러가 자동으로 한개 추가 (***)
 *           = 객체 생성시에 항상 호출되는 메소드 
 *       }
 *       
 */
public class 객체지향프로그램 {
    int a=100;// 명시적 초기화 
    // 초기화 블록 => 파일읽기 , 웹 연결 ...
    {
	    for(int i=1;i<=100;i++)
	    {
	    	a+=i;
	    }
    }
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        객체지향프로그램 a=new 객체지향프로그램();     // 변수 초기화 담당 
	}

}












