import java.util.Scanner;
public class 자바메소드_호출_결과값 {
	// 메소드 처리는 한개의 기능만 처리가 가능하게 만든다 
    static boolean login(String id,String pwd)
    {
    	final String MID="admin";
    	final String MPWD="1234";
    	boolean bCheck=false;
    	
    	if(MID.equals(id) && MPWD.equals(pwd))
    	{
    		bCheck=true;
    	}
    	else
    	{
    		bCheck=false;
    	}
    	return bCheck;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 사용자로부터 입력값 받기
		Scanner scan=new Scanner(System.in);
		System.out.print("ID 입력:");
		String id=scan.next();
		
		System.out.print("비밀번호 입력:");
		String pwd=scan.next();
		
		//(int)(Math.random()*100);
		
		// 메소드를 통해서 결과값을 받는다 
		boolean check=login(id,pwd);
		if(check==true)
		{
			System.out.println("메인 화면으로 이동");
		}
		else
		{
			System.out.println("ID나 비밀번호가 틀립니다!!");
		}
		
	}

}
