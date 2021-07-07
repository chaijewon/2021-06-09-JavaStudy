package com.sist.lang;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MainClass5 extends JFrame implements ItemListener{
    JComboBox box=new JComboBox();
    JLabel la=new JLabel();
    public MainClass5()
    {
    	box.addItem("홍길동");
    	box.addItem("심청이");
    	box.addItem("박문수");
    	add("North",box);
    	add("Center",la);
    	setSize(400,350);
    	setVisible(true);
    	box.addItemListener(this);// 이벤트 등록 (Callback함수 => 시스템에 의해 자동호출되는 함수)
    	// itemStateChanged=> 콤보박스 호출시마다 자동 호출하게 만들어 준다 
    	// 코틀린 => Activity ==> on~~
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new MainClass5();
	}
	// => 윈도우 / 웹 => 리턴형 (Object) => 문자열 변환 (toString())
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==box)
		{
			String name=(String)box.getSelectedItem();
			// 객체를 문자열 변환 : (String)box.getSelectedItem();
			// box.getSelectedItem().toString();
			la.setText(name);
		}
	}

}
