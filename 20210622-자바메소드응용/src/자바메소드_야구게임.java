// �Է� 
import java.util.Arrays;
import java.util.Scanner;
/*
 *    �߱����� 
 *      1. ��ǻ�Ͱ� ���� ==> int[] com 
 *      2. ����� �Է� 
 *      3. �� 
 *      4. ��Ʈ 
 *      5. ���Ῡ�� Ȯ�� 
 */
public class �ڹٸ޼ҵ�_�߱����� {
	// ��ǻ�� ���� 
    static int[] getRand()
    {
    	int[] com=new int[3];
        int rand=0;
        
        boolean bCheck=false;
        for(int i=0;i<3;i++) // for => Ƚ���� ���� 
        {
        	bCheck=true;
        	while(bCheck) // Ƚ���� ���� ��� 
        	{
        		// ���� �߻�
        		rand=(int)(Math.random()*9)+1; // 1~9������ ���� �߻� 
        		// �ߺ��� �ȵ� ��� => while�� ���� 
        		bCheck=false;
        		// �ߺ����� Ȯ�� 
        		for(int j=0;j<i;j++)
        		{
        			if(com[j]==rand) // �迭�ȿ� ���� ���� ���� �Ǿ��ٸ� => �ٽ� ������ �߻��Ѵ� while=���ǽ� 
        			{
        				bCheck=true;
        				break;// for(int j=0;j<i;j++) => while������ ���ư��� 
        			}
        		}
        	}
        	// ����
        	com[i]=rand;
        }
    	return com;
    }
    // ����� �Է� 
    static int[] userInput()
    {
    	int[] user=new int[3];
    	Scanner scan=new Scanner(System.in);
        while(true)
        {
        	// �Է� ��û
        	System.out.print("���ڸ� ���� �Է�:");
        	int input=scan.nextInt();
        	// ���� ó�� 
        	if(input<100 || input>999)
        	{
        		System.out.println("�� ���ڸ� ������ �Է��ؾ� �մϴ�!!");
        		// while(true)�� �̵� 
        		continue; // for=> ������ , while=> ���ǽ� => ó������ �ٽ� ���� 
        	}
        	
        	// user[]�� ���� ====> 389/100 ==> 3
        	user[0]=input/100;
        	user[1]=(input%100)/10; // 389%100 ==> 89/10 => 8
        	user[2]=input%10; // 389%10 ==> 9
        	
        	// ���� ó�� => ���� �� �Է½� ����  
        	if(user[0]==user[1] || user[0]==user[2] || user[1]==user[2])
        	{
        		System.out.println("���� ���� �Է��� �� �����ϴ�!!");
        		continue; 
        	}
        	
        	if(user[0]==0 || user[1]==0 || user[2]==0)
        	{
        		System.out.println("0�� ����� �� �����ϴ�!!");
        		continue;
        	}
        	
        	break;
        }
        return user;
    }
    // �� 
    static int compare(int[] com,int[] user)
    {
    	int s=0,b=0; 
    	
    	for(int i=0;i<3;i++)
    	{
    		for(int j=0;j<3;j++)
    		{
    			if(com[i]==user[j]) // ���� ���� �ְ�
    			{
    				if(i==j) // ���� �ڸ� 
    				   s++;
    				else   // �ٸ� �ڸ��� ��� 
    				   b++;
    			}
    		}
    	}
    	// ��Ʈ
    	System.out.printf("Input Number:%d-%d-%d,Result:%dS-%dB\n",user[0],user[1],user[2],s,b);
    	
    	return s;
    }
    // ���� 
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
            	System.out.print("������ �ٽ� �ұ��?(y/n):");
            	char c=scan.next().charAt(0);
            	if(c=='y'||c=='Y')
            	{
            		System.out.println("������ �ٽ� �����մϴ�!!");
            		process();
            	}
            	else
            	{
            		System.out.println("Game Over!!");
                 	System.exit(0); // ���α׷� ����
            	}
             	
             }
         }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        process();
	}

}





