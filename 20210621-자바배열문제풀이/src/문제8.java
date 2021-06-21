/*
 *   다음 코드와 같이 과목과 점수가 짝을 이루도록 2개의 배열을 작성하라.

String course[]={"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
int course[]={95, 88, 76, 62, 55};

과목 이름 >>  Jaba
없는 과목입니다.
 
과목 이름 >>  Java
Java의 점수는 95
 
과목 이름 >>  C++
C++의 점수는 88
 
과목 이름 >>  그만


 */
import java.util.Scanner;
public class 문제8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String course[]={"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
		int score[]={95, 88, 76, 62, 55};
		Scanner scan=new Scanner(System.in);
		
		
		int k=0;
		while(true)
		{
			System.out.print("과목 입력:");
			String subject=scan.next();
			if(subject.equals("그만"))
			{
			    break;
			}
			boolean bCheck=false;
			for(int i=0;i<course.length;i++)
			{
				
				if(subject.equals(course[i]))
				{
					System.out.println(subject+"의 점수는 "+score[i]);
					bCheck=true;
					break;
				}
				
			}
			if(bCheck==false)
			{
				System.out.println("없는 과목입니다");
			}
			
		}
	}

}






