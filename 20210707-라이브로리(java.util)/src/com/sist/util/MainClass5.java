package com.sist.util;
import java.util.*;
import java.text.*;
// ����,����,���� ������ �Է¹޾Ƽ� ���,����, ���� 
public class MainClass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("�������� �Է�:");
        int kor=scan.nextInt();
        
        System.out.print("�������� �Է�:");
        int eng=scan.nextInt();
        
        System.out.print("�������� �Է�:");
        int math=scan.nextInt();
        
        System.out.println("����:"+(kor+eng+math));
        System.out.printf("���:%.2f\n",(kor+eng+math)/3.0);
        double[] limits={50,60,70,80,90};
        //  90<  60~69 
        // 60<= score <70
        String[] grade={"F","D","C","B","A"};
        ChoiceFormat cf=new ChoiceFormat(limits,grade); // 
        System.out.println("����:"+cf.format((kor+eng+math)/3.0));
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
        System.out.println("����:"+score);*/
	}

}






