/*
 *   ����ö�ǵ��� 8,000�� ����ö�ǵ��� 8,000�� ���ܺ���� 7,500�� �ᳪ�����屹 7,000�� �׾Ƹ������� 7,500��
 */
public class �ڹٹ��ڿ�������5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String menu="����ö�ǵ��� 8,000�� ����ö�ǵ��� 8,000�� ���ܺ���� "
        		   +"7,500�� �ᳪ�����屹 7,000�� �׾Ƹ������� 7,500��"; 
        String[] s=menu.split("��");
        for(String m:s)// for-each
        {
        	System.out.println(m.trim()+"��");
        }
	}

}
