// ������ ���� => �Ű����� ����(����Ʈ ������) , �Ű������� �ִ� (�Է°��� �޾Ƽ� �ʱ�ȭ, ���� �б�,�����ͺ��̽� �б�)
class Sawon
{
	String name="ȫ�浿";//null
	String dept="���ߺ�";//null
	String loc="����";//null
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getLoc() {
		
		return loc;
		
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	Sawon(String n,String d,String l)
	{
	   name=n;
	   dept=d;
	   loc=l;
	}
}
public class ������2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Sawon s1=new Sawon("ȫ�浿","���ߺ�","����");
        System.out.println(s1.name);
        System.out.println(s1.dept);
        System.out.println(s1.loc);
        System.out.println("==========");
        Sawon s2=new Sawon("��û��","��ȹ��","���");
        System.out.println(s2.name);
        System.out.println(s2.dept);
        System.out.println(s2.loc);
        System.out.println("==========");
        Sawon s3=new Sawon("�ڹ���","������","�λ�");
        System.out.println(s3.name);
        System.out.println(s3.dept);
        System.out.println(s3.loc);
        
	}

}
