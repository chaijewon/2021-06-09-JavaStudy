import java.util.Arrays;

public class 배열활용_최대최소값 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr=new int[10];
        // 값 대입
        for(int i=0;i<arr.length;i++)
        {
        	arr[i]=(int)(Math.random()*100)+1; // 1~100사이의 정수 대입
        }
        System.out.println(Arrays.toString(arr));
        
        int max=arr[0];
        int min=arr[0];
        
        for(int i:arr)
        {
        	if(max<i) // 저장된 데이터중에 큰값이 있으면 변경
        		max=i;
        	if(min>i) // 저장된 데이터중에 작은 값일때 변경 
        		min=i;
        }
        
        System.out.println("최대값:"+max);
        System.out.println("최소값:"+min);
	}

}
