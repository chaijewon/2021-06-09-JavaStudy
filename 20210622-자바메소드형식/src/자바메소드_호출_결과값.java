import java.util.Scanner;
public class �ڹٸ޼ҵ�_ȣ��_����� {
	// �޼ҵ� ó���� �Ѱ��� ��ɸ� ó���� �����ϰ� ����� 
    static boolean login(String id,String pwd)
    {
    	final String MID="admin";
    	final String MPWD="1234";
    	boolean bCheck=false;
    	
    	if(MID.equals(id) && MPWD.equals(pwd))
    	{
    		bCheck=true;
    	}
    	else
    	{
    		bCheck=false;
    	}
    	return bCheck;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // ����ڷκ��� �Է°� �ޱ�
		Scanner scan=new Scanner(System.in);
		System.out.print("ID �Է�:");
		String id=scan.next();
		
		System.out.print("��й�ȣ �Է�:");
		String pwd=scan.next();
		
		//(int)(Math.random()*100);
		
		// �޼ҵ带 ���ؼ� ������� �޴´� 
		boolean check=login(id,pwd);
		if(check==true)
		{
			System.out.println("���� ȭ������ �̵�");
		}
		else
		{
			System.out.println("ID�� ��й�ȣ�� Ʋ���ϴ�!!");
		}
		
	}

}
