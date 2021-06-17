/*
 *     3.	숫자를 입력받아 3~5는 봄, 6~8은 여름, 9~11은 가을, 12,1,2는 겨울, 
 *          그 외의 숫자를 입력한 경우 잘못입력을 출력하는 프로그램을 작성하라. if-else 문과 switch 둘 다 이용해 볼 것.

		결과)
		달을 입력하세요(1~12) >> 9
		가을


 */
import java.util.Scanner;
public class 문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("달 입력하세요(1~12)>>");
        int month=scan.nextInt();
        switch(month)
        {
        case 3: case 4: case 5:
        	System.out.println("봄");
        	break;
        case 6: case 7: case 8:
        	System.out.println("여름");
        	break;
        case 9: case 10: case 11:
        	System.out.println("가을");
        	break;
        case 12: case 1: case 2:
        	System.out.println("겨울");
        	break;
        default:
        	System.out.println("잘못된 입력입니다");
        }
        /*if(month>=3 && month<=5) // month==3 || month==4 || month==5
        {
        	System.out.println("봄");
        }
        else if(month>=6 && month<=8)
        {
        	System.out.println("여름");
        }
        else if(month>=9 && month<=11)
        {
        	System.out.println("가을");
        }
        else if(month==12 || month==1 || month==2)
        {
        	System.out.println("겨울");
        }
        else
        {
        	System.out.println("잘못된 입력입니다");
        }
        */
	}

}











