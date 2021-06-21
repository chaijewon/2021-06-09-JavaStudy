import java.util.Arrays;

// 양의 정수 10개 입력받아 배열에 저장하고, 배열에 있는 정수 중에서 3의 배수만 출력하는 프로그램을 작성하라

public class 문제7 {

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
        	System.out.println("3의 배수가 없습니다");
	}

}
