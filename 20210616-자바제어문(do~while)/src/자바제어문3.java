/*
 *   �ݺ���� : �ݺ����� �����ϴ� ���α׷� 
 *             ======
 *             1. �ݺ����� �ߴ� => break
 *             2. �ݺ������� Ư���κ� ���� => continue
 *   *** ������ : break,continue�� �Ҽ� �ݺ����� ���� �� �� �ִ� 
 *   outer:
 *   for(int i=1;i<=5;i++)
 *   {
 *      for(int j=1;j<=5;j++)
 *      {
 *          if(j==3)
 *             break; ==> 2�� for�� ���� 
 *          if(j==5)
 *             break outer;
 *      }
 *   } 
 *     
 */
public class �ڹ����3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for1:
        for(int i=1;i<=5;i++)
        {
        	for2:
        	for(int j=1;j<=5;j++)
        	{
        		/*if(j==3)
        			break for2;*/
        		if(j==3)
					/* break for1; */
        			continue;// ������ ==> j++ (4...)
        		System.out.println("i="+i+",j="+j);
        	}
        }
        /*
         *   i=1 j=1
         *       j=2
         *       j=3//���� 
         *       j=4
         *       j=5
         *   ========
         *   i=2 j=1
         *       j=2
         *       
         *   i=3 j=1
         *       j=2
         *       
         *   i=4 j=1
         *       j=2
         *       
         *   i=5 j=1
         *       j=2
         *       
         */
	}

}












