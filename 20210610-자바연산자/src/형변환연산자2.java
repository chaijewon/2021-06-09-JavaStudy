/*
 *     �������� ==> ������������ ����ȯ(��ȯ) => ������ ��쿡�� ���� 
 *                                     =========
 *                                     ���� / �Ǽ� / ���� (���� ������)
 *                                                 => ���������� ��� 
 *     boolean�� ���� 
 *     
 *     = �ڵ�����ȯ : �ڹٽý��ۿ� ���ؼ� (����ó��)
 *                  ���� : �׻� ���� ��������
 *                        10 + 10.5
 *                        ==   ====
 *                        int  double 
 *                        ===
 *                        double + double 
 *                        
 *                        20+(int)10.5
 *                           ====
 *                            int   ==> 30
 *                            
 *                       ����) 
 *                            int a=10L; ==> ���� 
 *                            float f=10.5; ==> ���� 
 *                            ==========================
 *                            char c=65; ==> �������� => 'A'
 *                            byte b=100;
 *                            short s=200; 
 *                            ==========================
 *     = ��������ȯ : ���α׷��� 
 *     
 *     int a='A';  => 65 a=65
 *     
 *     double b='A' ==> b=65.0
 */
public class ����ȯ������2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        boolean b=false;
        double k=10.5f;
        //System.out.println((int)b);
        int a=(int)10L;
        float f=(float)k;// 10.5f
        char c=65;
        byte bb=100;
        short ss=300;
        double dd=.2;//0.2
        double dd1=25.;// 25.0
        System.out.println(dd);
        System.out.println(dd1);
        
        double ddd='A';// 65.0
        System.out.println(ddd);
        int ii='B';// 66
        System.out.println(ii);
        
        double dddd=100;// 100.0
        System.out.println(dddd);
        
        double ddddd=(int)10.5; //10.0
        System.out.println(ddddd);
        
        char cc=67;
        System.out.println(cc);
        // ���� ����=������(�۰ų� ����) 
        // ������ ũ�ų� ���� 
	}

}
