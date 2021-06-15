/*
 *   선택문 (다중조건문) : 여러개가 동시에 수행이 가능 
 *       => 값 1개를 선택 (게임=> 키보드 값) => VK_UP , VK_DOWN
 *       => 페이지 이동 
 *       형식)
 *            switch(값) ==> 1) 정수 , 2) 문자 , 3) 문자열
 *            {
 *               경우의 수:
 *               case 레벨:
 *                   실행문장 1;
 *               case 레벨:
 *                   실행문장 2;
 *               ...
 *               ...
 *               default:
 *                   실행문장 n
 *            }
 *            
 *            
 *            
 *            int a=5;
 *            switch(a)
 *            {
 *              case 1: ==> :(클론) , ;(새미클론: 문장이 끝났을 경우) , case 뒤에 라벨은 중복할 수 없다
 *                문장1                => 사용할 수 있는 값 (정수,문자,문자열)
 *                종료 => break        => 문장 수행후에 종료하고 싶은 경우에는 반드시 break;
 *              case 2:
 *                문장2
 *                break
 *              case 3:
 *                문장3
 *                break
 *              case 4:
 *                문장4
 *                break
 *              case 5:
 *                문장5
 *                break
 *              default;  ==> 생략이 가능 
 *                문장6
 *            }
 *            
 *            ==> 문장 1,2,3,4,5,6
 *            
 *   조건문 
 *       => 값 1개를 선택 , 범위를 지정할 수 있다
 */
public class 자바선택문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 100 => 100/10 ==> 10,9,.....0
		// if(a==1 || a==2) case 1: case 2:처리
        int a=2;
        switch(a)
        {
          case 1:
        	  //break; // switch를 종료 
          case 2:
        	  System.out.println("1을 선택...");
        	  System.out.println("2를 선택...");
        	  break;
          case 3:
        	  System.out.println("3을 선택...");
        	  break;
          default:
        	  System.out.println("선택한 수가 없다..");
        }
	}

}






