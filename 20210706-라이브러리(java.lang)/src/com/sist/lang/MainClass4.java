package com.sist.lang;
/*
 *   toString() => ��ü�� ���ڿ� ��� (��ü=>�ּ�)
 *   ����)
 *         public String toString() ==> �޼ҵ�� Ư���� ��찡 �ƴϸ� public 
 *                ====== ========
 *         Object => String���� �޴� ��� 
 *         String s=new Object(); ==> ���� 
 *                Object
 *                  |
 *               String 
 *         Object o="Hello";
 *         String s=(String)o;
 *         String s=o.toString();
 */
// ��ü�� ���ڿ� ��ȯ �Ҷ� ���Ǵ� �޼ҵ� (toString()) => ��� Ŭ����(���������,���̺귯��=>toString())
class Member // extends Object
{
    String name;
    String sex;
    // Ȯ�� => ������ �� ���� 
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		return "�̸�:"+name+",����:"+sex;
	}
	
}
public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Member m=new Member();
        m.name="ȫ�浿";
        m.sex="����";
        //System.out.println("m�� �ּ�="+m);//�ּҸ� ����Ҷ� toString()�� ������ �� �ִ� 
        System.out.println("����:"+m);
	}

}
