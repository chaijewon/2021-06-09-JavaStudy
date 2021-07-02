package com.sist.main;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

// 인터페이스 => 추상클래스의 일종 (추상클래스의 단점 보완 : 단일 => 다중)
// 인터페이스 => 단점 (선언 10개 => 필요없는 경우에도 10개 구현)
// 인터페이스 : 구현된 메소드가 존재 default , static 
/*
 *    형식)
 *         public interface interface명
 *         {
 *             ====================
 *               변수 => 상수형 변수  => 인스턴트 변수는 존재하지 않는다 
 *               설정 
 *                 int a=10; (선언하면 안된다)
 *                 ==> 자동 추가 
 *                 public static final int a=10;
 *                 ===================
 *             ====================
 *                메소드 
 *                 선언 
 *                 void aaa();
 *                 void bbb(); ===> 공통으로 사용되는 기능 ==> 구현이 틀린 경우 
 *                 public abstract void bbb();
 *                 ===============
 *                    자동 추가되는 부분 =====> 모든 메소드는 public 
 *             ====================
 *                메소드 
 *                 구현 
 *                 public default void ccc(){}
 *                        =======
 *                 public static void ddd(){}
 *             ====================
 *             ==> 생성자가 없다 
 *         }
 *         
 *         
 *         interface A
 *         {
 *            (public static final) int a;// 상수형이기 때문에 값을 반드시 설정  int a=10;
 *            (public abstract) void display();
 *         }
 *         
 *         //상속 => interface상속 => implements
 *         class B implements A
 *         {
 *             void display() // 에러  ==> public void display(){}
 *             {
 *                
 *             }
 *         }
 *         
 *         
 *         ==> 인터페이스 (미완성) ==> 상속을 내려서 구현한 다음에 사용 
 *                                            ========
 *                                            프로그래머 => 프로그램에 맞게 구현해서 사용 
 *         ==> 상속하는 방법 
 *             interface    ========   interface
 *                          extends 
 *                  interface A
 *                  interface C
 *                  interface B extends A,C
 *             interface    ========   class
 *                          implements 
 *                  interface A
 *                  class B implements A
 *             *** 추상 클래스와 다른 점 : 다중 상속
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
public class 인터페이스 extends JFrame implements MouseListener,
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
