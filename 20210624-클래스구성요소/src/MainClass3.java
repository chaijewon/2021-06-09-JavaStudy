import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

/*
 *   Ŭ���� => � ������ 
 */
class Music{
	int rank;
	String title;
	String singer;
	String album;
	int id; // ���� �� ��
	String state;// ���� , ��� , �ϰ�
	// String poster;
}

public class MainClass3 {
    
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
        Music[] music_data=new Music[200];
        int k=1;
        for(int i=1;i<=4;i++)
        {
        	Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=20210624&hh=15&rtm=Y&pg="+i).get(); // ����Ʈ �����ؼ� ��� ������ �о� �´� 
        	//System.out.println(doc);
        	Elements title=doc.select("a.title");
        	Elements singer=doc.select("a.artist");
        	Elements album=doc.select("a.albumtitle");
        	//System.out.println(title);
        	for(int j=0;j<title.size();j++)
        	{
        		try
        		{
	        		System.out.println("����:"+k);
	        		System.out.println(title.get(j).text());
	        		System.out.println(singer.get(j).text());
	        		System.out.println(album.get(j).text());
	        		k++;
	        		System.out.println("====================================");
        		}catch(Exception ex) {}
        	}
        }
        
	}
	
}








