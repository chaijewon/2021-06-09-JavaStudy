package com.sist.main;
import javax.swing.*;
import java.awt.*;
public class GameView extends JPanel{
       Image back,horse;
       int x=600,y=450;
       /*
        *   JPanel 
        *     private int width
        *     private int height
        *     => getWidth() 
        */
       public GameView()
       {
    	 // �ʱ�ȭ => �����б� => �ʱ�ȭ��� 
    	 back=Toolkit.getDefaultToolkit().getImage("c:\\javaDev\\back.jpg");
    	 horse=Toolkit.getDefaultToolkit().getImage("c:\\javaDev\\horse.gif");
       }
		@Override
		public void paint(Graphics g) {
			// ȸ�� => �̹����� ���� ==> ����� ������ ����� ���� => �������̵� 
			// Graphics => ȭ�鿡 �׸��� �׸��� 
			g.drawImage(back,0,0,getWidth(),getHeight(),this);
			g.drawImage(horse,x,y,150,100,this);
		}
		
     
}





