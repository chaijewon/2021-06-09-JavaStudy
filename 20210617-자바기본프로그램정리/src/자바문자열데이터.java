/*
 *    String : 클래스,문자열을 저장하는 데이터형 
 *             여러개의 문자열을 동시에 저장이 가능 
 *             형식)
 *                  ***String 변수명="홍길동";
 *                  String 변수명=new String("심청이")
 *             클래스 => 자체 기능(메소드)
 *             ======================
 *             1. 문자열 비교 
 *                =========
 *                메소드는 => 무조건 결과값 
 *                =================================== boolean
 *                ***equals() ===>  같은 문자열 
 *                ***constains() ==> 포함
 *                ======================== 
 *                startsWith() : 앞문장이 같은 경우
 *                endsWith() : 뒤에 문장에 같은 경우  ===> 자동완성기
 *                ======================== 서제스트  if문 사용 
 *            2. 문자열 정보 
 *               =========
 *               ***문자열 갯수 : length()  => CBD (조립) => 변경(오버라이딩) ==> int
 *            3. 문자열 변경 
 *               =========
 *               대문자 변환 : toUpperCase() ==> String
 *               소문자 변환 : toLowerCase() ==> String 
 *               ***지정된 문자를 변경 : replace(),replaceAll()
 *            4. 문자열 추출 
 *               =========
 *                charAt()
 *                ***substring()
 *                ***indexOf()
 *                ***lastIndexOf()
 *                ***split()
 *            5. 기타
 *               공백문자 제거 : ***trim()
 *               모든 데이터형을 문자열 변환 : ***valueOf()
 *            
 *               
 *                
 */
import java.util.Scanner;
public class 자바문자열데이터 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Math.random();
        //String s="Hello String Data!!";
        //System.out.println("문자 갯수 확인:"+s.length());
        
        //System.out.println(s.toUpperCase());
        //System.out.println(s.toLowerCase());
        
        /*
         *   equals : 문자열 비교 ==========> 대소문자 구분 Hello!=hello (비밀번호)
         *   equalsIgnoreCase :문자열 비교 ==> 대소문자 구분 없이 비교 Hello==hello (아이디)
         *   
         *   로그인 처리 
         */
		final String ID="admin";
		final String PWD="1234"; // 데이터베이스 존재 
		
		
		// 1. 입력값 받기 => Scanner
		Scanner scan=new Scanner(System.in);
		System.out.print("ID 입력:");
		String myid=scan.next(); // 문자열로 받는 경우 
		
		System.out.print("비밀번호 입력:");
		String mypwd=scan.next();
		// 문자열을 비교할때는 ==이 아니고 equals(): 문자열 자체 비교 
		// equalsIgnoreCase : 일반 데이터 비교 
		// equals : Password 
		// ===> 결과값이 true/false ==> if안에 조건식 만들때 주로 사용 
		if(ID.equalsIgnoreCase(myid) && PWD.equalsIgnoreCase(mypwd))
		{
			// 로그인 
			System.out.println(myid+"님 로그인되었습니다!!");
		}
		else
		{
			// 로그인 실패
			System.out.println("아이디나 비밀번호가 틀립니다!!");
		}
		
	}

}


















