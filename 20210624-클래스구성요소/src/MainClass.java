import java.util.Scanner;
/*
 *   �ڹٿ��� �����͸� �����ϴ� ��� 
 *     = ���� (�Ѱ��� �����ϴ� ����)
 *     = �迭 (���� �������� ������ ��Ƽ� �ѹ��� �����ϴ� ���)
 *     = Ŭ���� (�ٸ� �������� ������ ��Ƽ� �ѹ��� �����ϴ� ���)
 */
// �Ѹ��� �л��� ���� => �ʿ��� ��ŭ �޸� ����  
/*
 *     Ŭ���� 
 *       �������� (����� ���� ��������) => ���� ========> ~DTO(Data Transfor Object) , ~VO(value Object)
 *       �׼��� Ŭ���� (���(�޼ҵ�)�� ��Ƽ� ó��)  =====> ~DAO(�����ͺ��̽� ����),~Service,~Manager
 *       ȥ���� (������+�޼ҵ�) ===> ���� ������� �ʴ´� 
 *       
 *     ������� 
 *      ���� (�������)
 *         = �ν��Ͻ� ���� => ������� ���� ����  new (������� ���� ����) : String(70%)
 *           A a=new A() =>  ������� ���� ���� 
 *           A b=new A() =>  ������� ���� ���� 
 *         = �������� : �޼ҵ念���ȿ����� ��� => �޼ҵ尡 ����Ǹ� �ڵ����� �޸𸮰� ���� 
 *                    => �Ű����� ���� 
 *         = ��������(��������) : �Ѱ��� �޸� ������ ���� => �����Ϸ��� ���ؼ� �ڵ� ���� 
 *           static int a;
 *      �޼ҵ� 
 *         = �ν��Ͻ� �޼ҵ� 
 *         = ���� �޼ҵ�  static 
 *         = �߻�޼ҵ� 
 *         = ���ܸ޼ҵ� :String,Math...
 *         
 *      ������ 
 *         = �ʱ�ȭ : �������ڸ��� => �α��� , ID�ڵ� , ��Ʈ��ũ , �����ͺ��̽�
 */
class Student{
	String name;
	int kor,eng,math; // �ν��Ͻ����� => new��� �����ڸ� �̿��ؼ� ������� ���� ������ ���� 
	// �ڵ� ���� , ���� => Ŭ���� ���� (static)
	static String school;
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // �̸� ���� 2��
		String name1,name2,name3;
		int kor1,kor2,kor3;
		int eng1,eng2,eng3;
		int math1,math2,math3;
		
		name1="ȫ�浿";
		kor1=80;
		eng1=90;
		math1=85;
		
		name2="��û��";
		kor2=79;
		eng2=90;
		math2=80;
		
		name3="�ڹ���";
		kor3=79;
		eng3=90;
		math3=80;
		
		System.out.printf("%5s%4d%4d%4d%5d%7.2f\n",name1,kor1,eng1,math1,(kor1+eng1+math1),
				(kor1+eng1+math1)/3.0);
		System.out.printf("%5s%4d%4d%4d%5d%7.2f\n",name2,kor2,eng2,math2,(kor2+eng2+math2),
				(kor2+eng2+math2)/3.0);
		System.out.printf("%5s%4d%4d%4d%5d%7.2f\n",name3,kor3,eng3,math3,(kor3+eng3+math3),
				(kor3+eng3+math3)/3.0);
		
		System.out.println("============== �迭 ��� =================");
		// �迭 
		String[] name={"ȫ�浿","��û��","�ڹ���"};
		int[] kor={90,80,85};
		int[] eng= {80,79,89};
		int[] math={90,80,70};
		for(int i=0;i<name.length;i++)
		{
			System.out.printf("%5s%4d%4d%4d%5d%7.2f\n",name[i],kor[i],eng[i],math[i],
					(kor[i]+eng[i]+math[i]),
					(kor[i]+eng[i]+math[i])/3.0);
		}
		/*
		 *   String[] names;
		 *   int[] kor;
		 *   int[] eng;
		 *   int[] math
		 *   ===================> �ε����� ���� ���� �л� �Ѹ� ���� ����
		 */
		// Ŭ����
		/*
		 *   class Student{
		 *      String name;
		 *      int kor,eng,math
		 *   }
		 *   
		 *   new => 3���� ���� 
		 *   Student hong; ==> hong.name => �ش� �޸� ���� ������ 
		 *   Student shim;
		 *   Student park
		 */
		Student hong=new Student(); // hong => name,kor,eng,math
		System.out.println(hong);
		hong.name="ȫ�浿";
		hong.kor=90;
		hong.eng=89;
		hong.math=89;
		//hong.school="SIST1";// Ŭ������.������ 
		Student.school=""; // Math.random() , String.valueOf()
		Student shim=new Student(); // shim => name,kor,eng,math
		System.out.println(shim);
		shim.name="��û��";
		shim.kor=90;
		shim.eng=89;
		shim.math=89;
		shim.school="SIST2";
		Student park=new Student(); // park => name,kor,eng,math
		System.out.println(park);
		park.name="�ڹ���";
		park.kor=90;
		park.eng=89;
		park.math=89;
		park.school="SIST3";
		// hong.school? SIST3
		System.out.println("hong.school?"+hong.school);
		
		System.out.printf("%5s%4d%4d%4d%5d%7.2f\n",hong.name,hong.kor,hong.eng,
				hong.math,(hong.kor+hong.eng+hong.math),
				(hong.kor+hong.eng+hong.math)/3.0);
		System.out.printf("%5s%4d%4d%4d%5d%7.2f\n",shim.name,shim.kor,shim.eng,
				shim.math,(shim.kor+shim.eng+shim.math),
				(shim.kor+shim.eng+shim.math)/3.0);
		System.out.printf("%5s%4d%4d%4d%5d%7.2f\n",park.name,park.kor,park.eng,
				park.math,(park.kor+park.eng+park.math),
				(park.kor+park.eng+park.math)/3.0);
		
		Student[] s={hong,shim,park};
		for(int i=0;i<s.length;i++)
		{
			System.out.printf("%5s%4d%4d%4d%5d%7.2f\n",s[i].name,s[i].kor,s[i].eng,
					s[i].math,
					(s[i].kor+s[i].eng+s[i].math),
					(s[i].kor+s[i].eng+s[i].math)/3.0);
		}
		// Ŭ���� => ����� ���� => �Ϲ� ������ �����ϰ� ��� (�迭,Ŭ����...)
		
	}

}
