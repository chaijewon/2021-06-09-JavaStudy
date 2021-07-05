package com.sist.exception;

public class MainClass3 {
	/*
	 *   NumberFormatException,ArithmeticException,NullPointerException 선언 
	 *   => 처리 시기  : display를 호출 할때 처리 
	 *      try
	 *      {
	 *         display()
	 *      }catch(Exception e){}
	 *      
	 *      나중에 처리한다 
	 *      void main() throws NumberFormatException,ArithmeticException,NullPointerException
	 *      {
	 *      }
	 *   
	 */
	// 예외를 선언 (throws) ==> 다음에 메소드 호출시에 처리 
	/*
	 *    메소드 호출시에 처리 
	 *      = 선언 => 다시 호출시에 처리 => throws
	 *      = 직접처리해서 사용         => try~catch
	 *      = 예상되는 에러가 여러개 있는 경우 ==> Exception으로 처리 할 수 있다
	 *      = 선언시에는 예외처리 순서가 존재하지 않는다 
	 *      = 라이브러리에서 예외처리를 선언하고 있다 
	 *        =======
	 *         라이브러리 사용시에 try~catch , throws (단점 => 복구가 안된다 , 정상 종료는 가능 하다)
	 *                        =========== catch에서 에러 복구 (가급적이면 try~catch사용 권장)
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
        // RuntimeException => 생략이 가능 하다 
       /* try
        {
           m.display();
        }catch(NumberFormatException e) {}
        catch(ArithmeticException e) {}
        catch(NullPointerException e) {}
        catch(Exception e) {} // 멀티 catch
       
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







