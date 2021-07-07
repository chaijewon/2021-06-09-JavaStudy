package com.sist.string;
import java.sql.*;
/*
"따라따라,"
+"parachute,"
+"좋은 사람 있으면 소개시켜줘,"
+"On My Way,"
+"Into the I-LAND,"
+"Shape Of You,"
+"다시 여기 바닷가,"
+"Way Back Home,"
+"고맙소,"
+"팔레트 (Feat. G-DRAGON),"
+"그때가 좋았어,"
+"다시 만날까 봐,"
+"HIP,"
+"Blue & Grey,"
+"미친 소리,"
+"Stuck With U,"
+"그대라는 시,"
+"애인이 되어줄게요 (Prod. by 알고보니 & 혼수상태),"
+"덤디덤디 (DUMDi DUMDi),"
+"소확행,"
+"YOUTH,"
+"Mood (Feat. Iann Dior),"
+"누구 없소,"
+"사랑은 지날수록 더욱 선명하게 남아,"
+"Square (2017),"
+"선물,"
+"나만의 길 (My Way),"
+"사랑이란 멜로는 없어,"
+"페데리코의 탄식 (Lamento Di Federico),"
+"Black Mamba,"
+"할무니,"
+"기억해줘요 내 모든 날과 그때를,"
+"MAGO,"
+"잠시,"
+"니 소식,"
+"Psycho,"
+"오래된 노래,"
+"여백의 미 (Feat. Jessi & JUSTHIS) (Prod. by GroovyRoom),"
+"별은 빛나건만 (E Lucevan Le Stelle),"
+"Celebrity,"
+"고백 (바른연애 길잡이 X 허각),"
+"뒤돌아보지 말아요,"
+"이 밤을 빌려 말해요 (바른연애 길잡이 X 10CM),"
+"술 한잔 해요,"
+"Dynamite,"
+"우린 어쩌다 헤어진 걸까,"
+"I'm Not Cool,"
+"VVS (Feat. JUSTHIS) (Prod. by GroovyRoom),"
+"밤하늘의 별을 (2020),"
+"마음이 그래"
*/
import java.util.Scanner;
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="따라따라,"
        		+"parachute,"
        		+"좋은 사람 있으면 소개시켜줘,"
        		+"On My Way,"
        		+"Into the I-LAND,"
        		+"Shape Of You,"
        		+"다시 여기 바닷가,"
        		+"Way Back Home,"
        		+"고맙소,"
        		+"팔레트 (Feat. G-DRAGON),"
        		+"그때가 좋았어,"
        		+"다시 만날까 봐,"
        		+"HIP,"
        		+"Blue & Grey,"
        		+"미친 소리,"
        		+"Stuck With U,"
        		+"그대라는 시,"
        		+"애인이 되어줄게요 (Prod. by 알고보니 & 혼수상태),"
        		+"덤디덤디 (DUMDi DUMDi),"
        		+"소확행,"
        		+"YOUTH,"
        		+"Mood (Feat. Iann Dior),"
        		+"누구 없소,"
        		+"사랑은 지날수록 더욱 선명하게 남아,"
        		+"Square (2017),"
        		+"선물,"
        		+"나만의 길 (My Way),"
        		+"사랑이란 멜로는 없어,"
        		+"페데리코의 탄식 (Lamento Di Federico),"
        		+"Black Mamba,"
        		+"할무니,"
        		+"기억해줘요 내 모든 날과 그때를,"
        		+"MAGO,"
        		+"잠시,"
        		+"니 소식,"
        		+"Psycho,"
        		+"오래된 노래,"
        		+"여백의 미 (Feat. Jessi & JUSTHIS) (Prod. by GroovyRoom),"
        		+"별은 빛나건만 (E Lucevan Le Stelle),"
        		+"Celebrity,"
        		+"고백 (바른연애 길잡이 X 허각),"
        		+"뒤돌아보지 말아요,"
        		+"이 밤을 빌려 말해요 (바른연애 길잡이 X 10CM),"
        		+"술 한잔 해요,"
        		+"Dynamite,"
        		+"우린 어쩌다 헤어진 걸까,"
        		+"I'm Not Cool,"
        		+"VVS (Feat. JUSTHIS) (Prod. by GroovyRoom),"
        		+"밤하늘의 별을 (2020),"
        		+"마음이 그래";
        // 노래제목을 배열로 저장 => split
        String[] title=s.split(","); // String[] split(String regex)
        // 출력 
        for(String ss:title)
        {
        	System.out.println(ss);
        }
        // 찾기 
        System.out.println("==============================================");
        // contains : 문자가 포함 => 오라클 (like)
        // 사용자 입력을 받는다 
        Scanner scan=new Scanner(System.in);
        //System.out.print("검색어 입력:");
        //String fd=scan.next();
        /*boolean bCheck=false; // 검색내용이 없는 경우 
        for(String ss:title)
        {
        	if(ss.contains(fd)) // contains => 리턴형 boolean
        	{
        		bCheck=true;
        		System.out.println(ss);
        	}
        		
        }
        if(!bCheck)
        	System.out.println("검색된 내용이 없습니다");// 한번만 수행하게 만드는 프로그램*/
        // startsWith : 시작문자열이 동일 하다 (자동완성기) 
        /*
         *    오라클 : 필요한 데이터 저장 (검색,추가,수정,삭제) => CURD 
         *                                            Create Update Read Delete
         *                                            ======추가     ===== 검색
         *    자바 : 오라클을 연결해서 데이터 관리 => 전송 
         *    HTML/CSS => JSP : 자바에서 보내준 데이터를 출력
         *    ============================================ 개발자마다 코딩하는 방식이 다르다
         *    => 소스를 통합 (관리) => 스프링 (표준화) 
         *    
         */
        /*for(String ss:title)
        {
        	//if(ss.startsWith(fd))
        	if(ss.endsWith(fd))
        	{
        		System.out.println(ss);//브라우저로 전송 => 자동완성기 
        	}
        }*/
        String data="홍길동?이순신?심청이?강감찬?춘향이";
        String[] names=data.split("\\?"); // \\^ , \\$ , \\| , \\+ , \\*
        // 실제 ?를 사용한다 패턴기호 
        for(String name:names)
        {
        	System.out.println(name);
        }
        
	}

}








