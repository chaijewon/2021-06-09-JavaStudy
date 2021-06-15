/*
 *   1. 국어,영어,수학 점수를 입력받아서  => Scanner => import java.util.Scanner
 *   2. 평균,총점출력 
 *   3. 학점 => 평균 : 90이상 A
 *                   80이상 B
 *                   70이상 C
 *                   60이상 D
 *                   60이하 F
 *                   ============= 다중조건 (단일조건)
 */
/*
 *    자바의 전체 구조 
 *    =============
 *    1. package => 폴더 소속 (경로) 
 *    2. import => 외부에 있는 자바파일 읽기(클래스) => 여러개 사용이 가능 
 *    3. public class ClassName
 *       {
 *           ==========================
 *               멤버변수 (전역변수) : 여러개 설정이 가능 
 *           ==========================
 *               기능 설정 (메소드) 
 *                 여러개 설정 
 *           ==========================
 *               변수에 대한 초기화 (생성자)
 *           ==========================
 *               public static void main(String[] args) {
 *                  절차적언어 : 한번 사용하고 버린다 
 *                    순차적으로 코딩...
 *               }
 *           ==========================
 *       }
 *       
 *       절차적 언어 
 *       =========
 *       물을 마시고 싶다 
 *       =============
 *        1. 삽을 든다 
 *        2. 땅을 판다
 *        3. 물을 마시고 
 *        4. 다른 땅을 판다
 *        
 *      물을 마시고 싶다 
 *      =============
 *       정수기 => 호수만 연결 
 *       
 *       하둡 : 만든사람의 아들의 장난감 이유
 */
import java.util.Scanner;
public class 자바제어문_조건문4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("국어 영어 수학 점수 입력(90 90 90):");
        int kor=scan.nextInt();
        int eng=scan.nextInt();
        int math=scan.nextInt();
        System.out.println("국어 점수:"+kor);
        System.out.println("영어 점수:"+eng);
        System.out.println("수학 점수:"+math);
        System.out.println("총점:"+(kor+eng+math));
        System.out.printf("평균:%.2f\n",(kor+eng+math)/3.0);
       
        /*
         *    "총점:"+80+90+70
         *    =========
         *    "총점:80"
         *           =====
         *           "총점:8090"
         *                =====
         *           "총점:809070"    
         *    문자열+any type(모든 데이터형)  ==> 문자열  
         *    ""
         *    any type(모든 데이터형)+문자열 ==> 문자열
         *    
         *    "총점:"+(80+90+70)
         *            =========
         *                1
         *        ====
         *         2
         */
        // 학점
        char score='A';
        int avg=(kor+eng+math)/3;
        // 90 90 90 => avg=90
        if(avg>=90 && avg<=100)   // 90>=90
        	score='A';
        
        if(avg>=80 && avg<90)   // 90>=80
        	score='B';
        
        if(avg>=70 && avg<80)
        	score='C';
        
        if(avg>=60 && avg<70)
        	score='D';
        
        if(avg<60)
        	score='F';
        
        System.out.println("학점:"+score+"학점");
        
	}

}






