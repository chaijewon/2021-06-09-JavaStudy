/*
 *    do~while : ������ ���߿� �˻� => ���๮���� �ѹ� �̻� ���� 
 *    ����)
 *         �ʱⰪ   =========  1
 *         do
 *         {
 *             ���๮�� ===== 2
 *             ������  ====== 3
 *         }while(���ǽ�);=== 4 ==> false�� ���� , true�� => 2�� ���๮������ �̵�
 *     
 *    
 */
public class �ڹ����1 {

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
			// 1~10���� ��� 
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
		 *    i++; 11<=10 => false => ����
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
		 *   i=11 ==> 11<=10 false ==> ���� 
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






