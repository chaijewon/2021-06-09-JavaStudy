/*
 *   �񱳿����� ( ���� �� 
 *             �⺻ �������� ���� (int,byte...)
 *             ���ڿ��� ���� �� ���� (���ڿ��� �ּ�)
 *   ���� 
 *   
 *   ����   == ,
 *   ���� �ʴ� != , 
 *   �۴�      <
 *   ũ��      >
 *   �۰ų� ���� <=  < || ==   6<=6
 *   ũ�ų� ���� >=  > || ==    6>=6  => 6>6 || 6==6
 *   
 *   ====> ����� : boolean (true/false)
 *   
 */
public class �ڹٿ�����_�񱳿����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*System.out.println(6==7); 
        boolean b=7==7;
        System.out.println(b);
        b=10!=10;
        System.out.println(b);
        b=10<10;
        System.out.println(b);
        b=10>10;
        System.out.println(b);
        b=10<=10; // 10<10 || 10==10
        System.out.println(b);
        b=10>=10; // 10>10 || 10==10
        System.out.println(b);*/
		int a=10;
		int b=9;
		boolean bCheck = a==++b; // b�� 1�� ������ ���Ѵ� 
		System.out.println(bCheck);
        bCheck= a==b++; // �����Ŀ� ���� 
        System.out.println(bCheck);  // ���ǹ� 
        
	}

}
