package com.sist.main;
/*
 *   ���̺귯�� => �����̳� ���� (X) => �ִ� �״�� ��� 
 *   => Ŭ������ 
 *        �޼ҵ� ==> ������ �޼ҵ��(�Ű�����)
 *        ��/��
 *        ==== �����ͺ��̽�
 *   Stack(LIFO) / Queue(FIFO)
 *   ===========   ============ ��Ʈ��ũ,�ü��
 *   �޸� 
 *   
 *   ==> HashMap , HashSet 
 *       =======   ======== List�� ���� ��Ƽ� => �ߺ��� ���� �����͸� ������ �´ٸ� HashSet 
 *        = Ŭ���� ���� , ��(70%)
 */
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Stack st=new Stack(); //add,clear,set,remove,get,size => 
        // ���� = ���� = ���̹� = ����Ʈ 
        // �� ÷�� 
        st.push("0");
        st.push("1");
        st.push("2");
        st.push("3");
        st.push("4");
        st.push("5");
        
        // ��� ==> pop
        while(!st.empty())
        {
        	System.out.println(st.pop());
        }
        System.out.println("===== Queue======");
        Queue que=new LinkedList();
        que.offer("0");
        que.offer("1");
        que.offer("2");
        que.offer("3");
        que.offer("4");
        que.offer("5");
        while(!que.isEmpty())
        {
        	System.out.println(que.poll());
        }
	}

}















