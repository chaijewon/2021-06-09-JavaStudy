/*
 *   2.	Scanner 클래스를 이용하여 정수로 된 돈의 액수를 
 *   입력받아 오만 원권, 만 원권, 천 원권, 500원짜리 동전, 
 *   100원짜리 동전, 50원짜리 동전, 10원짜리 동전, 
 *   1원짜리 동전 각 몇개로 변환되는지 출력하라.


 */
import java.util.Scanner;
// 65376 
public class 문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("금액 입력:");
        int won=scan.nextInt();
        System.out.println("won="+won);
        
        int a=won/50000;
        System.out.printf("5만원권:%d매\n",a);
        won=won-(50000*a);
        
        a=won/10000;
        System.out.printf("1만원권:%d매\n",a);
        won=won-(10000*a);
        
        a=won/5000;
        System.out.printf("5천원권:%d매\n",a);
        won=won-(5000*a);
        
        a=won/1000;
        System.out.printf("1천원권:%d매\n",a);
        won=won-(1000*a);
        
        a=won/100;
        System.out.printf("1백원:%d개\n",a);
        won=won-(100*a);
        
        a=won/50;
        System.out.printf("5십원:%d개\n",a);
        won=won-(50*a);
        
        a=won/10;
        System.out.printf("십원:%d개\n",a);
        won=won-(10*a);
        
        System.out.printf("1원:%d개\n",won);
        
        /*
        int[] value={50000,10000,5000,1000,100,50,10};
        for(int i=0;i<value.length;i++)
        {
        	int b=won/value[i];
        	if(i<=3)
        	  System.out.printf("%d원:%d매\n",value[i],b);
        	else
        	  System.out.printf("%d원:%d개\n",value[i],b);
        	won=won-(value[i]*b);
        }
        System.out.println("1:"+won+"개");*/
	}

}
