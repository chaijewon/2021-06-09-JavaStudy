// 1~100������ ���� 
public class �ڹٹݺ���2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 1. 1~100���� ���� ������ ���� (���� ����)
		int sum=0; // ������ => 1
		// ¦����,Ȧ���� ,���� 
		int even=0,odd=0;
		for(int i=1;i<=100;i++)// 1~100���� �ݺ� 
		{
			sum+=i; // sum=sum+i
			//System.out.println("i="+i+",sum="+sum);
			if(i%2==0)
				even+=i;
			else
				odd+=i;
		}
		System.out.println("1~100������ ��:"+sum);
		System.out.println("1~100������ ¦�� ��:"+even);
		System.out.println("1~100������ Ȧ�� ��:"+odd);
		
		// 1~100���� 3�ǹ�� , 5��� , 7�� ����� ���� 
		int count3=0,count5=0,count7=0;
		for(int i=1;i<=100;i++)
		{
			// 3�� ������ count3++
			if(i%3==0)  // 15 21
				count3++;
			// 5�� ������ count5++
			if(i%5==0) // 15
				count5++;
			// 7�� ������ count7++
			if(i%7==0) // 21
				count7++;
		}
		System.out.println("1~100���� 3�� ����� ����:"+count3);
		System.out.println("1~100���� 5�� ����� ����:"+count5);
		System.out.println("1~100���� 7�� ����� ����:"+count7);
		
	}

}





