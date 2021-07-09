package com.sist.lib;
/*
 *   =======
 *   J2SE (�Ϲ��ڹ�) => JDK��ġ�� �ڵ� ����
 *   J2EE (����� ȯ�� => web) ������ �ٿ�ε� (tomcat => servlet-api.jar) tomcat:webserver+jsp����
 *   J2ME (�����) => X => Kotlin(�ȵ���̵�) 
 *   =======
 *   
 *   ���̺귯�� => �ڹٿ� ���� (Ŭ���� ����) => 85% (�ִ� �״�� ���) 15%(������=�������̵�)
 *   
 *   JDK1.0
 *   ====================
 *   �� : ����Ŭ���� ===> �ڹ� (�������б�) ===> ������ 
 *       ===== ������ ���� (���� ��ɾ� : SQL)
 *             CURD (���� , ���� , �б� , ����)=> SELECT(�˻�),INSERT(�߰�),UPDATE(����),DELETE(����)
 *       ===== ����Ŭ (���� => ������ , ������ , ��¥��)
 *                          ======  =====  ======
 *                          Integer,Double , String , Date
 *                          byte => �ڹ� ====> ������ 
 *                                      ����(���ε�) ===> �ڹ�(2����Ʈ,Unicode, ������ : 1����Ʈ :ASC)
 *   java.lang 
 *     Object : ��� �����͸� ������ �� �ִ� �ֻ��� Ŭ����(�⺻��������)
 *              Object o=1 , o="aaa" , o='A' , o=new A()
 *              Ŭ�������� => ����(�޼ҵ�)
 *              = equals() : ��ü�� 
 *              = finalize() : �Ҹ��� (�ڵ� ȣ�� => ȣ��Ǹ� �޸� ����)
 *              = clone() : ����(���ο� �޸� ����) => prototype
 *              = toString() : ����ȯ ���� ���ڿ� ��ȯ�� 
 *      **String : ���ڿ� ���� Ŭ����
 *                 length() : ���ڰ��� (ȭ�� UI)
 *                 ***substring() : ���� �ڸ��� (...) => ����Ŭ�� ���� (�׸� ������, �޴�������)
 *                 =========== ã��
 *                 ***indexOf,lastIndexOf : ����,���ڿ� ��ġ ã�� 
 *                 ***contains() : ���� 
 *                 startsWith,endsWith
 *                 ���繮�ڿ� : �����������̿� : matchers()
 *                            ======= ���Խ� ==> (String regex)
 *                 ====================
 *                 replace , replaceAll => ��ȯ 
 *                 ***trim() : ���鹮�� ���� 
 *                 ***valueOf() => ��� ���������� ���ڿ� ���� 
 *                 concat() , + => ���ڿ� ���� 
 *                 split()
 *      StringBuffer : ���� �����Ͱ� �ִ� ������ ���� ��� => ���ڿ��� ���� => append()
 *      **Wrapper : ��� ���������� ���� ������ �� �ְ� �����
 *         �⺻�������� => Ŭ����ȭ �Ǿ� �ִ� 
 *           int = Integer  =======> parseInt() : ����������
 *           double = Double ======> parseDouble() : �Ǽ� ����
 *           boolean = Boolean  ===> parseBoolean() : true/false
 *           long = Long    ====> parseLong() : long ���� 
 *           ======================== web���� ���۹޴� ��� �����ʹ� ���ڿ��� ������ �޴´� 
 *      Math ===> ��κ� static =========> Math.ceil()
 *         = �ø� : �����������ϱ� (ceil())
 *         = ���� : random() => 0.0~0.99 
 *      System ===> gc() 
 *                  System.currentTimeMillis() : �ð� => log���� (�ɸ��� �ð�)
 *   java.util
 *      StringTokenizer 
 *        = hasMoreTokens
 *        = countTokens() : ����
 *        = nextToken() : ���� ������ �б� 
 *      Random 
 *        = nextInt(10) => 0~9  
 *      Scanner : Ű���� �Է°� 
 *      Date : �ý����� �ð� �б� => ��¥
 *      Calendar : ���� , ������ ������ 
 *                 ��(0~11) , ���� (1~7)
 *                 =======   =========
 *                   +1         -1
 *      �����͸� ��� ó�� (�÷���)
 *      ================
 *        List : �߽� => ������ �ִ� , ������ �ߺ� ���
 *               �����Ͱ��� (CURD)
 *               ArrayList(***)
 *               Vector
 *               LinkedList
 *               Stack
 *               ================== �߰�(add()),����(set()),����(remove()),�б�(get()) Ȯ��(size())
 *        Set : ������ ���� , ������ �ߺ��� �� ���� 
 *               ***HashSet,TreeSet
 *        Map : key,value���ÿ� ���� 
 *              key�� �ߺ�(X) ,value(�ߺ� ����) ==> Ŭ���� �޸� ���� (������)
 *              => ***HashMap,Hashtable
 *   java.text
 *      ��ȯ 
 *      ====
 *       SimpleDateFormat : ��¥,�ð��� ��ȯ �Ҷ� ( yyyy , MM , dd , hh , mm ,ss)
 *       MessageFormat : ��� ���� 
 *                       =======
 *                       ����Ŭ ������ �߰� , ������ ���� 
 *                       INSERT INTO ~~   UPDATE table SET
 *   java.io
 *      File , FileReader , FileWriter , FileInputStream,FileOutputStream
 *      BufferedReader , BufferedWriter , BufferedInputStream,BufferedOutputStream
 *   java.net
 *      URL , URLEncoder
 *      
 *   *** ���׸��� : �������� �ѹ��� ����ȭ 
 *       ����) <Ŭ����>
 *            ArrayList<String> => ���ڿ��� ������ ����
 *            ArrayList<int>(X) => ArrayList<Integer>
 *            ArrayList => ���׸����� ������� ������ => default Object (��� , �߰� => ����ȯ)
 *            ����)
 *              = ���������� ������ 
 *              = ����ȯ�� ���� ������ �ҽ� �����ϴ� 
 *           ��)
 *               T => type (Ŭ������)
 *               E => Element (Ŭ������)
 *               Vector<E>
 *               K => key
 *               V => value
 *               Map<K,V>
 *               public class ArrayList<T> => T �ӽ� Ŭ���� ��������
 *               {
 *                  T t;
 *                  public ArrayList()
 *                  {
 *                     if(���׸����� ���� ���)
 *                     {
 *                         T=Object => ����ȯ => for-each�� �����ϱ� ��ƴ�
 *                     }
 *                     else
 *                     {
 *                         <String> <Integer>
 *                         T=String => Integer
 *                     }
 *                     
 *                  }
 *                  public T get(int i){} => public String get(int i)
 *                  public void set(int i,T t){} => public void set(int i,String t){}
 *                  
 *                  
 *               }
 *   
 *   JDK1.2
 *   ====================
 *   �� (web) 
 *   javax.xml
 *   javax.servlet
 *   
 *   �ܺζ��̺귯��(���̹�Ƽ��,������)
 *   ====================
 *   java(X) => org , com
 */
import java.util.*;
public class MainClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Vector vec=new Vector(); // ������� (�迭��� ���)
        // �迭:������ , �÷��� : ���� ==> ������ ������ �ִ�(�ε�����ȣ�� �ڵ����� ���� : ������) => ������ ��
        /*
         *    0 1 2 3
         *      4
         *    0 4 1 2 3
         *       (X)
         *    0 4 2 3
         */
        // 5���� �̸�
        /*vec.add("ȫ�浿");
        vec.add("��û��");
        vec.add("�ڹ���");
        vec.add("������");
        vec.add("�̼���"); // 15���� 
        */
        Collections.addAll(vec, "ȫ�浿","��û��","�ڹ���","������","�̼���");
        for(Object o:vec)
        {
        	System.out.println(o);
        }
        System.out.println("===============");
        System.out.println("===== ���� =====");
        Collections.sort(vec); // ���� (ASC)
        for(Object o:vec)
        {
        	System.out.println(o);
        }
        System.out.println("====Vector=>ArrayList��ȯ====");
        ArrayList list=new ArrayList();
        list.addAll(vec);
        for(Object o:list)
        {
        	System.out.println(o);
        }
	}

}







