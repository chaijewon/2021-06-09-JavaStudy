/*
 *   1. ����,����,���� ������ �Է¹޾Ƽ�  => Scanner => import java.util.Scanner
 *   2. ���,������� 
 *   3. ���� => ��� : 90�̻� A
 *                   80�̻� B
 *                   70�̻� C
 *                   60�̻� D
 *                   60���� F
 *                   ============= �������� (��������)
 */
/*
 *    �ڹ��� ��ü ���� 
 *    =============
 *    1. package => ���� �Ҽ� (���) 
 *    2. import => �ܺο� �ִ� �ڹ����� �б�(Ŭ����) => ������ ����� ���� 
 *    3. public class ClassName
 *       {
 *           ==========================
 *               ������� (��������) : ������ ������ ���� 
 *           ==========================
 *               ��� ���� (�޼ҵ�) 
 *                 ������ ���� 
 *           ==========================
 *               ������ ���� �ʱ�ȭ (������)
 *           ==========================
 *               public static void main(String[] args) {
 *                  ��������� : �ѹ� ����ϰ� ������ 
 *                    ���������� �ڵ�...
 *               }
 *           ==========================
 *       }
 *       
 *       ������ ��� 
 *       =========
 *       ���� ���ð� �ʹ� 
 *       =============
 *        1. ���� ��� 
 *        2. ���� �Ǵ�
 *        3. ���� ���ð� 
 *        4. �ٸ� ���� �Ǵ�
 *        
 *      ���� ���ð� �ʹ� 
 *      =============
 *       ������ => ȣ���� ���� 
 *       
 *       �ϵ� : �������� �Ƶ��� �峭�� ����
 */
import java.util.Scanner;
public class �ڹ����_���ǹ�4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("���� ���� ���� ���� �Է�(90 90 90):");
        int kor=scan.nextInt();
        int eng=scan.nextInt();
        int math=scan.nextInt();
        System.out.println("���� ����:"+kor);
        System.out.println("���� ����:"+eng);
        System.out.println("���� ����:"+math);
        System.out.println("����:"+(kor+eng+math));
        System.out.printf("���:%.2f\n",(kor+eng+math)/3.0);
       
        /*
         *    "����:"+80+90+70
         *    =========
         *    "����:80"
         *           =====
         *           "����:8090"
         *                =====
         *           "����:809070"    
         *    ���ڿ�+any type(��� ��������)  ==> ���ڿ�  
         *    ""
         *    any type(��� ��������)+���ڿ� ==> ���ڿ�
         *    
         *    "����:"+(80+90+70)
         *            =========
         *                1
         *        ====
         *         2
         */
        // ����
        char score='A';
        int avg=(kor+eng+math)/3;
        // 90 90 90 => avg=90
        if(avg>=90 && avg<=100)   // 90>=90
        	score='A';
        
        if(avg>=80 && avg<90)   // 90>=80
        	score='B';
        
        if(avg>=70 && avg<80)
        	score='C';
        
        if(avg>=60 && avg<70)
        	score='D';
        
        if(avg<60)
        	score='F';
        
        System.out.println("����:"+score+"����");
        
	}

}






