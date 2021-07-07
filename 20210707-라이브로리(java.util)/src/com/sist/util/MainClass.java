package com.sist.util;
/*
 *   java.util
 *   =========
 *     ��¥ , ��ȯ 
 *     ��¥ : Date , Calendar 
 *     ��ȯ : ChiceFormat , MassageFormat
 *     �ڷᱸ�� 
 *             �迭 : ������ , �÷��� : ������ 
 *             Collection(�����͸� ������ ��Ƽ� ����) = �迭�� ��ü
 *                |
 *         -------------------------
 *         |           |           |
 *       List         Set         Map (interface)
 *       List => ������ ����(�ε�����ȣ) , �����͸� �ߺ��ؼ� ������ ���� 
 *          => ������ Ŭ���� 
 *             ***ArrayList , LinkedList , Vector ====> Stack,Queue
 *       Set  => ������ ���� , ������ �ߺ��� ������� �ʴ´� 
 *          => ������ Ŭ���� 
 *             ***HashSet , TreeSet
 *       Map  => ������ ���� , ������ ������ ���� (key,value) ===> ���� (JSON) : JSON:��,������ 
 *          => ������ Ŭ���� 
 *             ***HashMap , Hashtable 
 *       
 *     ���ں��� , ���� 
 *     ���ں��� : StringTokenizer
 *     ���� : Random
 *     ��Ÿ : Scanner => IO (����ó��)
 *           ======= ������� 
 *     
 */
// ���ڿ� ���� : StringTokenizer ==> split
/*
 *    hasMoreToken() => nextToken() => countToken
 */
import java.util.*;// ������ ������ import => java.lang
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String colors="red,blue,black,yellow,pink";
        StringTokenizer st=new StringTokenizer(colors,","); // ���й��� : �����ϸ�  " "
        // ������ : ������ ����� ��������  
        /*System.out.println(st.nextToken());
        System.out.println(st.nextToken());
        System.out.println(st.nextToken());
        System.out.println(st.nextToken());
        System.out.println(st.nextToken());*/
        System.out.println(st.countTokens());// �ܾ� ����
        while(st.hasMoreTokens()) // 
        {
        	System.out.println(st.nextToken()); // �ܾ �о� �´� 
        }
        
        
	}

}









