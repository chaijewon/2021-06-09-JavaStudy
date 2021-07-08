package com.sist.main;
/*
 *   라이브러리 => 수정이나 제작 (X) => 있는 그대로 사용 
 *   => 클래스명 
 *        메소드 ==> 리턴형 메소드명(매개변수)
 *        웹/앱
 *        ==== 데이터베이스
 *   Stack(LIFO) / Queue(FIFO)
 *   ===========   ============ 네트워크,운영체제
 *   메모리 
 *   
 *   ==> HashMap , HashSet 
 *       =======   ======== List에 값을 담아서 => 중복이 없는 데이터를 가지고 온다면 HashSet 
 *        = 클래스 관리 , 웹(70%)
 */
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Stack st=new Stack(); //add,clear,set,remove,get,size => 
        // 다음 = 구글 = 네이버 = 네이트 
        // 값 첨부 
        st.push("0");
        st.push("1");
        st.push("2");
        st.push("3");
        st.push("4");
        st.push("5");
        
        // 출력 ==> pop
        while(!st.empty())
        {
        	System.out.println(st.pop());
        }
        System.out.println("===== Queue======");
        Queue que=new LinkedList();
        que.offer("0");
        que.offer("1");
        que.offer("2");
        que.offer("3");
        que.offer("4");
        que.offer("5");
        while(!que.isEmpty())
        {
        	System.out.println(que.poll());
        }
	}

}















