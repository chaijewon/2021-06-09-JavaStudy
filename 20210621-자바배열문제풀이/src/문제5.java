import java.util.Arrays;
/*
 *   51   34   65   29   39
 *   ==   ==
 *   34   51
 *   ==        ==
 *   34        65
 *   ==             ==
 *   29             34
 *   ==                  ==
 *   29                  39
 *   ==================================
 *   29   51   65   34   39
 *        ==   ==
 *        51   65
 *        ==        ==
 *        34        51
 *        ==             ==
 *        34             39
 *   ==================================
 *   29   34  65  51  39
 *            ==  ==
 *            51  65
 *            ==      ==
 *            39      51
 *   ==================================
 *   29  34 39  65  51
 *              ==  ==
 *              51  65
 *   ==================================
 *   29  34  39  51  65
 *   select sort => 선택정렬
 *        
 */
public class 문제5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr=new int[5];
        for(int i=0;i<arr.length;i++)
        {
        	arr[i]=(int)(Math.random()*100)+1;
        }
        System.out.println("정렬 전:"+Arrays.toString(arr));
        /*Arrays.sort(arr);// 올림차순 
        System.out.println("정렬 후:"+Arrays.toString(arr));
        for(int i=arr.length-1;i>=0;i--)
        {
        	System.out.print(arr[i]+" ");
        }*/
        for(int i=0;i<arr.length-1;i++)
        {
        	for(int j=i+1;j<arr.length;j++)
        	{
        		if(arr[i]>arr[j])
        		{
        			int temp=arr[i];
        			arr[i]=arr[j];
        			arr[j]=temp;
        		}
        	}
        }
        System.out.println("정렬 후:"+Arrays.toString(arr));
	}

}
