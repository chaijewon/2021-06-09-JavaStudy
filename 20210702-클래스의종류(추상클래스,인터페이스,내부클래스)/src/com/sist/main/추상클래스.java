package com.sist.main;
/*
 *   �߻� Ŭ���� 
 *   === ���뼺�� ������ �ִ� Ŭ���� 
 *   ��)
 *        �Խ��� : ������ , ã�� , �۾��� , ���뺸�� , �����ϱ� , �����ϱ� 
 *        ������ϱ� : ������ , ã�� , �۾��� , ���뺸�� , �����ϱ� , �����ϱ� , �亯�ϱ� 
 *        ��۰Խ��� : ������ , ã�� , �۾��� , ���뺸�� , �����ϱ� , �����ϱ� ,���
 *        �ı�Խ���: ������ , ã�� , �۾��� , ���뺸�� , �����ϱ� , �����ϱ�, ���ε� 
 *        ===================================================================
 *        1. �������� ���Ǵ� �޼ҵ带 ã�´� 
 *        2. �߻�޼ҵ� (������ �ȵ� �޼ҵ�)
 *        3. ��ӹ޾� ���� 
 *        4. �߻�Ŭ���� �Ѱ��� => ��� �Խ����� ���� �� �� �ִ�  => ī��
 *        
 *        
 *        ��ư : Ŭ���Ѵ� 
 *              ó����� Ʋ���� (�α��ι�ư,����)
 *        ���콺 : ó�� ���� 
 */
abstract class ����
{
	public abstract void draw(); // ������ �ȵ� �޼ҵ� => ��ӽÿ� �ݵ�� �����ؼ� ���
	public void select(String color) // �ʿ��ϸ� �������̵� (������ �޼ҵ�)
	{
		System.out.println("�������� ����Ѵ�");
	}
}
class �� extends ����
{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("���� �׸���");
	}
	/*
	 *   public void select(String color) // �ʿ��ϸ� �������̵� (������ �޼ҵ�)
	     {
		   System.out.println("�������� ����Ѵ�");
	     }
	 */
	
}
class �� extends ����
{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("���� �׸���");
	}
	/*
	 *   public void select(String color) // �ʿ��ϸ� �������̵� (������ �޼ҵ�)
	     {
		   System.out.println("�������� ����Ѵ�");
	     }
	 */
}
class �簢�� extends ����
{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("�谢���� �׸���");
	}
	/*
	 *   public void select(String color) // �ʿ��ϸ� �������̵� (������ �޼ҵ�)
	     {
		   System.out.println("�������� ����Ѵ�");
	     }
	 */
}
public class �߻�Ŭ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*�� line=new ��();
        line.draw();
        line.select("������");
        
        �� c=new ��();
        c.draw();
        
        �簢�� r=new �簢��();
        r.draw();*/
		// ���õ� Ŭ������ ��Ƽ� ������ ���� => ���õ� Ŭ���� (������) => Ŭ���� ��ü��=new ������()
		/*
		 *   �߻� Ŭ������ ��ü(�ν��Ͻ�)�� ������ �� ���� ������ 
		 *   �����ϱ� ���ؼ� �ݵ�� ����� ���ؼ� ������ Ŭ������ �̿��ؼ� �޸� �Ҵ��� �Ѵ� 
		 *   
		 *   ���� a=new ��();
		 *   ===      ===
		 *   �߻� Ŭ����  ������ Ŭ����
		 *   ����        ���� ������ �ִ� �޼ҵ� 
		 *   
		 *   aaa()
		 *   aaa(int)
		 *   aaa(int ,int)
		 *   C��� ���ε� (�޼ҵ� , �Լ� => �ּҰ�) �޼ҵ� (�޸𸮿� ����) => �޼ҵ���� �ּ�
		 *        =====
		 *        �������ε� : ����ÿ� �޼ҵ��� �ּҰ��� ���� 
		 *        �������ε� : ���� ==> �����Լ� ==> �ڹٴ� �����Լ� (�ӵ�)
		 *        
		 *        ���� a=new ��() ==> ���� ������ �޼ҵ� �ּ� ȣ�� 
		 *        a=new ��()   ==> ���� ������ �޼ҵ� �ּ� ȣ�� 
		 */
		
		���� a=new ��();
		a.draw();
		
		a=new ��();
		a.draw();
		
		a=new �簢��();
		a.draw();
	}

}








