/*
 *   메소드 
 *   =====
 *         데이터 교환
 *     메소드 <=====> 메소드
 *         데이터 전송 
 *           = 1) 리턴형
 *           = 2) 매개변수 
 *     클래스가 1개 여러개 사용 ... 통신 (메소드)
 */
public class 자바메소드_6 {
    static void data()
    {
    	String[] name={"홍길동","심청이","박문수","춘향이","김두한"};
    	// 1
    	// 여기서 출력 
    	process(name);
    }
    static void process(String[] name)
    {
        for(String n:name)
        {
        	System.out.println(n);
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        data();
        
	}

}
