import java.util.Scanner;

class MusicData
{
	 static String[] title={
            "Your Lights",
		"�ܿ���",
		"�츰 ��¼�� ����� �ɱ�",
		"����",
		"VVS (Feat. JUSTHIS) (Prod. by GroovyRoom)",
		"Dynamite",
		"���ϴ��� ���� (2020)",
		"ù��� (Feat. SOLE (��))",
		"Life Goes On",
		"���� ���� �Ͼ��",
		"���� �ٲ��� (Duet With JYP)",
		"���� ���� �ʳ׿�",
		"What Do I Call You",
		"ON AIR (Feat. �β� & ����� & GRAY)",
		"������ �뷡",
		"�����̸� ��������",
		"���� �� ����� �ƴϴ�",
		"For You (Feat. Crush)",
		"Savage Love (Laxed - Siren Beat) (BTS Remix)",
		"��⸦ ���� (�������� �׳� X ���)",
		"HERO",
		"Lovesick Girls",
		"���θ� ���� ��",
		"���ѳ���",
		"������ ���� (Feat. �⸮���� & BIG Naughty (������))",
		"���� �͵��� ���� �� (Boy With Luv) (Feat. Halsey)",
		"���Ұ�",
		"CREDIT (Feat. ���� & �⸮���� & Zion.T)",
		"��� 60�� ��κ��̾߱�",
		"���� (Prod. ������)",
		"�ǿ� (Feat. ������ & ���̸� ���̴�) (Prod. by �ڵ� �ｺƮ)",
		"ȥ���ϰ� ���� ��",
		"��鸮�� �ɵ� �ӿ��� �� ��Ǫ���� �������ž�",
		"���õ� ������ �ʿ��� (To You My Light) (Feat.�̶��)",
		"������ �뷡",
		"��Ҽ�",
		"�׳��� ���� ���� ��������",
		"������ �� ����ؿ�",
		"�Ա�",
		"��� ��, ��� ���� (Every day, Every Moment)",
		"�ٷ�",
		"�� ������ �����ߴ� ���� (�������� �׳� X ����)",
		"�����㿡 �� ����",
		"���� ���� �Ͼ�� (Piano by ������)",
		"�Ѹ� (Feat. JUSTHIS) (Prod. by GroovyRoom)",
		"���� (Prod. & Feat. SUGA of BTS)",
		"�ƹ��� ����� ���� (Nessun Dorma)",
		"���� �� ���� �� �� ���濡��",
		"Achoo (Feat. pH-1 & HAON) (Prod. by GroovyRoom)",
		"Blueming"
		};
		static String[] singer={
		  "�̼� (�������ƽ�)",
		  "���ö",
		  "�㰢",
		  "�����",
		  "�̶��� (Mirani) & ��ġ�� & Khundi Panda & �ӽ����� (MUSHVENOM)",
		  "��ź�ҳ��",
		  "�漭",
		  "������",
		  "��ź�ҳ��",
		  "�ӿ���",
		  "��",
		  "�����",
		  "�¿� (TAEYEON)",
		  "������ (lIlBOI)",
		  "�ӿ���",
		  "Ȳ�ο�",
		  "��â��",
		  "������",
		   "Jawsh 685 & Jason Derulo & ��ź�ҳ��",
		   "���",
		   "�ӿ���",
		   "BLACKPINK",
		   "����",
		   "�̽±�",
		   "������ (lIlBOI)",
		   "��ź�ҳ��",
		   "�̽±�",
		   "������ (lIlBOI)",
		   "�ӿ���",
		   "��ȣ��",
		   "������ (Swings)",
		   "��",
		   "�����",
		   "��ũ�� (Maktub)",
		   "Standing Egg (���ĵ� ����)",
		   "��ȣ��",
		   "�̿���","��ȣ��","10CM","��Ŵ","�ӿ���","���� (KYUHYUN)","�ܳ���","�ӿ���",
		   "Khundi Panda","������ (IU)","��ȣ��","����","�̶��� (Mirani)","������ (IU)"
		};
		static String[] album={
		  "Your Lights (����ũ ������ OST Part.1)","�ܿ���","Hello","����",
		  "��̴��Ӵ� 9 Episode 1","Dynamite (DayTime Ver.)","���ϴ��� ���� (2020)",
		  "ù���","BE","������ �̽���Ʈ�� ����� Ư����","���� �ٲ���","���� ���� �ʳ׿�",
		  "What Do I Call You - The 4th Mini Album","��̴��Ӵ� 9 Final",
		  "����� �ݼ�Ÿ Part19","�����̸� ��������","���� �� ����� �ƴϴ�",
		  "For You","Savage Love (Laxed - Siren Beat) (BTS Remix)",
		  "��⸦ ���� (�������� �׳� X ���)","HERO","THE ALBUM",
		  "���θ� ���� ��","���ѳ���","��̴��Ӵ� 9 Episode 3","MAP OF THE SOUL : PERSONA",
		  "The Project","��̴��Ӵ� 9 Final","������ �̽���Ʈ�� Ʈ�� ���̵� ����Ʈ",
		  "�츮ʫ","��̴��Ӵ� 9 Semi Final","ȥ���ϰ� ���� ��","��ΰ� ü�� OST Part 3 (JTBC ���� ���)",
		  "Red Moon : To You My Light","������ �뷡","��Ҽ�","�׳��� ���� ���� ��������",
		  "������ �� ����ؿ�","5.1",
		  "'Ű�� ���� �ұ��?' OST Part. 3 (SBS ��ȭ���)","������ �̽���Ʈ�� ������ ����Ʈ",
		  "�� ������ �����ߴ� ���� (�������� �׳� X ����)","�ܳ��� �Ұ��� l","���� ���� �Ͼ��",
		  "��̴��Ӵ� 9 Episode 3","����","The Classic Album","���� �� ���� �� �� ���濡��",
		  "��̴��Ӵ� 9 Episode 3","Love poem"
		};
		
		static String[] state={
		"����","����","����","����","����",
		"����","����","����","���","���",
		"�ϰ�","�ϰ�","���","���","���",
		"���","���","���","�ϰ�","�ϰ�",
		"���","���","���","���","���",
		"���","���","���","�ϰ�","�ϰ�",
		"���","���","���","���","���",
		"���","���","���","���","���",
		"�ϰ�","�ϰ�","���","���","���",
		"���","���","���","���","���",
		"���","���","���","���","���",
		"���","�ϰ�","�ϰ�","�ϰ�","�ϰ�",
		"���","���","���","���","���",
		"���","���","���","���","���",
		"�ϰ�","�ϰ�","���","���","�ϰ�",
		"�ϰ�","���","���","���","���",
		"�ϰ�","�ϰ�","���","���","���",
		"���","�ϰ�","�ϰ�","���","���",
		"���","���","�ϰ�","�ϰ�","���",
		"���","���","���","���","���"
		};
		
		static int[] modify={
		0,0,0,0,0,
		0,0,0,2,2,
		1,1,7,7,2,
		2,3,3,4,4,
		26,26,20,20,8,
		8,32,32,7,7,
		20,20,23,23,23,
		23,16,16,28,28,
		12,12,30,30,30,
		30,48,48,34,34,
		12,12,18,18,14,
		14,16,16,19,19,
		39,39,7,7,27,
		27,61,61,31,31,
		21,21,26,26,21,
		21,23,23,27,27,
		25,25,5,5,44,
		44,26,26,6,6,
		9,9,28,28,38,
		38,7,7,15,15
		};
}
// ����� ���� �������� => int,double ... => �������� ���ÿ� ���� 
class Music
{
	String title;
	String singer;
	String album;
	String state;
	int modify;
}
class MusicManager
{
	// ������� => MusicManager�� ������ ���� 
	Music[] music=new Music[50]; // null
	// �ʱ�ȭ => ������ (����ʱ�ȭ ����)
	MusicManager()
	{
		
		for(int i=0;i<50;i++)
		{
			music[i]=new Music(); // �޸� �Ҵ� => �޸𸮸� ���� 
			music[i].title=MusicData.title[i];
			music[i].singer=MusicData.singer[i];
			music[i].album=MusicData.album[i];
			music[i].state=MusicData.state[i];
			music[i].modify=MusicData.modify[i];
		}
	}
	void musicListData()
	{
		for(Music m:music)
		{
			String s="";
			if(m.state.equals("���"))
			{
				s="�� ("+m.modify+")";
			}
			else if(m.state.equals("�ϰ�"))
			{
				s="�� ("+m.modify+")";
			}
			else
			{
				s="��";
			}
			System.out.println(s+"\t"+m.title+"\t"
					+m.singer+"\t"+m.album+"\t");
		}
	}
	void musicFindData(String title)
	{
		boolean bCheck=false;
		for(Music m:music)
		{
			if(m.title.contains(title))
			{
				bCheck=true;
				System.out.println("�뷡��:"+m.title);
				System.out.println("������:"+m.singer);
				System.out.println("�ٹ���:"+m.album);
				System.out.println("��������:"+m.state);
				System.out.println("����:"+m.modify);
				System.out.println("============================================");
			}
		}
		if(!bCheck) // true => if(bCheck) , if(bCheck==true) => if(!bCheck) , if(bCheck==false)
		{
			System.out.println("�˻��� ����� �����ϴ�");
		}
	}
}
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MusicManager m=new MusicManager();
        m.musicListData();
        System.out.println("===========================");
        Scanner scan=new Scanner(System.in);
        System.out.print("�뷡 ���� �Է�:");
        String title=scan.next();
        m.musicFindData(title);
	}

}






