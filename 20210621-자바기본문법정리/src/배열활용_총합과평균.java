import java.util.Arrays;

public class 배열활용_총합과평균 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[5];// arr[0]~arr[4] => 0
		// 임의의 정수를 입력 
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*101); //0~100사이의 임의의 수를 대입
		}
        // 실제 저장된 값 확인 
		System.out.println(Arrays.toString(arr));
		
		int total=0;
		double avg=0.0;
		// [20, 76, 70, 64, 3]
		// 데이터를 변경하는 것이 아니라 읽기 => for-each (읽기 전용) => +=
		for(int i:arr) // 웹(브라우저=> 변경하지 않고 있는 그대로 출력,모바일) => for-each
		{
			System.out.printf("i=%d,total=%d\n",i,total);
			total+=i; // total=total+i
			
		}
		/*
		 *    사용자 요청 ==> (조작):자바 ========> 결과값 전송 ===> 브라우저는 출력만 담당
		 */
		System.out.println("총합:"+total);
		System.out.printf("평균:%.2f\n",total/5.0);

	}

}
