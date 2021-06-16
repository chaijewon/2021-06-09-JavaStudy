/*
 * 6) 100점 만점으로 성적을 입력 받아 90~100이면 A,80~89이면 B,70~79이면 C, 60~69이면 D,
   60점 이하면 F를 출력하라 (switch~case 사용)

 */
public class 문제6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score=(int)(Math.random()*101);
        // 결과
        char c='A';
        int no=score/10;
        switch (no) {
        case 10:
        case 9:
        	c='A';
        	break;
        case 8:
        	c='B';
        	break;
        case 7:
        	c='C';
        	break;
        case 6:
        	c='D';
        	break;
        default:
        	c='F';
        }
        System.out.println("점수:"+score+",학점:"+c);
	}

}
