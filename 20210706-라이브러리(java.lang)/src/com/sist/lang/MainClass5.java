package com.sist.lang;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MainClass5 extends JFrame implements ItemListener{
    JComboBox box=new JComboBox();
    JLabel la=new JLabel();
    public MainClass5()
    {
    	box.addItem("ȫ�浿");
    	box.addItem("��û��");
    	box.addItem("�ڹ���");
    	add("North",box);
    	add("Center",la);
    	setSize(400,350);
    	setVisible(true);
    	box.addItemListener(this);// �̺�Ʈ ��� (Callback�Լ� => �ý��ۿ� ���� �ڵ�ȣ��Ǵ� �Լ�)
    	// itemStateChanged=> �޺��ڽ� ȣ��ø��� �ڵ� ȣ���ϰ� ����� �ش� 
    	// ��Ʋ�� => Activity ==> on~~
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new MainClass5();
	}
	// => ������ / �� => ������ (Object) => ���ڿ� ��ȯ (toString())
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==box)
		{
			String name=(String)box.getSelectedItem();
			// ��ü�� ���ڿ� ��ȯ : (String)box.getSelectedItem();
			// box.getSelectedItem().toString();
			la.setText(name);
		}
	}

}
