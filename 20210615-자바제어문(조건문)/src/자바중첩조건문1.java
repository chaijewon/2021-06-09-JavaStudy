/*
 *    ��ø ���ǹ� 
 *    ����)
 *         if(���ǹ�)  ==> ���̵� �����ϰ�
 *         {
 *            if(���ǹ�) ==> ��й�ȣ�� ���� 
 *            {
 *            }
 *         }
 *         
 *         if(��ǻ��==����)
 *         {
 *            if(�����==����)
 *            else if(�����==����)
 *            else if(�����==��)
 *         }
 *         
 *         ���� �Է� 
 *         if(score>=90) ==> A
 *         {
 *            if(score>=98) +
 *            else - 94���� 
 *         }
 */
import java.util.Scanner;
public class �ڹ���ø���ǹ�1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 1. Scanner ���� => �Է°��� �޾Ƽ� ����
		Scanner scan=new Scanner(System.in); // new�� ����ؾ� Ŭ������ ��� �� �� �ִ� 
		// 2. ����� �Է� ��û 
		System.out.print("0~100������ ������ �Է�:");
		// 3. ����� �Է��� ������ �޾Ƽ� ���� 
		int score=scan.nextInt();
		
		char grade=' '; // A , B , C , D , F
		char option=' ';// +(98) ,-(94����) , 0 
		// ������� ��� 
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
		
		System.out.printf("������ %c%c\n",grade,option);
		
	}

}











