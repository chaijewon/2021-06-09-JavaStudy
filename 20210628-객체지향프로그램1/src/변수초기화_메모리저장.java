/*
 *    Ŭ���� ������ ���� ���� => �ڵ� �ʱ�ȭ 
 *    int => 0
 *    int a; a=0;
 *    double => 0.0
 *    float => 0.0f
 *    byte , short => 0
 *    String => null (�ּҰ� ���� ���) =-> ��� Ŭ������ �ּҰ��� �����ϰ� �ִ� => �ּҰ� ���� (new)
 *    boolean => false
 */
public class �����ʱ�ȭ_�޸����� {
    int a; // 0
    double d; // 0.0
    String name;//null
    float f;// 0.0f
    byte b;//0
    short s;//0
    boolean boo;  // false  ==> �⺻ ����Ʈ 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        �����ʱ�ȭ_�޸����� a=new �����ʱ�ȭ_�޸�����(); // ���� a��� �޸� ������ Ŭ������ ����� ��� ���� ���� 
	    // . �� �̿��Ѵ�  a.a ,a.boo..... (.�ּҾȿ� �ִ� �޸� ���� ������)
        System.out.println(a.a);
        System.out.println(a.d);
        System.out.println(a.name);
        System.out.println(a.f);
        System.out.println(a.b);
        System.out.println(a.s);
        System.out.println(a.boo);
	}

}









