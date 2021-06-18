import java.util.Scanner;
public class 자바배열5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 5명의 이름 저장 
		/*String[] names={"홍길동","심청이","춘향이","박문수","이순신"};
		String[] sexs={"남자","여자","여자","남자","남자"};
		// 출력 => for-each(한개의 배열에서 데이터 출력)
		// 일반 for 홍길동(남자)
		for(int i=0;i<names.length;i++)
		{
			System.out.printf("%s(%s)\n",names[i],sexs[i]);
		}*/
		String[] book={
			"자바와 오라클",
			"자바와 JSP",
			"HTML & Ajax",
			"자바 & 코틀린",
			"혼자 배우는 스프링",
			"혼자 배우는 자바",
			"자바와 AI",
			"모바일 코틀린",
			"모바일 과 자바"
		};
	    Scanner scan=new Scanner(System.in);
	    System.out.print("검색어 입력:");
	    String data=scan.next();
	    
	    for(String s:book)
	    {
	    	if(s.startsWith(data) || s.endsWith(data)) // 카페 id_board ==> cookie
	    	{
	    		/*try
	    		{
	    			Thread.sleep(1000);
	    		}catch(Exception ex) {}*/
	    		System.out.println(s);
	    	}
	    }
	}

}











