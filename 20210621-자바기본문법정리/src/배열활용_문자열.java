import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

/*
 *    <a href="#" class="title ellipsis" title="���" onclick="fnPlaySong('93562243','1');return false;">
   ġ���ٶ� (Chi Mat Ba Ram)</a>

     <a href="#" class="artist ellipsis" onclick="fnViewArtist('80130534');return false;">�극�̺�ɽ� (Brave girls)</a>
                                        
     <div class="toggle-button-box">
     <button type="button" class="btn artist-etc" onclick="fnRelationArtistList('93562243');">��</button>
       <ul class="list" id="RelationArtist_93562243"></ul>
       </div>
                                        
       <i class="bar">|</i>
       <a href="#" class="albumtitle ellipsis" onclick="fnViewAlbumLayer('82095179');return false;">Summer Queen</a>
                   </td>
 */
public class �迭Ȱ��_���ڿ� {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
        String[] title=new String[200];
        String[] singer=new String[200];
        String[] album=new String[200];
        // index  title[0],singer[0],album[0]
        int index=0;
        for(int i=1;i<=4;i++)
        {
        	Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=20210621&hh=15&rtm=Y&pg="+i).get();
            Elements titles=doc.select("a.title");
            Elements singers=doc.select("a.artist");
            Elements albums=doc.select("a.albumtitle");
            for(int j=0;j<50;j++)
            {
            	/*System.out.println((index+1)+"."+titles.get(j).text()
            	 +" "+singers.get(j).text()
            	 +" "+albums.get(j).text()
            	);*/
            	
            	title[index]=titles.get(j).text();
            	singer[index]=singers.get(j).text();
            	album[index]=albums.get(j).text();
            	index++;
            }
            
        }
        
        // ���α׷� 
        // 1. �뷡 ���� ���
        int i=1;
        for(String s:title)
        {
        	System.out.println(i+". "+s);
        	i++;
        }
        
        System.out.println("============================================");
        Scanner scan=new Scanner(System.in);
        System.out.print("������ �Է�:");
        String data=scan.next();
        /*boolean bCheck=false;
        for(String s:title) // for,while ==> �׻� ó������ ������ ���� => if~else => default
        {
        	if(s.contains(data))
        	{
        		System.out.println(s);
        		bCheck=true;
        	}
        	
        }
        if(!bCheck)
        {
        	System.out.println("�˻��� ����� �����ϴ�!!");
        }*/
        // �������� �Է��ϸ� => �뷡���� ��� 
       int res=0;
       for(int k=0;k<singer.length;k++)
       {
    	   if(singer[k].startsWith(data)) // equals , startsWith , contains
    	   {
    		   res=k; // �ٸ� ������ ã�� ���  (������ => ����,�ٹ�) ==> �ε���
    		   break;
    	   }
       }
       System.out.println(title[res]);
       System.out.println(album[res]);
        
        
	}

}







