/*
 * 13) 1-2+3-4+5-6+7-8+9-10 ��� ���� for���� �̿��Ͽ� ����϶� 
 */
public class ����13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
        for(int i=1;i<=10;i++)
        {
        	if(i%2==0)
        		sum-=i;
        	else
        		sum+=i;
        }
        System.out.println("��� ���:"+sum);
	}

}
