package com.sist.lang;
/*
 *   Object ==> clone():���� (�ִ� �״�� �޸� ����=>���ο� �޸� ����)
 *   ����) protected Object clone() => clone�� ����Ҷ��� �ݵ�� ����ó���� �ϰ� ����Ѵ� 
 *        => ����) ������ (�⺻ : �̱��� , �޸� ���� ���� => prototype)
 *                      =========== �޸� �Ѱ��� ����� ���� (DAO,XML)
 *        => ���� ���� (����=>��Ī)
 *             = class A
 *               => A a=new A();
 *               => A b=a; ========> �޸� ������ 1�� 
 *           ���� ���� 
 *             = class A
 *             = A a=new A();
 *               A b=a.clone();  ==> a�޸�, b�޸𸮰� ���� ���� => �޸� ���� 2��
 */
class Box
{
	private int width=100;
	private int height=200;
	// �޼ҵ带 ���ؼ� ������ �����ϰ� ����� (ĸ��ȭ) => ����(�б�/����)
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	
}
public class MainClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Box a=new Box();// a=>width=100 , height=200
        a.setWidth(1000);
        a.setHeight(2000); // a=>width=1000,height=2000;
        System.out.println("a.width="+a.getWidth()+",a.height="+a.getHeight());
        Box b=new Box();// b=>width=100,height=200
        System.out.println("b.width="+b.getWidth()+",b.height="+b.getHeight());
        
        
        
	}

}
