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
    	 // 초기화 => 파일읽기 => 초기화블록 
    	 back=Toolkit.getDefaultToolkit().getImage("c:\\javaDev\\back.jpg");
    	 horse=Toolkit.getDefaultToolkit().getImage("c:\\javaDev\\horse.gif");
       }
		@Override
		public void paint(Graphics g) {
			// 회색 => 이미지로 변경 ==> 상속후 기존의 기능을 변경 => 오버라이딩 
			// Graphics => 화면에 그림을 그린다 
			g.drawImage(back,0,0,getWidth(),getHeight(),this);
			g.drawImage(horse,x,y,150,100,this);
		}
		
     
}





