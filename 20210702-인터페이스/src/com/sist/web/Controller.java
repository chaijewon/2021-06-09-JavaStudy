package com.sist.web;
/*
 *   메소드에 매개변수 
 *          ======
 *          일반 변수 (기본형) : Call by Value => 다른 메모리에 값을 전송 (복사)
 *          참조 변수 (배열 , 클래스) : 주소를 전송 (자체 주소를 변경해 준다) => Call by Reference
 *          메소드 처리 ==> 클래스는 매개변수 , 리턴형 (클래스 자체가 데이터형)
 *                                             ======
 *                                             사용자 정의 데이터형 (정수형,실수형)
 */
public interface Controller {
     public String handlerRequest(HttpRequest req,HttpResponse res);
     // 객체 전송 
}
