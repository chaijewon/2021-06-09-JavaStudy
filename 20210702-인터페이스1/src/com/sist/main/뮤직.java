package com.sist.main;
/*
 *   ������ 
 *   ã��
 *   �󼼺��� 
 *   ��)
 *       �ǹ� 
 *       ���߱Ⱓ 6����
 *       ===========
 *       1. ����(�䱸���׺м�) : 3���� ==> ���� (�ڹ� �ڵ� : �������̽�) => �����ȵ� �޼ҵ尡 �ִ� 
 *       2. �����ͺ��̽� ����(����) : 1����
 *       3. ȭ�� UI : 15��
 *       4. ���� : 1����
 *       5. �׽�Ʈ ���� : 15�� 
 *       ===================================== 6���� �ϼ� 
 *   ���α׷� 
 *     ���谡 �ϼ�
 *   1. ���߱Ⱓ�� ���� 
 *   2. ��� ������ => �������̽��� ��� �޼ҵ带 ���� (�޼ҵ���� ����) => ǥ��ȭ 
 *                   => �ҽ��� ����ȭ 
 *   3. ���� �ٸ� Ŭ������ ������ �� �ִ� ���� (������) ==> 390page 
 *      int i=1;
 *      while(i<=10)
 *      {
 *        System.out.pritnln(i);
 *        i++;
 *      }
 *      
 *      int i=1;
 *      do
 *      {
 *         System.out.pritnln(i);
 *         i++;
 *      }while(i<=10);
 *      
 *      for(int i=1;i<=10;i++)
 *      {
 *         System.out.pritnln(i);
 *      }
 *      
 *    4. ����)
 *       public interface �������̽���
 *       {
 *          (public static final) int a=10;
 *                                      == ���� �Է� (����=>���) 
 *                                      => �ڽ��� �޸� �Ҵ��� �Ұ��� (�ν��Ͻ������� ����)
 *           (public abstract) void method��(�Ű�����...);
 *                   =========                        == ���� �Ѵ� (������Ǵ� �޼ҵ�)
 *                                                    ������ ������ Ʋ�� �� �� �ִ�
 *           JDK 1.8 ���� 
 *             => ������ �޼ҵ� ����� ���� 
 *             public default void method��(){}
 *                    =======
 *             public static void method��(){}
 *                    ======
 *                                     
 *       }
 *    5. ��Ӱ��� 
 */
public interface ���� {
  public void musicAllData() throws Exception;
  public void musicFind(int a);
  public void musicDetail(int a);
}








