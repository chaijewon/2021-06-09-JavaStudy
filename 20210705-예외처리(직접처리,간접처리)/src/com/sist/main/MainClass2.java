package com.sist.main;
/*
 *   ����ó�� => ����Ǵ� ������ �����ؼ� ����� ���� (���������� ������ ����)
 *   ��)
 *      ����ڷκ��� ������ �޾Ƽ� 
 *      �迭�� ������ ������ �ΰ������� �������� ��� 
 *      =========                =====
 *      �迭�� �ε��� �ʰ�           ����ڰ� 0���� �����޶�
 *      ==============           ==================
 *      catch�� 2���� �ִ� ==> try�Ѱ��� catch�� ������ ����� ���� 
 *             �������� 
 *             =======
 *                      Object
 *                        |
 *                      Throwable
 *                        |
 *                    =============
 *                    |           |
 *                  Error      Exception (ó���� ������ �κ�)
 *                                |
 *                          ===============================
 *                          | �ݵ�� ����ó��                 |
 *                        (�����Ͽ���)                  (����ÿ���)
 *                                                   RuntimeException
 *                                                         |
 *                                                         ArrayIndexOutOfBoundsException
 *                                                         ArithmeticException
 *                                                         NumberFormatException
 *      try
 *      {
 *          
 *      }catch(ArrayIndexOutOfBoundsException) �迭�� �ε��� �ʰ�
 *      {
 *      
 *      }catch( ArithmeticException) ����ڰ� 0���� �����޶�
 *      {
 *          
 *      }
 *      
 *      try
 *      {
 *      }catch(RuntimeException) �迭�� �ε��� �ʰ�,����ڰ� 0���� �����޶�
 *      {
 *      }
 *      
 *      ========================================================
 *      try
 *      {
 *      }catch(Exception) �迭�� �ε��� �ʰ�,����ڰ� 0���� �����޶� (���ܿ� ���õ� ��� ���ܸ� ���� �� �ִ�)
 *      {
 *      }
 *      =========================================================
 *      
 *      try
 *      {
 *      }catch(Throwable) �迭�� �ε��� �ʰ�,����ڰ� 0���� �����޶�
 *      {
 *      }
 *      
 *      =====
 *      try
 *      {
 *          ���� ������ ������ �ҽ��ڵ�(���� �ڵ�)
 *      }catch(ArrayIndexOutOfBoundsException) // �迭
 *      { 
 *      }catch(ArithmeticException) // ������
 *      {
 *      }catch(Exception) // ��Ÿ
 *      {
 *      }
 *      
 *      try
 *      {
 *          ���� ������ ������ �ҽ��ڵ�(���� �ڵ�)
 *      }catch(Exception) // ��Ÿ  =============================> ������ ���� 
 *      {
 *      }
 *      catch(ArrayIndexOutOfBoundsException) // �迭
 *      { 
 *      }catch(ArithmeticException) // ������
 *      {
 *      }
 *      ==> catch�� �����ϴ� ����ó�� ������ ������ �ִ� (������==> ū������) => �������� 
 *      
 *      => try~catch�� ���� ���� 
 *      try
 *      {
 *         1. ����  = ����
 *         2. ����  = ����
 *         3. ����  = ����
 *         4. ����  = ����
 *         5. ����  = ����  ==> catch�� ����ؼ� ����
 *      }
 *      catch(Exception e)
 *      {
 *          6. ����
 *      }
 *      7. ����
 *      =========================> 1,2,3,4,5,7���� ����
 *      
 *      try
 *      {
 *         1. ����  = ����
 *         2. ����  = ����
 *         3. ����  = ����
 *         ===========================================================
 *         4. ����  = �����߻� ==> catch�̵� 
 *         5. ����  = ����  ===> catch�̵��߱� ������ �����̵Ǵ� ������ �ƴϴ� 
 *         =========================================================== ����(Jump)
 *      }
 *      catch(Exception e)
 *      {
 *          6. ���� ==> ���� ���� ==> ����(������ġ Ȯ��)
 *          ==> �����޼��� ��� 
 *              ============
 *               getMessage() => /zero
 *               printStackTrace() => ���� ��ġ Ȯ�� (����)
 *      }
 *      7. ����
 *      =========================> 1,2,3,6,7���� ������ ����
 */
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1.����");
		System.out.println("2.����");// ���ܿ� ������ ���� (������ �����ϴ� ����)
		try
		{
			System.out.println("3.����");
			int[] arr={10,5};
			System.out.println(arr[0]/arr[1]);// �����߻� => �迭�� ���� �ʰ� 
			System.out.println(Integer.parseInt("30"));// ������ ��ȯ�� �ȵ�
			MainClass2 m=new MainClass2();// new�� �̿��ؼ� ��������� ����� (null ��������� ���� ����)
			System.out.println(m.toString());
			Object obj=new Object(); // Object obj=new MainClass2()
			m=(MainClass2)obj;
			System.out.println(m);
			//����ȯ�ÿ��� �ݵ�� �����ڰ� �����ؾ� �ȴ� 
			System.out.println("������� => catch���� �������� �ʴ´�");
		}
		// RuntimeException : ����� ���� => RuntimeException
		// catch���� 1���� ���� => switch,�������ǹ��� ����ϴ�
		
		catch(ArrayIndexOutOfBoundsException e)// �迭 ������ �ʰ� ���� ��츸 ���� 
		{
			System.out.println("�迭 ���� �ʰ� ���� �߻�");
		}catch(ArithmeticException e)// 0���� ���� ��츸 ����
		{
			System.out.println("0���� ���� �� ����");
		}catch(NumberFormatException e)// ���ڿ��� ���������� ������ �ȵ� ��� "aaa" "A" "30"(O)
		{
			System.out.println("���� ��ȯ�� �ȵǴ� ����");
		}catch(NullPointerException e)// ��ü�ּҳ� �迭�� �ּҰ� ���� ��� 
		{
			System.out.println("��ü�� �迭�� �ּҰ� ���� ����");
		} 
	    /*catch(ClassCastException e)// Ŭ���� ����ȯ ���� 
		{
	       System.out.println("Ŭ���� ����ȯ ���� �߻�"); 
	    }*/
			 
		/*
		 * catch(RuntimeException e)// ��Ÿ ���� (������ ���� ������ ó��) { // �ؿ� �ִ� ��� ���ܸ� ó���� �� �ִ�
		 * Ŭ���� System.out.println("��Ÿ ���� ó��"); }
		 */
		System.out.println("���α׷� ����");

	}

}







