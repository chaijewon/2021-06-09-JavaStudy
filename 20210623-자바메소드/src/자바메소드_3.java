// �޼ҵ� ���� 
/*
 *    ������ / �Ű����� 
 *     O       O (O)  ==> ���̵��ߺ�üũ => true/false => oracle 0/1 ==> COUNT(*)
 *     O       X      ==> ��� => ������ ���� (����)
 *     X       O (O)  ==> ������ (�Ѵ�) => �޼ҵ� ��ü ��� 
 *     X       X      ==> ������ ���� 
 */
import java.util.Scanner;
public class �ڹٸ޼ҵ�_3 {
    static boolean isIdCheck(String id)
    {
    	// id = shim 
    	boolean bCheck=false;
    	// �ݺ��� => �׻� ó������ �����͸� ������ �´� 
    	String[] ids={"admin","hong","shim","park","lee","kim"};
    	for(String s:ids) // �迭,�÷���(ArrayList, Map , Vector, Queue,Stack , LinkList):�ڷᱸ��
    	{
    		// kim , Kim , KIm , KIM , KiM 
    		if(id.equalsIgnoreCase(s)) // equals => ��ҹ��ڸ� ���� , equalsIgnoreCase:��ҹ��� ���о��� 
    		{
    			bCheck=true;
    			break;
    		}
    		
    	}
    	return bCheck;
    }
    static int rand()
    {
    	return (int)(Math.random()*100)+1;
    }
    // �޼ҵ� ��ü���� ó�� (��� , ����Ŭ ���� , ����, ���� ��û ...)
    static void gugudan(int dan) // (O)
    {
    	for(int i=1;i<=9;i++)
    	{
    		System.out.printf("%d*%d=%d\n",dan,i,dan*i);
    	}
    }
    //  ������ ���� ==> insert, XML... (���)
    static void dataFind()
    {
    	String[] ids={"admin","hong","shim","park","lee","kim"};
    	System.out.println("========= ���̵� ��� ==========");
    	for(String s:ids)
    	{
    		System.out.println(s);
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        boolean bCheck=isIdCheck("Kim");
        if(bCheck)
        {
        	System.out.println("�̹� ������� ���̵� �Դϴ�!!");
        }
        else
        {
        	System.out.println("��� ������ ���̵� �Դϴ�!!");
        }
        int a=rand();
        System.out.println("������ ����:"+a);
        gugudan(5);
        dataFind();
	}

}





