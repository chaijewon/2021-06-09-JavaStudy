import java.util.Scanner;
public class ����Ǯ�� {
    // �Է�
	static int input(String s)
    {
    	Scanner scan=new Scanner(System.in);
    	System.out.print(s+" �Է�:");
    	return scan.nextInt();
    }
    // ������ ��� 
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
	// ���
	static void print()
	{
		int num=input("0~32767���� ����");
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
