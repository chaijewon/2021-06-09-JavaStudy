/*
 * 8) 2+4+6+....100까지의 정수의 합을 구하고 출력하라 (for 사용)
   For(int i=2;i<=100;i+=2)

 */
public class 문제8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int sum=0;// 누적 변수 => 반드시 0으로 초기화 
        for(int i=2;i<=100;i+=2)
        {
        	sum+=i;
        }
        System.out.println("sum="+sum);
	}

}
