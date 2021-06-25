import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import java.util.Scanner;

// 맛집 출력 => 망고플레이트
/*
 *   객체 지향 프로그램 
 *   70년도 (sw)              70년도(hw)
 *     C언어 (벨연구소)           => 집적회로 (조립 한개의 기계:재사용)
 *        |                         |
 *   80년도 
 *        | 스트덥 (집적회로: 보관 => 재사용)
 *          단점) 이유 => C언어 개발자 양성 (IBM)
 *               => 개발자 단가가 감소
 *               => 아무도 모르는 언어를 개발 => 몸값을 높인다
 *      C++ (C With Class)
 *      ==== class가 1개 증가 ++
 *        |
 *      자바 / MFC(C계열)
 *      ===
 *      1995 => 1996(우리나라) ===> 부상 2000년 (전자상거래:자바) : 만들어 보관 => 재사용 
 */
class Category
{
	int no; // 카테고리 번호
	String title;// 제목
	String subject;// 부제목 
	// 서로 다른 데이터형 모아서 관리 (사용자 정의 데이터형) => 관련
	/*
	 *   1. 기본 데이터형 
	 *   2. 자바에서 제공하지 않는 데이터 제작 (class)
	 *   3. 메소드 추가 ==> 한개 부품을 제작 
	 *                   ==============
	 *                    객체 지향 3대 요소 
	 *                    1) 재사용 
	 *                       = 필요시 수정해서 사용 (상속:is-a) ========> 재사용성 
	 *                       = 있는 그대로 (포함:has-a)
	 *                    2) 데이터의 중요성 => 데이터 보호 (캡슐화)
	 *                    3) 수정,추가가 가능하게 만들어 진다 (다형성) =====> 관리 용이 
	 *                    4) 이미 완성된 제품을 사용 ==> 신뢰성이 높다 
	 *                    ======================================== 유수보수
	 *                    클래스의 종류 , 클래스 접근 범위...(공개 , 해당 클래스에서 사용, 같은 폴더에서 접근
	 *                                                  상속시 접근)
	 *                    => 추상클래스 
	 *                    => 인터페이스 
	 *                    => 내부클래스 (익명의 클래스, 멤버클래스 , 지역클래스)
	 *                    => 종단클래스
	 *                    =============================================
	 *                    클래스 여러개를 만들어서 관리 ==> 관련된 클래스 분류 ==> 패키지 
	 *                    ===================================================
	 *                    사용자가 오류 : 프로그램이 유지 => 오류방지 (예외처리) ==> 6,7,8장
	 *                    
	 *   
	 *   
	 */
}
class FoodHouse
{
	
}
public class 자바메소드4 {
	// 클래스 제작 => 기본데이터형과 동일 (형변환, 배열)
	/*
	 *   <div class="info_inner_wrap">
                      <span class="title">비빔밥 맛집 베스트 25곳</span>
                      <p class="desc">"밥은 비벼야 제맛이지!"</p>
	 */
    static Category[] getCategory() throws Exception
    {
    	Category[] cate=new Category[12];
    	Document doc=Jsoup.connect("https://www.mangoplate.com").get();// 파싱 : HTML 필요한 데이터 읽기
    	Elements title=doc.select("span.title");
    	Elements subject=doc.select("p.desc");
    	//System.out.println(title);
    	//System.out.println(subject);
    	
    	for(int i=0;i<12;i++) //size()=length()
    	{
    		cate[i]=new Category();
    		cate[i].no=i+1;
    		cate[i].title=title.get(i).text();
    		cate[i].subject=subject.get(i).text();
    	}
    	return cate;
    }
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
        Category[] cate=getCategory();
        Scanner scan=new Scanner(System.in);
        while(true) // 무한루프 => 종료하는 방법 
        {
	        System.out.println("==============  맛집 카테고리 ===============");
	        for(Category c:cate)
	        {
	        	System.out.println(c.no);
	        	System.out.println(c.title);
	        	System.out.println(c.subject);
	        	System.out.println("==========================================");
	        	
	        }
	        System.out.print("카테고리 번호 선택(1~12):");
        	int index=scan.nextInt();
        	if(index==0)
        	{
        		System.out.println("프로그램 종료!!");
        		break;
        	}
        }
	}

}






