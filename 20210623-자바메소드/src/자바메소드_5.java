import java.util.Arrays;

public class �ڹٸ޼ҵ�_5 {
	// �������� 
    static void display()
    {
    	int a=10; // �������� => {} , �������� => ���α׷� ����ñ��� �޸� ����
    	System.out.println("a="+a);
    	++a;
    	// �ٸ� �޼ҵ�� ����� �� ���� 
    	// ����Ҷ��� ������ , �Ű������� �̵� 
    }
    static void swap(int a,int b)
    {
    	int temp=a;
    	a=b;
    	b=temp;
    	System.out.println("swap:a="+a+",b="+b);
    }
    static void disp(int[] arr)// �迭 �ּҸ� �Ѱ��ְ� �ش� �ּҿ� ���� ä���� (�ּҿ� ���� ����) 
    {
    	System.out.println("arr="+arr);
    	for(int i=0;i<5;i++)
    	{
    		arr[i]=(int)(Math.random()*100)+1;
    	}
    	System.out.println("disp:arr="+Arrays.toString(arr));
    }
    static void swap(String s1,String s2)
    {
    	System.out.println("s1="+s1+",s2="+s2);
    	String temp=s1;
    	s1=s2;
    	s2=temp;
    	System.out.println("s1="+s1+",s2="+s2);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // int a=10 => ����� �� ���� 
		//display();// a=10 => a++ => a=11 ==> a�� ������� 
		//display();// a=10 => a++ => a=11 ==> a�� �������
		//display();
		int a=10;
		int b=20;
		// a,b�޸� 
		System.out.println("main:a="+a+",b="+b);
		swap(a,b);
		System.out.println("main:a="+a+",b="+b);
		// ������ �״�� ���۵� �����͸� ���� =========> Call by Value , Call by Reference (�ּ�:��ü ����)
		//  Call by Reference (�ּ�:��ü ����) : �⺻���� ����� �ȵȴ� , �迭,Ŭ����(String����)
		int[] nums=new int[5];
		// nums = I@5d22bbb7 (�ּҰ�)
		System.out.println("nums="+nums);
		disp(nums);
		System.out.println("nums="+Arrays.toString(nums));
		String s1="Hello";
		String s2="Java";
		swap(s1,s2);
		System.out.println("main:s1="+s1+",s2="+s2);
		
		int[] aaa=new int[5];//aaa[0]=0
		System.out.println("aaa="+aaa);
		int[] bbb=aaa;
		System.out.println("bbb="+bbb);
		bbb[0]=100;
		
		aaa[1]=200;
		System.out.println(Arrays.toString(aaa));// 100,200,0,0,0
		System.out.println(Arrays.toString(bbb));// 100,200,0,0,0
		
		int aa=10;
		int bb=aa;
		bb=20;
		System.out.println("aa="+aa);
		System.out.println("bb="+bb);
		
		// int a=10;
		// int* p=&a;
	}

}






