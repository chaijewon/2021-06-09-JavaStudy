// ���α׷� => �뵵 => if~else (���� ó��, ������ ó��)
public class �ڹ����ǹ�3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� ���� 
		int rand=(int)(Math.random()*2); // 0,1
		char alpha=' '; //�ʱ�ȭ 
		if(rand==0) // �빮��
			alpha=(char)((Math.random()*26)+65); // 0+65 => 65('A')
		else // rand==1 => �ҹ��� 
			alpha=(char)((Math.random()*26)+97); // 0+97 => 97('a')
		
		// ����� 
		if(alpha>='A' && alpha<='Z')//  �빮�� ��� 
			System.out.println(alpha+"��(��) �빮���Դϴ�");
		else
			System.out.println(alpha+"��(��) �ҹ����Դϴ�");

	}

}
