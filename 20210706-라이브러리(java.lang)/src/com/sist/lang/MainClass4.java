package com.sist.lang;
/*
 *   toString() => 객체를 문자열 출력 (객체=>주소)
 *   원형)
 *         public String toString() ==> 메소드는 특별한 경우가 아니면 public 
 *                ====== ========
 *         Object => String으로 받는 경우 
 *         String s=new Object(); ==> 오류 
 *                Object
 *                  |
 *               String 
 *         Object o="Hello";
 *         String s=(String)o;
 *         String s=o.toString();
 */
// 객체를 문자열 변환 할때 사용되는 메소드 (toString()) => 모든 클래스(사용자정의,라이브러리=>toString())
class Member // extends Object
{
    String name;
    String sex;
    // 확인 => 변수값 잘 설정 
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		return "이름:"+name+",성별:"+sex;
	}
	
}
public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Member m=new Member();
        m.name="홍길동";
        m.sex="남자";
        //System.out.println("m의 주소="+m);//주소를 출력할때 toString()이 생략할 수 있다 
        System.out.println("정보:"+m);
	}

}
