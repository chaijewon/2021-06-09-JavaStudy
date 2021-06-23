import java.util.Scanner;
public class 자바메소드_4 {
	/*
	 *   
	 *   static void aaa(int b)
	 *   {
	 *       int a=10;
	 *       ccc(a);
	 *   }
	 *   static void bbb()
	 *   {
	 *       int b=20;
	 *       aaa(b)
	 *   }
	 *   static void ccc(int a)
	 *   {
	 *       int c=30;
	 *   }
	 */
    static void showMusic()
    {
    	String[] music= {
		        "1. 치맛바람 (Chi Mat Ba ...",
				"2. Next Level",
				"3. Butter",
				"4. 비와 당신",
				"5. Alcohol-Free",
				"6. 치맛바람 (Chi Mat Ba Ram)",
				"7. Next Level",
				"8. Butter",
				"9. 비와 당신",
				"10. Alcohol-Free",
				"11. 헤픈 우연",
				"12. Dun Dun Dance",
				"13. 추적이는 여름 비가 되어",
				"14. Peaches (Feat. Daniel Caesar & Giveon)",
				"15. 안녕 (Hello)",
				"16. 롤린 (Rollin')",
				"17. 라일락",
				"18. Ready to love",
				"19. 운전만해 (We Ride)",
				"20. Dynamite",
				"21. ASAP",
				"22. Celebrity",
				"23. 상상더하기",
				"24. 신호등",
				"25. 상상더하기",
				"26. Timeless",
				"27. 다정히 내 이름을 부르면",
				"28. 이제 나만 믿어요",
				"29. Savage Love (Laxed - Siren Beat) (BTS Remix)",
				"30. 작은 것들을 위한 시 (Boy With Luv) (Feat. Halsey)",
				"31. 허리춤",
				"32. 사이렌 Remix (Feat. UNEDUCATED KID & Paul Blanco)",
				"33. At My Worst",
				"34. 내 손을 잡아",
				"35. 내 입술 따뜻한 커피처럼",
				"36. 별빛 같은 나의 사랑아",
				"37. Blueming",
				"38. Coin",
				"39. 마.피.아. In the morning",
				"40. LOVE DAY (2021) (바른연애 길잡이 X 양요섭, 정은지)",
				"41. Off My Face",
				"42. 봄날",
				"43. Life Goes On",
				"44. 라라라",
				"45. HERO",
				"46. 다시 사랑한다면 (김필 Ver.)",
				"47. 멜로디",
				"48. Anyone",
				"49. Heaven's Cloud",
				"50. 밝게 빛나는 별이 되어 비춰줄게"
         };
    	for(String m:music)
    	{
    		System.out.println(m);
    	}
    }
    static void showMusicFind(String fd)
    {
    	String[] music= {
		        "1. 치맛바람 (Chi Mat Ba ...",
				"2. Next Level",
				"3. Butter",
				"4. 비와 당신",
				"5. Alcohol-Free",
				"6. 치맛바람 (Chi Mat Ba Ram)",
				"7. Next Level",
				"8. Butter",
				"9. 비와 당신",
				"10. Alcohol-Free",
				"11. 헤픈 우연",
				"12. Dun Dun Dance",
				"13. 추적이는 여름 비가 되어",
				"14. Peaches (Feat. Daniel Caesar & Giveon)",
				"15. 안녕 (Hello)",
				"16. 롤린 (Rollin')",
				"17. 라일락",
				"18. Ready to love",
				"19. 운전만해 (We Ride)",
				"20. Dynamite",
				"21. ASAP",
				"22. Celebrity",
				"23. 상상더하기",
				"24. 신호등",
				"25. 상상더하기",
				"26. Timeless",
				"27. 다정히 내 이름을 부르면",
				"28. 이제 나만 믿어요",
				"29. Savage Love (Laxed - Siren Beat) (BTS Remix)",
				"30. 작은 것들을 위한 시 (Boy With Luv) (Feat. Halsey)",
				"31. 허리춤",
				"32. 사이렌 Remix (Feat. UNEDUCATED KID & Paul Blanco)",
				"33. At My Worst",
				"34. 내 손을 잡아",
				"35. 내 입술 따뜻한 커피처럼",
				"36. 별빛 같은 나의 사랑아",
				"37. Blueming",
				"38. Coin",
				"39. 마.피.아. In the morning",
				"40. LOVE DAY (2021) (바른연애 길잡이 X 양요섭, 정은지)",
				"41. Off My Face",
				"42. 봄날",
				"43. Life Goes On",
				"44. 라라라",
				"45. HERO",
				"46. 다시 사랑한다면 (김필 Ver.)",
				"47. 멜로디",
				"48. Anyone",
				"49. Heaven's Cloud",
				"50. 밝게 빛나는 별이 되어 비춰줄게"
        };
    	
    	boolean check=false;
    	for(String m:music)
    	{
    		if(m.contains(fd))
    		{
    			System.out.println(m);
    			check=true;
    		}
    	}
    	if(check==false)
    	{
    		System.out.println("검색된 내용이 없습니다!!");
    	}
    }
	// menu
	static int showMenu()
	{
		System.out.println("===== 메뉴 =====");
		System.out.println("1. 뮤직목록");
		System.out.println("2. 뮤직찾기");
		System.out.println("3. 종료");
		System.out.println("===============");
		Scanner scan=new Scanner(System.in);
		System.out.print("메뉴 입력:");
		return scan.nextInt();
	}
	// 영화목록 
	// 영화 상세보기 
	// 종료 
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
        while(true)
        {
        	int menu=showMenu();
        	if(menu==3)
        	{
        		System.out.println("프로그램 종료");
        		break;
        	}
        	else if(menu==1)
        	{
        		System.out.println("===== 뮤직 목록 출력 =====");
        		showMusic();
        		
        	}
        	else if(menu==2)
        	{
        		System.out.println("===== 뮤직 찾기=====");
        		Scanner scan=new Scanner(System.in);
            	System.out.print("검색어 입력:");
            	String fd=scan.next();
        		showMusicFind(fd);
        		
        	}
        }
	}

}





