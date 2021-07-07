package com.sist.util;
/*
 *   java.util
 *   =========
 *     날짜 , 변환 
 *     날짜 : Date , Calendar 
 *     변환 : ChiceFormat , MassageFormat
 *     자료구조 
 *             배열 : 고정적 , 컬렉션 : 가변형 
 *             Collection(데이터를 여러개 모아서 관리) = 배열에 대체
 *                |
 *         -------------------------
 *         |           |           |
 *       List         Set         Map (interface)
 *       List => 순서가 존재(인덱스번호) , 데이터를 중복해서 저장이 가능 
 *          => 구현된 클래스 
 *             ***ArrayList , LinkedList , Vector ====> Stack,Queue
 *       Set  => 순서가 없다 , 데이터 중복을 허용하지 않는다 
 *          => 구현된 클래스 
 *             ***HashSet , TreeSet
 *       Map  => 순서가 없다 , 데이터 쌍으로 저장 (key,value) ===> 발전 (JSON) : JSON:웹,앱통합 
 *          => 구현된 클래스 
 *             ***HashMap , Hashtable 
 *       
 *     문자분해 , 난수 
 *     문자분해 : StringTokenizer
 *     난수 : Random
 *     기타 : Scanner => IO (예외처리)
 *           ======= 사라진다 
 *     
 */
// 문자열 분해 : StringTokenizer ==> split
/*
 *    hasMoreToken() => nextToken() => countToken
 */
import java.util.*;// 생략이 가능한 import => java.lang
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String colors="red,blue,black,yellow,pink";
        StringTokenizer st=new StringTokenizer(colors,","); // 구분문자 : 생략하면  " "
        // 주의점 : 갯수를 벗어나면 오류난다  
        /*System.out.println(st.nextToken());
        System.out.println(st.nextToken());
        System.out.println(st.nextToken());
        System.out.println(st.nextToken());
        System.out.println(st.nextToken());*/
        System.out.println(st.countTokens());// 단어 갯수
        while(st.hasMoreTokens()) // 
        {
        	System.out.println(st.nextToken()); // 단어를 읽어 온다 
        }
        
        
	}

}









