import java.util.Arrays;

// 1~45 => �ߺ����� ���� 6�� 
public class �迭Ȱ��_�ߺ����³��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*int[] lotto=new int[6];
        for(int i=0;i<lotto.length;i++)
        {
        	lotto[i]=(int)(Math.random()*45)+1; //1~45�� ������ ���� ���� ����
        }
        System.out.println(Arrays.toString(lotto));*/
		// ������ �߻��ÿ� �ߺ�üũ�� ���� �ʴ´� 
		/*int[] arr=new int[10]; // 10=> arr.length
		System.out.println("�迭�� ����:"+arr.length);
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*10)+1;// 1~10
		}
		System.out.println(Arrays.toString(arr));*/
		int[] com=new int[6]; // ���� ���� (1~10 �ߺ����� ó��)
		boolean bCheck=false;
		/*
		 *     bCheck => false => com�迭 ���� 
		 *               true  => ������ �ٽ� �߻� (�ߺ��� ���� ���)
		 */
		int rand=0; // ���� �߻� 
		
		/*
		 *    i=0  ==> 
		 */
		for(int i=0;i<com.length;i++)
		{
			bCheck=true;
			
			while(bCheck)
			{
				rand=(int)(Math.random()*45)+1;
				bCheck=false; // for,while���� ������ ó������ ���� 
				for(int j=0;j<i;j++)
				{
					if(com[j]==rand)
					{
						bCheck=true;// while���� �ٽ� ���� ==> �ߺ��� ���� �ֱ� ������ 
						break; // �ڽ��� ����� �����Ѵ�  ==> for
					}
					
				}
			}
			// while���ᰡ �Ǹ� �ߺ��� ���� 
			com[i]=rand;
		}
		System.out.println(Arrays.toString(com));
		
	}

}









