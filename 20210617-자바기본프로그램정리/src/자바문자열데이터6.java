/*
 *   trim() , valueOf() : 모바일(kotlin),웹(JSP/Spring)
 *                        =========================== 전송데이터 , 수신데이터 (모든 데이터 String)
 *                          모든 데이터형 => String 변환 (valueOf()) 
 *                          valueOf(10) => "10"
 *                          valueOf(true) => "true"
 *  ======== trim() : 좌우 공백문자 제거  ==> 입력창에 trim() => 사용자의 실수  " admin" "admin"
 */
public class 자바문자열데이터6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="     Hello Java       ";
		System.out.println(s);
		System.out.println(s.length());
		System.out.println(s.trim());  // 로그인 (id,password,회원가입 , 글쓰기...)
		System.out.println(s.trim().length());
		
		System.out.println(10+String.valueOf(true)); // + : 실수,정수=> 문자열 
		// instance , static => 클래스명.메소드() => Math.random()

	}

}








