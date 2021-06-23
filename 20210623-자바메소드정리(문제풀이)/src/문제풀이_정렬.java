import java.util.Arrays;

public class 문제풀이_정렬 {
    // 입력 
	static int[] rand()
	{
		int[] arr=new int[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		return arr;
	}
	// 정렬
	static int[] sortDesc(int[] arr)
	{
	
		 for(int i=0;i<arr.length-1;i++)
		 {
			 for(int j=i+1;j<arr.length;j++)
			 {
				 if(arr[i]<arr[j]) //DESC
				 {
					 int temp=arr[i];
					 arr[i]=arr[j];
					 arr[j]=temp;
				 }
			 }
		 }
		 return arr;
	}
	static int[] sortAsc(int[] arr)
	{
	
		 for(int i=0;i<arr.length-1;i++)
		 {
			 for(int j=i+1;j<arr.length;j++)
			 {
				 if(arr[i]>arr[j]) //DESC
				 {
					 int temp=arr[i];
					 arr[i]=arr[j];
					 arr[j]=temp;
				 }
			 }
		 }
		 return arr;
	}
	
	// 출력 
	static void print()
	{
		int[] arr=rand();
		System.out.println("정렬 전:");
		System.out.println(Arrays.toString(arr));
		System.out.println("내림차순 정렬 후:");
		int[] a=sortDesc(arr);
		System.out.println(Arrays.toString(a));
		System.out.println("올림차순 정렬 후:");
		int[] b=sortAsc(arr);
		System.out.println(Arrays.toString(b));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        print();
	}

}
