// page 283 �����ε� 
/*
 *   �����ε� : �ߺ��޼ҵ� ���� (���� �޼ҵ� �̸����� ������ �޼ҵ带 ����) : new 
 *   �����ε� (������) 
 *     1. �Ѱ��� Ŭ�����ȿ��� ���� �̸��� �޼ҵ带 ������ ���� 
 *        =============== ==============
 *     2. �Ű������� ������ ���������� �ٸ��� 
 *     3. �������� ������� 
 *     int plus(int a, int b)
 *     double plus(double d,double d2)
 *     String plus(String s1,String s2)
 *     char plus(char c1,char c2)
 *     void plus(int a,int b) => ���� �߻�  void plus(int k,int m) ==> plus(int,int)
 *     void plus(int a) 
 *     ===========================================================================
 *     void print(int a, String s,double d,long l)
 *     void print(char a, byte s,float d,boolean l) ==> ������ �Ű����� 
 *     void print(int a)
 *     void print(int a, int b)
 *     void print(int a, String s)
 *     void print(Object... arg) ==> Object (��� ���������� ���� �� �ִ� Ŭ����)
 *                      === ����  ...
 */
public class �����ε� {
    void print(Object...args )
    {
    	for(Object obj:args)
    	{
    		System.out.println(obj);
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        �����ε� a=new �����ε�();
        a.print("ȫ�浿","��û��","�ڹ���",10,20,30,'A','B','C',10.5,20.3,30.5);
	}

}
