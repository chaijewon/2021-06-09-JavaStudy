
public class 자바메소드재사용 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double s=86.0;
        //char c=자바메소드_2.score(s);
        char score='A';
    	switch((int)(s/10)) // 정수,문자,문자열
        {
        case 10:
        case 9:
        	score='A'; // if(avg==10 || avg==9)
        	break;// 종료
        case 8:
        	score='B';
        	break;// 종료
        case 7:
        	score='C';
        	break;// 종료
        case 6:
        	score='D';
        	break;// 종료
        default:
        	score='F';
        }
        System.out.println("학점:"+score);
        
	}

}
