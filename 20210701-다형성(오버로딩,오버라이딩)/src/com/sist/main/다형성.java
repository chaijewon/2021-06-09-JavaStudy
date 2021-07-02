package com.sist.main;
/*
 *    �����ε� (�߰�) / �������̵� (����)
 *    ====================================================
 *                 �����ε�                �������̵� 
 *    ====================================================
 *     ����       �Ѱ��� Ŭ����              ��Ӱ��� 
 *    ====================================================
 *     �޼ҵ�       ����                    ����
 *    ====================================================
 *    �Ű�����      ������ ���������� �ٸ���     ���� 
 *    ====================================================
 *    ������        �������                 ���� 
 *    ====================================================
 *                                      ���������ڰ� Ȯ�� / ���������ڸ� ���(X)
 *    ====================================================
 *                     public > protected > default > private
 *                     
 *    1. ������ ��ȣ (ĸ��ȭ)
 *    2. ����     (���,����)
 *    3. ����,�߰�  (������) => �Ѱ��� �޼ҵ��̸����� �������� ��� ���� 
 *    
 *    Ŭ������ ũ�� 
 *    ==========
 *      ��� , ���� 
 *      
 *    class A
 *    {
 *    }
 *    class B    A�� B�� ũ�� �� �� ����(���� �� ����)
 *    {
 *    }
 *    
 *    ===========================================
 *    class A
 *    {
 *    }
 *    class B extends A  => AŬ������ BŬ�������� ũ�� 
 *    {
 *    }
 *    ===========================================
 *    class A
 *    {
 *    }
 *    class B => BŬ������ A���� ũ�� 
 *    {
 *       A a;
 *    }
 *    
 *    ==========================================
 *    ��Ӱ����� Ŭ���� ����
 *    class A
 *    class B extends A
 *    
 *    A a=new A();
 *    B b=new B();
 *    
 *    A c=new B();(O)
 *    B d=new A();(X)
 *    
 *    ����ȯ 
 *    class A (����)
 *    class B extends A
 *         �ΰ�
 *    
 *    A a=new A();
 *    B b=new B();
 *    
 *    a=b => ����� ���� 
 *    ���� = �ΰ� ==> �ΰ��� �����̴� (O)
 *    b=a => ����� �Ұ��� 
 *    �ΰ� = ���� ==> ������ �ΰ��̴� (X)
 *    ==> b=(�ΰ�)a;
 *    �ڹٿ��� => ���̺귯�� ���鶧 Ŭ������ �����Ҷ� => Object => ����ȯ 
 *    
 *    ==> class A
 *        class B extends A
 *        *** 
 *        A a=new B();
 *          1. ������ (new B()) => a.(�޼ҵ�) => BŬ������ �޼ҵ� 
 *          2. Ŭ������ (A)     => a.(����)   => AŬ������ ���� 
 *    ��)
 *        class A
 *        {
 *           int a=10;
 *           public void display()
 *           {
 *              System.out.println(100);
 *           }
 *        }
 *        class B extends A
 *        {
 *           int a=20;
 *           public void display()
 *           {
 *              System.out.println(200);
 *           }
 *           public void aaa()
 *           {
 *           }
 *        }
 *    
 *        A a=new B();
 *        a.display() => 200
 *        a.a=10
 *        a.aaa() => ȣ�� �� �� ���� 
 *    
 *    
 */
class SutdaCard
{
    private int num;
    private Boolean isKwang;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public Boolean getIsKwang() {
		return isKwang;
	}
	public void setIsKwang(Boolean isKwang) {
		this.isKwang = isKwang;
	}
    
    
}
class Student
{
	private String name;
	private int ban,no,kor,eng,math;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBan() {
		return ban;
	}
	public void setBan(int ban) {
		this.ban = ban;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
}
class A // extends Object
{
	int aa=100;
	public void display()
	{
		System.out.println("A:display()...");
	}
}
class B extends A
{
	int aa=200;
	public void display()
	{
		System.out.println("B:display()...");
	}
	public void connection()
	{
		System.out.println("B:connection()...");
	}
}

public class ������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        A a=new A(); // aa,display()
        System.out.println(a.aa);
        a.display();
        
        B b=new B(); // aa,display(),connection();
        System.out.println(b.aa);
        b.display();
        
        A c=new B(); // aa, display()=>(B=> display()) interface, �߻�Ŭ���� 
        System.out.println(c.aa);
        c.display();
        
        B d=(B)c;
        //d=(B)a;
        //B d=(B)a; // connection
        System.out.println(d.aa);
        d.display();
        d.connection();
        
        // Ŭ�������� => Ŭ������ ��ü��=new �𷡽���() A a=new A()
        //            =======          ====== ����(O) 
        //            =======          ====== ����(X) => �������̽� , �߻�Ŭ����
        // List list=new ArrayList()
        
        Object o=new A();
        // double = int
        
        A aa=(A)o;
        // int = (int)double
        aa.display();
        
        /*
         *    ���� Ŭ���� => ���� Ŭ���� : ����ȯ(Down) => �����Ұ���
         *    ���� Ŭ���� => ���� Ŭ���� : ����ȯ(UP) => ������ ���� 
         */
        
	}

}








