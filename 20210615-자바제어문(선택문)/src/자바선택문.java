/*
 *   ���ù� (�������ǹ�) : �������� ���ÿ� ������ ���� 
 *       => �� 1���� ���� (����=> Ű���� ��) => VK_UP , VK_DOWN
 *       => ������ �̵� 
 *       ����)
 *            switch(��) ==> 1) ���� , 2) ���� , 3) ���ڿ�
 *            {
 *               ����� ��:
 *               case ����:
 *                   ���๮�� 1;
 *               case ����:
 *                   ���๮�� 2;
 *               ...
 *               ...
 *               default:
 *                   ���๮�� n
 *            }
 *            
 *            
 *            
 *            int a=5;
 *            switch(a)
 *            {
 *              case 1: ==> :(Ŭ��) , ;(����Ŭ��: ������ ������ ���) , case �ڿ� ���� �ߺ��� �� ����
 *                ����1                => ����� �� �ִ� �� (����,����,���ڿ�)
 *                ���� => break        => ���� �����Ŀ� �����ϰ� ���� ��쿡�� �ݵ�� break;
 *              case 2:
 *                ����2
 *                break
 *              case 3:
 *                ����3
 *                break
 *              case 4:
 *                ����4
 *                break
 *              case 5:
 *                ����5
 *                break
 *              default;  ==> ������ ���� 
 *                ����6
 *            }
 *            
 *            ==> ���� 1,2,3,4,5,6
 *            
 *   ���ǹ� 
 *       => �� 1���� ���� , ������ ������ �� �ִ�
 */
public class �ڹټ��ù� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 100 => 100/10 ==> 10,9,.....0
		// if(a==1 || a==2) case 1: case 2:ó��
        int a=2;
        switch(a)
        {
          case 1:
        	  //break; // switch�� ���� 
          case 2:
        	  System.out.println("1�� ����...");
        	  System.out.println("2�� ����...");
        	  break;
          case 3:
        	  System.out.println("3�� ����...");
        	  break;
          default:
        	  System.out.println("������ ���� ����..");
        }
	}

}






