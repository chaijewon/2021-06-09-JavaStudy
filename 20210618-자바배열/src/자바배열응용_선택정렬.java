import java.util.Arrays;

/*
 *    40 50 10 20 30   ===> 50 40 30 20 10(DESC) , 10 20 30 40 50(ASC)
 *                          ��������                     �ø�����          ==>  ==> < >
 *                          
 *    ���� ���� 
 *    =======
 *    40 50 10 20 30
 *    == ==
 *    50 40
 *    ==    ==
 *    50    10
 *    ==       ==
 *    50       20 
 *    ==          ==  1round (for�� 1����)
 *    50          30
 *    ===================================
 *    50 40 10 20 30
 *       == ==
 *       40 10
 *       ==    ==
 *       40    20
 *       ==       ==  2round
 *       40       30
 *    ====================================
 *    50 40 10 20 30
 *          == ==
 *          20 10
 *          ==    ==
 *          30    20  3round
 *    ====================================
 *    50 40 30 10 20
 *             == ==
 *             20 10  4round
 *    ====================================
 *    50 40 30 20 10  
 *    
 */
public class �ڹٹ迭����_�������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // �迭 5�� ���� 
		int[] arr=new int[5]; // ������ 5�� ������ �� �ִ� ���� 
		// ��������� ������ ä��� 
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1; // 1~100 ������ ������ ���� 
		}
		//��� 
		System.out.println("===== ���� �� =====");
		System.out.println(Arrays.toString(arr));// �迭��ü�� �����͸� ����ϴ� ��� 
		System.out.println("===== ���� �� =====");
		/*for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				// ���ڸ� ���ؼ� ��ȯ 
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}*/
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		for(int i=arr.length-1;i>=0;i--)// �迭�� �ڿ������� ��� 
		{
			System.out.print(arr[i]+" ");
		}
	}

}


















