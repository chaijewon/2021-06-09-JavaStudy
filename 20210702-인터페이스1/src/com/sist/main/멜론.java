package com.sist.main;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
/*
 *   <div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									<a href="javascript:melon.play.playSong('19030101',33625988);" title="�ٶ� ���� ���">�ٶ� ����</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									<a href="javascript:melon.link.goArtistDetail('2939212');" title="MSG���ʺ�(M.O.M) - ������ �̵�" >MSG���ʺ�(M.O.M)</a><span class="checkEllipsis" style="display:none"><a href="javascript:melon.link.goArtistDetail('2939212');" title="MSG���ʺ�(M.O.M) - ������ �̵�" >MSG���ʺ�(M.O.M)</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10638275');" title="MSG���ʺ� 1�� - ������ �̵�">MSG���ʺ� 1��</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="�ٶ� ���� ���ƿ�" data-song-no="33625988" data-song-menuid="19030101">
								<span class="odd_span">���ƿ�</span>
								<span class="cnt">
									<span class="none">�ѰǼ�</span>
									0
								</span>
							</button>
						</div></td>
 */
public class ��� implements ����{
    public static void main(String[] args) throws Exception{
		���� music=new ���();
		music.musicAllData();
	}
	@Override
	public void musicAllData() throws Exception{
		// TODO Auto-generated method stub
		// URL���� 
		Document doc=Jsoup.connect("https://www.melon.com/chart/index.htm").get();//get() ����� �����͸� ���� �о� �´� 
		// HTML => �±�����  <a>data</a>  a.text()
		Elements title=doc.select("div.rank01 a");
		Elements singer=doc.select("div.rank02 a");
		Elements album=doc.select("div.rank03 a");
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
