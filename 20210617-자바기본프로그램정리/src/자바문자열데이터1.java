import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
// contains => ���ڿ��߿� ���Կ��� => �˻� 
public class �ڹٹ��ڿ�������1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		// �Է� => 
		Scanner scan=new Scanner(System.in);
        while(true) //���ѷ��� => �����ϴ� ������ ÷�� => for(;;)
        {
        	System.out.println("==================�޴�=================");
        	System.out.println("1. ���� ���");
        	System.out.println("2. ���� �˻�");
        	System.out.println("3. ����");
        	System.out.println("======================================");
        	System.out.print("�޴� ����=>(���:1,�˻�:2,����:3):");
        	int menu=scan.nextInt();
        	if(menu==3)
        	{
        		break; // �ݺ����� �ߴ� 
        	}
        	/*
        	 *   <a href="#" class="title ellipsis" title="���" onclick="fnPlaySong('93522004','1');return false;">
                   �����̴� ���� �� �Ǿ�</a>
        	 */
        	else if(menu==1)
        	{
        		Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200").get();//������Ʈ ���� 
        		Elements a=doc.select("a.title");
        		for(int i=0;i<50;i++)
        		{
        			System.out.println((i+1)+". "+a.get(i).text());
        		}
        	}
        	else if(menu==2)
        	{
        		System.out.print("�˻��� �Է�:");
        		String fd=scan.next();
        		
        		Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200").get();//������Ʈ ���� 
        		Elements a=doc.select("a.title");
        		boolean bCheck=false;
        		for(int i=0;i<50;i++)
        		{
        			if(a.get(i).text().contains(fd))
        			{
        			   System.out.println((i+1)+". "+a.get(i).text());
        			   bCheck=true;
        			}
        		}
        		if(bCheck==false)
        		{
        			System.out.println("�˻��� ����� �����ϴ�");
        		}
        	}
        	else // default => (1,2,3)���� �ٸ� ��ȣ�� ���ý� ó���ϴ� ���� 
        	{
        		System.out.println("�޴��� �����ϼ���");
        	}
        }
        System.out.println("���α׷� ����");
	}

}






