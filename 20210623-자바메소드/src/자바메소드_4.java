import java.util.Scanner;
public class �ڹٸ޼ҵ�_4 {
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
		        "1. ġ���ٶ� (Chi Mat Ba ...",
				"2. Next Level",
				"3. Butter",
				"4. ��� ���",
				"5. Alcohol-Free",
				"6. ġ���ٶ� (Chi Mat Ba Ram)",
				"7. Next Level",
				"8. Butter",
				"9. ��� ���",
				"10. Alcohol-Free",
				"11. ���� �쿬",
				"12. Dun Dun Dance",
				"13. �����̴� ���� �� �Ǿ�",
				"14. Peaches (Feat. Daniel Caesar & Giveon)",
				"15. �ȳ� (Hello)",
				"16. �Ѹ� (Rollin')",
				"17. ���϶�",
				"18. Ready to love",
				"19. �������� (We Ride)",
				"20. Dynamite",
				"21. ASAP",
				"22. Celebrity",
				"23. �����ϱ�",
				"24. ��ȣ��",
				"25. �����ϱ�",
				"26. Timeless",
				"27. ������ �� �̸��� �θ���",
				"28. ���� ���� �Ͼ��",
				"29. Savage Love (Laxed - Siren Beat) (BTS Remix)",
				"30. ���� �͵��� ���� �� (Boy With Luv) (Feat. Halsey)",
				"31. �㸮��",
				"32. ���̷� Remix (Feat. UNEDUCATED KID & Paul Blanco)",
				"33. At My Worst",
				"34. �� ���� ���",
				"35. �� �Լ� ������ Ŀ��ó��",
				"36. ���� ���� ���� �����",
				"37. Blueming",
				"38. Coin",
				"39. ��.��.��. In the morning",
				"40. LOVE DAY (2021) (�ٸ����� ������ X ��伷, ������)",
				"41. Off My Face",
				"42. ����",
				"43. Life Goes On",
				"44. ����",
				"45. HERO",
				"46. �ٽ� ����Ѵٸ� (���� Ver.)",
				"47. ��ε�",
				"48. Anyone",
				"49. Heaven's Cloud",
				"50. ��� ������ ���� �Ǿ� �����ٰ�"
         };
    	for(String m:music)
    	{
    		System.out.println(m);
    	}
    }
    static void showMusicFind(String fd)
    {
    	String[] music= {
		        "1. ġ���ٶ� (Chi Mat Ba ...",
				"2. Next Level",
				"3. Butter",
				"4. ��� ���",
				"5. Alcohol-Free",
				"6. ġ���ٶ� (Chi Mat Ba Ram)",
				"7. Next Level",
				"8. Butter",
				"9. ��� ���",
				"10. Alcohol-Free",
				"11. ���� �쿬",
				"12. Dun Dun Dance",
				"13. �����̴� ���� �� �Ǿ�",
				"14. Peaches (Feat. Daniel Caesar & Giveon)",
				"15. �ȳ� (Hello)",
				"16. �Ѹ� (Rollin')",
				"17. ���϶�",
				"18. Ready to love",
				"19. �������� (We Ride)",
				"20. Dynamite",
				"21. ASAP",
				"22. Celebrity",
				"23. �����ϱ�",
				"24. ��ȣ��",
				"25. �����ϱ�",
				"26. Timeless",
				"27. ������ �� �̸��� �θ���",
				"28. ���� ���� �Ͼ��",
				"29. Savage Love (Laxed - Siren Beat) (BTS Remix)",
				"30. ���� �͵��� ���� �� (Boy With Luv) (Feat. Halsey)",
				"31. �㸮��",
				"32. ���̷� Remix (Feat. UNEDUCATED KID & Paul Blanco)",
				"33. At My Worst",
				"34. �� ���� ���",
				"35. �� �Լ� ������ Ŀ��ó��",
				"36. ���� ���� ���� �����",
				"37. Blueming",
				"38. Coin",
				"39. ��.��.��. In the morning",
				"40. LOVE DAY (2021) (�ٸ����� ������ X ��伷, ������)",
				"41. Off My Face",
				"42. ����",
				"43. Life Goes On",
				"44. ����",
				"45. HERO",
				"46. �ٽ� ����Ѵٸ� (���� Ver.)",
				"47. ��ε�",
				"48. Anyone",
				"49. Heaven's Cloud",
				"50. ��� ������ ���� �Ǿ� �����ٰ�"
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
    		System.out.println("�˻��� ������ �����ϴ�!!");
    	}
    }
	// menu
	static int showMenu()
	{
		System.out.println("===== �޴� =====");
		System.out.println("1. �������");
		System.out.println("2. ����ã��");
		System.out.println("3. ����");
		System.out.println("===============");
		Scanner scan=new Scanner(System.in);
		System.out.print("�޴� �Է�:");
		return scan.nextInt();
	}
	// ��ȭ��� 
	// ��ȭ �󼼺��� 
	// ���� 
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
        while(true)
        {
        	int menu=showMenu();
        	if(menu==3)
        	{
        		System.out.println("���α׷� ����");
        		break;
        	}
        	else if(menu==1)
        	{
        		System.out.println("===== ���� ��� ��� =====");
        		showMusic();
        		
        	}
        	else if(menu==2)
        	{
        		System.out.println("===== ���� ã��=====");
        		Scanner scan=new Scanner(System.in);
            	System.out.print("�˻��� �Է�:");
            	String fd=scan.next();
        		showMusicFind(fd);
        		
        	}
        }
	}

}





