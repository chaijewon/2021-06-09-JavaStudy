/*
 *   1. 변수 (데이터 저장) ==> 변수 (데이터를 묶어서 사용:배열)
 *      배열 : 고정 , 같은 데이터형만 모아서 처리 => 클래스 (다른 데이터형)
 *      =======================================================
 *        메모리 저장 (한번 사용후 종료) ==> 파일 , RDBMS(오라클)(영구적인 저장 장치)
 *   2. 연산자 : 변경 (사항이 없다)
 *      단항연산자 
 *         ++,--(증감 연산자) , ! (부정) , (type) => 형변환 
 *         =====
 *         선증가(++a),후증가(a++) 
 *      이항연산자 
 *         산술연산자( + , - , * , / , % )
 *         비교연산자 ( == , != , < , > , <= ,>=) => true/false => if , for,while(조건식)
 *         논리연산자 (범위 , 기간) &&(포함),||(미포함)
 *         대입연산자 ( = , += , -= )
 *      삼항연산자 ( (조건)?값1:값2 )  ===> if~else
 *                =====
 *                 true : 값1
 *                 false : 값2
 *       *** 우선순위 ==> () 최우선순위 연산 
 *   3. 제어문 : 변경 사항이 없다 
 *      조건문 
 *        if : 단일 조건문 : 여러개 동시 수행이 가능 
 *        if~else : 선택조건문 
 *        if~ else if ~ else if ~ else : 다중 조건문  : 조건에 맞는 문장만 수행
 *      ***선택문 
 *        값 1개가 선택시에 처리 
 *        switch(문자,정수,문자열) ~ case ...
 *      반복문
 *        for ==> 2차 for => 반복 횟수가 있는 경우 
 *        while => 반복횟수가 없는 경우 (데이터베이스 연결)
 *      반복제어문
 *        break : 반복문장을 종료 
 *        continue : 특정부분을 제외 ==> 게임 (입력이 잘못된 경우=> 처음 상태)
 *   
 */
import java.util.Scanner;
public class 자바기본프로그램정리1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        // 변수 초기화 
        int score=0;
        while(true)// 무한 루프 
        {
        	System.out.print("0~100까지 사이의 점수 입력:");
        	score=scan.nextInt();
        	if(score<0 || score>100)
        	{
        		System.out.println("잘못된 입력입니다!!");
        		continue; 
        		/*
        		 *   1. for : 증가식으로 이동 
        		 *   2. while : 조건식으로 이동 
        		 */
        	}
        	break;
        }
        System.out.println("score="+score);
	}

}







