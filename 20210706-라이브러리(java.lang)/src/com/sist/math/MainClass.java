package com.sist.math;
// ���� ���� (����,���) => random() : ���� ���� ��, => ���� (������ ��)
// ceil() => �ø� => ������ ������ (��������) 
// 10���� �������� => �Ѱ����� 25 ==> 25/10 => 2  ==> 25/10.0 => 2.5 => �ø� => 3
// ������� => ����¡ ��� 
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int rowSize=10; // ���������� ����� ���� 
        int count=37; 
        /*int total=count/rowSize;//3
        if(count%rowSize>0)
        	total++;
        System.out.println("��������:"+total);*/
        int total=(int)Math.ceil(count/(double)rowSize);
        //             =======================  37/10.0 ==> (int)4.0 => 4  =>3.1 4
        System.out.println("��������:"+total);
        for(int i=1;i<=total;i++)
        {
        	System.out.print(i+" ");
        }
        	
	}

}
