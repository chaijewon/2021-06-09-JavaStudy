/*
 *    141 page 다중 조건문 
 *    => if이 여러개 존재 => 수행은 1개만 수행 
 *    형식)
 *         if(조건문)
 *         {   ↓ true
 *             실행 문장 ==========> if문 종료 
 *             
 *         }        ↓ false
 *         else if(조건문)
 *         {        ↓ true
 *              true일때 수행하는 문장 ====> 문장 수행후에 종료 
 *                  
 *         }        ↓ false
 *         else if(조건문)
 *         {        ↓ true
 *              true일때 수행하는 문장 ====> 문장 수행후에 종료 
 *                  
 *         }        ↓ false
 *         ================
 *         else
 *         {
 *               조건중에 해당하는 조건이 없는 경우에 수행하는 문장 
 *         }
 *         ================ 조건에 해당되는 내용이 없는 경우 처리 (default)
 */
// 가위 바위 보 => 컴퓨터   ==> 0(가위) , 1(바위) , 2(보)  ==> 컴퓨터가 난수 
import java.util.Scanner;
public class 자바다중조건문1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 1. 컴퓨터가 가위바위보 
		int com=(int)(Math.random()*3); //0~2 사이의 정수를 발생 
		// 2. 사용자가 선택 
		Scanner scan=new Scanner(System.in); // 키보드 입력값을 받아서 메모리에 저장 
		System.out.print("가위(0),바위(1),보(2):");
		int user=scan.nextInt();
		/// 결과 (컴퓨터)
		if(com==0)
			System.out.println("컴퓨터:가위");
		else if(com==1)
			System.out.println("컴퓨터:바위");
		else
			System.out.println("컴퓨터:보");
		
		// 결과(사용자)
		if(user==0)
			System.out.println("Player:가위");
		else if(user==1)
			System.out.println("Player:바위");
		else if(user==2)
			System.out.println("Player:보");
		else
			System.out.println("Player는 게임을 포기 했습니다");
		
		// 게임 결과 
		if(user>2)
		{
			System.out.println("게임 종료 : 컴퓨터 Win!!!");
		}
		/*
		 *     컴퓨터는 숫자 
		 *     컴퓨터  =====================> user-com
		 *               사용자가 이기는 숫자 => 1, -2
		 *               컴퓨터가 이기는 숫자 => 2, -1
		 *               나머지는 0 (비겼다)
		 *       가위(0)
		 *              => 사용자 
		 *                 가위(0) => 비겼다   ==> 0
		 *                 바위(1) => 사용자   ==> 1
		 *                 보(2)   => 컴퓨터  ==> 2
		 *       바위(1)
		 *             => 사용자 
		 *                 가위(0) => 컴퓨터   ==> -1
		 *                 바위(1) => 비겼어   ==> 0
		 *                 보(2)   => 사용자   ==> 1
		 *       보(2)
		 *             => 사용자 
		 *                 가위(0)  => 사용자   ==> -2
		 *                 바위(1)  => 컴퓨터   ==> -1
		 *                 보(2)    => 비겼다   ==> 0
		 */
		else
		{
			// 정상 입력이 된 경우 
			int result=user-com;
			if(result==-1 || result==2)
			{
				System.out.println("컴퓨터 Win!!");
			}
			else if(result==1 || result==-2)
			{
				System.out.println("Player Win!!");
			}
			else
			{
				System.out.println("비겼다!!");
			}
		}
	}

}











