/*
 *    ���׿����� 
 *      ����) 
 *           ���� ? ��1 : ��2
 *           ===
 *            true�� ��� ==> ��1
 *            false�� ��� ==> ��2
 */
import java.util.Scanner; // �Է°��� �޴� ��� 
// �ٸ� Ŭ������ �ҷ� �ö� ��� 
/*
 *    c/c++  => #include <io.h>
 *    java   => import Ŭ������
 *    c#     => using 
 *    python => from ��� import 
 *    kotlin => import 
 */
public class �ڹٿ�����_���׿����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        char c='A';
        System.out.println(
           (c>='A' && c<='Z')||(c>='a' && c<='z')?"���ĺ�":"���ĺ��� �ƴϴ�"
        );
        char c1='1'; // '0'~'9'   '100'
        // [0-9]  [A-Za-z] [��-�R]
        System.out.println(
           	c1>='0' && c1<='9'?"������ ����":"������ ���ڰ� �ƴϴ�"
        );
        
        int i=100;
        System.out.println(
           i%3==0 || i%5==0 || i%7==0 ? "3�ǹ��,5���,7���":"�ٸ� ���"	
        );
	}

}






