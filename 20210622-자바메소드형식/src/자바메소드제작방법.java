import java.util.Arrays;
// 249 page 
/*
 *    변수 
 *    =====
 *    연산자
 *    제어문 
 *    ===== 메소드 
 *    ============== 변수+메소드=클래스  ==> 패키지 
 *                       =====
 *                       = 이미 만들어진 메소드(라이브러리) => 
 *                       = 사용자 정의
 */

/*
 *     구성 요소 
 *     = 리턴형 (처리후 결과값)
 *     = 사용자 요청값 (매개변수) => 매개변수 갯수가 다를 수 있다 
 *     
 *     리턴형      매개변수
 *     =================
 *      O           O
 *      O           X
 *      X           O ==> 메소드 자체에서 처리  ==> 결과값이 존재하지 않는다 (void)
 *      X           X ==> 메소드 자체에서 처리  ==> 결과값이 존재하지 않는다 (void)
 *     
 *     리턴형 : 반드시 한개의 값만 사용
 *             
 *             리턴값 메소드명()
 *             {
 *                return 값  => 여러개 동시에 => 배열,클래스
 *             }
 *             메소드명(매개변수......) : 가변매개변수 (...)
 *             
 *     원형 
 *     1. 사용자로부터 아이디를 받아서 중복체크하는 기능  ==> 중복체크를 하는 메소드
 *     static  boolean idCheck(String id)  : 매개변수 , 리턴형 => 경우의 수 2개일 경우 => boolean
 *     2. 구구단을 출력하는 기능 ==> 메소드 
 *     static void gogudan() ==> 메소드 자체 출력 
 *     3. 정수 여러개를 배열을 받아서 정렬하는 프로그램
 *     static int[] sort(int[] arr)  ===> 리턴형,매개변수 => 기본형 , 배열 , 클래스 
 *     4. 우편번호를 출력하는 기능 
 *     static String[] postfind(String dong) => 배열 
 *     5. 로그인하는 기능 (경우: 3가지 => ID가 없는 경우 , Password가 틀린 경우, 로그인된 상태)
 *     static String login(String id,String pwd) => int,String
 */
public class 자바메소드제작방법{
    static int[] sort(int[] arr,int type)
    {
    	for(int i=0;i<arr.length-1;i++)
    	{
    		for(int j=i+1;j<arr.length;j++)
    		{
    		  if(type==0)
    		  {
    			if(arr[i]>arr[j])
    			{
    				int temp=arr[i];
    				arr[i]=arr[j];
    				arr[j]=temp;
    			}
    		  }
    		  else
    		  {
    			  if(arr[i]<arr[j])
      			  {
      				int temp=arr[i];
      				arr[i]=arr[j];
      				arr[j]=temp;
      			  }
    		  }
    		}
    	}
    	return arr;
    	//System.out.println("");
    }
	// 다른 클래스에서 필요시마다 사용이 가능 (재사용성)
	static void gugudan()
	{
		        // 구구단 
				for(int i=1;i<=9;i++)
				{
					for(int j=2;j<=9;j++)
					{
						System.out.printf("%2d * %2d = %2d\t",j,i,j*i);
					}
					System.out.println();
				}
				return;// 생략이 가능 => 메소드 종료 => void에서 return에 없는 경우에는 JVM이 자동으로 return
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //gugudan();
		int[] arr=new int[5];
		for(int i=0;i<5;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		
		System.out.println(Arrays.toString(arr));
		
		// 정렬된 데이터 받기
		int[] arr2=sort(arr,0);
		System.out.println(Arrays.toString(arr2));
		int[] arr3=sort(arr,1);
		System.out.println(Arrays.toString(arr3));
		//sort(arr);
		//System.out.println(Arrays.toString(arr));
		return;
	}

}






