// �޼ҵ�
/*
 *   �޼ҵ� 
 *    1) ���� 
 *    2) ���α׷� ������ (���� ������) => ���α׷��� ����ȭ 
 *    3) �޼ҵ�ȿ��� ������ �������� �ϱ� ������ �Ѱ��� ��ɸ� ������ �����ϰ� �Ѵ� 
 *       ��) ã�� , ��� , ������ �߰� ....
 *          ��� (��۾��� , ��� ���� , ��� ����, ��� ����...)
 *    4) �޼ҵ� ���� ���
 *           ������      �Ű����� 
 *       =    O          O  =====> ���� ���� ���Ǵ� �޼ҵ� ���� 
 *       =    O          X 
 *       =    X          O  =====> ���� ���Ǵ� ���� 
 *       =    X          X  =====> ���󵵰� ���� 
 *    5) �޼ҵ� ���� 
 *       (����������) ������ �޼ҵ�(�Ű�����...)  ==> �Ű������� ���� ���� �ְ� ������ ����� ���� , 
 *       �� �������� �Ѱ��� ��� (�������� ���� ���� void�� ����Ѵ�)
 *       ==> �޼ҵ� ������� : return�� �ִ� ������ ����  
 *       ==========
 *       public , protected , default , private  
 *       
 *       void display(int a)
 *       {
 *          if(a==0)
 *            return; ����ڰ� 0�� �Է����ָ� �޼ҵ� ���� ==> ����ڰ� �Է��� �Է����� �ʴ� ��� 
 *          else
 *            return;
 *       }
 *       
 *       ����)
 *            int display(int a)
 *            {
 *               === �Ű������� ó��
 *               ===
 *               ===
 *               return ��; => ���� �ݵ�� �������� ��ġ ==> ó�� �����
 *            }
 *            
 *            ȣ��� 
 *            int a=display(10);
 *                  ==> �Ű������� 10�� �Է½�Ų�� 
 *            ======
 *             ������� �޴´� 
 *             
 *            *** return���� ���������� �޼ҵ� {} �ȿ� �ִ� ��� ������ ���� 
 *            *** �޼ҵ�� �ݺ� ���� �Ҽ� �ִ� ����� �ִ�
 *            
 *     => class 
 *        Tv 
 *         = Tv������ ����ϴ� ����(�Ӽ�) : ���� , ����(off,on) , channel
 *         = Tv������ ����ϴ� �޼ҵ�(���): �������� (power()), channel=> �ø��� , ������ 
 *         
 *         ======================
 *         ��� 
 *           �Ӽ�  : �̸� , �ֹι�ȣ , ���� , ���� , Ű , ������ , ��ȭ , �ּ� .... , �� ,�ٸ�,��,��...
 *           ����  : �Դ� ��� , �ȴ� ��� , �ٴ� ��� , ���� ��� .... 
 *           ===================================== �ùķ��̼� 
 */
/*
 *    1. ��������� ����޼ҵ� � ���̵� ������� ����� ���� 
 *    2. static �޼ҵ�� ��������� ��� �� �� ���� 
 *       => ��ü�� �����Ŀ� ����� ���� 
 */
class Temp
{
	int a=10;
	static int b=10;
	void aaa()
	{
		System.out.println("a="+a);
		System.out.println(b);
	}
	void bbb()
	{
	     a+=10;
	     b+=20;
	}
	static void ccc() // Ŭ�����޼ҵ�,Ŭ�������� (static) => ����,�������� , �����޼ҵ� 
	{
		Temp t=new Temp();// ��ü�����Ŀ� ����� ����  => ���󵵰� ���� �幰�� 
		System.out.println("a="+t.a);
		System.out.println(b);
	}
}
class Tv
{
	//=============== Tv�� ���Ǵ� ���� ==> class ��ü���� ����� ���� 
	  String color="������";
	  boolean power;// false
	  int channel;// 0
	//===============
	// Tv�� �۵� => ���� (�޼ҵ�)
	  void setPower() // ���� ����  => ���� ������ �ƴ϶� (����) => power=true (Tv�ѱ�) , power=false(Tv����)
	  {
		  power=!power;
	  }
	  // channel �̵� 
	  void channelUp()
	  {
		  channel++;
	  }
	  void channelDown()
	  {
		  channel--;
	  }
	  // �ν��Ͻ� (����,�޼ҵ�) => �������� => new ������()
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Tv t=new Tv();// t(�޸� �ּ�:41a4555e) => color,power,channel , setPower,channelUp,channelDown
        System.out.println("t="+t);
        t.setPower(); // t.power=true
        if(t.power)
        {
        	System.out.println("Tv ����...");
        }
        else
        {
        	System.out.println("Tv ����...");
        }
        
        t.channelUp();
        t.channelUp();
        t.channelUp();
        t.channelUp();
        t.channelUp();
        t.channelUp();
        t.channelUp();
        
        System.out.println("channel="+t.channel);
        
        t.channel=11;
        System.out.println("ä�� ����");
        System.out.println("channel="+t.channel);
        
        
        /*t.setPower();
        if(t.power)
        {
        	System.out.println("Tv ����...");
        }
        else
        {
        	System.out.println("Tv ����...");
        }*/
        
        Tv t2=new Tv();
        System.out.println("t2="+t2);
        //t2.setPower();
        if(t2.power)
        {
        	System.out.println("t2 Tv ����..");
        }
        else
        {
        	System.out.println("t2 Tv ����..");
        }
        System.out.println("channel="+t2.channel);
        //  �޸� ���� (�޸� �Ҵ�) => new (���� �޸� �Ҵ�)
        //  Ŭ������ ��ü��=new ������() => �����ڴ� �ݵ�� Ŭ������� ���� 
        //  ����� ��������� �����ϴ� ��� , static�� �����ϴ� ��� 
        //  ����޼ҵ� : ��ü��.�޼ҵ��(�Ű�������...) 
        //  static�޼ҵ� : ��ü��.�޼ҵ��(�Ű�������..) , Ŭ������.�޼ҵ��()
        //  => new�� �̿����� �ʾƵ� �޸𸮿� ���� => �ʿ��Ҷ� ���� new�� ������� �ʰ� ����� ���� 
        //  Scanner scan=new Scanner() => scan.nextInt() => �ν��Ͻ� �޼ҵ� 
        //  Math.random() => static �޼ҵ� (Math=> ���� ó�� => static)
        //  Math.ceil() ; �ø� => �������� ���ϱ�
        
	}

}










