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
public class 배열활용_섞기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr=new int[10];
        // 값을 대입 (임의의 대입)
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
        // 대입된 값을 출력
        System.out.println(Arrays.toString(arr));
        
        for(int i=0;i<100;i++)
        {
        	int no=(int)(Math.random()*10);//0~9
        	int temp=arr[0]; // 배열이나 변수의 값을 변경하는 경우 (임시변수 설정)
        	arr[0]=arr[no];
        	arr[no]=temp;
        }
        System.out.println(Arrays.toString(arr));
	}

}
