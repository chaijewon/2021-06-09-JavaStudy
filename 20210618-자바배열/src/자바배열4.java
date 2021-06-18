// 문자열배열 
// 컴퓨터 ==> 사용자 (가위 바위 보) 
import java.util.Scanner;
public class 자바배열4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 배열없이 사용
		// 1. 컴퓨터가 가위(0) 바위(1) 보(2) 결정
		int com=(int)(Math.random()*3); //0,1,2
		
		// 2.사용자 
		Scanner scan=new Scanner(System.in);
		System.out.print("가위(0),바위(1),보(2):");
		int user=scan.nextInt();
		
		/*if(com==0)
			System.out.println("컴퓨터:가위");
		else if(com==1)
			System.out.println("컴퓨터:바위");
		else if(com==2)
			System.out.println("컴퓨터:보");
		
		if(user==0)
			System.out.println("사용자:가위");
		else if(user==1)
			System.out.println("사용자:바위");
		else if(user==2)
			System.out.println("사용자:보");*/
		// 배열이용
		String[] s={"가위","바위","보"};
		System.out.println("컴퓨터:"+s[com]);
		System.out.println("사용자:"+s[user]);
	}

}
