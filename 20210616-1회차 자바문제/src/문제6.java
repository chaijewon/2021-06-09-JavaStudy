/*
 * 6) 100�� �������� ������ �Է� �޾� 90~100�̸� A,80~89�̸� B,70~79�̸� C, 60~69�̸� D,
   60�� ���ϸ� F�� ����϶� (switch~case ���)

 */
public class ����6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score=(int)(Math.random()*101);
        // ���
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
        System.out.println("����:"+score+",����:"+c);
	}

}
