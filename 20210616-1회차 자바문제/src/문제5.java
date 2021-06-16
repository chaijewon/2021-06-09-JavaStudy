/*
 * 5) 100점 만점으로 성적을 입력 받아 90~100이면 A,80~89이면 
 *  B,70~79이면 C, 60~69이면 D,
   60점 이하면 F를 출력하라 (다중 if 사용)

 */
public class 문제5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int score=(int)(Math.random()*101);
        // 결과
        char c='A';
        if(score>=90)
        	c='A';
        else if(score>=80)
        	c='B';
        else if(score>=70)
        	c='C';
        else if(score>=60)
        	c='D';
        else
        	c='F';
        
        System.out.println("점수:"+score+",학점:"+c);
	}

}
