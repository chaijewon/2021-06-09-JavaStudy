// 1.	100~999���̿� 7�� ����� ������ ���� ����ϴ� ���α׷� �ۼ�
/*
 *   1. ���� 
 *      = �� : 0
 *      = ���� : 0
 *      = 100~999 => ���� => 100
 */
public class ����1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int sum=0;
        int count=0;
        for(int i=100;i<=999;i++)
        {
        	if(i%7==0)
        	{
        	  sum+=i;
        	  count++;
        	}
        }
        System.out.println("��:"+sum);
        System.out.println("����:"+count);
	}

}
