/*
 *   3���� ������ �Է� �޾Ƽ� ==> �Է� �޼ҵ� int[]
 *   ����  ==> �޼ҵ�  => int
 *   ���  ==> �޼ҵ�  => double
 *   ����  ==> �޼ҵ�  => char
 *   ��� �޼ҵ�  ===> void
 *   ================ ȣ�� ����(main()) 
 *   
 */
import java.util.Scanner;
public class �ڹٸ޼ҵ�_2 {
    static int input(String subject)
    {
    	Scanner scan=new Scanner(System.in);
    	System.out.print(subject+"���� �Է�:");
    	return scan.nextInt();
    }
    // ���� 
    static int total(int kor,int eng,int math)
    {
    	return kor+eng+math;
    }
    // ���
    static double avg(int total)
    {
    	return total/3.0;
    }
    
    static char score(double avg)
    {
    	char score='A';
    	switch((int)(avg/10)) // ����,����,���ڿ�
        {
        case 10:
        case 9:
        	score='A'; // if(avg==10 || avg==9)
        	break;// ����
        case 8:
        	score='B';
        	break;// ����
        case 7:
        	score='C';
        	break;// ����
        case 6:
        	score='D';
        	break;// ����
        default:
        	score='F';
        }
    	return score;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*Scanner scan=new Scanner(System.in);
        System.out.print("�������� �Է�:");
        int kor=scan.nextInt();
        
        System.out.print("�������� �Է�:");
        int eng=scan.nextInt();
        
        System.out.print("�������� �Է�:");
        int math=scan.nextInt();
        
        // ���� 
        int total=kor+eng+math;// static int total(int kor,int eng,int math)
        // ���
        double avg=total/3.0; // static double avg(int total)
        
        // ����
        char score='A'; // �޼ҵ� static char score(double avg)
        switch((int)(avg/10)) // ����,����,���ڿ�
        {
        case 10:
        case 9:
        	score='A'; // if(avg==10 || avg==9)
        	break;// ����
        case 8:
        	score='B';
        	break;// ����
        case 7:
        	score='C';
        	break;// ����
        case 6:
        	score='D';
        	break;// ����
        default:
        	score='F';
        }
        
        //// ��� 
        System.out.println("���� ����:"+kor);
        System.out.println("���� ����:"+eng);
        System.out.println("���� ����:"+math);
        System.out.println("���� ����:"+total);
        System.out.printf("���:%.2f\n",avg);
        System.out.println("����:"+score);*/
		
		int kor=input("����");
		int eng=input("����");
		int math=input("����");
		
		int total=total(kor,eng,math);//kor+eng+math
		double avg=avg(total); // total/3.0
		char score=score(avg);
		System.out.println("���� ����:"+kor);
        System.out.println("���� ����:"+eng);
        System.out.println("���� ����:"+math);
        System.out.println("���� ����:"+total);
        System.out.printf("���:%.2f\n",avg);
        System.out.println("����:"+score);
        
	}

}







