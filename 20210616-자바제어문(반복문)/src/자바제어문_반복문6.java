/*
 *      *
 *     **
 *    ***
 *   ****
 *         i     j    k    
 *        �ټ�   ����  ��ǥ
 *         1     3    1
 *         2     2    2
 *         3     1    3
 *         4     0    4
 *        ==============
 *         i+j=4 => j=4-i   k=i
 *         for(int i=1;i<=4;i++)
 *         {
 *            ����  
 *            for(int j=1;j<=4-i;j++)   i=1 => j=3 , k=1
 *            {
 *               System.out.print(" ");
 *            }
 *            ��ǥ
 *            for(int k=1;k<=i;k++)
 *            {
 *               System.out.print("*");
 *            }
 *            System.out.println();
 *         }
 *  ========== 
 *   ****
 *    ***
 *     **
 *      *
 *          �ټ� (i)   ����(j)  ��ǥ(k)
 *           1          0       4
 *           2          1       3
 *           3          2       2
 *           4          3       1
 *           ============
 *             i=j+1 ==> j=i-1   i+k=5  => k=5-i
 *             
 *           for(int i=1;i<=4;i++)
 *           {
 *            ����  
 *            for(int j=1;j<=i-1;j++)   i=1 => j=3 , k=1
 *            {
 *               System.out.print(" ");
 *            }
 *            ��ǥ
 *            for(int k=1;k<=5-i;k++)
 *            {
 *               System.out.print("*");
 *            }
 *            System.out.println();
 *         }
 *      
 *   ==== 2�� => ����(����,����) , ��� , �޷� ... [�迭]
 */
public class �ڹ����_�ݺ���6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for(int i=1;i<=4;i++)// �ټ�
        {
        	// ���� 
        	for(int j=1;j<=4-i;j++)
        	{
        		System.out.print(" ");
        	}
        	// ��ǥ
        	for(int k=1;k<=i;k++)
        	{
        		System.out.print("*");
        	}
        	System.out.println();
        }
        System.out.println("==============");
        for(int i=1;i<=4;i++)// �ټ�
        {
        	// ���� 
        	for(int j=1;j<=i-1;j++)
        	{
        		System.out.print(" ");
        	}
        	// ��ǥ
        	for(int k=1;k<=5-i;k++)
        	{
        		System.out.print("*");
        	}
        	System.out.println();
        }
	}

}





