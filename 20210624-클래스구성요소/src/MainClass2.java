/*
 *     ���� ���� 
 *     =======
 *     
 *     ===============================================================================
 *                            ���� ����(�޸�)            ���� ����      ���� ������
 *     ===============================================================================
 *     **�ν��Ͻ�����         =>  ��ü ����                  ���α׷� �����    Ŭ���� ��ü �������� ��� ����
 *                           new => �޸� ������ ���� ���� 
 *     ===============================================================================
 *     ��������(��������)    => �����Ϸ��� class������        ���α׷� �����    Ŭ���� ��ü �������� ��� ����
 *                          �ε����� ��� (java)
 *                    a.java ====== a.classs ===== ����
 *                            javac            java
 *     ===============================================================================
 *     **��������            => �޼ҵ� ȣ��ø���            �޼ҵ尡 �����ϸ� �ڵ�����  �޼ҵ� ���������� ����� ����
 *                                                   �������
 *     ===============================================================================
 *     
 *     �ν��Ͻ� ���� 
 *     class ClassName{
 *         �������� ������;
 *         �������� ������;
 *         static �������� ������;  // �������� => Ŭ���� ��ü���� ��� ���� , ������� 
 *         
 *         ������ �޼ҵ��(�Ű�����:���������� ���� )
 *         {
 *            �������� ==> �޼ҵ�ȿ����� ��� 
 *         }
 *     }
 *     
 *     class ClassName{
 *         String name="ȫ�浿"; ===> heap
 *         void rint()
 *         {
 *             String name="�ڹ���" ===> stack  ==> �������� �켱���� => ������� 
 *             System.out.println(this.name); this=> �ڽ��� ��ü  
 *         }
 *     }
 *     
 *     ==> ��ü (Ŭ���� ����)
 *              =====
 *               ����� ���� = �������� 
 *               
 *               1) �ڹٿ��� �����ϴ� ��������(�⺻ ��������) 
 *                  ������,�Ǽ���,����,������ 
 *               2) ���� ���������� �����Ѵ�  ==> class (���,�л�,��ȭ,����,����,������,ȸ��....)
 *                    => ������ �������� (�ּҸ� �̿��ؼ� �޸� ����)
 */
class Movie{
	String title;
	String director;
	String actor;
	String genre;
	String grade;
	boolean isShow;// ���� 
}
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Movie�� ������ ������ �޸� ���� ���� 
		Movie m1=new Movie(); // m1=> title,director,actor,genre,grade,isShow
		// �޸𸮿� ���ٽø��� ==> .  m1.title  (.: �ּ� ���� ������)
		// �ٸ� ��������(������ �ִ�)�� ��Ƽ� �ѹ��� �޸𸮿� ���� => �����ϱ� ���ϴ�
		System.out.println("m1="+m1); // ���� �ּҰ� ��� 
		// ��ȭ���� 
		m1.title="�߽�����";
		m1.director="��â��";
		m1.actor="������,������,����,��â��,����ȣ";
		m1.genre="������/���";
		m1.grade="15���̻������";
		m1.isShow=true;
		
		// ��� 
		System.out.println("��ȭ��:"+m1.title);
		System.out.println("����:"+m1.director);
		System.out.println("�⿬:"+m1.actor);
		System.out.println("�帣:"+m1.genre);
		System.out.println("���:"+m1.grade);
		System.out.println(m1.isShow==true?"����":"��������");
		
		Movie m2=new Movie(); // m2 => title,director,actor,genre,grade,isShow
		// ���ο� �޸� ����(title,director,actor,genre,grade,isShow) ==> new�� ����ؼ� ����
		System.out.println("m2="+m2); // ���� �ּҰ� ��� 
		// ��ȭ���� 
		m2.title="�߽�����";
		m2.director="��â��";
		m2.actor="������,������,����,��â��,����ȣ";
		m2.genre="������/���";
		m2.grade="15���̻������";
		m2.isShow=false;
		System.out.println("��ȭ��:"+m2.title);
		System.out.println("����:"+m2.director);
		System.out.println("�⿬:"+m2.actor);
		System.out.println("�帣:"+m2.genre);
		System.out.println("���:"+m2.grade);
		System.out.println(m2.isShow==true?"����":"��������");
		
		
	}

}





