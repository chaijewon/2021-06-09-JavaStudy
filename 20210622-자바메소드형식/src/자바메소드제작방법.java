import java.util.Arrays;
// 249 page 
/*
 *    ���� 
 *    =====
 *    ������
 *    ��� 
 *    ===== �޼ҵ� 
 *    ============== ����+�޼ҵ�=Ŭ����  ==> ��Ű�� 
 *                       =====
 *                       = �̹� ������� �޼ҵ�(���̺귯��) => 
 *                       = ����� ����
 */

/*
 *     ���� ��� 
 *     = ������ (ó���� �����)
 *     = ����� ��û�� (�Ű�����) => �Ű����� ������ �ٸ� �� �ִ� 
 *     
 *     ������      �Ű�����
 *     =================
 *      O           O
 *      O           X
 *      X           O ==> �޼ҵ� ��ü���� ó��  ==> ������� �������� �ʴ´� (void)
 *      X           X ==> �޼ҵ� ��ü���� ó��  ==> ������� �������� �ʴ´� (void)
 *     
 *     ������ : �ݵ�� �Ѱ��� ���� ���
 *             
 *             ���ϰ� �޼ҵ��()
 *             {
 *                return ��  => ������ ���ÿ� => �迭,Ŭ����
 *             }
 *             �޼ҵ��(�Ű�����......) : �����Ű����� (...)
 *             
 *     ���� 
 *     1. ����ڷκ��� ���̵� �޾Ƽ� �ߺ�üũ�ϴ� ���  ==> �ߺ�üũ�� �ϴ� �޼ҵ�
 *     static  boolean idCheck(String id)  : �Ű����� , ������ => ����� �� 2���� ��� => boolean
 *     2. �������� ����ϴ� ��� ==> �޼ҵ� 
 *     static void gogudan() ==> �޼ҵ� ��ü ��� 
 *     3. ���� �������� �迭�� �޾Ƽ� �����ϴ� ���α׷�
 *     static int[] sort(int[] arr)  ===> ������,�Ű����� => �⺻�� , �迭 , Ŭ���� 
 *     4. �����ȣ�� ����ϴ� ��� 
 *     static String[] postfind(String dong) => �迭 
 *     5. �α����ϴ� ��� (���: 3���� => ID�� ���� ��� , Password�� Ʋ�� ���, �α��ε� ����)
 *     static String login(String id,String pwd) => int,String
 */
public class �ڹٸ޼ҵ����۹��{
    static int[] sort(int[] arr,int type)
    {
    	for(int i=0;i<arr.length-1;i++)
    	{
    		for(int j=i+1;j<arr.length;j++)
    		{
    		  if(type==0)
    		  {
    			if(arr[i]>arr[j])
    			{
    				int temp=arr[i];
    				arr[i]=arr[j];
    				arr[j]=temp;
    			}
    		  }
    		  else
    		  {
    			  if(arr[i]<arr[j])
      			  {
      				int temp=arr[i];
      				arr[i]=arr[j];
      				arr[j]=temp;
      			  }
    		  }
    		}
    	}
    	return arr;
    	//System.out.println("");
    }
	// �ٸ� Ŭ�������� �ʿ�ø��� ����� ���� (���뼺)
	static void gugudan()
	{
		        // ������ 
				for(int i=1;i<=9;i++)
				{
					for(int j=2;j<=9;j++)
					{
						System.out.printf("%2d * %2d = %2d\t",j,i,j*i);
					}
					System.out.println();
				}
				return;// ������ ���� => �޼ҵ� ���� => void���� return�� ���� ��쿡�� JVM�� �ڵ����� return
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //gugudan();
		int[] arr=new int[5];
		for(int i=0;i<5;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		
		System.out.println(Arrays.toString(arr));
		
		// ���ĵ� ������ �ޱ�
		int[] arr2=sort(arr,0);
		System.out.println(Arrays.toString(arr2));
		int[] arr3=sort(arr,1);
		System.out.println(Arrays.toString(arr3));
		//sort(arr);
		//System.out.println(Arrays.toString(arr));
		return;
	}

}






