/*
 *   �Ű������� ������ �ִ� ������ => �Է°��� �޾Ƽ� ������ �ʱ�ȭ 
 *                          => �ٸ� Ŭ������ �ּҰ��� �޾Ƽ� ó��(�����쿡 �ַ� ���(X),������)
 *                          => ������(�޸� �Ҵ�=> ������ ��ü���� ó��) => ������ ,setter�̿� 
 *                             => new�� ������� �ʴ´� (�̱���)
 *   class ClassName
 *   {
 *      ClassName(){} ============> �⺻ ������
 *      ClassName(�Ű�����...){} ===> �Ű������� �ִ� ������ 
 *   }
 *   ====> ������ ����� ���� �ʱ�ȭ 
 *         �Ϲݰ� : �����   int a=100
 *         ===================
 *         = �Է°��� ó��
 *         = ���� 
 *         =================== ���� (X), ����(O) => Ŭ���� ��Ͼȿ����� ����� �ȵȴ�
 *         ==> ������ => Ŭ������ �޸𸮿� �����Ҷ� (���� ó���� ȣ��Ǵ� �Լ�)
 */
import java.util.Scanner;
class Student{
	String name="ȫ�浿";
	int hakbun=3;
	Student(int h,String n) {
		hakbun=h;
		name=n;
	}
}
public class ������ {
    // {}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
	    for(int i=0;i<5;i++)
	    {
			System.out.print("�й� �Է�:");
			int h=scan.nextInt();
			System.out.print("�̸� �Է�:");
			String n=scan.next();
			
			Student s1=new Student(h, n);
			System.out.println("s"+(i+1)+".hakbun="+s1.hakbun+",s"+(i+1)+".name="+s1.name);
	    }
        /*Student s1=new Student();
        System.out.println("s1.hakbun="+s1.hakbun+",s1.name="+s1.name);
        
        Student s2=new Student();
        System.out.println("s2.hakbun="+s2.hakbun+",s2.name="+s2.name);
        
        Student s3=new Student();
        System.out.println("s3.hakbun="+s3.hakbun+",s3.name="+s3.name);
        */
		
        
	}

}






