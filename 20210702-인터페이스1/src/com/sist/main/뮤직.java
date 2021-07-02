package com.sist.main;
/*
 *   목록출력 
 *   찾기
 *   상세보기 
 *   예)
 *       실무 
 *       개발기간 6개월
 *       ===========
 *       1. 설계(요구사항분석) : 3개월 ==> 설계 (자바 코딩 : 인터페이스) => 구현안된 메소드가 있다 
 *       2. 데이터베이스 설계(수집) : 1개월
 *       3. 화면 UI : 15일
 *       4. 구현 : 1개월
 *       5. 테스트 배포 : 15일 
 *       ===================================== 6개월 완성 
 *   프로그램 
 *     설계가 완성
 *   1. 개발기간이 단축 
 *   2. 모든 개발자 => 인터페이스에 등록 메소드를 구현 (메소드명이 동일) => 표준화 
 *                   => 소스의 통일화 
 *   3. 서로 다른 클래스를 연결을 해 주는 역할 (스프링) ==> 390page 
 *      int i=1;
 *      while(i<=10)
 *      {
 *        System.out.pritnln(i);
 *        i++;
 *      }
 *      
 *      int i=1;
 *      do
 *      {
 *         System.out.pritnln(i);
 *         i++;
 *      }while(i<=10);
 *      
 *      for(int i=1;i<=10;i++)
 *      {
 *         System.out.pritnln(i);
 *      }
 *      
 *    4. 형식)
 *       public interface 인터페이스명
 *       {
 *          (public static final) int a=10;
 *                                      == 값을 입력 (변수=>상수) 
 *                                      => 자신이 메모리 할당이 불가능 (인스턴스변수가 없다)
 *           (public abstract) void method명(매개변수...);
 *                   =========                        == 선언만 한다 (공통사용되는 메소드)
 *                                                    구현된 내용이 틀릴 수 도 있다
 *           JDK 1.8 변경 
 *             => 구현된 메소드 사용이 가능 
 *             public default void method명(){}
 *                    =======
 *             public static void method명(){}
 *                    ======
 *                                     
 *       }
 *    5. 상속과정 
 */
public interface 뮤직 {
  public void musicAllData() throws Exception;
  public void musicFind(int a);
  public void musicDetail(int a);
}








