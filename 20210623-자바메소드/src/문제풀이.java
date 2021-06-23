import java.util.Scanner;
public class 문제풀이 {
    // 입력
	static int input(String s)
    {
    	Scanner scan=new Scanner(System.in);
    	System.out.print(s+" 입력:");
    	return scan.nextInt();
    }
    // 이진법 출력 
	static int[] binary(int num)
	{
		int[] arr=new int[16];
		int index=15;
		while(true)
		{
			arr[index]=num%2;
			num=num/2;
			if(num==0) break;
			index--;
		}
		return arr;
	}
	// 출력
	static void print()
	{
		int num=input("0~32767까지 정수");
		int[] result=binary(num);
		for(int i=0;i<result.length;i++)
		{
			if(i%4==0 && i!=0)
			{
				System.out.print(" ");
			}
			System.out.print(result[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        print();
	}

}
