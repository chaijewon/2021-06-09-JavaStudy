/*
 *   2) �� ���� ������ �Է� �޾� 3�� ������� �Ǻ��Ͽ� ����϶�
 *      if~else 
 *      if(num%3==0)
 *         3�� ���
 *      else
 *         3�� ����� �ƴϴ� 
 *         
 *      ==> ���׿����� 
 */
public class ����2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num=(int)(Math.random()*100)+1; // 1~100 ���� �߻�
        System.out.println(num%3==0?num+"��(��) 3�� ����Դϴ�":num+"��(��) 3�� ����� �ƴմϴ�");
        
        if(num%3==0)
        	System.out.println(num+"��(��) 3�� ����Դϴ�");
        else
        	System.out.println(num+"��(��) 3�� ����� �ƴմϴ�");
	}

}
