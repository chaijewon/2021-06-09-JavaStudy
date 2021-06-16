/*
 *    1####
 *    #2###
 *    ##3##
 *    ###4#
 *    ####5
 */
public class 자바제어문_반복문5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 줄수 4줄
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==j)
					System.out.print("["+i+","+j+"]");
				else
					System.out.print("     ");
			}
			System.out.println();
		}
	}

}








