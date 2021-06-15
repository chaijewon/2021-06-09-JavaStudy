// 계절 => 3 => 봄 (계절을 알려주는 프로그램)
/*
 *   345 : 봄 
 *   678 : 여름 
 *   91011: 가을 
 *   12 1 2: 겨울 
 */
import java.util.Scanner;
public class 자바선택문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 1. 입력값을 받는다 
		Scanner scan=new Scanner(System.in);
		System.out.print("월 입력:");
		int a=scan.nextInt();
		switch(a)
		{
		case 3:case 4:case 5:
			System.out.println("봄입니다");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름입니다");
			break;
		case 9: case 10: case 11:
			System.out.println("가을입니다");
			break;
		case 12: case 1: case 2:
			System.out.println("겨울입니다");
            break;			
		}
	}

}














