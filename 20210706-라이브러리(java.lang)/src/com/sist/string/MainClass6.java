package com.sist.string;
import javax.swing.*;
public class MainClass6 extends JFrame{
    JTextField tf=new JTextField();
    public MainClass6()
    {
    	add("North",tf);
    	tf.setText(String.valueOf(100));
    	// String s=String.valueOf(100)
    	setSize(300,200);
    	setVisible(true);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 생성자 호출 => new
		new MainClass6();
	}

}
