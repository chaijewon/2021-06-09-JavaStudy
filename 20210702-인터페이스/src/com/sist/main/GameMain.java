package com.sist.main;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class GameMain extends JFrame implements KeyListener{
    // ���� Ŭ����
	GameView gv=new GameView();
	public GameMain()
	{
		add("Center",gv);
		setSize(800,600);
		setVisible(true);
		addKeyListener(this);
		setFocusable(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new GameMain();
	}
	// �������̽� => ���(Ű����) : ���α׷��� ���� => ��� ������ �ٸ� ���� �ֱ� ������ =>���α׷��Ӱ� ����  
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
	   if(e.getSource()==this)
	   {
		switch (e.getKeyCode()) {
		   case KeyEvent.VK_LEFT:
			gv.x-=5;
			if(gv.x<0)
				gv.x=800;
			break;

           case KeyEvent.VK_RIGHT:// Back
			gv.x+=5;
			if(gv.x>800)
				gv.x=0;
			break;
		}
	   }
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
