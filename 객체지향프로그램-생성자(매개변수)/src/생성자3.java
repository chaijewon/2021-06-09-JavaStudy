class Member
{
	int no;//0=2
	String name;//null
	String addr;//null
	/*
	 *   Member m1=new Member();
	 *   Member m2=new Member();
	 *   
	 *   Member mn=new Member();
	 */
	Member()
	{
		no=1;
		name="ȫ�浿";
		addr="����";
	}
	Member(int n,String s)
	{
		this(s); // ������ �ڽ� ==> Member(s) => this(s) => super()
		// this�޼ҵ�� �����ھȿ��� �ٸ� �����ڸ� ȣ�� �Ҷ� ��� 
		// �������� �׻� �����ھȿ����� ����Ѵ� 
		// �׻� ù�ٿ� �´� 
		no=n;
		
	}
	Member(String n)
	{
		
		name=n;
		//this(n,"aaa");
		
	}
	Member(String n,String a)
	{
		name=n;
		addr=a;
	}
	Member(int n,String s,String a) { no=n; name=s; addr=a; }
	
	 
}
public class ������3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Member m1=new Member();
        System.out.println(m1.no);
        System.out.println(m1.name);
        System.out.println(m1.addr);
        System.out.println("===============");
        Member m2=new Member(2,"������");
        System.out.println(m2.no); // 2
        System.out.println(m2.name); // null
        System.out.println(m2.addr); // null
        System.out.println("===============");
        Member m3=new Member("��û��");
        System.out.println(m3.no); // 0
        System.out.println(m3.name); // ��û��
        System.out.println(m3.addr); // null
        System.out.println("===============");
        Member m4=new Member("�ڹ���","���");
        System.out.println(m4.no); // 0
        System.out.println(m4.name); // �ڹ���
        System.out.println(m4.addr); // ���
        System.out.println("===============");
        Member m5=new Member(3,"�̼���","��õ");
        System.out.println(m5.no); // 0
        System.out.println(m5.name); // �ڹ���
        System.out.println(m5.addr); // ���
	}

}
