/*
 *     �������� => && , || 
 *       => ����� ==> boolean (true/false)
 *    
 *       ����)
 *            ���� && ����   ,  ���� || ���� 
 *     ====================================
 *                          &&       ||
 *     ====================================
 *      true true          true     true
 *     ====================================
 *      true false         false    true
 *     ====================================
 *      false true         false    true
 *     ====================================
 *      false false        false    false 
 *     ====================================
 *     
 *     => �������� (ȿ������ ������ �Ѵ�)
 *                 ===========
 *                 
 *        &&�� �������� false�� Ȯ���� �ִ� ������ ��� 
 *              (false) && (����)
 *              =======    =====(ó������ �ʴ´�)
 *        ||�� �������� true     
 */
public class �ڹٿ�����_�������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=10;
        int b=9;
        boolean bCheck=(a<b) || (++b==a);
        System.out.println(bCheck);
        System.out.println(b);
	}

}
