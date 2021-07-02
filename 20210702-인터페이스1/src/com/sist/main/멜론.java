package com.sist.main;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
/*
 *   <div class="wrap_song_info">
								<div class="ellipsis rank01"><span>
									<a href="javascript:melon.play.playSong('19030101',33625988);" title="바라만 본다 재생">바라만 본다</a>
								</span></div>
								
								<br>
								<div class="ellipsis rank02">
									
									<a href="javascript:melon.link.goArtistDetail('2939212');" title="MSG워너비(M.O.M) - 페이지 이동" >MSG워너비(M.O.M)</a><span class="checkEllipsis" style="display:none"><a href="javascript:melon.link.goArtistDetail('2939212');" title="MSG워너비(M.O.M) - 페이지 이동" >MSG워너비(M.O.M)</a></span>
								</div>
								
							</div>
						</div></td>
						<td><div class="wrap">
							<div class="wrap_song_info">
								<div class="ellipsis rank03">
									<a href="javascript:melon.link.goAlbumDetail('10638275');" title="MSG워너비 1집 - 페이지 이동">MSG워너비 1집</a>
								</div>
							</div>
						</div></td>
						<td><div class="wrap">
							<button type="button" class="button_etc like" title="바라만 본다 좋아요" data-song-no="33625988" data-song-menuid="19030101">
								<span class="odd_span">좋아요</span>
								<span class="cnt">
									<span class="none">총건수</span>
									0
								</span>
							</button>
						</div></td>
 */
public class 멜론 implements 뮤직{
    public static void main(String[] args) throws Exception{
		뮤직 music=new 멜론();
		music.musicAllData();
	}
	@Override
	public void musicAllData() throws Exception{
		// TODO Auto-generated method stub
		// URL연결 
		Document doc=Jsoup.connect("https://www.melon.com/chart/index.htm").get();//get() 저장된 데이터를 전부 읽어 온다 
		// HTML => 태그형식  <a>data</a>  a.text()
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
