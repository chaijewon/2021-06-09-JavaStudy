import java.util.Arrays;

public class 자바메소드_5 {
	// 전역변수 
    static void display()
    {
    	int a=10; // 지역변수 => {} , 전역변수 => 프로그램 종료시까지 메모리 유지
    	System.out.println("a="+a);
    	++a;
    	// 다른 메소드는 사용할 수 없다 
    	// 사용할때는 리턴형 , 매개변수로 이동 
    }
    static void swap(int a,int b)
    {
    	int temp=a;
    	a=b;
    	b=temp;
    	System.out.println("swap:a="+a+",b="+b);
    }
    static void disp(int[] arr)// 배열 주소를 넘겨주고 해당 주소에 값을 채워라 (주소에 의한 전달) 
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
        // int a=10 => 사용할 수 없다 
		//display();// a=10 => a++ => a=11 ==> a는 사라진다 
		//display();// a=10 => a++ => a=11 ==> a는 사라진다
		//display();
		int a=10;
		int b=20;
		// a,b메모리 
		System.out.println("main:a="+a+",b="+b);
		swap(a,b);
		System.out.println("main:a="+a+",b="+b);
		// 원본은 그대로 전송된 데이터만 변경 =========> Call by Value , Call by Reference (주소:자체 변경)
		//  Call by Reference (주소:자체 변경) : 기본형은 사용이 안된다 , 배열,클래스(String제외)
		int[] nums=new int[5];
		// nums = I@5d22bbb7 (주소값)
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






