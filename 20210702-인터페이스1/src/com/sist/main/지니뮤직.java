package com.sist.main;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class ���Ϲ��� implements ����{

	public static void main(String[] args) throws Exception{
		���� music=new ���Ϲ���();
		music.musicAllData();
	}
	@Override
	public void musicAllData() throws Exception{
		// TODO Auto-generated method stub
		// URL���� 
		Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200").get();//get() ����� �����͸� ���� �о� �´� 
		// HTML => �±�����  <a>data</a>  a.text()
		Elements title=doc.select("a.title");
		Elements singer=doc.select("a.artist");
		Elements album=doc.select("a.albumtitle");
		//System.out.println(title);
		for(int i=0;i<title.size();i++)
		{
			System.out.println(title.get(i).text());
			System.out.println(singer.get(i).text());
			System.out.println(album.get(i).text());
			System.out.println("===============================================");
		}
	}

	@Override
	public void musicFind(int a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void musicDetail(int a) {
		// TODO Auto-generated method stub
		
	}

}
