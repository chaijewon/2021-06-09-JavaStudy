package com.sist.exception;
/*
 *    try~catch 
 *    메소드() throws 선언  ==> 모든 예외처리 클래스 => Exception
 *    
 *    예)
 *        void display() throws IOException,SQLException,....
 *                              =========================
 *                              CheckException => 컴파일시에 예외처리 확인 (반드시 예외처리해야 된다)
 *                                IOException : 파일 
 *                                SQLException : 오라클 
 *                                MalformedURLException : 네트워크 
 *                                InterruptedException : 쓰레드
 *                                ClassNotFoundException : 패키지 
 *                                
 *                              UnCheckException 
 *                              ================
 *                               RuntimeException : java(실행시=>소스를 한줄씩 읽어서 번역:인터프리터)
 *                                  |
 *                                  ArithmathException
 *                                  NumberFormatException
 *                                  NullPointerException
 *                                  ClassCastException
 *                                  ArrayIndexOutOfBoundsException
 *                                  =============================== 예외처리를 생략 할 수 있다
 *                                  필요할때 예외처리를 한다 (자주에러 발생하는 구역=예외처리를 할 수 있다)
 *        
 *        => 호출하는 메소드에서 처리 
 *        public static void main(String[] arg)
 *        {
 *           display(); ==> 오류 발생 
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
 *        * 메소드 뒤에 예외처리가 선언되어 있으면 
 *           1) 프로그래머가 다시 선언 할 수 있다 
 *           2) 직접 처리후 사용 할 수 있다 
 *           ***** 반드시 예외처리후 사용 해야 된다 
 *        * 예외가 여러개 있는 경우에는 큰 예외처리로 처리가 가능하다 
 *                                ========= Throwsable(Error , Exception) , Exception 
 */
public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
