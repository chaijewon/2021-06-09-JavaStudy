/*
 *   2.	100~999 ������ 4�ǹ���� �ƴ� ���� ����,���� ����ϴ� ���α׷� �ۼ�
 */
public class ����2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int sum=0;
        int count=0;
        for(int i=100;i<=999;i++)
        {
        	if(i%4!=0)
        	{
        		sum+=i;
        		count++;
        	}
        }
        System.out.println("��:"+sum);
        System.out.println("����:"+count);
        
        ����1.display();
	}

}
