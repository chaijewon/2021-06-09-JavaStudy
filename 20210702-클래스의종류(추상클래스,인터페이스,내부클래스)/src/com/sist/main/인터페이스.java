package com.sist.main;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

// �������̽� => �߻�Ŭ������ ���� (�߻�Ŭ������ ���� ���� : ���� => ����)
// �������̽� => ���� (���� 10�� => �ʿ���� ��쿡�� 10�� ����)
// �������̽� : ������ �޼ҵ尡 ���� default , static 
/*
 *    ����)
 *         public interface interface��
 *         {
 *             ====================
 *               ���� => ����� ����  => �ν���Ʈ ������ �������� �ʴ´� 
 *               ���� 
 *                 int a=10; (�����ϸ� �ȵȴ�)
 *                 ==> �ڵ� �߰� 
 *                 public static final int a=10;
 *                 ===================
 *             ====================
 *                �޼ҵ� 
 *                 ���� 
 *                 void aaa();
 *                 void bbb(); ===> �������� ���Ǵ� ��� ==> ������ Ʋ�� ��� 
 *                 public abstract void bbb();
 *                 ===============
 *                    �ڵ� �߰��Ǵ� �κ� =====> ��� �޼ҵ�� public 
 *             ====================
 *                �޼ҵ� 
 *                 ���� 
 *                 public default void ccc(){}
 *                        =======
 *                 public static void ddd(){}
 *             ====================
 *             ==> �����ڰ� ���� 
 *         }
 *         
 *         
 *         interface A
 *         {
 *            (public static final) int a;// ������̱� ������ ���� �ݵ�� ����  int a=10;
 *            (public abstract) void display();
 *         }
 *         
 *         //��� => interface��� => implements
 *         class B implements A
 *         {
 *             void display() // ����  ==> public void display(){}
 *             {
 *                
 *             }
 *         }
 *         
 *         
 *         ==> �������̽� (�̿ϼ�) ==> ����� ������ ������ ������ ��� 
 *                                            ========
 *                                            ���α׷��� => ���α׷��� �°� �����ؼ� ��� 
 *         ==> ����ϴ� ��� 
 *             interface    ========   interface
 *                          extends 
 *                  interface A
 *                  interface C
 *                  interface B extends A,C
 *             interface    ========   class
 *                          implements 
 *                  interface A
 *                  class B implements A
 *             *** �߻� Ŭ������ �ٸ� �� : ���� ���
 *             interface A
 *             interfece B
 *             interface C
 *             class D implements A,B,C
 *                                ======
 *                                
 *             interface A
 *             interfece B
 *             interface C
 *             class D
 *             
 *             class E extends D implements A,B,C
 *                     ========= ================
 */
import javax.swing.*;
interface A
{
	int a=10;
	void display();
}
class B implements A
{
	public void display() {}
}
public class �������̽� extends JFrame implements MouseListener,
KeyListener,ActionListener,FocusListener,Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void focusGained(FocusEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void focusLost(FocusEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
