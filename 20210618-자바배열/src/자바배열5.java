import java.util.Scanner;
public class �ڹٹ迭5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 5���� �̸� ���� 
		/*String[] names={"ȫ�浿","��û��","������","�ڹ���","�̼���"};
		String[] sexs={"����","����","����","����","����"};
		// ��� => for-each(�Ѱ��� �迭���� ������ ���)
		// �Ϲ� for ȫ�浿(����)
		for(int i=0;i<names.length;i++)
		{
			System.out.printf("%s(%s)\n",names[i],sexs[i]);
		}*/
		String[] book={
			"�ڹٿ� ����Ŭ",
			"�ڹٿ� JSP",
			"HTML & Ajax",
			"�ڹ� & ��Ʋ��",
			"ȥ�� ���� ������",
			"ȥ�� ���� �ڹ�",
			"�ڹٿ� AI",
			"����� ��Ʋ��",
			"����� �� �ڹ�"
		};
	    Scanner scan=new Scanner(System.in);
	    System.out.print("�˻��� �Է�:");
	    String data=scan.next();
	    
	    for(String s:book)
	    {
	    	if(s.startsWith(data) || s.endsWith(data)) // ī�� id_board ==> cookie
	    	{
	    		/*try
	    		{
	    			Thread.sleep(1000);
	    		}catch(Exception ex) {}*/
	    		System.out.println(s);
	    	}
	    }
	}

}











