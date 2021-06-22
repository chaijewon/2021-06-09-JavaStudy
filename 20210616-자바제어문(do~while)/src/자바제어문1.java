/*
 *    do~while : 조건을 나중에 검색 => 실행문장을 한번 이상 수행 
 *    형식)
 *         초기값   =========  1
 *         do
 *         {
 *             실행문장 ===== 2
 *             증가식  ====== 3
 *         }while(조건식);=== 4 ==> false면 종료 , true면 => 2번 실행문장으로 이동
 *     
 *    
 */
public class 자바제어문1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int i=1;
        while(i>=10)
        {
        	System.out.println("Hello While");
        }
        
        do
        {
        	System.out.println("Hello Do~While");
        }while(i>=10);*/
		int i=1;
		do
		{
			// 1~10까지 출력 
			System.out.println("i="+i);
			i++;
		}while(i<=10);
		/*
		 *    i=1 ==> (i=1)
		 *    i++; 2<=10
		 *    ============= 1round
		 *    i=2 ==> (i=2)
		 *    i++;  3<=10
		 *    =============
		 *    i=3 ==> (i=3)
		 *    i++;  4<=10
		 *    =============
		 *    ...
		 *    ...
		 *    ...
		 *    i=10 ==> (i=10)
		 *    i++; 11<=10 => false => 종료
		 *    
		 */
		System.out.println("=============");
		i=1;
		while(i<=10)
		{
			System.out.println("i="+i);
			i++;
		}
		/*
		 *   i=1  ==> 1<=10 true ==> i=1 ==> i++ (2)
		 *   i=2  ==> 2<=10 true ===> i=2 ==> i++ (3)
		 *   i=3 
		 *   i=4
		 *   i=5 
		 *   ...
		 *   ...
		 *   i=10 ==> 10<=10 true ==> i=10 ==> i++ (11)
		 *   i=11 ==> 11<=10 false ==> 종료 
		 *   
		 *   "10,00"  
		 */
		int a=10;
		if(a!=10);
		{
			System.out.println("Hello!!");
		}
	}

}






