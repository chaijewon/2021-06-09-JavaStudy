/*
 *   2.	Scanner 클래스를 이용하여 정수로 된 돈의 액수를 입력받아 오만 원권, 만 원권, 천 원권, 500원짜리 동전, 100원짜리 동전, 50원짜리 동전, 10원짜리 동전, 1원짜리 동전 각 몇개로 변환되는지 출력하라.


		결과)
		금액을 입력하시오 >> 65376 
		오만원권 1매 
		만원권 1매 
		천원권 5매 
		500원
		100원 3개 
		50원 1개 
		10원 2개
		1원 6개



 */
import java.util.Scanner;
public class 문제2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("금액 입력:");
        int won=scan.nextInt();
        
        // 5만원권
        int a=won/50000;
        System.out.printf("5만원권:%d매\n",a);
        won=won-(50000*a);
        System.out.println("won="+won);
        // 1만원
        a=won/10000;
        System.out.printf("1만원권:%d매\n",a);
        won=won-(10000*a);
        System.out.println("won="+won);
        // 5천원
        a=won/5000;
        System.out.printf("5천원권:%d매\n",a);
        won=won-(5000*a);
        System.out.println("won="+won);
        
        // 1천원
        a=won/1000;
        System.out.printf("1천원권:%d매\n",a);
        won=won-(1000*a);
        System.out.println("won="+won);
        
        // 500원
        a=won/500;
        System.out.printf("500원:%d개\n",a);
        won=won-(500*a);
        System.out.println("won="+won);
        
        // 100원
        a=won/100;
        System.out.printf("100원:%d개\n",a);
        won=won-(100*a);
        System.out.println("won="+won);
        
        // 50원
        a=won/50;
        System.out.printf("50원:%d개\n",a);
        won=won-(50*a);
        System.out.println("won="+won);
        
        // 10원
        a=won/10;
        System.out.printf("10원:%d개\n",a);
        won=won-(10*a);
        System.out.println("won="+won);
        
        System.out.printf("1원:%d개\n",won);
        
	}

}














