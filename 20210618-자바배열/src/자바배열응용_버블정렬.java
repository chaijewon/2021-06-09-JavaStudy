import java.util.Arrays;

/*
 *      버블 정렬 (뒤에서부터 고정)  
 *      ASC
 *      
 *      30 20 40 50 10
 *      == ==
 *      20 30
 *         == ==
 *         30 40
 *            == ==
 *            40 50
 *               == ==
 *               10 50       i=0 j=4
 *      ===================
 *      20 30 40 10 50 
 *      == ==
 *      20 30
 *         == ==
 *         30 40
 *            == ==
 *            10 40          i=1 j=3
 *      ===================
 *      20 30 10 40 (50)
 *      == ==
 *      20 30   
 *         == ==
 *         10 30             i=2  j=2
 *      ====================
 *      20 10 (30,40,50)
 *      == ==
 *      10 20                i=3 j=1
 *      ====================
 *      10 20 30 40 50
 *      
 *      
 *      i  j
 *      0  4
 *      1  3
 *      2  2
 *      3  1    ==> i+j=4 ==> j=4-i
 *                             ==
 *                             arr.length-1
 *                             
 *                  [55, 39, 18, 38, 40]
 *                  ===  ==
 *                   55  39
 *                       ==  ==
 *                       39  18
 *                           ==  ==
 *                           38  18
 *                               ==  ==
 *                               40  18   === [55, 39, 38, 40, 18]
===== 정렬후 출력 ===== 
[55, 39, 38, 18, 40]
[55, 39, 38, 40, 18]
[55, 39, 40, 38, 18]
[55, 40, 39, 38, 18]
[55, 40, 39, 38, 18]
 */
public class 자바배열응용_버블정렬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr=new int[5];
        // 초기값
        for(int i=0;i<arr.length;i++)
        {
        	arr[i]=(int)(Math.random()*100)+1;
        }
        // 정렬전에 저장된 데이터 출력 
        System.out.println(Arrays.toString(arr));
        System.out.println("===== 정렬후 출력 =====");
        for(int i=0;i<arr.length-1;i++)
        {
        	for(int j=0;j<arr.length-1-i;j++)
        	{
        		if(arr[j]<arr[j+1])
        		{
        			int temp=arr[j];
        			arr[j]=arr[j+1];
        			arr[j+1]=temp;
        			
        			 System.out.println(Arrays.toString(arr));
        		}
        	}
        }
        System.out.println(Arrays.toString(arr));
	}

}







