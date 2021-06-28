// 변수 초기화 
/*
 *    class A
 *    {
 *       ===========
 *        변수 => 초기화 (시작값을 지정)
 *        = 명시적 초기화
 *        = 구현후에 값 초기화 
 *          = 생성자
 *          = 초기화 블록 
 *       ===========
 *    }
 *    
 *    boolean bCheck=false;
 *    for(int i=1;i<=10;i++)
 *    {
 *       if(i%2==0)
 *       {
 *          bCheck=true; =. 2,4,6,8,10
 *          break;
 *       }
 *       
 *    }
 */
/*
 *    구성 요소 
 *    =======
 *     멤버변수 : 데이터 저장  
 *     메소드  : 저장된 데이터 가공 
 *     생성자  : 메모리 할당 => 데이터베이스 연결 (자바 <===> 오라클)
 */
import java.util.Scanner;
public class 변수초기화3 {
	String[] data=new String[10];
	
	// 멤버변수 초기화 블록  => 자동호출 (명시적 초기화 => 초기화 블록 => 생성자 (특별한 경우가 아니면 생성자를 이용한다)
	{
	   	data[0]="홍길동";
	   	data[1]="심청이";
	   	data[2]="춘향이";
	   	data[3]="박문수";
	   	data[4]="이순신";
	   	data[5]="김두한";
	   	data[6]="을지문덕";
	   	data[7]="강감찬";
	   	data[8]="이산";
	   	data[9]="소서노";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 출력 => 반드시 메모린에 저장 
		변수초기화3 a=new 변수초기화3();// a.data
		// 출력 
		for(String name:a.data)
		{
			System.out.println(name);
		}
		System.out.println("==========");
		Scanner scan=new Scanner(System.in);
		System.out.print("이름 입력:");
		String n=scan.next();
		// 이름이 있는 경우에는 이름을 출력 , 없는 경우는 이름이 없다 => 홍길동,심청이
		boolean bCheck=false;
		for(String name:a.data)
		{
			if(n.equals(name))
			{
				System.out.println("찾은 이름:"+name);// 1번 수행
				bCheck=true;
				
			}
			
			else { System.out.println("찾는 이름이 없습니다"); bCheck=false;}//9번 수행 //break; }
			 
		}
		
		if(bCheck==false)
		{
			System.out.println("찾는 이름이 없습니다");
		}
	}

}











