/*
 *    161 page ��ø for (���� for)
 *    ����)
 *               1     2 => false ��ü ���� 
 *          for(�ʱⰪ;���ǽ�;������)  =====> �ټ�
 *          {
 *                     | true  
 *                   3    4 => false
 *                              6
 *             for(�ʱⰪ;���ǽ�;������) ====> ������ ��� 
 *             {  
 *                     | true 
 *                 �ݺ� ���๮��  5
 *             }
 *          }
 *          
 *          ������ 
 *          =====
 *          2*1=2 3*1=3 4*1=4 .... 9*1=9
 *          2*2=4 ..................
 *          ...
 *          ...
 *          ...
 *          2*9=18                 9*9=81
 *          ================================= �ټ� (9)
 *             ==> 2�� for ==> 2~9
 *             
 *          *****  ���� (2��)
 *          *****
 *          *****
 *          *****     => 1~4
 *          ����(1��)
 *          
 *          �ڡ١ڡ١ڡ١ڡ١ڡ�
 *          �ڡ١ڡ١ڡ١ڡ١ڡ�
 *          �ڡ١ڡ١ڡ١ڡ١ڡ�
 *          �ڡ١ڡ١ڡ١ڡ١ڡ�
 *          �ڡ١ڡ١ڡ١ڡ١ڡ�
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
public class �ڹ����_�ݺ���2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*for(int i=1;i<=9;i++)
        {
        	for(int j=2;j<=9;j++)
        	{
        		// ������ ��� (����)
        		System.out.printf("%d * %d = %2d\t",j,i,j*i);
        	}
        	System.out.println();
        }*/
		/*for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=10;j++)
			{
				if(j%2==0)
				  System.out.print("��");
				else
				  System.out.print("��");
			}
			System.out.println();
		}
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("�ڡ١ڡ١ڡ١ڡ١ڡ�");
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




