/*
 *   trim() , valueOf() : �����(kotlin),��(JSP/Spring)
 *                        =========================== ���۵����� , ���ŵ����� (��� ������ String)
 *                          ��� �������� => String ��ȯ (valueOf()) 
 *                          valueOf(10) => "10"
 *                          valueOf(true) => "true"
 *  ======== trim() : �¿� ���鹮�� ����  ==> �Է�â�� trim() => ������� �Ǽ�  " admin" "admin"
 */
public class �ڹٹ��ڿ�������6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="     Hello Java       ";
		System.out.println(s);
		System.out.println(s.length());
		System.out.println(s.trim());  // �α��� (id,password,ȸ������ , �۾���...)
		System.out.println(s.trim().length());
		
		System.out.println(10+String.valueOf(true)); // + : �Ǽ�,����=> ���ڿ� 
		// instance , static => Ŭ������.�޼ҵ�() => Math.random()

	}

}








