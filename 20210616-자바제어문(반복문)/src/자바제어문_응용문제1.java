/*
 *    주사위 2개를 던진다 
 *    두개의 합이 6이 될 경우의 수를 출력  
 *             ==
 *             10이상
 */
public class 자바제어문_응용문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
        for(int i=1;i<=6;i++) // 1번째 주사위
        {
        	for(int j=1;j<=6;j++) // 2번째 주사위
        	{
        		//if((i+j)>=10)
        		//{
        			System.out.println("["+i+","+j+"]");
        			count++;
        		//}
        	}
        }
        System.out.println("경우의 수:"+count);
	}

}
