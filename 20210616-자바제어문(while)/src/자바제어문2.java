/*
 *   while 
 *   ����)
 *        �ʱⰪ        ==== 1
 *        while(���ǽ�) ==== 2
 *        {
 *           �ݺ� ���๮�� ==  3
 *           ������     ==== 4 ===> �̵� (������ 2�� ���ǽ�)
 *        }
 *        2������ ���ǽ��� false�� while�� ����
 *        
 *        public static void main(String[] args) 
 *        {
 *            int a=10;
 *            if(a==10)
 *            {
 *               int b=20;
 *               if(b==20)
 *               {
 *                  int c=30;
 *                  
 *                  // a,b,c���� ��� 
 *               } ====>c������ �޸𸮿��� ������� 
 *               
 *               // a,b����
 *            } ===> b������ �޸𸮿��� �������  ====> �ý������� �޸� �����ϴ� ���� (����=>�޸���ü ����)
 *                                                ������� �ñ� => {} (��Ϻ���,��������)
 *            
 *            // a������ ����� ���� 
 *        }
 *        
 *        ������ ���� 
 *        => �������� 
 *           = �������� 
 *           = �������� 
 *           = �÷α׺��� 
 *           int i=0;
 *           for(i=1;i<=10;i++)
 *           {
 *               ó��
 *           }//i�� ������� 
 *           
 *           for(i=1;i<=10;i++)
 *           {
 *              
 *           }// i
 *           
 *           
 *        
 */
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
public class �ڹ����2 {
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
        // ���ĺ� 
		//char c='A'; // �޸𸮰� main�� ����ñ��� ����
		/*char c='A';
		while(c<='Z')
		{	
			System.out.print(c++);
			//c++;
		}*/
		Scanner scan=new Scanner(System.in);
		while(true) // ���ѷ��� => �����ϴ� ��� 
		{
			System.out.println("======= �޴� ========");
			System.out.println("1. ���� �� ��ȭ");
			System.out.println("2. ���� ���� ��ȭ");
			System.out.println("3. ��ȭ ����");
			System.out.println("4. ����");
			System.out.println("====================");
			System.out.print("�޴� ����:");
			int menu=scan.nextInt();
			
			if(menu==1)
			{
				//System.out.println("���� �� ��ȭ ����Դϴ�");
				Document doc=Jsoup.connect("https://movie.daum.net/ranking/reservation").get();
				Elements title=doc.select("strong.tit_item");
				for(int i=0;i<title.size();i++)
				{
					System.out.println(title.get(i).text());
				}
			}
			else if(menu==2)
			{
				Document doc=Jsoup.connect("https://movie.daum.net/ranking/boxoffice/weekly").get();
				Elements title=doc.select("strong.tit_item");
				for(int i=0;i<title.size();i++)
				{
					System.out.println(title.get(i).text());
				}
			}
			else if(menu==3)
				System.out.println("��ȭ ���� ȭ���Դϴ�");
			else if(menu==4)
				System.exit(0);// ���α׷� ���� (0=>���� ����)
		}
		
	}

}







