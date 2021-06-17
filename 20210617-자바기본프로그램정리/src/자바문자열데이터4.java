/*
 *   int indexOf(문자)
 *   Hello Java
 *   0123456789
 *   
 *   indexOf('o') ==> 4
 *   indexOf('a') ==> 7   ==> 확장자  aa.aa.java
 *   // 처음부터 찾기 => 
 *   lastIndexOf('a') => 뒤에서 찾기  ==> 9  ==> \\ , / 경로명 
 *   
 *   서울특별시 서초구 신반포로45길 50-9 유진빌딩 지번 서울시 서초구 잠원동 35-8 유진빌딩
 *   
 *   ㅎㅎ ㅋㅋㅋㅋㅋㅋㅋ  ㅇㅇ
 */
public class 자바문자열데이터4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    String addr="서울특별시 서초구 신반포로45길 50-9 유진빌딩 지번 서울시 서초구 잠원동 35-8 유진빌딩";
	        String first=addr.substring(0,addr.indexOf("지"));   
	        System.out.println(first.trim());
	        // substring(3) => 3부터
	        // substring(3,9) => 3부터 9까지 출력 => 9은 제외  ==> 3,4,5,6,7,8
	        String s=addr.substring(addr.indexOf("번")+1);
	        System.out.println(s.trim()); // 좌우의 공백문자 제거  => trim()
	}

}











