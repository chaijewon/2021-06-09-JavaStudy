package com.sist.lang;
/*
 *  �� => �ڹٱ⺻ , ����Ŭ , HTML/CSS , JavaScript => Web SITE
 *       ����Ŭ : ������ �����͸� �����ϴ� ��(������) => ���̺귯�� (���̹�Ƽ��)
 *       �ڹ� : ����Ŭ �����ؼ� �����͸� ������ �� �Ŀ� => �������� ���� 
 *       HTML/CSS => �������� ��� 
 *       JavaScript => �ǽð� ����(AJAX) => ��� ,����... ���������� �̺�Ʈó��(��ư,�޴�...)
 *       ===========================================================================
 *       
 *       1. �ڹ�(����) 
 *          ����,������,���,�޼ҵ�(���:����ڿ�û=> �α���,ȸ������,����...)
 *          ������ ���� : �����͸� ��� �ѹ��� ���� => ĸ��ȭ (private����+public �޼ҵ�)
 *          ������ �б�(����Ŭ) ==> ����ó��(�����Ͽ���) => ����Ŭ ���� ���α׷� 
 *          Ŭ���� ������ => �迭 (X) , �÷���(���̺귯�� => java.util)
 *          ==================================================================== 1�� �Ϸ�(Ajax,Jquery)
 *       2. �ڹ�(�߱�) => XML , ������̼� , ������ ���� 
 *       3. �ڹ�(���) => ������ �м� , ��� (����� ��=>���Խ�,�ڸ��,������(���¼Һм�)
 *       ======================================================================= 2�� �Ϸ�(Vue.js,React)
 *       4. ��Ʋ�� (���) => �ȵ���̵� ���� (�����) ==> ���� ������Ʈ 
 *       
 *   ������ : ����� ���� Ŭ���� + �ڹٿ��� �����ϴ� ���̺귯��
 *          ======================================= �Ѱ��� ����� ���� 
 *          �ڹٿ��� �����ϴ� ���̺귯�� 
 *          java.lang , java.util , java.io , java.net , javax.xml , javax.servlet=>JSP
 *          ��Ÿ => �ܺζ��̺귯�� (������,���̹�Ƽ��,Jsoup,simple-json....:mvnrepository.com)
 *          java.lang => �ڹٿ��� �⺻ ��Ű�� : import�� ���� �� �� �ִ� 
 *          ==========
 *          1.Object : �ֻ��� Ŭ���� => ��� �ڹ� Ŭ������ Object����� �޴´� (����� ����,���̺귯��..)
 *          ======= Ŭ���� = �������� (Object�� ��� ���������� ���� �� �ִ�)
 *          Object o=1; Object o=10.5; Object o='A'; Object o="Hello"; Object o=true....
 *          2.���ڿ� ���� : String , StringBuffer , StringBuilder
 *          3.���� : Math
 *          4.����� : System => ȭ�� ��� , �Է°� �ޱ� , GC(�޸� ����) 
 *          5.Wrapper Ŭ���� 
 *            �⺻���������� ���� ��� �����ϰ� ���� Ŭ���� 
 *            =========
 *            ������(int,long,byte,short), �Ǽ���(float,double),����(boolean)
 *            => ***int ====> Integer 
 *                �� => "10" => �ڹٿ��� �ޱ�  => int page=(int)"10" => ���� 
 *                                            int page=Integer.parseInt("10");
 *               ***long ===> Long
 *               byte ===> Byte
 *               short ==> Short
 *               float ==> Float
 *               ***double ==> Double
 *               ***boolean ==> Boolean
 *          ==================================================================
 *          java.util 
 *            = Date , Calendar:��¥ ���� 
 *            = ���ڿ� ���� : StringTokeniger 
 *            = ���� : Random
 *            = �迭 ��� ��� : �÷��� => ArrayList,Vector,Map, HashSet,Queue,Stack,LinkedList
 *                            ====== �ڷᱸ�� 
 *         java.io : ����� => File , FileReader ,FileWriter,FileInputStream,FileOutputStream 
 *         java.net : ��Ʈ��ũ => URL , Socket , URLEncoder(�ѱۺ�ȯ) 
 *         
 *         ���̺귯���� �����ϴ� ��� 
 *         1) Ŭ���� 
 *             = �޼ҵ�(���)
 *               ==========
 *               ������ , �޼ҵ�� , �Ű����� => �뵵
 *               ==============================
 *               
 *         java.lang 
 *         =========
 *         Object ���� ��� : 450page 
 *           = finalize() : �Ҹ����Լ� => ȣ���� �Ǹ� �޸𸮿��� ��ü�� ���� 
 *             ����) protected void finalize()
 *           = clone()    : ���� (��ü) => ������ (prototype) => ����/����
 *                          ����(���� �޸� �ּ�) , ����(���ο� �޸� ����) , new 
 *             ����) protected Object clone() 
 *                  => �ٸ� ��Ű������ ��� : ��� , ������(�������̵�) => ��������� Ȯ���ؼ� ����� ����
 *                     ========= ����� ���� (��� Object ���)
 *                  => ���� �ٸ� Ŭ������ �Ѱ��� ��� ��� => Object[]
 *                     =============================
 *             class A
 *             class B
 *             class C 
 *             class D 
 *             ======== ��� ����� �Ұ��� (�������̽� , Object)
 *             Object[] cls={new A(),new B(),new C() , new D()} , Object[] o={10,'A',10.5,"Java"}
 *             ===> Object���� Ŭ�����̱� ������ => ���ø��� ����ȯ 
 *             interface I
 *             class A implements I
 *             class B implements I
 *             class C implements I
 *             class D implements I
 *             
 *             I i=new A() , i=new B() , i=new C() , i=new D() => �������̽� 
 *             => �������̽� : ���� �ٸ� Ŭ������ ������ ��� ���� ==> ��(��û�޾Ƽ� �����ϴ� ���α׷�)
 *           = toString() : ��ü ��� => �ּҰ��� ��� (����)
 *                          A a=new A();
 *                          System.out.println("a="+a) => A@�ּ�
 *                                            =========
 *                                             a.toString() 
 *           = equals() : ��ü �� => ������ �ִ� ���� ��
 *       
 *       
 */
class Sawon
{
	public Sawon()
	{
		System.out.println("Sawon ��ü ����...");
	}
	public void display()
	{
		System.out.println("Sawon:display() Call...");
	}
    // Sawon��ü�� �޸𸮿��� ������� �ڵ� ȣ��Ǵ� �޼ҵ�(�Ҹ����Լ�) => A() , ~A()
	@Override
	protected void finalize() throws Throwable {
		System.out.println("SawonŬ���� �޸� ����!!");//�Ҹ��� => ȣ��Ǹ� ����, ȣ���� �ȵǸ� �޸𸮿� ������
	}
	
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //1. ��ü ���� 
		Sawon s=new Sawon();
		
		//2. ��ü�� ������ �ִ� ��� Ȱ�� (�޼ҵ� ȣ��) 
		s.display();
		//3. ��ü ���� ==> gc() => �����ϴ� �ð��� �ʴ� (���α׷� ����� ����) => ��Ƽ�̵�� 
		s=null; // ��ü�� null���̰ų� ������� ������ => GC()�� �ڵ� ������ �Ѵ� 
		// �޸𸮿��� �ڵ� ���� => Stack(��������,�Ű�����) , ���α׷��� ���� ���� => heap(��ü,�迭) => �������÷���
		System.gc(); // null�� ��ü�� ������ ����
	}

}









