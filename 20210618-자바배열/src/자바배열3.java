/*
 *   3���� �л� 
 *     ����,����,���� ==> ������ �Է��ؼ� 
 *     1. ���� 
 *     2. ���
 *     3. ����
 *     4. ��� 
 *     ========= �Ϲ� => ���� 21�� 
 *     
 *     
 *     ���� ==> ���� 
 *              ������ ===> ���� 
 *                         ��� ====> ����
 *                                   ===== �迭 ====> 
 *                                            �޼ҵ� ======= ����
 *                                                Ŭ���� (��ü) + ���̺귯�� ==> ���� 
 */
import java.util.Scanner;
public class �ڹٹ迭3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] kor=new int[3]; 
        int[] eng=new int[3];
        int[] math=new int[3];
        int[] total=new int[3];
        double[] avg = new double[3];
        char[] score=new char[3];
        int[] rank=new int[3];
        // int[][] info=new int[3][5];
        // 1. Ű���� �ޱ�
        Scanner scan=new Scanner(System.in);
        for(int i=0;i<3;i++)
        {
        	System.out.printf("%d��° �������� �Է�:",(i+1));
        	kor[i]=scan.nextInt();
        	System.out.printf("%d��° �������� �Է�:",(i+1));
        	eng[i]=scan.nextInt();
        	System.out.printf("%d��° �������� �Է�:",(i+1));
        	math[i]=scan.nextInt();
        	total[i]=kor[i]+eng[i]+math[i];
        	avg[i]=total[i]/3.0;
        }
        // ���� 
        for(int i=0;i<3;i++)
        {
        	char c='A';
        	if(avg[i]>=90)
        		c='A';
        	else if(avg[i]>=80)
        		c='B';
        	else if(avg[i]>=70)
        		c='C';
        	else if(avg[i]>=60)
        		c='D';
        	else
        		c='F';
        	score[i]=c;
        		
        }
        // ���
        for(int i=0;i<3;i++)
        {
        	rank[i]=1;
        	for(int j=0;j<3;j++)
        	{
        		if(total[i]<total[j])
        			rank[i]++;
        	}
        }
        // ��� 
        System.out.println("================== ���� ��� ==============================");
        System.out.printf("%-4s%-4s%-4s%-6s%-6s%-6s%-6s\n","����","����","����","����","���","����","���");
        for(int i=0;i<3;i++)
        {
        	System.out.printf("%-5d%-5d%-5d%-7d%-7.2f%-5c%-5d\n",kor[i],eng[i],
        			math[i],total[i],avg[i],score[i],rank[i]);
        }
        
	}

}










