/*
 *   �⺻�������� : ������(int,long),�Ǽ���(float,double), ����(boolean) => ���� ���� (read only)
 *               => Call By Value (*** String) => ���纻 (������ �״��) ==> ����� (������)
 *   ������������ (����� ����) : �������� ũ�⸦ ���α׷��� �°� ���� ���� => �ּҰ� ���� (read & write)
 *                          ========== �迭 , Ŭ���� => ���� (���� ��ü�� ����) 
 *               => Call By Refernece  => ������ ���� ���� 
 */
class A
{
	int a=10;
	int b=20;
}
public class �Ű��������۹� {
	void change(String s1,String s2) // String (Ŭ����) => Call By Value (String�� �⺻ �������� ���)
	{
		String temp=s1;
		s1=s2;
		s2=temp;
		System.out.println("s1="+s1+",s2="+s2);
		
	}
	void change(A aa)
	{
		System.out.println("aa="+aa);
		int temp=aa.a;
		aa.a=aa.b;
		aa.b=temp;
		System.out.println("aa.a="+aa.a+",aa.b="+aa.b);
	}
    void change(int x,int y) // �⺻�� �Ű����� => ���۽� �޸�, �޴� �޸� ��ġ�� �ٸ��� // read
    {
    	int temp=x;
    	x=y;
    	y=temp;
    	System.out.println("x="+x+",y="+y);
    }
    void change(int[] brr) // read,write
    { 
    	System.out.println("brr="+brr);
    	int temp=brr[0];
    	brr[0]=brr[1];
    	brr[1]=temp;
    	System.out.println("brr[0]="+brr[0]+",brr[1]="+brr[1]);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=10;
        int b=20;
        �Ű��������۹� aa=new �Ű��������۹�(); // aa=>change
        aa.change(a, b);
        System.out.println("a="+a+",b="+b);
        // �ּҰ� ���� (������ �Ű�����)
        int[] arr= {10,20};
        System.out.println("arr="+arr);
        aa.change(arr);
        System.out.println("arr[0]="+arr[0]+",arr[1]="+arr[1]);
        A ccc=new A();// ccc=> a, b
        System.out.println("ccc="+ccc); // Ŭ���� ��ü => ���� ���� �ּ�
        aa.change(ccc);
        System.out.println("ccc.a="+ccc.a+",ccc.b="+ccc.b);
        String s1="Hello";
        String s2="Java";
        aa.change(s1,s2);
        System.out.println("s1="+s1+",s2="+s2);
        
	}

}




