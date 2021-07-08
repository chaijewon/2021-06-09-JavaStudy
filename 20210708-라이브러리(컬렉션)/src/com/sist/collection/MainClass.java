package com.sist.collection;
/*
 *    java.util
 *    =========
 *     = StringTokenizer (������Ʈ���� �̹����� ���� ��� ���)
 *       => countTokens() => �ܾ� ����
 *       => hasMoreTokens() => ��� (�ܾ)
 *       => ���� ������ ������ ���� => nextToken()
 *     = ��¥ 
 *       => Date => �����ͺ��̽�(����Ŭ) ��ϵ� ��¥,�ð�
 *       => Calendar => ����(�޷�=>��������, ������ �����ش�)
 *    java.text 
 *     = SimpleDateFormat : ��¥,�ð��� ���ϴ� ���·� ���� 
 *       = �⵵ : yyyy,yy
 *       = ��   : MM , M
 *       = ��   : dd , d
 *       = �ð�  : hh , h
 *       = ��   : mm ,m 
 *       = ��   : ss, s 
 *       ===============> �� (�Խ��� : ����� , ���,�������� : ����� , �ð�)
 *     = ChoiceFormat : switch�� ��ü (���󵵰� �۴�)
 *     *****= MessageFormat : ��� ���� => ������ SQL������ ���� ��� �ַ� ���(����Ŭ�� ����)
 *     ��)
 *         ȸ������ 
 *         ======             ��ưŬ��                 INSERT ���� ä���� ����
 *         ����� �������� ��� ======== �ڹ�(���� �޴´�) =====================����Ŭ
 *         String id , pwd ,name ,addr , tel,email
 *         int age
 *         
 *         => String sql="INSERT INTO member VALUES('"+id+"','"+pwd+"','"+name
 *                       +"','"+addr+"','"+tel+"','"+email+"',"+age+")";
 *         => String sql="INSERT INTO member VALUES({0},{1},{2},{3},{4},{5},{6}..)"
 *         
 *     Collection : �����͸� ��Ƽ� ���� => ���� (������ �������� �ʰ� �ڵ��� ������ ����)
 *     ==========  �迭(X) : ����  =======> ����Ŭ���� �迭 ��� (����) 
 *        1) ǥ��ȭ�� ������ ���� ���α׷� (���̺귯��) 
 *          => �ڹٿ��� �����ϴ� ���̺귯�� (����ǰ =>�ڹٰ����� ������ �����ϰ� ���: �������̵��� ����)
 *          => ������ (����(����) , ����(Ʋ����)) , ���̹�Ƽ�� 
 *          => �ڹٽ�ũ��Ʈ (���̺귯�� ... Jquery , reactjs , nodejs , vuejs)
 *        2) ���뼺�� ���� => �ʿ��ϸ� �����簡 ������ ����..
 *        3) ���� 
 *                  ����Ŭ : ������ �ߺ� ���
 *                         => �ߺ����� �����͸� ������ �´� (�帣,���)
 *                         => SELECT DISTINCT genre~
 *           List : ������ ����(�ε���) , ������ �ߺ� ��� => �迭�ϰ� ���� (0~~�ڵ� ����)
 *           Set  : ������ �������� �ʴ´� , ������ �ߺ��� ������� �ʴ´� 
 *                  List => Set ���� ==> �ߺ��� �����͸� ������ ������ �´� 
 *           Map  : Ű�� ���� ������ ��������� => 
 *                  => Ű�� �ߺ��� �Ұ��� , ���� �ߺ��� ���� ==> JSON , ������ ����ϴ� ��� �����ʹ� Map����
 *                     �� : ����ڰ� ������ ��(Request) , ����� ��û�� ó���� �������� ������(Response) 
 *                          �ʿ��� ������ ��������(Session) , Ŭ���̾�Ʈ �������� ���� (Cookie)
 *                          => (id,admin)
 *                                Collection => interface
 *                                  |
 *                         -----------------------------
 *                         |             |             |
 *                        List         Set            Map => interface  
 *                        =====
 *                        List => ***ArrayList , Vector , LinkedList , Stack 
 *                                ArrayList : �����ͺ��̽� (�񵿱�ȭ) 
 *                                Vector : ��Ʈ��ũ(������ ���� ���� => ����ȭ) 
 *                                LinkList : C��� ������ (ObList) => MFC
 *                        Set 
 *                        =====
 *                        Set => ***HashSet , TreeSet 
 *                        Map 
 *                        =====
 *                        Map => Hashtable , ***HashMap
 *                        
 *                        ================> ���ٽ� , Stream , IO 
 *       CURD =>  �����͸� ��Ƽ� ���� (1. �߰� , 2. �б� , 3. ���� , 4. ����) => �޸�����
 *                                   INSERT   SELECT    UPDATE   DELETE => SQL(DML)
 *       ============================================================= ����Ŭ,���� (�������� ���� ��ġ)
 *       1. List
 *          1) ArrayList : ���� (�޸𸮰� ũ��)
 *             ============================
 *                �ε���:�� |      |      |
 *             ============================
 *                 0 => �߰� , ������ => �ڵ� �ε�����ȣ�� �ο�
 *                 0 1 2 3
 *                     =
 *                 0 1 2 3 4  ==> loop 
 *                   =
 *                 0   2 3 4 5
 *                   1
 *             => �߰� 
 *                add(��)
 *                add(index,��)
 *             => �б�
 *                get(�ε�����ȣ)
 *             => ����
 *                set(�ε�����ȣ,��)
 *             => ����
 *                remove(�ε�����ȣ) 
 *             => ����
 *                size() : ����� ����
 *             => ������ ���� : �⺻�������� (����,�Ǽ�,��,����,���ڿ�,����� ���� Ŭ����)
 *                ========= �̹� ������� �ִ� => ���� �д� ��쿡 ��� ������ Object
 *                                            =========== ����ȯ 
 *                                            =========== Object ���������� ���� ���� => ���׸���
 *       
 *                        
 */
import java.util.*;
// T(type) , E(element) , K(key) , V(value) => �ӽ�Ŭ����
// T => Ŭ������ 
class Box<T> 
{
	T t;
	public void setT(T t)
	{
		this.t=t;
	}
	public T getT()
	{
		return t;
	}
	public T display()
	{
		return t;
	}
	
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*ArrayList list=new ArrayList();
        //list.add(list)
        list.add("ȫ�浿");
        list.add("����");
        list.add(30);
        list.add("010-1111-1111");
        list.add(true);
        list.add('A');
        list.add("�����");  // for�� ����� �� ���� => 1. �������� ���� , 2. �����Ͱ��� ����  
                            // �����͸� ��Ƽ� ���� => ������ �����͸� ��Ƽ� ����
        // Object�� ���� => ÷���ϱ� ���ϴ� , �� �бⰡ ��ƴ� */
		//Box<String> b=new Box<String>();
		//b.
		// �����͸� �߰��� ��쿡�� => ���������� �߰� 
		List<String> names=new Stack<String>();
		names.add("ȫ�浿"); // 0
		names.add("��û��"); // 1
		names.add("�̼���"); // 3
		names.add("�ڹ���"); // 4
		names.add("������"); // 5
		//�ε�����ȣ�� �׻� => �ϰ������� ����  
		// ���
		int i=0;
		for(String name:names)
		{
			System.out.println("�ε�����ȣ:"+i+",����� �̸�:"+name);
			i++;
		}
		names.add(2,"������");// 2 ==> ������� �ʴ´� (����)
		System.out.println("==========================");
		i=0;
		for(String name:names)
		{
			System.out.println("�ε�����ȣ:"+i+",����� �̸�:"+name);
			i++;
		}
		// ���� 
		names.remove(3);
		
		System.out.println("==========================");
		i=0;
		for(String name:names)
		{
			System.out.println("�ε�����ȣ:"+i+",����� �̸�:"+name);
			i++;
		}
		
		// ���� 
		names.set(3, "ȫ����");
		i=0;
		for(String name:names)
		{
			System.out.println("�ε�����ȣ:"+i+",����� �̸�:"+name);
			i++;
		}
		System.out.println("=====================");
		System.out.println("���� �ο�:"+names.size()); // 
		//�����ͼ��� =>Jsoup for(int i=0;i<title.size();i++)
		// ��ü ���� 
		names.clear();
		System.out.println("���� �ο�:"+names.size());
		// ArrayList�� ��ϵ� �����͸� ����� ��� => clear()
		
	}

}










