package com.sist.exception;
/*
 *   throws : ���� ȸ��,���� ó�� 
 *   =======
 *     ����Ǵ� ������ �̷� �͵��� �ִ� , �׳� �Ѿ�� (�ý��ۿ� ���ؼ� ó��)
 *   ����) ������ �޼ҵ��() throws ����ó������..........
 *                             NumberFormatException,NullPointerException,Exception...
 *                             ========================================================
 *                               ������ �������� �ʴ´� 
 *        => throws�� �� �ִ� �޼ҵ带 ȣ���Ҷ� (ȣ���ؼ� ����ϴ� �޼ҵ忡�� ó��)
 *            => ȸ�� 
 *            => ����ó�� 
 *            
 *        ���ܰ� �߻� : ArrayIndexOutOfException ==> �迭�� ū ��� ==> �ε�����ȣ ������ �߻� �� �� �ִ�
 *        public static void display1() throws ArrayIndexOutOfException // RuntimeException
 *        {
 *        }
 *        
 *        public static void display2() throws Exception // �����Ͽ��� => ���߿� ȣ��ÿ� ó�� �Ѵ� 
 *        {
 *        }
 *        public static void main(String[] arg) throws Exception
 *                                              ================= ȸ��
 *        {
 *             display1(); // ����ó���� ���� �ʰ� ����ص� ������ ����,���� 
 *             try
 *             {
 *               display2(); // ����ó�� ���� �ʰ� ����ϸ� ������ �߻��Ѵ� 
 *             }catch(Exception ex){}
 *        }
 */
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
	}

}
