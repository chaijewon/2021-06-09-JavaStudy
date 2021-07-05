package com.sist.main;
/*
 *   => 자바에서 지원하는 error메세지 
 *      getMessage() : 문자열로만 표시 
 *      printStackTrace() : 실행되는 처리 과정을 보여준다
 *   => 멀티 catch
 *      catch(NumberFormatException | ArrayIndexOutOfBoundsException e) => 동시 처리 
 *      => 예외처리를 한번에 처리 할 경우에는 가장 큰 예외 처리 클래스 이용 
 *         catch(Exception e) => 예외처리 전체를 복구 가능 
 *         catch(Throwable e) => Exception전체,Error전체를 복구 할 수 있다
 *         
 *     A.java  =========== A.class ========== 실행
 *              javac                 java
 *              =====                 =====
 *              컴파일시                런타임 (실행시마다 처리 ==> 필요할때 예외처리)
 *              => 반드시 예외처리를 한다
 *              => 컴파일시에 컴파일러가 감시(예외처리를 사용했는지 확인)
 *              => 네트워크 , 쓰레드 , IO , 오라클 연동 
 *                                 =============== 웹 
 */
public class MainClass3 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		int a=10;
        int b=3;
        int c=a/b;// 오류 발생 ==> catch (catch수행후 점프)
        System.out.println("c="+c);// 수행을 못하는 문장
        /*try
        {
            int a=10;
            int b=0;
            int c=a/b;// 오류 발생 ==> catch (catch수행후 점프)
            System.out.println("c="+c);// 수행을 못하는 문장
            
        }catch(ArithmeticException e)
        {
        	//System.out.println(e.getMessage());
        	e.printStackTrace();
        }*/
	}

}
