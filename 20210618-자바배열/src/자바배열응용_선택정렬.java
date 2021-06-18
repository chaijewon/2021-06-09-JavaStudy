import java.util.Arrays;

/*
 *    40 50 10 20 30   ===> 50 40 30 20 10(DESC) , 10 20 30 40 50(ASC)
 *                          내림차순                     올림차순          ==>  ==> < >
 *                          
 *    선택 정렬 
 *    =======
 *    40 50 10 20 30
 *    == ==
 *    50 40
 *    ==    ==
 *    50    10
 *    ==       ==
 *    50       20 
 *    ==          ==  1round (for문 1바쿼)
 *    50          30
 *    ===================================
 *    50 40 10 20 30
 *       == ==
 *       40 10
 *       ==    ==
 *       40    20
 *       ==       ==  2round
 *       40       30
 *    ====================================
 *    50 40 10 20 30
 *          == ==
 *          20 10
 *          ==    ==
 *          30    20  3round
 *    ====================================
 *    50 40 30 10 20
 *             == ==
 *             20 10  4round
 *    ====================================
 *    50 40 30 20 10  
 *    
 */
public class 자바배열응용_선택정렬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 배열 5개 선언 
		int[] arr=new int[5]; // 정수를 5개 저장할 수 있는 공간 
		// 저장공간에 데이터 채우기 
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1; // 1~100 사이의 정수값 대입 
		}
		//출력 
		System.out.println("===== 정렬 전 =====");
		System.out.println(Arrays.toString(arr));// 배열자체의 데이터를 출력하는 방식 
		System.out.println("===== 정렬 후 =====");
		/*for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				// 숫자를 비교해서 교환 
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}*/
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		for(int i=arr.length-1;i>=0;i--)// 배열의 뒤에서부터 출력 
		{
			System.out.print(arr[i]+" ");
		}
	}

}


















