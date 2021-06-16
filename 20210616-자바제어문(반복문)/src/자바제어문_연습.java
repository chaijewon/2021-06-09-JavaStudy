import java.util.*;
public class 자바제어문_연습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        outer:
        while(true)
        {
        	System.out.print("정수 입력:");
        	int num=scan.nextInt();
        	for(int i=1;i<=num;i++)
        	{
        		if(num==10)
        			break;
        		if(num==11)
        			break outer;
        		
        		System.out.println("i="+i);
        	}
        }
        System.out.println("프로그램 종료!!");
	}

}
