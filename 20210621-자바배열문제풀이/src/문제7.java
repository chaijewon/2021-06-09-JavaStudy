import java.util.Arrays;

// ���� ���� 10�� �Է¹޾� �迭�� �����ϰ�, �迭�� �ִ� ���� �߿��� 3�� ����� ����ϴ� ���α׷��� �ۼ��϶�

public class ����7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr=new int[5];
        for(int i=0;i<arr.length;i++)
        {
        	arr[i]=(int)(Math.random()*100)+1;//1~100
        }
        System.out.println(Arrays.toString(arr));
        boolean bCheck=false;
        for(int i:arr)
        {
        	if(i%3==0)
        	{
        	  System.out.print(i+" ");
        	  bCheck=true;
        	}
        }
        if(!bCheck)
        	System.out.println("3�� ����� �����ϴ�");
	}

}
