/*
 *   프로젝트명: 마음대로...(자바X)
 *   클래스명: 문법 사항 , 약속 사항
 *     1. 문법 사항 
 *        = 알파벳,한글로 시작한다 (단 알파벳은 대소문자를 구분한다)
 *        = 숫자를 사용할 수 있다 (단 앞에 사용할 수 없다)
 *          1Main(X)  2Main(X) => Main1 Main2...
 *        = 특수문자 사용이 가능 ( _ , $ )
 *        = 키워드는 사용할 수 없다 (자바에서 사용되는 단어)
 *          => 이클립스에서 빨간색
 *     ==================================================
 *     2. 약속 사항 
 *        = 클래스명은 알파벳일 경우에 대문자로 시작 
 *        = 단어가 2개이상일 경우  첫번째 , 두번째 단어의 첫자를 대문자로 한다
 *          filename  => FileName
 *        = File_Name (_는 가급적이면 변수에 주로 사용)
 *        = _MainClass ( _ 임시 ) : 페어코딩 , 라이브코딩
 *        
 *     3. 데이터를 저장 
 *        ==========
 *                127            32767            21억 4천
 *        정수 : 1byte (byte) , 2byte(short) ,   4byte(int) , 8byte(long)
 *              =====   ===== 16  ===== 32      ====== 64
 *              0과1일 => 8개
 *              ===== bit
 *        실수 : float (소수점 6), double (소수점 15자리)
 *        문자 : char ( 65535 )
 *        논리 : true/false  ==> c/python ( 1, 0 )
 *        String : "Hello" =>문자 여러개 저장 
 *        
 *     4. 주의점 
 *        명령문 : 끝난 경우 => 반드시 ';'
 *     5.main이 없는 경우 
 *       화면에 출력 sysout => ctrl+space
 *     6. 파일저장명과 클래스명은 일치가 된다 
 *     
 *     ============================================
 *     자바에서 데이터 표현법 
 *     1) 정수
 *         = 2진법    0b1100
 *         = 8진법    010
 *         = 16진법   0xFF
 *         = 10진법   1100
 *     2) 문자 => 한글자사용 ==> ''  'A'
 *     3) 문자열 => "문자 여러개"
 *     ============================================
 *     
 *     실행                            class파일 로더
 *                                    데이터 저장 
 *                                    화면 출력   =========> JVM (자바 가상머신)
 *     A.java     =========  A.class  ========== 화면 출력 
 *                컴파일                   인터프리터  
 *                javac                  java
 *                
 *                구조 
 *                ===========
 *                  응용프로그램 (main있는 프로그램)
 *                ===========
 *                     | ==========> 가상머신 (자바시스템) ==> JDK를 설치하면 설치된다 
 *                ===========
 *                  운영체제 (window)
 *                ===========
 *        
 */
// mainClass MainClass Mainclass
/*
 *   ㅍ.ㅊ
 *   ㅊㅍㅊㅍㅊ
 */
// 

public class MainClass 
{
   public static void main(String[] args) {
	
   }
	/*
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * System.out.println(0xFF); }
	 */

}
