import java.util.Arrays;

/*
 *   8.	int[] num = { 94, 85, 95, 88, 90 };

        다음 배열에서 최대값,최소값을 출력하는 프로그램을 작성하시오



    9.	정수를 10개 저장하는 배열을 만들고 1에서 10까지 범위의 정수를 랜덤하게 생성하여 
        배열에 저장하라. 그리고 배열에 든 숫자들과 평균을 출력하라.

 */
public class 문제4 {

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
        System.out.println("최대값:"+max+",최소값:"+min);
        
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
        System.out.printf("평균:%.2f\n",(sum/10.0));
	}

}










