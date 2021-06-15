/*
 *    중첩 조건문 
 *    형식)
 *         if(조건문)  ==> 아이디 존재하고
 *         {
 *            if(조건문) ==> 비밀번호가 같다 
 *            {
 *            }
 *         }
 *         
 *         if(컴퓨터==가위)
 *         {
 *            if(사용자==가위)
 *            else if(사용자==가위)
 *            else if(사용자==보)
 *         }
 *         
 *         점수 입력 
 *         if(score>=90) ==> A
 *         {
 *            if(score>=98) +
 *            else - 94이하 
 *         }
 */
import java.util.Scanner;
public class 자바중첩조건문1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 1. Scanner 생성 => 입력값을 받아서 저장
		Scanner scan=new Scanner(System.in); // new를 사용해야 클래스를 사용 할 수 있다 
		// 2. 사용자 입력 요청 
		System.out.print("0~100사이의 점수를 입력:");
		// 3. 사용자 입력한 점수를 받아서 저장 
		int score=scan.nextInt();
		
		char grade=' '; // A , B , C , D , F
		char option=' ';// +(98) ,-(94이하) , 0 
		// 결과값을 출력 
		if(score>=90)
		{
			grade='A';
			if(score>=98)
				option='+';
			else if(score<94)
				option='-';
			else
				option='0';
		}
		else if(score>=80)
		{
			grade='B';
			if(score>=88)
				option='+';
			else if(score<84)
				option='-';
			else
				option='0';
		}
		else if(score>=70)
		{
			grade='C';
			if(score>=78)
				option='+';
			else if(score<74)
				option='-';
			else
				option='0';
		}
		else if(score>=60)
		{
			grade='D';
			if(score>=68)
				option='+';
			else if(score<64)
				option='-';
			else
				option='0';
		}
		else
		{
			grade='F';
		}
		
		System.out.printf("학점은 %c%c\n",grade,option);
		
	}

}











