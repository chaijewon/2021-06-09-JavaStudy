package com.sist.math;
// 수학 관련 (게임,통계) => random() : 예매 가능 날, => 난수 (임의의 수)
// ceil() => 올림 => 페이지 나누기 (총페이지) 
// 10개를 한페이지 => 총갯수가 25 ==> 25/10 => 2  ==> 25/10.0 => 2.5 => 올림 => 3
// 기술면접 => 페이징 기법 
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int rowSize=10; // 한페이지에 출력할 갯수 
        int count=37; 
        /*int total=count/rowSize;//3
        if(count%rowSize>0)
        	total++;
        System.out.println("총페이지:"+total);*/
        int total=(int)Math.ceil(count/(double)rowSize);
        //             =======================  37/10.0 ==> (int)4.0 => 4  =>3.1 4
        System.out.println("총페이지:"+total);
        for(int i=1;i<=total;i++)
        {
        	System.out.print(i+" ");
        }
        	
	}

}
