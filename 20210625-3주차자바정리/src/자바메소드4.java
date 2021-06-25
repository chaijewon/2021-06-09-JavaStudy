import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import java.util.Scanner;

// ���� ��� => �����÷���Ʈ
/*
 *   ��ü ���� ���α׷� 
 *   70�⵵ (sw)              70�⵵(hw)
 *     C��� (��������)           => ����ȸ�� (���� �Ѱ��� ���:����)
 *        |                         |
 *   80�⵵ 
 *        | ��Ʈ�� (����ȸ��: ���� => ����)
 *          ����) ���� => C��� ������ �缺 (IBM)
 *               => ������ �ܰ��� ����
 *               => �ƹ��� �𸣴� �� ���� => ������ ���δ�
 *      C++ (C With Class)
 *      ==== class�� 1�� ���� ++
 *        |
 *      �ڹ� / MFC(C�迭)
 *      ===
 *      1995 => 1996(�츮����) ===> �λ� 2000�� (���ڻ�ŷ�:�ڹ�) : ����� ���� => ���� 
 */
class Category
{
	int no; // ī�װ� ��ȣ
	String title;// ����
	String subject;// ������ 
	// ���� �ٸ� �������� ��Ƽ� ���� (����� ���� ��������) => ����
	/*
	 *   1. �⺻ �������� 
	 *   2. �ڹٿ��� �������� �ʴ� ������ ���� (class)
	 *   3. �޼ҵ� �߰� ==> �Ѱ� ��ǰ�� ���� 
	 *                   ==============
	 *                    ��ü ���� 3�� ��� 
	 *                    1) ���� 
	 *                       = �ʿ�� �����ؼ� ��� (���:is-a) ========> ���뼺 
	 *                       = �ִ� �״�� (����:has-a)
	 *                    2) �������� �߿伺 => ������ ��ȣ (ĸ��ȭ)
	 *                    3) ����,�߰��� �����ϰ� ����� ���� (������) =====> ���� ���� 
	 *                    4) �̹� �ϼ��� ��ǰ�� ��� ==> �ŷڼ��� ���� 
	 *                    ======================================== ��������
	 *                    Ŭ������ ���� , Ŭ���� ���� ����...(���� , �ش� Ŭ�������� ���, ���� �������� ����
	 *                                                  ��ӽ� ����)
	 *                    => �߻�Ŭ���� 
	 *                    => �������̽� 
	 *                    => ����Ŭ���� (�͸��� Ŭ����, ���Ŭ���� , ����Ŭ����)
	 *                    => ����Ŭ����
	 *                    =============================================
	 *                    Ŭ���� �������� ���� ���� ==> ���õ� Ŭ���� �з� ==> ��Ű�� 
	 *                    ===================================================
	 *                    ����ڰ� ���� : ���α׷��� ���� => �������� (����ó��) ==> 6,7,8��
	 *                    
	 *   
	 *   
	 */
}
class FoodHouse
{
	
}
public class �ڹٸ޼ҵ�4 {
	// Ŭ���� ���� => �⺻���������� ���� (����ȯ, �迭)
	/*
	 *   <div class="info_inner_wrap">
                      <span class="title">����� ���� ����Ʈ 25��</span>
                      <p class="desc">"���� �񺭾� ��������!"</p>
	 */
    static Category[] getCategory() throws Exception
    {
    	Category[] cate=new Category[12];
    	Document doc=Jsoup.connect("https://www.mangoplate.com").get();// �Ľ� : HTML �ʿ��� ������ �б�
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
        while(true) // ���ѷ��� => �����ϴ� ��� 
        {
	        System.out.println("==============  ���� ī�װ� ===============");
	        for(Category c:cate)
	        {
	        	System.out.println(c.no);
	        	System.out.println(c.title);
	        	System.out.println(c.subject);
	        	System.out.println("==========================================");
	        	
	        }
	        System.out.print("ī�װ� ��ȣ ����(1~12):");
        	int index=scan.nextInt();
        	if(index==0)
        	{
        		System.out.println("���α׷� ����!!");
        		break;
        	}
        }
	}

}






