/*
 * 8) 2+4+6+....100������ ������ ���� ���ϰ� ����϶� (for ���)
   For(int i=2;i<=100;i+=2)

 */
public class ����8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int sum=0;// ���� ���� => �ݵ�� 0���� �ʱ�ȭ 
        for(int i=2;i<=100;i+=2)
        {
        	sum+=i;
        }
        System.out.println("sum="+sum);
	}

}
