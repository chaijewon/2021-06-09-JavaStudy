import java.util.Arrays;
import java.util.Scanner;
/*
 *    345
 *    => 389 => 1s
 *    => 839 => 1b
 *    => 3s=> ����
 */
public class �迭Ȱ��_�߱����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] com=new int[3]; // ���� (1~9������ �ߺ��� ���� ����=3���߻�)
        int[] user=new int[3];// ����� �Է� 
        //1. ���� 3�� �߻� 
        // = ������ �����ϴ� ���� 
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
        //System.out.println(Arrays.toString(com));
        //2. ��� �Է� 
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
        	// ��
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
        	System.out.printf("Input Number:%d,Result:%dS-%dB\n",input,s,b);
        	// ����?
        	if(s==3)
        	{
        		System.out.println("Game Over!!");
        		System.out.println("�߻��� ����:"+Arrays.toString(com));
        		break;// ���� 
        	}
        	
        }
        //3. �� 
        //4. ��Ʈ 
        //5. ���Ῡ�� Ȯ�� 
	}

}













