/*
 *   3개의 정수를 입력 받아서 ==> 입력 메소드 int[]
 *   총점  ==> 메소드  => int
 *   평균  ==> 메소드  => double
 *   학점  ==> 메소드  => char
 *   출력 메소드  ===> void
 *   ================ 호출 조립(main()) 
 *   
 */
import java.util.Scanner;
public class 자바메소드_2 {
    static int input(String subject)
    {
    	Scanner scan=new Scanner(System.in);
    	System.out.print(subject+"점수 입력:");
    	return scan.nextInt();
    }
    // 총점 
    static int total(int kor,int eng,int math)
    {
    	return kor+eng+math;
    }
    // 평균
    static double avg(int total)
    {
    	return total/3.0;
    }
    
    static char score(double avg)
    {
    	char score='A';
    	switch((int)(avg/10)) // 정수,문자,문자열
        {
        case 10:
        case 9:
        	score='A'; // if(avg==10 || avg==9)
        	break;// 종료
        case 8:
        	score='B';
        	break;// 종료
        case 7:
        	score='C';
        	break;// 종료
        case 6:
        	score='D';
        	break;// 종료
        default:
        	score='F';
        }
    	return score;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*Scanner scan=new Scanner(System.in);
        System.out.print("국어점수 입력:");
        int kor=scan.nextInt();
        
        System.out.print("영어점수 입력:");
        int eng=scan.nextInt();
        
        System.out.print("수학점수 입력:");
        int math=scan.nextInt();
        
        // 총점 
        int total=kor+eng+math;// static int total(int kor,int eng,int math)
        // 평균
        double avg=total/3.0; // static double avg(int total)
        
        // 학점
        char score='A'; // 메소드 static char score(double avg)
        switch((int)(avg/10)) // 정수,문자,문자열
        {
        case 10:
        case 9:
        	score='A'; // if(avg==10 || avg==9)
        	break;// 종료
        case 8:
        	score='B';
        	break;// 종료
        case 7:
        	score='C';
        	break;// 종료
        case 6:
        	score='D';
        	break;// 종료
        default:
        	score='F';
        }
        
        //// 출력 
        System.out.println("국어 점수:"+kor);
        System.out.println("영어 점수:"+eng);
        System.out.println("수학 점수:"+math);
        System.out.println("총점 점수:"+total);
        System.out.printf("평균:%.2f\n",avg);
        System.out.println("학점:"+score);*/
		
		int kor=input("국어");
		int eng=input("영어");
		int math=input("수학");
		
		int total=total(kor,eng,math);//kor+eng+math
		double avg=avg(total); // total/3.0
		char score=score(avg);
		System.out.println("국어 점수:"+kor);
        System.out.println("영어 점수:"+eng);
        System.out.println("수학 점수:"+math);
        System.out.println("총점 점수:"+total);
        System.out.printf("평균:%.2f\n",avg);
        System.out.println("학점:"+score);
        
	}

}







