import java.util.*;
public class �ڹ����_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        outer:
        while(true)
        {
        	System.out.print("���� �Է�:");
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
        System.out.println("���α׷� ����!!");
	}

}
