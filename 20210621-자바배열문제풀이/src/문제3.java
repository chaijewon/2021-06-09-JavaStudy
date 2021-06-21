/*
 *   3.	1~30 짝수합,홀수합을 출력하는 프로그램을 작성
 */
public class 문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int even=0,odd=0;
        for(int i=1;i<=30;i++)
        {
        	if(i%2==0)
               even+=i;
        	else
        		odd+=i;
        }
        System.out.println("짝수합:"+even);
        System.out.println("홀수합:"+odd);
        
        // 4.	1~100 3의 배수이고 5의 배수를 출력하는 프로그램 작성
        for(int i=1;i<=100;i++)
        {
        	if(i%3==0 && i%5==0)
        	{
        		System.out.print(i+" ");
        	}
        }
        
        //5.	1~1000까지에서 7의 배수의 합 ,9의 배수의 합
        int sum7=0;
        int sum9=0;
        for(int i=1;i<=1000;i++)
        {
        	if(i%7==0)
        		sum7+=i;
        	if(i%9==0)
        		sum9+=i;
        }
        System.out.println();
        System.out.println("7의 배수 합:"+sum7);
        System.out.println("9의 배수 합:"+sum9);
        System.out.println("총합:"+(sum7+sum9));
        
        // 6.	10~99까지 정수중에 같은 자리의 정수를 출력하시오
        for(int i=10;i<=99;i++)
        {
        	if(i%11==0)
        	{
        		System.out.print(i+" ");
        	}
        }
        System.out.println();
        // 7.	정수 입력을 받아서 60이상 합격 =>불합격  if~else
        int no=(int)(Math.random()*101); //0~100
        if(no<60)
        {
        	System.out.println(no+"점은 불합격");
        }
        else
        {
        	System.out.println(no+"점은 합격");
        }
	}

}
