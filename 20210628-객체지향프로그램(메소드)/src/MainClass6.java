
public class MainClass6 {
	void connection()
	{
		System.out.println("����Ŭ ����̹� ���");
    	System.out.println("����Ŭ ����");
	}
	void disconnection()
	{
		System.out.println("����Ŭ ����̹� ����");
    	System.out.println("����Ŭ ���� ����");
	}
    void select()
    {
    	connection();
    	System.out.println("SELECT ���� ����");
    	System.out.println("����Ŭ ����� �б�");
    	disconnection();
    	
    }
    void insert()
    {
    	connection();
    	System.out.println("Insert ���� ����");
    	System.out.println("����Ŭ���� ������ �߰�");
    	disconnection();
    	
    }
    void update()
    {
    	connection();
    	System.out.println("Update ���� ����");
    	System.out.println("����Ŭ���� ������ ����");
    	disconnection();
    	
    }
    void delete()
    {
    	connection();
    	System.out.println("Delete ���� ����");
    	System.out.println("����Ŭ���� ������ ����");
    	disconnection();
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MainClass6 m=new MainClass6(); //m => select(),insert(),update(),delete()
        m.select();
        m.insert();
        m.update();
        m.delete();
        
	}

}
