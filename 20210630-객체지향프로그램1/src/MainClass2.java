/*
 *   ��ü������ ���α׷� ���� 
 *   1) ������ ��ȣ (�ٸ� Ŭ�������� ���� ���� ����� �� �� ����, �� ����� ���� �ϰ� ���´�(�޼ҵ带 �̿��ؼ�))
 *      ========== ����ȭ / ĸ��ȭ 
 *        === ���������� 
 *            private 
 *            protected
 *            public
 *            default 
 *   2) ������ ���� Ŭ������ ���� (���=�����ؼ� ���,����=�ִ� �״��)
 *                            =============== ==============
 *                             ����� ����         ���̺귯�� 
 *                            ============================== extends(Ȯ��) => ����ȯ
 *   3) ����,�߰� (������) 
 *      ���� => �������̵�
 *      �߰� => �����ε� 
 *   *** ĸ��ȭ , ��� , ������  (�������) 
 *   *** Ŭ������ ���� ����� 
 *       �������
 *       ���������� �������� ������;  ===> default (int a;=>���� ���������� ������ ����)
 *       �޼ҵ� 
 *       ������ 
 *       ===============================================================================
 *                   �ڽ��� Ŭ����    ���� �����ȿ���     �ٸ� ��Ű�� ���� Ŭ������ ����     ��� Ŭ����
 *                                 (��Ű��)
 *       ===============================================================================
 *       private        O
 *       ===============================================================================
 *       default        O              O
 *       ===============================================================================
 *       protected      O              O                     O
 *       ===============================================================================
 *       public         O              O                     O                      O
 *       ===============================================================================
 *       
 *       ***** ������ private (����ȭ) => ������ ��ȣ�� ���� => ���ٽÿ��� �޼ҵ带 �̿��Ѵ� (ĸ��ȭ)
 *             ===
 *              ��� : �б� / ���� (�޸𸮿� ����) => �޼ҵ� �б�:getter , ���� :setter ==> ���̺귯��(lombok)
 *                    ===
 *                    �޸𸮿� ���� ������ �´� 
 *       ***** �޼ҵ�� �ٸ� Ŭ���� ��� public 
 *       ***** ������ => � Ŭ������ ������� ����� ���� public 
 *   
 */
/*
 *    java���Ͼȿ� ������ class�� ���� 
 *    =========
 *     = public class => 1���� ����� ���� 
 *     = ������� public class�� ������ ���� 
 *     
 *     class A
 *     public class B ==> B.java
 *     
 *     
 */
class Sawon
{
	/// default => ���� �����ȿ��� ����� ���� 
	//  protected => default���� ũ�� (�ٸ� ������ �ִ� Ŭ�������� ������ ���� (���))
	/*
	 * protected int sabun; protected String name; protected String dept;// �μ���
	 * protected String loc; //�ٹ��� protected long pay;
	 */
	// ������ ����� ��� Ŭ�������� ������ ���� (����) => Open
	/*public int sabun;
	public String name;
	public String dept;// �μ���
	public String loc; //�ٹ���
	public long pay;*/
	private int sabun;
	private String name;
	private String dept;// �μ���
	private String loc; //�ٹ���
	private long pay;
	// �ٸ� Ŭ���������� ����� �Ұ��� (����ȭ)
	// ���� => �б� / ���� ====================> ĸ��ȭ 
	public int getSabun() {
		return sabun;
	}
	public void setSabun(int sabun) {
		this.sabun = sabun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public long getPay() {
		return pay;
	}
	public void setPay(long pay) {
		this.pay = pay;
	}
	
}
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Sawon s=new Sawon();
        s.setSabun(2);
        s.setName("��û��");
        s.setDept("��ȹ��");
        s.setLoc("���");
        s.setPay(3500);
        // setXxx() ===> ����
        System.out.println("���:"+s.getSabun());
        System.out.println("�̸�:"+s.getName());
        System.out.println("�μ�:"+s.getDept());
        System.out.println("�ٹ���:"+s.getLoc());
        System.out.println("����:"+s.getPay());
        /*s.sabun=1;
        s.name="ȫ�浿";
        s.dept="���ߺ�";
        s.loc="����";
        s.pay=3000;// ���԰����� ==> ���� (�޸𸮿� ����)
        System.out.println("���:"+s.sabun); ==> �б� (�޸𸮿��� ���� ������ ����)
        System.out.println("�̸�:"+s.name);
        System.out.println("�μ�:"+s.dept);
        System.out.println("�ٹ���:"+s.loc);
        System.out.println("����:"+s.pay);*/
	}

}









