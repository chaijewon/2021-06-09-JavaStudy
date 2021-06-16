// 163 page => 사용자 입력 받아서 => 입력수 만큼 ★을 출력 
import java.util.Scanner;
public class 자바제어문_반복문4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 1. Scanner 생성 => 키보드로 입력된 값을 읽어서 => 메모리에 저장 
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");//사용자가 입력후 enter=> 값을 읽어 온다 
		int n=scan.nextInt(); // 입력된 데이터를 읽어 온다 
		for(int i=1;i<=n;i++) // 줄수 (세로)
		{
			for(int j=1;j<=n-i;j++) // 가로 (실제 데이터 출력 위치)
			{
				System.out.print("★");
			}
			System.out.println();
		}
	}

}
