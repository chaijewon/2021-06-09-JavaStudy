// 국어 , 영어 , 수학 => 총점 , 평균 , 평균에 대한 학점부여 A(90),B(80),C(70),D(60),F(60이하)
import java.util.Scanner;
// A(추상클래스) , F(종단클래스) => final => 변경해서 사용이 안된다 (제공한 내용 그대로 사용) 
public class 자바다중조건문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 입력값을 받는다 ==> 첫자가 대문자 => 클래스
		Scanner scan=new Scanner(System.in);
		System.out.print("국어 영어 수학점수 입력(입력방법:90 90 90):"); 
		int kor=scan.nextInt();
		int eng=scan.nextInt();
		int math=scan.nextInt();
		int total=kor+math+eng;
		double avg=total/3.0;
		int res=(int)avg;
		char score='A';
		
		if(res>=90)
			score='A';
		else if(res>=80)
			score='B';
		else if(res>=70)
			score='C';
		else if(res>=60)
			score='D';
		else
			score='F';
		
		
		// 결과값 출력 
		System.out.println("국어 점수:"+kor);
		System.out.println("영어 점수:"+eng);
		System.out.println("수학 점수:"+math);
		System.out.println("총점:"+total);
		System.out.printf("평균:%.2f\n",avg);
		System.out.println("학점:"+score);
	}

}







