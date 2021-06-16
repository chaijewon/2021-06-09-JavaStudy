/*
 *    161 page 중첩 for (이중 for)
 *    형식)
 *               1     2 => false 전체 종료 
 *          for(초기값;조건식;증가식)  =====> 줄수
 *          {
 *                     | true  
 *                   3    4 => false
 *                              6
 *             for(초기값;조건식;증가식) ====> 데이터 출력 
 *             {  
 *                     | true 
 *                 반복 실행문장  5
 *             }
 *          }
 *          
 *          구구단 
 *          =====
 *          2*1=2 3*1=3 4*1=4 .... 9*1=9
 *          2*2=4 ..................
 *          ...
 *          ...
 *          ...
 *          2*9=18                 9*9=81
 *          ================================= 줄수 (9)
 *             ==> 2차 for ==> 2~9
 *             
 *          *****  가로 (2차)
 *          *****
 *          *****
 *          *****     => 1~4
 *          세로(1차)
 *          
 *          ★☆★☆★☆★☆★☆
 *          ★☆★☆★☆★☆★☆
 *          ★☆★☆★☆★☆★☆
 *          ★☆★☆★☆★☆★☆
 *          ★☆★☆★☆★☆★☆
 *          
 *          ABCD
 *          ABCD
 *          ABCD
 *          ABCD
 *          ======
 *          ABCD
 *          EFGH
 *          IJKL
 *          MNOP
 *         
 */
public class 자바제어문_반복문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*for(int i=1;i<=9;i++)
        {
        	for(int j=2;j<=9;j++)
        	{
        		// 구구단 출력 (한줄)
        		System.out.printf("%d * %d = %2d\t",j,i,j*i);
        	}
        	System.out.println();
        }*/
		/*for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=10;j++)
			{
				if(j%2==0)
				  System.out.print("☆");
				else
				  System.out.print("★");
			}
			System.out.println();
		}
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("★☆★☆★☆★☆★☆");
		}*/
		/*
		 *  A
		 *  AB
		 *  ABC
		 *  ABCD
		 */
		
		for(int i=1;i<=4;i++)
		{
			char c='A';
			for(int j=1;j<=i;j++)
			{
				System.out.print(c++);
			}
			System.out.println();
		}
		/*
		 *   ABCD
 *           EFGH
 *           IJKL
 *           MNOP
		 */
	}

}




