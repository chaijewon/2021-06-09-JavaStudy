
public class �ڹٸ޼ҵ����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double s=86.0;
        //char c=�ڹٸ޼ҵ�_2.score(s);
        char score='A';
    	switch((int)(s/10)) // ����,����,���ڿ�
        {
        case 10:
        case 9:
        	score='A'; // if(avg==10 || avg==9)
        	break;// ����
        case 8:
        	score='B';
        	break;// ����
        case 7:
        	score='C';
        	break;// ����
        case 6:
        	score='D';
        	break;// ����
        default:
        	score='F';
        }
        System.out.println("����:"+score);
        
	}

}
