// 1.	100~999사이에 7의 배수의 갯수와 합을 출력하는 프로그램 작성
/*
 *   1. 변수 
 *      = 합 : 0
 *      = 갯수 : 0
 *      = 100~999 => 루프 => 100
 */
public class 문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int sum=0;
        int count=0;
        for(int i=100;i<=999;i++)
        {
        	if(i%7==0)
        	{
        	  sum+=i;
        	  count++;
        	}
        }
        System.out.println("합:"+sum);
        System.out.println("갯수:"+count);
	}

}
