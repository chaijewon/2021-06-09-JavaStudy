
public class ����4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0, i=1;
		while (i<100) {
		    if(i%3 != 0) {
		        i++;
		        continue;// while�� ���ǽ����� �̵� 
		    }
		    else sum += i;
		    i++;
		}
		/*int sum=0;
		for(int i=1;i<=100;i++)
		{
			if(i%3==0)
			{
				//break; ==> break�� continue�� �Ʒ� �ڵ��� �� �� ���� 
				sum+=i;
				
			}
		}
        System.out.println("1~100���� 3�� ����� ��:"+sum);*/
	}

}
