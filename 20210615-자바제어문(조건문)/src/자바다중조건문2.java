// ���� , ���� , ���� => ���� , ��� , ��տ� ���� �����ο� A(90),B(80),C(70),D(60),F(60����)
import java.util.Scanner;
// A(�߻�Ŭ����) , F(����Ŭ����) => final => �����ؼ� ����� �ȵȴ� (������ ���� �״�� ���) 
public class �ڹٴ������ǹ�2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // �Է°��� �޴´� ==> ù�ڰ� �빮�� => Ŭ����
		Scanner scan=new Scanner(System.in);
		System.out.print("���� ���� �������� �Է�(�Է¹��:90 90 90):"); 
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
		
		
		// ����� ��� 
		System.out.println("���� ����:"+kor);
		System.out.println("���� ����:"+eng);
		System.out.println("���� ����:"+math);
		System.out.println("����:"+total);
		System.out.printf("���:%.2f\n",avg);
		System.out.println("����:"+score);
	}

}







