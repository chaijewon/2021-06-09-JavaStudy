import java.util.Arrays;

// 메소드안에 메소드를 선언할 수 없다(메소드 클래스 블록안에서만 사용이 가능)
// 반복 제거 
// 메소드는 반드시 => 한개의 기능만 수행이 가능하게 만든다 (재사용)
// 기능 처리 => 소스가 많이 있는 경우 ==> 가급적이면 세분화
// 한 클래스안에서 메소드의 기본 (입력,처리,출력)
// => 매개변수 전송법 ==> (일반 데이터) => 값에 의한 전달, (배열,클래스) => 주소에 의한 전달 (메모리를 열어주고 값을 변경)
//                         기본형 데이터 전달              참조 데이터 전송 (참조: 주소)
//                         복사본 전송(원본은 변경되지 않는다)         (원본을 전송) 원본자체 변경
// 클래스나 배열에서 값을 변경 하고 싶다 ==> 메소드를 통해서 변경이 가능 
// 메소드 ==> 다른 클래스와 통신을 할 때 사용 (소프트웨어공학 => Message)
// 메소드 => 다른 클래스 통신 => 멤버 변수 변경 ...
// 객체 지향 프로그램 ==> 메소드 (기능) ==> 필요한 데이터 (멤버변수)  변수 + 메소드 
public class 자바메소드2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr= {1,2,3,4,5};
        int[] aaa=arr;// 별칭 => aaa,arr ==> Call by Reference , 배열 , 클래스 (단 예외 : String)
        
        aaa[0]=100;
        System.out.println(Arrays.toString(arr));
        arr[1]=200;
        System.out.println(Arrays.toString(aaa));
        
        int a=10;  // 값만 전송 ==> Call By Value
        int b=a;
        b=100;
        System.out.println("a="+a);
        System.out.println("b="+b);
        
	}
}
