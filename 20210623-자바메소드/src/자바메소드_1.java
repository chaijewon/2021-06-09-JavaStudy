import java.util.Arrays;

/*
 *    변수 => 변수 , 상수 , 배열
 *    메소드 : 동작 (목록출력 , 입력유도...) => 연산자 , 제어문 
 *    ================================== 클래스 (유지보수가 쉽게)
 *                                       ===================
 *                                       객체지향 프로그램 
 *                                       = 데이터 보호 (캡슐화)
 *                                       = 재사용 (상속)
 *                                       = 다형성(수정,추가)
 *    1. 사용자 정의
 *    2. 라이브러리 
 *    ============= 조립 
 *    ============================================ 프로그램이 종료하지 않게  정상상태 유지 (예외처리)
 *    
 *    메소드 VS 함수 : 한개의 작업을 수행하는 명령문의 집합 
 *                  ----------
 *                  => 메소드는 클래스 종속 : 자바,파이썬,코틀린 
 *                  => 독립적으로 생성 (함수) : C언어 , 파이썬 , 코틀린 
 *    1) 메소드의 구성요소 
 *       = 리턴형(처리 결과값:반드시 한개 사용) ====> 요청에 대한 결과값(응답)
 *       = 매개변수 : 0이상 ==================> 요청(클라이언트:user)
 *    2) 메소드의 형식 
 *       = 리턴형 메소드명(매개변수...) => 선언
 *         => 유저가 데이터 보내주면 처리후에 리턴값을 보내준다 
 *       = {
 *             구현부 
 *             ---
 *             ---
 *             ---
 *             결과값 도출 
 *             return 결과값; ==> 결과값이 없는 경우 (return 생략이 가능:컴파일러가 자동으로 추가)
 *             
 *         }
 *       = 메소드의 종료시점 ==> return이 있으면 종료 (return은 항상 마지막에 있는 것이 아니다,중간에 첨부)
 *       
 *       메소드()
 *       {
 *          if()
 *           return; 메소드 종료
 *          else
 *           return; 메소드 종료 
 *       }
 *       
 *       리턴형 메소드명(매개변수...) : 선언부
 *       {
 *           구현부 
 *           return 결과값 전송
 *       }
 *    3) 모든 프로그램 : 메소드가 4개
 *       = 입력 (변수의 초기화)
 *       = 처리 부분 
 *       = 출력 
 *       = main() => 프로그램의 시작점 (전체 메소드를 호출=메소드 조립)
 *       
 *    4) 메소드 종류 
 *       리턴형 / 매개변수 
 *        O       O      ===> String substring(int begin,int end)
 *                            String replace(char o,char n)
 *        O       X      ===> double random() , String trim()
 *            ===> 결과값을 받아서 전송(윈도우,웹,모바일)
 *        ==================================================================
 *        X       O      ===> void print(String s) : 결과값이 없는 경우 : void
 *                            void main(String[] a) 
 *        X       X      ===> void println() => 다음줄에 출력 
 *                            구구단 출력 
 *        ================================================================== 자체 처리 
 *         *** 메소드명은 소문자로 시작 
 *             단어가 2개 이상  : 첫자를 대문자, _
 *             boardList , boardDetail ,  board_list , board_detail , boardFind , board_find
 *             ==> 변수명 => 식별자과 동일 (문법)
 *    5) 메소드 호출 
 *       int input()
 *       {
 *          return 값(int)
 *       }
 *       
 *       ==> 호출 
 *           int a=input();
 *           === long, double, float ==> 전송값과 일치
 *                                       ========== boolean , String 
 *           String s="Hello";
 *           String s1="Hello Java" ==> s,s1=4byte  : 클래스의 객체 (주소)
 *       void display()
 *       {
 *       }
 *       
 *       => display();
 *       
 *       매개변수가 있는 경우 
 *       int add(int a,int b) => a=10, b=20
 *       {
 *           return a+b;
 *       }
 *       
 *       int res=add(10,20); 
 *           res=30
 *       ===================================
 *       * 한개의 클래스안에서 메소드명은 유일하다 
 *         예외) 매개변수의 갯수나 데이터형이 다르면 다른 메소드로 인식 
 *        class A
 *        {
 *            int add(int a,int b){}
 *            double add(double d1,double d2){}
 *            void add(String s1,String s2){}
 *            void add(int a,int b){} ==> 중복된 메소드
 *        }
 *        bus(좌석) , bus(고속엔진) , bus(마을) , bus(입석)
 *     ** 리턴형 => 정수 입력 => 정수 
 *                정수 여러개 => 배열 (결과값이 여러개) , 클래스
 *                영화제목 =>10  String[] 
 *                국어 점수 =>10  int[]
 *                평균 점수 => 10 double[]
 *                학점 =>10 char[]
 *     ** 매개변수 : 사용자 요청 
 *                 login => String id, String pwd
 *                 idcheck => String id 
 *                 우편번호 => String dong
 *                 평균(국어,영어,수학) => int kor,int eng,int math
 *                 *** 매개변수가 많은 경우(3개이상) => 1.배열(같은 데이터 여러개) , 
 *                                                2.클래스 (다른 데이터 여러개)
 *     ***** 첫번째 ==> 정수 5개를 넘겨주고 , 최대값,최소값
 *                    ================  ===========
 *                      매개변수              리턴형      
 *                 ==> 기능상 
 *                     정수 5개를 입력하는 기능
 *                     최소값 기능
 *                     최대값 기능  
 *                     출력  
 */
public class 자바메소드_1 {
    static int[] input()
    {
    	int[] arr=new int[5];
    	for(int i=0;i<arr.length;i++)
    	{
    		arr[i]=(int)(Math.random()*100)+1; // 1~100사이 => 5개 추출 
    	}
    	return arr;
    }
    static int max(int[] arr)
    {
    	int max=arr[0];
    	for(int i:arr) // arr안에서 실제 데이터를 한개씩 가지고 온다 
    	{
    		if(max<i)
    			max=i;
    	}
    	return max;
    }
    static int min(int[] arr)
    {
    	int min=arr[0];
    	for(int i:arr)
    	{
    		if(min>i)
    			min=i;
    	}
    	return min;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        /*int[] arr=input();
        System.out.println(Arrays.toString(arr));
        // 최대값
        int max=max(arr);
        // 최소값
        int min=min(arr);
        System.out.printf("최대값:%d,최소값:%d\n",max,min);*/
		int[] arr=new int[5];
    	for(int i=0;i<arr.length;i++)
    	{
    		arr[i]=(int)(Math.random()*100)+1; // 1~100사이 => 5개 추출 
    	}
    	
    	System.out.println(Arrays.toString(arr));
    	
    	int max=arr[0];
    	for(int i:arr) // arr안에서 실제 데이터를 한개씩 가지고 온다 
    	{
    		if(max<i)
    			max=i;
    	}
    	
    	int min=arr[0];
    	for(int i:arr)
    	{
    		if(min>i)
    			min=i;
    	}
    	
    	
    	System.out.printf("최대값:%d,최소값:%d\n",max,min);
	}

}








