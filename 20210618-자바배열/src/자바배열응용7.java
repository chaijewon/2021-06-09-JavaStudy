import java.util.Arrays;

/*
 *   9.	정수를 10개 저장하는 배열을 만들고 1에서 10까지 범위의 정수를 랜덤하게 생성하여 
        배열에 저장하라. 그리고 배열에 든 숫자들과 평균을 출력하라.
        
     배열 => 같은 데이터형을 묶어서 한개의 이름으로 관리 
            ========== 3개이상이면 배열을 사용한다 
            1) 배열 선언 
               데이터형[] 배열명
               데이터형 배열명[]
            2) 배열의 초기화 
               데이터형[] 배열명=new 데이터형[저장할 갯수] ==>   자동 초기화 
                                        (int=0,double=0.0,boolean=false,String=null)
                                       =========== length
               데이터형[] 배열명={값,값...}; => 지정된 값 만큼만 메모리 할당 
            3) 배열의 값 변경
               index번호를 이용해서 배열의 값 변경 (index번호는 0부터 시작)
               2번째 값을 변경 
               배열명[1]=값
               *** index번호가 length-1을 초과하면 오류 발생
            4) 전체 데이터 출력 
               일반 for : 데이터 변경, 두개의 이상 배열에 데이터를 동시 출력 
               for-each : 한개의 배열에서 데이터 출력할 경우에 주로 사용(출력 전용)
               
            *** 배열의 단점 
                1) 고정적 => 크기를 늘리기 위해서는 더 큰 배열을 생성후 => 복사 
                   => 가변형 (컬렉션)
                   => 값을 삭제할 수 없다 
                   => 추가,수정,찾기...

 */
public class 자바배열응용7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr=new int[10];
        for(int i=0;i<arr.length;i++)
        {
        	arr[i]=(int)(Math.random()*10)+1;
        }
        
        System.out.println(Arrays.toString(arr));
        
        // 데이터를 읽어 온다 
        // 데이터 누적 
        //double avg=0.0;
        int sum=0;
        for(int i:arr) // 실제 배열에 저장된 값을 읽을 경우에 주로 사용하는 for-each(출력 전용)
        {
        	sum+=i;
        }
        
        System.out.printf("평균:%.2f\n",sum/10.0);
        
	}

}
