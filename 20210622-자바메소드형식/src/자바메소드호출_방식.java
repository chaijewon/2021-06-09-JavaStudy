
public class �ڹٸ޼ҵ�ȣ��_��� {
    static void a() {
    	System.out.println("2. a() ����...");
    	
    	System.out.println("3. a() ����...");
    }
    static void b() {
    	System.out.println("4. b() ����...");
    	System.out.println("5. b() ����...");
    	// a()�� ȣ���߱� ������ a() => ������ ���� ����
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("1. main() ����...");
        a();
        b();
        System.out.println("6. main() ����...(���α׷� ����)");
	}
	/*
	 *   main() ����...
	 *   ==> a() ������� �̵� 
	 *       a() ����...
	 *       ==> b() ������� �̵� 
	 *       b() ����...
	 *       b() ����...
	 *       a() ����...
	 *   main() ����...(���α׷� ����)
	 *       
	 *   
	 */

}
