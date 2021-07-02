package com.sist.control;
/*
 *   page 344
 *   
 *   ������ 
 *    1. ���� ������ : public , protected , default , private
 *       public => ��Ű���� ������ ���� ��� Ŭ������ ������ ���� 
 *                 public���� : ������(Ŭ������ �о� �ö� �޸𸮿� ������ �Ѵ�=> new ������())
 *                             => public Ŭ������()
 *                             �޼ҵ�� �ٸ� Ŭ������ ����� �Ҷ� ���
 *                             => public ������ �޼ҵ��(�Ű�����...) 
 *                             Ŭ���� 
 *                             => public class Ŭ������ 
 *      protected => ��Ű���ȿ��� ������ ���� + ��ӹ��� Ŭ����(�ٸ� ��Ű��) => ���� ���󵵰� ���� 
 *      default => ���� ��Ű���ȿ��� 
 *      private => Ŭ���������� (�ڽ��� Ŭ����) : ���� => ����ȭ  
 *                                          === �б�޼ҵ�/����޼ҵ� ÷�� ==> ĸ��ȭ
 *                                              ================
 *                                              getter/setter 
 *   2. ��Ÿ������ 
 *      static / abstract / final 
 *      static => �������� ���Ǵ� (����=> �޸� ������ 1���� ����) 
 *                ���� => Ŭ���� ���������� ���� (����, �޼ҵ�)
 *                class A
 *                {
 *                    static int a;
 *                    public void display()
 *                    {
 *                       static int b; ==> ���� (���������� static�� ��� �� �� ����)
 *                    }
 *                }
 *      ====== ���� , �޼ҵ� , Ŭ���� (����Ŭ����)
 *      final : ������ (���������� �ַ� ���)
 *              ���� : �������,���������� �����ϴ� 
 *              ���� , �޼ҵ�, Ŭ���� 
 *              ===
 *               ���  final int ������=�� => ����Ŭ �ּ� , ����Ŭ port(1521)
 *                    final ������ �޼ҵ��(){} => ������ �� ���� �޼ҵ� (�������̵�) ==> ���� ���� 
 *                    => ���� (����=����, �߰�)
 *                    final class A ==> ���� Ŭ���� : ����� �� �� ���� (�ִ� �״�� ���)
 *      ===================================================================================
 *      Ŭ����  => public , default (private,protected�� ����� �Ұ���)
 *      �޼ҵ�  => public protected,default,private 
 *               �ַ� ����� (�ٸ� Ŭ���� ������ �� ���) => public 
 *      ������� => public protected,default,private 
 *               �ַ� ����� (�����͸� ��ȣ => ����ȭ) => private
 *      �������� => ����  => final
 *      ĸ��ȭ => �ܺηκ��� ������ ��ȣ 
 *              => �����Ͱ� �ջ� (������ ����ȭ => �ʿ��� ���� �޼ҵ带 �̿��ؼ� ����� ����)
 *                             ===========   ==================================
 *                             private           �޸� ���� / �޸� �б�
 *                                               setXxx()     getXxx() ==> getter/setter
 *      
 */
class A
{
	
}
public class MainClass {
    /*public static int a=10;
    static public int b=20;
    public final int c=30;
    final public int d=40;*/
	static public void main(String[] args) {
		// TODO Auto-generated method stub

	}

}





