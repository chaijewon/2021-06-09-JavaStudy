package com.sist.exception;

public class MainClass3 {
	/*
	 *   NumberFormatException,ArithmeticException,NullPointerException ���� 
	 *   => ó�� �ñ�  : display�� ȣ�� �Ҷ� ó�� 
	 *      try
	 *      {
	 *         display()
	 *      }catch(Exception e){}
	 *      
	 *      ���߿� ó���Ѵ� 
	 *      void main() throws NumberFormatException,ArithmeticException,NullPointerException
	 *      {
	 *      }
	 *   
	 */
	// ���ܸ� ���� (throws) ==> ������ �޼ҵ� ȣ��ÿ� ó�� 
	/*
	 *    �޼ҵ� ȣ��ÿ� ó�� 
	 *      = ���� => �ٽ� ȣ��ÿ� ó�� => throws
	 *      = ����ó���ؼ� ���         => try~catch
	 *      = ����Ǵ� ������ ������ �ִ� ��� ==> Exception���� ó�� �� �� �ִ�
	 *      = ����ÿ��� ����ó�� ������ �������� �ʴ´� 
	 *      = ���̺귯������ ����ó���� �����ϰ� �ִ� 
	 *        =======
	 *         ���̺귯�� ���ÿ� try~catch , throws (���� => ������ �ȵȴ� , ���� ����� ���� �ϴ�)
	 *                        =========== catch���� ���� ���� (�������̸� try~catch��� ����)
	 */
    public void display() throws NumberFormatException,ArithmeticException,NullPointerException
    ,Exception
    {
    	System.out.println("Hello");
    }
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
        MainClass3 m=new MainClass3();
        m.display();
        // NumberFormatException,ArithmeticException,NullPointerException 
        // RuntimeException => ������ ���� �ϴ� 
       /* try
        {
           m.display();
        }catch(NumberFormatException e) {}
        catch(ArithmeticException e) {}
        catch(NullPointerException e) {}
        catch(Exception e) {} // ��Ƽ catch
       
        try
        {
           m.display();
        }catch(Exception ex) {}
        
        try {
			m.display();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        
			try {
				m.display();
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ArithmeticException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NullPointerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
		
	}

}







