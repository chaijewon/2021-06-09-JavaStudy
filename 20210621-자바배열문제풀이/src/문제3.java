/*
 *   3.	1~30 ¦����,Ȧ������ ����ϴ� ���α׷��� �ۼ�
 */
public class ����3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int even=0,odd=0;
        for(int i=1;i<=30;i++)
        {
        	if(i%2==0)
               even+=i;
        	else
        		odd+=i;
        }
        System.out.println("¦����:"+even);
        System.out.println("Ȧ����:"+odd);
        
        // 4.	1~100 3�� ����̰� 5�� ����� ����ϴ� ���α׷� �ۼ�
        for(int i=1;i<=100;i++)
        {
        	if(i%3==0 && i%5==0)
        	{
        		System.out.print(i+" ");
        	}
        }
        
        //5.	1~1000�������� 7�� ����� �� ,9�� ����� ��
        int sum7=0;
        int sum9=0;
        for(int i=1;i<=1000;i++)
        {
        	if(i%7==0)
        		sum7+=i;
        	if(i%9==0)
        		sum9+=i;
        }
        System.out.println();
        System.out.println("7�� ��� ��:"+sum7);
        System.out.println("9�� ��� ��:"+sum9);
        System.out.println("����:"+(sum7+sum9));
        
        // 6.	10~99���� �����߿� ���� �ڸ��� ������ ����Ͻÿ�
        for(int i=10;i<=99;i++)
        {
        	if(i%11==0)
        	{
        		System.out.print(i+" ");
        	}
        }
        System.out.println();
        // 7.	���� �Է��� �޾Ƽ� 60�̻� �հ� =>���հ�  if~else
        int no=(int)(Math.random()*101); //0~100
        if(no<60)
        {
        	System.out.println(no+"���� ���հ�");
        }
        else
        {
        	System.out.println(no+"���� �հ�");
        }
	}

}
