import java.util.Arrays;
/*
 *    int a=10;
 *    int b=20;
 *    
 *    a=b;  a=20
 *    b=a;  b=20
 *    ===========
 *    int temp=a;  temp=10
 *    a=b;  // a=20
 *    b=temp; // b=10
 */
public class �迭Ȱ��_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr=new int[10];
        // ���� ���� (������ ����)
        for(int i=0;i<arr.length;i++)
        {
        	//arr[i]=(int)(Math.random()*10); // 0~9
        	arr[i]=i;  
        }
        
        /*
         *   arr[0]
         *   arr[1]
         *   arr[2]
         *   ..
         *   arr[9999]
         */
        // ���Ե� ���� ���
        System.out.println(Arrays.toString(arr));
        
        for(int i=0;i<100;i++)
        {
        	int no=(int)(Math.random()*10);//0~9
        	int temp=arr[0]; // �迭�̳� ������ ���� �����ϴ� ��� (�ӽú��� ����)
        	arr[0]=arr[no];
        	arr[no]=temp;
        }
        System.out.println(Arrays.toString(arr));
	}

}
