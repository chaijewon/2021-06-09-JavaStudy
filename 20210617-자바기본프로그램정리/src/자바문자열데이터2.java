/*
 *    charAt(int)  : ���ڿ��߿� �����Ѱ��� ���� ==> char
 *    
 *    String s="Hello Java!!";
 *     Hello Java!!  ===> �迭���� (���۹�ȣ�� 0���� ����)
 *     01234567891011
 *     
 *     charAt(0) => 'H'
 *     charAt(6) => 'J'
 *     charAt(4) => 'o'
 *     
 *     ����ڰ� ���ĺ��� �Է��� �ָ� ==> 'A', 'a' ==> � 
 */
import java.util.Scanner;
public class �ڹٹ��ڿ�������2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*String s="Hello Java!!";
        System.out.println("ù��° ����:"+s.charAt(0));
        System.out.println("6��° ����:"+s.charAt(6));*/
		// 1. �Է°� �ޱ� => �޸𸮿� ���� 
		Scanner scan=new Scanner(System.in);
		System.out.print("���ĺ� ������ �Է�:");
		String data=scan.next();//String java.util.Scanner.next()
		System.out.println("���� ������:"+data);
		// 'a' , 'A' 
		// Hello  => 5  ==> 0~4  ==> �迭 0 ==> <length 
		int count=0; // ����� Ȯ�� 
		for(int i=0;i<data.length();i++) // int java.lang.String.length()
		{
			char c=data.charAt(i);// �Էµ� ���ڿ����� ���� �Ѱ��� ������ �´� 
			// char java.lang.String.charAt(int index)
			//System.out.println(c);
			if(c=='A' || c=='a')
				count++; // 'A','a' ����� Ȯ�� 
		}
		System.out.println("A,a�� �:"+count);
	}

}






