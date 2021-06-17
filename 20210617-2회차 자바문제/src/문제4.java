
public class 문제4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0, i=1;
		while (i<100) {
		    if(i%3 != 0) {
		        i++;
		        continue;// while의 조건식으로 이동 
		    }
		    else sum += i;
		    i++;
		}
		/*int sum=0;
		for(int i=1;i<=100;i++)
		{
			if(i%3==0)
			{
				//break; ==> break나 continue는 아래 코딩을 할 수 없다 
				sum+=i;
				
			}
		}
        System.out.println("1~100까지 3의 배수의 합:"+sum);*/
	}

}
