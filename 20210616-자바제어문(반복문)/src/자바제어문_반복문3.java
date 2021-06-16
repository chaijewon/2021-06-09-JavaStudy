/*
 *   A
 *   AB
 *   ABC
 *   ABCD
 *   
 *    i     j
 *   줄수   알파벳
 *    1      1 (A)
 *    2      2 (AB)
 *    3      3 (ABC)
 *    4      4 (ABCD)   i=j  ==> j=i
 *    
 *    for(int i=1;i<=4;i++)
 *    {
 *       for(int j=1;j<=i;j++)
 *       
 *       System.out.println()
 *    }
 *    
 *    ====================
 *    i=1  A  j=1 for(int j=1;j<=1;j++)
 *    ====================
 *    i=2  AB     for(int j=1;j<=2;j++)
 *    ====================
 *    i=3  ABC    for(int j=1;j<=3;j++)
 *    ====================
 *    i=4  ABCD   for(int j=1;j<=4;j++)
 *    ====================
 *    
 *    *
 *    **
 *    ***
 *    ****
 *    *****
 *    ******
 *    ********
 */
public class 자바제어문_반복문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c='A';
        for(int i=1;i<=4;i++)
        {
        	
        	for(int j=1;j<=i;j++)
        	{
        		System.out.print(c++);
        	}
        	System.out.println();
        }
        c='A';
        for(int i=1;i<=4;i++)
        {
        	for(int j=1;j<=5-i;j++)
        	{
        		System.out.print(c++);
        	}
        	System.out.println();
        }
	}
	/*
	 *   ABCD
	 *   EFG
	 *   HI
	 *   J
	 *   
	 *   줄수 (i)   알파벳(j) => j가 역순이면 +
	 *     1          4
	 *     2          3
	 *     3          2
	 *     4          1
	 *         i+j=5     ==> j=5-i
	 */
     
     
}
