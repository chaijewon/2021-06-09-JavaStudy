import java.util.Arrays;

public class �迭Ȱ��_���հ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[5];// arr[0]~arr[4] => 0
		// ������ ������ �Է� 
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*101); //0~100������ ������ ���� ����
		}
        // ���� ����� �� Ȯ�� 
		System.out.println(Arrays.toString(arr));
		
		int total=0;
		double avg=0.0;
		// [20, 76, 70, 64, 3]
		// �����͸� �����ϴ� ���� �ƴ϶� �б� => for-each (�б� ����) => +=
		for(int i:arr) // ��(������=> �������� �ʰ� �ִ� �״�� ���,�����) => for-each
		{
			System.out.printf("i=%d,total=%d\n",i,total);
			total+=i; // total=total+i
			
		}
		/*
		 *    ����� ��û ==> (����):�ڹ� ========> ����� ���� ===> �������� ��¸� ���
		 */
		System.out.println("����:"+total);
		System.out.printf("���:%.2f\n",total/5.0);

	}

}
