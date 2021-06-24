// 웹(java)/앱(kotlin)  웹 (자바:오라클 연결=> 브라우저로 전송 , HTML:출력 , 디자인 : CSS , 오라클: 데이터 저장장소)
//                    자바/오라클 => 브라우저에서 버튼 , 메뉴 => 자바스크립트 (라이브러리:JQuery, Ajax)=> React,Vue
// Spring(서버) , NodeJS

class Member
{
	String id,name,password,hint,dap,sex,phone,hphone,email,post,addr1,addr2;
}
class Sawon{
	int empno;
	String ename;
	String job;//직위
	int mgr; // 사수번호
	String hiredate;// 입사일 ==> Date
	int sal;//급여
	int comm;// 성과급
	int deptno;//부서번호 => 
}
class Board{
	int no;//게시믈번호 (중복없다)
	String name;
	String subject;
	String content; // 내용 
	String password;// 삭제,수정 
	String regdate;
	int hit; // 조회수 
}
class Category{
	String title;
	String subject;
	String poster;
}
class FoodHouse
{
	String name;
	double score;
	String address;
	String tel;
	String price;
	String psrking;
	String time1,time2;
	String day;
	String[] menu;
	int good;
	int soso;
	int bad;
}
class Movie1{
	String title;
	boolean isShow;
	String regdate;
	String genre;
	String nation;
	String grade;
	int time;
	double score;
	int showUser;
	int boxoffice;
	int cookie;
	String story;
	String poster;
}
class Recipe
{
	String poster;// 클래스 
	String title;
	String chef;
	int star;
	int hit;
	static String site;
}
class Chef
{
	Recipe r;//has-a (포함)
	String chef;
	int rank;
	String chef_poster;
	int mc1,mc3,mc7,mc2;
}
/*
 *    1. 변수
 *    ==========
 *    2. 연산자
 *    3. 제어문 
 *    ========== 기본 코딩 
 *    4. 묶어서 사용 
 *       = 데이터 묶는 방법 
 *          = 같은 것끼리 묶어서 (크기가 동일:배열)
 *          = 다른 것끼리 묶어서 (클래스)
 *            ==> 클래스안에서 설정 할 수 있는 데이터형 
 *                기본형 (int,byte,short,char,long,float,double,boolean)
 *                클래스 (클래스 , 배열)
 *       = 명령문 묶는 방법 
 *         = 메소드 (연산자,제어문,지역변수)
 *    ========================================================== 클래스 + 메소드 (242page)
 *    5. 클래스 영역 
 *       클래스 (구성요소)
 *       ======================
 *          변수 
 *             = 인스턴스 => new를 사용해서 메모리 생성 => 따라 메모리가 생성 
 *             = 정적변수(클래스변수) => static => 메모리 한개만 생성 => 공유 데이터
 *             
 *             ==> 생성 방법 
 *                 class A
 *                 {
 *                     int aa;
 *                     static int bb;
 *                 }
 *                 
 *                 A a=new A();  ===> a(aa)  ==> a가 aa에 접근시에는 a.aa
 *                 A b=new A();  ===> b(aa)  ==> b가 aa에 접근시에는 b.aa
 *                   => 별도로 bb가 생성 =======> a,b공통으로 사용이 가능하다
 *                      a.bb (객체명으로 접근이 가능) , A.bb (클래스명.변수) 
 *       ======================
 *          메소드
 *       ======================
 *          생성자 
 *       ======================
 *    
 */
class A
{
	String name;
	int aa;//0
	static int bb;//0
	// 변수 => 초기화(지역변수) , 멤버변수 (인스턴스,static) => 자동 초기화 
	/*
	 *   String => null
	 *   char  => ' '
	 *   double => 0.0
	 *   float  => 0.0f
	 *   int    => 0
	 *   long   => 0L
	 *   클래스  => 주소값이 없는 경우 (null)
	 */
}
public class 데이터형만들기 {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       // A a=new A();
		// 249 page
		System.out.println(A.bb);//Math.random() , 
		A a=new A(); // name,aa
		System.out.println(a.aa);
		a.bb=100;
		System.out.println(a.name);
		
	}

}










