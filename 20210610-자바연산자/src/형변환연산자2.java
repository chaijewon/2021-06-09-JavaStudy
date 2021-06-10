/*
 *     데이터형 ==> 데이터형끼리 형변환(교환) => 숫자일 경우에만 가능 
 *                                     =========
 *                                     정수 / 실수 / 문자 (실제 정수값)
 *                                                 => 정수형으로 취급 
 *     boolean은 제외 
 *     
 *     = 자동형변환 : 자바시스템에 의해서 (연산처리)
 *                  연산 : 항상 같은 데이터형
 *                        10 + 10.5
 *                        ==   ====
 *                        int  double 
 *                        ===
 *                        double + double 
 *                        
 *                        20+(int)10.5
 *                           ====
 *                            int   ==> 30
 *                            
 *                       예외) 
 *                            int a=10L; ==> 오류 
 *                            float f=10.5; ==> 오류 
 *                            ==========================
 *                            char c=65; ==> 오류예외 => 'A'
 *                            byte b=100;
 *                            short s=200; 
 *                            ==========================
 *     = 강제형변환 : 프로그래머 
 *     
 *     int a='A';  => 65 a=65
 *     
 *     double b='A' ==> b=65.0
 */
public class 형변환연산자2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        boolean b=false;
        double k=10.5f;
        //System.out.println((int)b);
        int a=(int)10L;
        float f=(float)k;// 10.5f
        char c=65;
        byte bb=100;
        short ss=300;
        double dd=.2;//0.2
        double dd1=25.;// 25.0
        System.out.println(dd);
        System.out.println(dd1);
        
        double ddd='A';// 65.0
        System.out.println(ddd);
        int ii='B';// 66
        System.out.println(ii);
        
        double dddd=100;// 100.0
        System.out.println(dddd);
        
        double ddddd=(int)10.5; //10.0
        System.out.println(ddddd);
        
        char cc=67;
        System.out.println(cc);
        // 왼쪽 변수=오른쪽(작거나 같다) 
        // 왼쪽이 크거나 같다 
	}

}
