package com.sist.string;
import java.sql.*;
/*
"�������,"
+"parachute,"
+"���� ��� ������ �Ұ�������,"
+"On My Way,"
+"Into the I-LAND,"
+"Shape Of You,"
+"�ٽ� ���� �ٴ尡,"
+"Way Back Home,"
+"����,"
+"�ȷ�Ʈ (Feat. G-DRAGON),"
+"�׶��� ���Ҿ�,"
+"�ٽ� ������ ��,"
+"HIP,"
+"Blue & Grey,"
+"��ģ �Ҹ�,"
+"Stuck With U,"
+"�״��� ��,"
+"������ �Ǿ��ٰԿ� (Prod. by �˰��� & ȥ������),"
+"������� (DUMDi DUMDi),"
+"��Ȯ��,"
+"YOUTH,"
+"Mood (Feat. Iann Dior),"
+"���� ����,"
+"����� �������� ���� �����ϰ� ����,"
+"Square (2017),"
+"����,"
+"������ �� (My Way),"
+"����̶� ��δ� ����,"
+"�䵥������ ź�� (Lamento Di Federico),"
+"Black Mamba,"
+"�ҹ���,"
+"�������� �� ��� ���� �׶���,"
+"MAGO,"
+"���,"
+"�� �ҽ�,"
+"Psycho,"
+"������ �뷡,"
+"������ �� (Feat. Jessi & JUSTHIS) (Prod. by GroovyRoom),"
+"���� �����Ǹ� (E Lucevan Le Stelle),"
+"Celebrity,"
+"��� (�ٸ����� ������ X �㰢),"
+"�ڵ��ƺ��� ���ƿ�,"
+"�� ���� ���� ���ؿ� (�ٸ����� ������ X 10CM),"
+"�� ���� �ؿ�,"
+"Dynamite,"
+"�츰 ��¼�� ����� �ɱ�,"
+"I'm Not Cool,"
+"VVS (Feat. JUSTHIS) (Prod. by GroovyRoom),"
+"���ϴ��� ���� (2020),"
+"������ �׷�"
*/
import java.util.Scanner;
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="�������,"
        		+"parachute,"
        		+"���� ��� ������ �Ұ�������,"
        		+"On My Way,"
        		+"Into the I-LAND,"
        		+"Shape Of You,"
        		+"�ٽ� ���� �ٴ尡,"
        		+"Way Back Home,"
        		+"����,"
        		+"�ȷ�Ʈ (Feat. G-DRAGON),"
        		+"�׶��� ���Ҿ�,"
        		+"�ٽ� ������ ��,"
        		+"HIP,"
        		+"Blue & Grey,"
        		+"��ģ �Ҹ�,"
        		+"Stuck With U,"
        		+"�״��� ��,"
        		+"������ �Ǿ��ٰԿ� (Prod. by �˰��� & ȥ������),"
        		+"������� (DUMDi DUMDi),"
        		+"��Ȯ��,"
        		+"YOUTH,"
        		+"Mood (Feat. Iann Dior),"
        		+"���� ����,"
        		+"����� �������� ���� �����ϰ� ����,"
        		+"Square (2017),"
        		+"����,"
        		+"������ �� (My Way),"
        		+"����̶� ��δ� ����,"
        		+"�䵥������ ź�� (Lamento Di Federico),"
        		+"Black Mamba,"
        		+"�ҹ���,"
        		+"�������� �� ��� ���� �׶���,"
        		+"MAGO,"
        		+"���,"
        		+"�� �ҽ�,"
        		+"Psycho,"
        		+"������ �뷡,"
        		+"������ �� (Feat. Jessi & JUSTHIS) (Prod. by GroovyRoom),"
        		+"���� �����Ǹ� (E Lucevan Le Stelle),"
        		+"Celebrity,"
        		+"��� (�ٸ����� ������ X �㰢),"
        		+"�ڵ��ƺ��� ���ƿ�,"
        		+"�� ���� ���� ���ؿ� (�ٸ����� ������ X 10CM),"
        		+"�� ���� �ؿ�,"
        		+"Dynamite,"
        		+"�츰 ��¼�� ����� �ɱ�,"
        		+"I'm Not Cool,"
        		+"VVS (Feat. JUSTHIS) (Prod. by GroovyRoom),"
        		+"���ϴ��� ���� (2020),"
        		+"������ �׷�";
        // �뷡������ �迭�� ���� => split
        String[] title=s.split(","); // String[] split(String regex)
        // ��� 
        for(String ss:title)
        {
        	System.out.println(ss);
        }
        // ã�� 
        System.out.println("==============================================");
        // contains : ���ڰ� ���� => ����Ŭ (like)
        // ����� �Է��� �޴´� 
        Scanner scan=new Scanner(System.in);
        //System.out.print("�˻��� �Է�:");
        //String fd=scan.next();
        /*boolean bCheck=false; // �˻������� ���� ��� 
        for(String ss:title)
        {
        	if(ss.contains(fd)) // contains => ������ boolean
        	{
        		bCheck=true;
        		System.out.println(ss);
        	}
        		
        }
        if(!bCheck)
        	System.out.println("�˻��� ������ �����ϴ�");// �ѹ��� �����ϰ� ����� ���α׷�*/
        // startsWith : ���۹��ڿ��� ���� �ϴ� (�ڵ��ϼ���) 
        /*
         *    ����Ŭ : �ʿ��� ������ ���� (�˻�,�߰�,����,����) => CURD 
         *                                            Create Update Read Delete
         *                                            ======�߰�     ===== �˻�
         *    �ڹ� : ����Ŭ�� �����ؼ� ������ ���� => ���� 
         *    HTML/CSS => JSP : �ڹٿ��� ������ �����͸� ���
         *    ============================================ �����ڸ��� �ڵ��ϴ� ����� �ٸ���
         *    => �ҽ��� ���� (����) => ������ (ǥ��ȭ) 
         *    
         */
        /*for(String ss:title)
        {
        	//if(ss.startsWith(fd))
        	if(ss.endsWith(fd))
        	{
        		System.out.println(ss);//�������� ���� => �ڵ��ϼ��� 
        	}
        }*/
        String data="ȫ�浿?�̼���?��û��?������?������";
        String[] names=data.split("\\?"); // \\^ , \\$ , \\| , \\+ , \\*
        // ���� ?�� ����Ѵ� ���ϱ�ȣ 
        for(String name:names)
        {
        	System.out.println(name);
        }
        
	}

}








