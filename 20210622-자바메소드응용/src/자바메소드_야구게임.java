// 입력 
import java.util.Arrays;
import java.util.Scanner;
/*
 *    야구게임 
 *      1. 컴퓨터가 난수 ==> int[] com 
 *      2. 사용자 입력 
 *      3. 비교 
 *      4. 힌트 
 *      5. 종료여부 확인 
 */
public class 자바메소드_야구게임 {
	// 컴퓨터 난수 
    static int[] getRand()
    {
    	int[] com=new int[3];
        int rand=0;
        
        boolean bCheck=false;
        for(int i=0;i<3;i++) // for => 횟수가 지정 
        {
        	bCheck=true;
        	while(bCheck) // 횟수가 없는 경우 
        	{
        		// 난수 발생
        		rand=(int)(Math.random()*9)+1; // 1~9사이의 난수 발생 
        		// 중복이 안된 경우 => while을 종료 
        		bCheck=false;
        		// 중복여부 확인 
        		for(int j=0;j<i;j++)
        		{
        			if(com[j]==rand) // 배열안에 같은 수가 저장 되었다면 => 다시 난수를 발생한다 while=조건식 
        			{
        				bCheck=true;
        				break;// for(int j=0;j<i;j++) => while문으로 돌아간다 
        			}
        		}
        	}
        	// 저장
        	com[i]=rand;
        }
    	return com;
    }
    // 사용자 입력 
    static int[] userInput()
    {
    	int[] user=new int[3];
    	Scanner scan=new Scanner(System.in);
        while(true)
        {
        	// 입력 요청
        	System.out.print("세자리 정수 입력:");
        	int input=scan.nextInt();
        	// 오류 처리 
        	if(input<100 || input>999)
        	{
        		System.out.println("☞ 세자리 정수만 입력해야 합니다!!");
        		// while(true)로 이동 
        		continue; // for=> 증가식 , while=> 조건식 => 처음부터 다시 실행 
        	}
        	
        	// user[]에 저장 ====> 389/100 ==> 3
        	user[0]=input/100;
        	user[1]=(input%100)/10; // 389%100 ==> 89/10 => 8
        	user[2]=input%10; // 389%10 ==> 9
        	
        	// 오류 처리 => 같은 수 입력시 오류  
        	if(user[0]==user[1] || user[0]==user[2] || user[1]==user[2])
        	{
        		System.out.println("같은 수는 입력할 수 없습니다!!");
        		continue; 
        	}
        	
        	if(user[0]==0 || user[1]==0 || user[2]==0)
        	{
        		System.out.println("0은 사용할 수 없습니다!!");
        		continue;
        	}
        	
        	break;
        }
        return user;
    }
    // 비교 
    static int compare(int[] com,int[] user)
    {
    	int s=0,b=0; 
    	
    	for(int i=0;i<3;i++)
    	{
    		for(int j=0;j<3;j++)
    		{
    			if(com[i]==user[j]) // 같은 수자 있고
    			{
    				if(i==j) // 같은 자리 
    				   s++;
    				else   // 다른 자리일 경우 
    				   b++;
    			}
    		}
    	}
    	// 힌트
    	System.out.printf("Input Number:%d-%d-%d,Result:%dS-%dB\n",user[0],user[1],user[2],s,b);
    	
    	return s;
    }
    // 종료 
    static boolean isEnd(int s)
    {
    	if(s==3)
    		return true;
    	
    	return false;
    }
    static void process()
    {
    	 int[] com=getRand();
         //System.out.println(Arrays.toString(com));
         while(true)
         {
             int[] user=userInput();
             int s=compare(com, user);
             boolean bCheck=isEnd(s);
             if(bCheck==true)
             {
            	Scanner scan=new Scanner(System.in);
            	System.out.print("게임을 다시 할까요?(y/n):");
            	char c=scan.next().charAt(0);
            	if(c=='y'||c=='Y')
            	{
            		System.out.println("게임을 다시 시작합니다!!");
            		process();
            	}
            	else
            	{
            		System.out.println("Game Over!!");
                 	System.exit(0); // 프로그램 종료
            	}
             	
             }
         }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        process();
	}

}





