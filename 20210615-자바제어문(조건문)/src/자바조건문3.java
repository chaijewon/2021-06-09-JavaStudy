// 프로그램 => 용도 => if~else (정상 처리, 비정상 처리)
public class 자바조건문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수 설정 
		int rand=(int)(Math.random()*2); // 0,1
		char alpha=' '; //초기화 
		if(rand==0) // 대문자
			alpha=(char)((Math.random()*26)+65); // 0+65 => 65('A')
		else // rand==1 => 소문자 
			alpha=(char)((Math.random()*26)+97); // 0+97 => 97('a')
		
		// 결과값 
		if(alpha>='A' && alpha<='Z')//  대문자 라면 
			System.out.println(alpha+"은(는) 대문자입니다");
		else
			System.out.println(alpha+"은(는) 소문자입니다");

	}

}
