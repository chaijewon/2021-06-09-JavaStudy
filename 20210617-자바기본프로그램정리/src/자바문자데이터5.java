/*
 *    replace / replaceAll
 *    =======   ========== ���Խ�
 *              [A-Z], [a-z] , => [A-Za-z]
 *              [0-9] , [��-�R]
 *    �ѱ��� ����  
 *    
 *    ����*
 *    ����*
 */
public class �ڹٹ��ڵ�����5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="Hello Java";
        System.out.println(s.replace('a', 'k'));
        System.out.println(s.replace("Hello", "Hi"));
        System.out.println(s);
        String s1="Hello �ȳ��ϼ��� 1234";
        System.out.println(s1.replaceAll("[^A-Za-z]", ""));
        System.out.println(s1.replaceAll("[^0-9]", ""));
        System.out.println(s1.replaceAll("[^��-�R]", ""));
	}

}
