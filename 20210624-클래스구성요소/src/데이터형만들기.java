// ��(java)/��(kotlin)  �� (�ڹ�:����Ŭ ����=> �������� ���� , HTML:��� , ������ : CSS , ����Ŭ: ������ �������)
//                    �ڹ�/����Ŭ => ���������� ��ư , �޴� => �ڹٽ�ũ��Ʈ (���̺귯��:JQuery, Ajax)=> React,Vue
// Spring(����) , NodeJS

class Member
{
	String id,name,password,hint,dap,sex,phone,hphone,email,post,addr1,addr2;
}
class Sawon{
	int empno;
	String ename;
	String job;//����
	int mgr; // �����ȣ
	String hiredate;// �Ի��� ==> Date
	int sal;//�޿�
	int comm;// ������
	int deptno;//�μ���ȣ => 
}
class Board{
	int no;//�Խùɹ�ȣ (�ߺ�����)
	String name;
	String subject;
	String content; // ���� 
	String password;// ����,���� 
	String regdate;
	int hit; // ��ȸ�� 
}
class Category{
	String title;
	String subject;
	String poster;
}
class FoodHouse
{
	String name;
	double score;
	String address;
	String tel;
	String price;
	String psrking;
	String time1,time2;
	String day;
	String[] menu;
	int good;
	int soso;
	int bad;
}
class Movie1{
	String title;
	boolean isShow;
	String regdate;
	String genre;
	String nation;
	String grade;
	int time;
	double score;
	int showUser;
	int boxoffice;
	int cookie;
	String story;
	String poster;
}
class Recipe
{
	String poster;// Ŭ���� 
	String title;
	String chef;
	int star;
	int hit;
	static String site;
}
class Chef
{
	Recipe r;//has-a (����)
	String chef;
	int rank;
	String chef_poster;
	int mc1,mc3,mc7,mc2;
}
/*
 *    1. ����
 *    ==========
 *    2. ������
 *    3. ��� 
 *    ========== �⺻ �ڵ� 
 *    4. ��� ��� 
 *       = ������ ���� ��� 
 *          = ���� �ͳ��� ��� (ũ�Ⱑ ����:�迭)
 *          = �ٸ� �ͳ��� ��� (Ŭ����)
 *            ==> Ŭ�����ȿ��� ���� �� �� �ִ� �������� 
 *                �⺻�� (int,byte,short,char,long,float,double,boolean)
 *                Ŭ���� (Ŭ���� , �迭)
 *       = ��ɹ� ���� ��� 
 *         = �޼ҵ� (������,���,��������)
 *    ========================================================== Ŭ���� + �޼ҵ� (242page)
 *    5. Ŭ���� ���� 
 *       Ŭ���� (�������)
 *       ======================
 *          ���� 
 *             = �ν��Ͻ� => new�� ����ؼ� �޸� ���� => ���� �޸𸮰� ���� 
 *             = ��������(Ŭ��������) => static => �޸� �Ѱ��� ���� => ���� ������
 *             
 *             ==> ���� ��� 
 *                 class A
 *                 {
 *                     int aa;
 *                     static int bb;
 *                 }
 *                 
 *                 A a=new A();  ===> a(aa)  ==> a�� aa�� ���ٽÿ��� a.aa
 *                 A b=new A();  ===> b(aa)  ==> b�� aa�� ���ٽÿ��� b.aa
 *                   => ������ bb�� ���� =======> a,b�������� ����� �����ϴ�
 *                      a.bb (��ü������ ������ ����) , A.bb (Ŭ������.����) 
 *       ======================
 *          �޼ҵ�
 *       ======================
 *          ������ 
 *       ======================
 *    
 */
class A
{
	String name;
	int aa;//0
	static int bb;//0
	// ���� => �ʱ�ȭ(��������) , ������� (�ν��Ͻ�,static) => �ڵ� �ʱ�ȭ 
	/*
	 *   String => null
	 *   char  => ' '
	 *   double => 0.0
	 *   float  => 0.0f
	 *   int    => 0
	 *   long   => 0L
	 *   Ŭ����  => �ּҰ��� ���� ��� (null)
	 */
}
public class ������������� {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       // A a=new A();
		// 249 page
		System.out.println(A.bb);//Math.random() , 
		A a=new A(); // name,aa
		System.out.println(a.aa);
		a.bb=100;
		System.out.println(a.name);
		
	}

}










