
public class 문제풀이_이진법 {
    // 이진법 처리
	static void binary(int[] arr,int value)
	{
		int index=15;
		while(true)
		{
			arr[index]=value%2;
			value/=2;
			if(value==0) break; // 1/2=0
			index--;
		}
	}
	// 출력 
	static void print()
	{
		int num=자바메소드정리.input("0~32767까지 정수");
		int[] arr=new int[16];// call by reference => 배열(주소) 주소를 넘겨주고 값을 채워 달라 (자신것에 채운다)
		binary(arr, num);
		// 출력 
		for(int i=0;i<16;i++)
		{
			if(i%4==0 && i!=0)
				System.out.print(" ");
			System.out.print(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        print();
	}

}
