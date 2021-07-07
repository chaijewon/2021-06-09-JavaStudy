package com.sist.util;
import java.util.*;
import java.text.*;
// 국어,영어,수학 점수를 입력받아서 평균,총점, 학점 
public class MainClass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("국어점수 입력:");
        int kor=scan.nextInt();
        
        System.out.print("영어점수 입력:");
        int eng=scan.nextInt();
        
        System.out.print("수학점수 입력:");
        int math=scan.nextInt();
        
        System.out.println("총점:"+(kor+eng+math));
        System.out.printf("평균:%.2f\n",(kor+eng+math)/3.0);
        double[] limits={50,60,70,80,90};
        //  90<  60~69 
        // 60<= score <70
        String[] grade={"F","D","C","B","A"};
        ChoiceFormat cf=new ChoiceFormat(limits,grade); // 
        System.out.println("학점:"+cf.format((kor+eng+math)/3.0));
        /*char score=' ';
        switch((kor+eng+math)/30)
        {
        case 10:
        case 9:
        	score='A';
        	break;
        case 8:
        	score='B';
        	break;
        case 7:
        	score='C';
        	break;
        case 6:
        	score='D';
        	break;
        default:
        	score='F';
        }
        System.out.println("학점:"+score);*/
	}

}






