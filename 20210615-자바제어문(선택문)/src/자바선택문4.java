// ����,����,���� ������ �޾Ƽ� => ��� , ���� , ���� :(90,80,70,60,60)
// switch 
// ��Ʈ��ũ ... , �� => �޴� ó�� , ��ư ó��...(�ڹٽ�ũ��Ʈ) 
import java.util.Scanner;
public class �ڹټ��ù�4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        // ��û 
        System.out.print("���� , ���� , ���� ���� �Է�:(�Է�:90 90 90):");
        int kor=scan.nextInt();
        int eng=scan.nextInt();
        int math=scan.nextInt();
        int total=kor+eng+math;
        double avg=total/3.0;
        System.out.println("��������:"+kor);
        System.out.println("��������:"+eng);
        System.out.println("��������:"+math);
        System.out.println("����:"+total);
        System.out.printf("���:%.2f\n",avg);
        
        int score=(int)(avg/10);  // double => int : 100,99......  => 10,9,8...
        char hakjum=' ';
        switch(score)
        {
        case 10:
        case 9:
        	hakjum='A';
        	break;
        case 8:
        	hakjum='B';
        	break;
        case 7:
        	hakjum='C';
        	break;
        case 6:
        	hakjum='D';
        	break;
         default:
        	 hakjum='F';
        }
        System.out.println("����:"+hakjum+"����");
        
	}

}






