package com.sist.main;
/*
 *   예외처리 => 예상되는 에러를 복구해서 사용이 가능 (정상적으로 수행이 가능)
 *   예)
 *      사용자로부터 정수를 받아서 
 *      배열에 저장한 다음에 두개정수를 나눈값을 출력 
 *      =========                =====
 *      배열은 인덱스 초과           사용자가 0으로 나눠달라
 *      ==============           ==================
 *      catch절 2개가 있다 ==> try한개에 catch절 여러개 사용이 가능 
 *             계층구조 
 *             =======
 *                      Object
 *                        |
 *                      Throwable
 *                        |
 *                    =============
 *                    |           |
 *                  Error      Exception (처리가 가능한 부분)
 *                                |
 *                          ===============================
 *                          | 반드시 예외처리                 |
 *                        (컴파일에러)                  (실행시에러)
 *                                                   RuntimeException
 *                                                         |
 *                                                         ArrayIndexOutOfBoundsException
 *                                                         ArithmeticException
 *                                                         NumberFormatException
 *      try
 *      {
 *          
 *      }catch(ArrayIndexOutOfBoundsException) 배열은 인덱스 초과
 *      {
 *      
 *      }catch( ArithmeticException) 사용자가 0으로 나눠달라
 *      {
 *          
 *      }
 *      
 *      try
 *      {
 *      }catch(RuntimeException) 배열은 인덱스 초과,사용자가 0으로 나눠달라
 *      {
 *      }
 *      
 *      ========================================================
 *      try
 *      {
 *      }catch(Exception) 배열은 인덱스 초과,사용자가 0으로 나눠달라 (예외와 관련된 모든 예외를 받을 수 있다)
 *      {
 *      }
 *      =========================================================
 *      
 *      try
 *      {
 *      }catch(Throwable) 배열은 인덱스 초과,사용자가 0으로 나눠달라
 *      {
 *      }
 *      
 *      =====
 *      try
 *      {
 *          정상 수행이 가능한 소스코딩(평상시 코딩)
 *      }catch(ArrayIndexOutOfBoundsException) // 배열
 *      { 
 *      }catch(ArithmeticException) // 나누기
 *      {
 *      }catch(Exception) // 기타
 *      {
 *      }
 *      
 *      try
 *      {
 *          정상 수행이 가능한 소스코딩(평상시 코딩)
 *      }catch(Exception) // 기타  =============================> 문법상 오류 
 *      {
 *      }
 *      catch(ArrayIndexOutOfBoundsException) // 배열
 *      { 
 *      }catch(ArithmeticException) // 나누기
 *      {
 *      }
 *      ==> catch에 설정하는 예외처리 종류는 순서가 있다 (작은것==> 큰것으로) => 계층구조 
 *      
 *      => try~catch에 실행 순서 
 *      try
 *      {
 *         1. 문장  = 정상
 *         2. 문장  = 정상
 *         3. 문장  = 정상
 *         4. 문장  = 정상
 *         5. 문장  = 정상  ==> catch를 통과해서 수행
 *      }
 *      catch(Exception e)
 *      {
 *          6. 문장
 *      }
 *      7. 문장
 *      =========================> 1,2,3,4,5,7문장 수행
 *      
 *      try
 *      {
 *         1. 문장  = 정상
 *         2. 문장  = 정상
 *         3. 문장  = 정상
 *         ===========================================================
 *         4. 문장  = 오류발생 ==> catch이동 
 *         5. 문장  = 정상  ===> catch이동했기 때문에 수행이되는 문장이 아니다 
 *         =========================================================== 제외(Jump)
 *      }
 *      catch(Exception e)
 *      {
 *          6. 문장 ==> 에러 복구 ==> 에러(수정위치 확인)
 *          ==> 에러메세지 출력 
 *              ============
 *               getMessage() => /zero
 *               printStackTrace() => 에러 위치 확인 (권장)
 *      }
 *      7. 문장
 *      =========================> 1,2,3,6,7문장 수행후 종료
 */
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1.문장");
		System.out.println("2.문장");// 예외와 관련이 없다 (무조건 수행하는 문장)
		try
		{
			System.out.println("3.문장");
			int[] arr={10,5};
			System.out.println(arr[0]/arr[1]);// 에러발생 => 배열의 범위 초과 
			System.out.println(Integer.parseInt("30"));// 정수형 변환이 안됨
			MainClass2 m=new MainClass2();// new를 이용해서 저장공간을 만든다 (null 저장공간이 없는 상태)
			System.out.println(m.toString());
			Object obj=new Object(); // Object obj=new MainClass2()
			m=(MainClass2)obj;
			System.out.println(m);
			//형변환시에는 반드시 생성자가 동일해야 된다 
			System.out.println("정상수행 => catch절은 수행하지 않는다");
		}
		// RuntimeException : 실행시 에러 => RuntimeException
		// catch절은 1개만 수행 => switch,다중조건문과 비슷하다
		
		catch(ArrayIndexOutOfBoundsException e)// 배열 범위를 초과 했을 경우만 수행 
		{
			System.out.println("배열 범위 초과 예러 발생");
		}catch(ArithmeticException e)// 0으로 나눌 경우만 수행
		{
			System.out.println("0으로 나눌 수 없다");
		}catch(NumberFormatException e)// 문자열을 정수형으로 변경이 안될 경우 "aaa" "A" "30"(O)
		{
			System.out.println("정수 변환이 안되는 에러");
		}catch(NullPointerException e)// 객체주소나 배열의 주소가 없는 경우 
		{
			System.out.println("객체나 배열의 주소가 없는 에러");
		} 
	    /*catch(ClassCastException e)// 클래스 형변환 문제 
		{
	       System.out.println("클래스 형변환 에러 발생"); 
	    }*/
			 
		/*
		 * catch(RuntimeException e)// 기타 에러 (예상을 못한 에러를 처리) { // 밑에 있는 모든 예외를 처리할 수 있는
		 * 클래스 System.out.println("기타 에러 처리"); }
		 */
		System.out.println("프로그램 종료");

	}

}







