package com.sist.exception;
/*
 *    try~catch 
 *    �޼ҵ�() throws ����  ==> ��� ����ó�� Ŭ���� => Exception
 *    
 *    ��)
 *        void display() throws IOException,SQLException,....
 *                              =========================
 *                              CheckException => �����Ͻÿ� ����ó�� Ȯ�� (�ݵ�� ����ó���ؾ� �ȴ�)
 *                                IOException : ���� 
 *                                SQLException : ����Ŭ 
 *                                MalformedURLException : ��Ʈ��ũ 
 *                                InterruptedException : ������
 *                                ClassNotFoundException : ��Ű�� 
 *                                
 *                              UnCheckException 
 *                              ================
 *                               RuntimeException : java(�����=>�ҽ��� ���پ� �о ����:����������)
 *                                  |
 *                                  ArithmathException
 *                                  NumberFormatException
 *                                  NullPointerException
 *                                  ClassCastException
 *                                  ArrayIndexOutOfBoundsException
 *                                  =============================== ����ó���� ���� �� �� �ִ�
 *                                  �ʿ��Ҷ� ����ó���� �Ѵ� (���ֿ��� �߻��ϴ� ����=����ó���� �� �� �ִ�)
 *        
 *        => ȣ���ϴ� �޼ҵ忡�� ó�� 
 *        public static void main(String[] arg)
 *        {
 *           display(); ==> ���� �߻� 
 *        }
 *        
 *        public static void main(String[] arg) throws IOException,SQLException,....
 *        {
 *           display();  
 *        }
 *        
 *        public static void main(String[] arg) throws Exception
 *        {
 *           display();  
 *        }
 *        
 *        public static void main(String[] arg)
 *        {
 *          try
 *          {
 *           display();  
 *          }catch(IOException e){}
 *           catch(SQLException e){}
 *           ..
 *           ..
 *        }
 *        
 *        public static void main(String[] arg)
 *        {
 *          try
 *          {
 *           display();  
 *          }catch(Exception e){}
 *           
 *        }
 *        
 *        * �޼ҵ� �ڿ� ����ó���� ����Ǿ� ������ 
 *           1) ���α׷��Ӱ� �ٽ� ���� �� �� �ִ� 
 *           2) ���� ó���� ��� �� �� �ִ� 
 *           ***** �ݵ�� ����ó���� ��� �ؾ� �ȴ� 
 *        * ���ܰ� ������ �ִ� ��쿡�� ū ����ó���� ó���� �����ϴ� 
 *                                ========= Throwsable(Error , Exception) , Exception 
 */
public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
