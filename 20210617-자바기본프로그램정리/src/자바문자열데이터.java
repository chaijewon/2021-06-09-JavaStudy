/*
 *    String : Ŭ����,���ڿ��� �����ϴ� �������� 
 *             �������� ���ڿ��� ���ÿ� ������ ���� 
 *             ����)
 *                  ***String ������="ȫ�浿";
 *                  String ������=new String("��û��")
 *             Ŭ���� => ��ü ���(�޼ҵ�)
 *             ======================
 *             1. ���ڿ� �� 
 *                =========
 *                �޼ҵ�� => ������ ����� 
 *                =================================== boolean
 *                ***equals() ===>  ���� ���ڿ� 
 *                ***constains() ==> ����
 *                ======================== 
 *                startsWith() : �չ����� ���� ���
 *                endsWith() : �ڿ� ���忡 ���� ���  ===> �ڵ��ϼ���
 *                ======================== ������Ʈ  if�� ��� 
 *            2. ���ڿ� ���� 
 *               =========
 *               ***���ڿ� ���� : length()  => CBD (����) => ����(�������̵�) ==> int
 *            3. ���ڿ� ���� 
 *               =========
 *               �빮�� ��ȯ : toUpperCase() ==> String
 *               �ҹ��� ��ȯ : toLowerCase() ==> String 
 *               ***������ ���ڸ� ���� : replace(),replaceAll()
 *            4. ���ڿ� ���� 
 *               =========
 *                charAt()
 *                ***substring()
 *                ***indexOf()
 *                ***lastIndexOf()
 *                ***split()
 *            5. ��Ÿ
 *               ���鹮�� ���� : ***trim()
 *               ��� ���������� ���ڿ� ��ȯ : ***valueOf()
 *            
 *               
 *                
 */
import java.util.Scanner;
public class �ڹٹ��ڿ������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Math.random();
        //String s="Hello String Data!!";
        //System.out.println("���� ���� Ȯ��:"+s.length());
        
        //System.out.println(s.toUpperCase());
        //System.out.println(s.toLowerCase());
        
        /*
         *   equals : ���ڿ� �� ==========> ��ҹ��� ���� Hello!=hello (��й�ȣ)
         *   equalsIgnoreCase :���ڿ� �� ==> ��ҹ��� ���� ���� �� Hello==hello (���̵�)
         *   
         *   �α��� ó�� 
         */
		final String ID="admin";
		final String PWD="1234"; // �����ͺ��̽� ���� 
		
		
		// 1. �Է°� �ޱ� => Scanner
		Scanner scan=new Scanner(System.in);
		System.out.print("ID �Է�:");
		String myid=scan.next(); // ���ڿ��� �޴� ��� 
		
		System.out.print("��й�ȣ �Է�:");
		String mypwd=scan.next();
		// ���ڿ��� ���Ҷ��� ==�� �ƴϰ� equals(): ���ڿ� ��ü �� 
		// equalsIgnoreCase : �Ϲ� ������ �� 
		// equals : Password 
		// ===> ������� true/false ==> if�ȿ� ���ǽ� ���鶧 �ַ� ��� 
		if(ID.equalsIgnoreCase(myid) && PWD.equalsIgnoreCase(mypwd))
		{
			// �α��� 
			System.out.println(myid+"�� �α��εǾ����ϴ�!!");
		}
		else
		{
			// �α��� ����
			System.out.println("���̵� ��й�ȣ�� Ʋ���ϴ�!!");
		}
		
	}

}


















