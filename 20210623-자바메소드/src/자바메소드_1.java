import java.util.Arrays;

/*
 *    ���� => ���� , ��� , �迭
 *    �޼ҵ� : ���� (������ , �Է�����...) => ������ , ��� 
 *    ================================== Ŭ���� (���������� ����)
 *                                       ===================
 *                                       ��ü���� ���α׷� 
 *                                       = ������ ��ȣ (ĸ��ȭ)
 *                                       = ���� (���)
 *                                       = ������(����,�߰�)
 *    1. ����� ����
 *    2. ���̺귯�� 
 *    ============= ���� 
 *    ============================================ ���α׷��� �������� �ʰ�  ������� ���� (����ó��)
 *    
 *    �޼ҵ� VS �Լ� : �Ѱ��� �۾��� �����ϴ� ��ɹ��� ���� 
 *                  ----------
 *                  => �޼ҵ�� Ŭ���� ���� : �ڹ�,���̽�,��Ʋ�� 
 *                  => ���������� ���� (�Լ�) : C��� , ���̽� , ��Ʋ�� 
 *    1) �޼ҵ��� ������� 
 *       = ������(ó�� �����:�ݵ�� �Ѱ� ���) ====> ��û�� ���� �����(����)
 *       = �Ű����� : 0�̻� ==================> ��û(Ŭ���̾�Ʈ:user)
 *    2) �޼ҵ��� ���� 
 *       = ������ �޼ҵ��(�Ű�����...) => ����
 *         => ������ ������ �����ָ� ó���Ŀ� ���ϰ��� �����ش� 
 *       = {
 *             ������ 
 *             ---
 *             ---
 *             ---
 *             ����� ���� 
 *             return �����; ==> ������� ���� ��� (return ������ ����:�����Ϸ��� �ڵ����� �߰�)
 *             
 *         }
 *       = �޼ҵ��� ������� ==> return�� ������ ���� (return�� �׻� �������� �ִ� ���� �ƴϴ�,�߰��� ÷��)
 *       
 *       �޼ҵ�()
 *       {
 *          if()
 *           return; �޼ҵ� ����
 *          else
 *           return; �޼ҵ� ���� 
 *       }
 *       
 *       ������ �޼ҵ��(�Ű�����...) : �����
 *       {
 *           ������ 
 *           return ����� ����
 *       }
 *    3) ��� ���α׷� : �޼ҵ尡 4��
 *       = �Է� (������ �ʱ�ȭ)
 *       = ó�� �κ� 
 *       = ��� 
 *       = main() => ���α׷��� ������ (��ü �޼ҵ带 ȣ��=�޼ҵ� ����)
 *       
 *    4) �޼ҵ� ���� 
 *       ������ / �Ű����� 
 *        O       O      ===> String substring(int begin,int end)
 *                            String replace(char o,char n)
 *        O       X      ===> double random() , String trim()
 *            ===> ������� �޾Ƽ� ����(������,��,�����)
 *        ==================================================================
 *        X       O      ===> void print(String s) : ������� ���� ��� : void
 *                            void main(String[] a) 
 *        X       X      ===> void println() => �����ٿ� ��� 
 *                            ������ ��� 
 *        ================================================================== ��ü ó�� 
 *         *** �޼ҵ���� �ҹ��ڷ� ���� 
 *             �ܾ 2�� �̻�  : ù�ڸ� �빮��, _
 *             boardList , boardDetail ,  board_list , board_detail , boardFind , board_find
 *             ==> ������ => �ĺ��ڰ� ���� (����)
 *    5) �޼ҵ� ȣ�� 
 *       int input()
 *       {
 *          return ��(int)
 *       }
 *       
 *       ==> ȣ�� 
 *           int a=input();
 *           === long, double, float ==> ���۰��� ��ġ
 *                                       ========== boolean , String 
 *           String s="Hello";
 *           String s1="Hello Java" ==> s,s1=4byte  : Ŭ������ ��ü (�ּ�)
 *       void display()
 *       {
 *       }
 *       
 *       => display();
 *       
 *       �Ű������� �ִ� ��� 
 *       int add(int a,int b) => a=10, b=20
 *       {
 *           return a+b;
 *       }
 *       
 *       int res=add(10,20); 
 *           res=30
 *       ===================================
 *       * �Ѱ��� Ŭ�����ȿ��� �޼ҵ���� �����ϴ� 
 *         ����) �Ű������� ������ ���������� �ٸ��� �ٸ� �޼ҵ�� �ν� 
 *        class A
 *        {
 *            int add(int a,int b){}
 *            double add(double d1,double d2){}
 *            void add(String s1,String s2){}
 *            void add(int a,int b){} ==> �ߺ��� �޼ҵ�
 *        }
 *        bus(�¼�) , bus(��ӿ���) , bus(����) , bus(�Լ�)
 *     ** ������ => ���� �Է� => ���� 
 *                ���� ������ => �迭 (������� ������) , Ŭ����
 *                ��ȭ���� =>10  String[] 
 *                ���� ���� =>10  int[]
 *                ��� ���� => 10 double[]
 *                ���� =>10 char[]
 *     ** �Ű����� : ����� ��û 
 *                 login => String id, String pwd
 *                 idcheck => String id 
 *                 �����ȣ => String dong
 *                 ���(����,����,����) => int kor,int eng,int math
 *                 *** �Ű������� ���� ���(3���̻�) => 1.�迭(���� ������ ������) , 
 *                                                2.Ŭ���� (�ٸ� ������ ������)
 *     ***** ù��° ==> ���� 5���� �Ѱ��ְ� , �ִ밪,�ּҰ�
 *                    ================  ===========
 *                      �Ű�����              ������      
 *                 ==> ��ɻ� 
 *                     ���� 5���� �Է��ϴ� ���
 *                     �ּҰ� ���
 *                     �ִ밪 ���  
 *                     ���  
 */
public class �ڹٸ޼ҵ�_1 {
    static int[] input()
    {
    	int[] arr=new int[5];
    	for(int i=0;i<arr.length;i++)
    	{
    		arr[i]=(int)(Math.random()*100)+1; // 1~100���� => 5�� ���� 
    	}
    	return arr;
    }
    static int max(int[] arr)
    {
    	int max=arr[0];
    	for(int i:arr) // arr�ȿ��� ���� �����͸� �Ѱ��� ������ �´� 
    	{
    		if(max<i)
    			max=i;
    	}
    	return max;
    }
    static int min(int[] arr)
    {
    	int min=arr[0];
    	for(int i:arr)
    	{
    		if(min>i)
    			min=i;
    	}
    	return min;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        /*int[] arr=input();
        System.out.println(Arrays.toString(arr));
        // �ִ밪
        int max=max(arr);
        // �ּҰ�
        int min=min(arr);
        System.out.printf("�ִ밪:%d,�ּҰ�:%d\n",max,min);*/
		int[] arr=new int[5];
    	for(int i=0;i<arr.length;i++)
    	{
    		arr[i]=(int)(Math.random()*100)+1; // 1~100���� => 5�� ���� 
    	}
    	
    	System.out.println(Arrays.toString(arr));
    	
    	int max=arr[0];
    	for(int i:arr) // arr�ȿ��� ���� �����͸� �Ѱ��� ������ �´� 
    	{
    		if(max<i)
    			max=i;
    	}
    	
    	int min=arr[0];
    	for(int i:arr)
    	{
    		if(min>i)
    			min=i;
    	}
    	
    	
    	System.out.printf("�ִ밪:%d,�ּҰ�:%d\n",max,min);
	}

}








