import java.util.Arrays;

/*
 *   8.	int[] num = { 94, 85, 95, 88, 90 };

        ���� �迭���� �ִ밪,�ּҰ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�



    9.	������ 10�� �����ϴ� �迭�� ����� 1���� 10���� ������ ������ �����ϰ� �����Ͽ� 
        �迭�� �����϶�. �׸��� �迭�� �� ���ڵ�� ����� ����϶�.

 */
public class ����4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] num=new int[10];
        for(int i=0;i<num.length;i++)
        {
        	num[i]=(int)(Math.random()*100)+1;
        }
        
        int max=num[0];
        int min=num[0];
        for(int i:num)
        {
        	if(max<i)
        		max=i;
        	if(min>i)
        		min=i;
        }
        
        System.out.println(Arrays.toString(num));
        System.out.println("�ִ밪:"+max+",�ּҰ�:"+min);
        
        int[] arr=new int[10];
        for(int i=0;i<arr.length;i++)
        {
        	arr[i]=(int)(Math.random()*10)+1;
        }
        int sum=0;
        for(int i:arr)
        {
        	sum+=i;
        }
        System.out.println(Arrays.toString(arr));
        System.out.printf("���:%.2f\n",(sum/10.0));
	}

}










