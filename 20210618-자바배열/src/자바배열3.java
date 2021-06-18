/*
 *   3명의 학생 
 *     국어,영어,수학 ==> 점수를 입력해서 
 *     1. 총점 
 *     2. 평균
 *     3. 학점
 *     4. 등수 
 *     ========= 일반 => 변수 21개 
 *     
 *     
 *     변수 ==> 응용 
 *              연산자 ===> 응용 
 *                         제어문 ====> 응용
 *                                   ===== 배열 ====> 
 *                                            메소드 ======= 응용
 *                                                클래스 (객체) + 라이브러리 ==> 조립 
 */
import java.util.Scanner;
public class 자바배열3 {

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
        // 1. 키보드 받기
        Scanner scan=new Scanner(System.in);
        for(int i=0;i<3;i++)
        {
        	System.out.printf("%d번째 국어점수 입력:",(i+1));
        	kor[i]=scan.nextInt();
        	System.out.printf("%d번째 영어점수 입력:",(i+1));
        	eng[i]=scan.nextInt();
        	System.out.printf("%d번째 수학점수 입력:",(i+1));
        	math[i]=scan.nextInt();
        	total[i]=kor[i]+eng[i]+math[i];
        	avg[i]=total[i]/3.0;
        }
        // 학점 
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
        // 등수
        for(int i=0;i<3;i++)
        {
        	rank[i]=1;
        	for(int j=0;j<3;j++)
        	{
        		if(total[i]<total[j])
        			rank[i]++;
        	}
        }
        // 출력 
        System.out.println("================== 성적 목록 ==============================");
        System.out.printf("%-4s%-4s%-4s%-6s%-6s%-6s%-6s\n","국어","영어","수학","총점","평균","학점","등수");
        for(int i=0;i<3;i++)
        {
        	System.out.printf("%-5d%-5d%-5d%-7d%-7.2f%-5c%-5d\n",kor[i],eng[i],
        			math[i],total[i],avg[i],score[i],rank[i]);
        }
        
	}

}










