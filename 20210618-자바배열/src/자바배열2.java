// 5개의 정수를 저장 => 합과 평균을 구해서 처리 
/*러러ㅣㄴㄹ
ㄴ란란;라
ㅏㅣㄹㄴ;ㅏㄹ;ㄴ
마오망
ㅁ암암;
ㅁㅇㅁ임'이
ㅁ임'임
ㅁ이'ㅁ이
        Ctrl+shift+/
        Ctrl+shift+\ 
*/
public class 자바배열2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 난수 => 임의로 데이터 저장 
		// 1. 일반 변수 
		/*
		 * int a=(int)(Math.random()*100)+1; //1~100 int b=(int)(Math.random()*100)+1;
		 * //1~100 int c=(int)(Math.random()*100)+1; //1~100 int
		 * d=(int)(Math.random()*100)+1; //1~100 int e=(int)(Math.random()*100)+1;
		 * //1~100 System.out.printf("a=%d,b=%d,c=%d,d=%d,e=%d\n",a,b,c,d,e);
		 * System.out.printf("합:%d\n",a+b+c+d+e);
		 * System.out.printf("평균:%.2f\n",(a+b+c+d+e)/5.0); // 최대값,최소값 int max=a; int
		 * min=a;
		 * 
		 * // 최대값 if(max<a) max=a; if(max<b) max=b; if(max<c) max=c; if(max<d) max=d;
		 * if(max<e) max=e;
		 * 
		 * System.out.println("최대값:"+max);
		 * 
		 * // 최대값 if(min>a) min=a; if(min>b) min=b; if(min>c) min=c; if(min>d) min=d;
		 * if(min>e) min=e;
		 * 
		 * System.out.println("최소값:"+min);
		 */
		
		// 데이터를 모아서 처리 (변수명이 1개로 통일) ==> 인덱스 번호를 0
		// 선언
		int[] arr=new int[20000];
		// 초기값 
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		
		for(int i:arr)
		{
			System.out.printf("%d\t",i);
		}
		
		System.out.println();
		
		// 총합 
		int total=0;
		for(int i:arr)
		{
			total+=i;
		}
		System.out.println("합:"+total);
		// 평균 
		System.out.println("평균:"+(total/(double)arr.length));
		
		// 최소값 , 최대값
		int min=arr[0];
		int max=arr[0];
		
		for(int i:arr)
		{
			if(i<min)
				min=i;
			if(i>max)
				max=i;
		}
		System.out.println("최대값:"+max);
		System.out.println("최소값:"+min);
		
	}

}









