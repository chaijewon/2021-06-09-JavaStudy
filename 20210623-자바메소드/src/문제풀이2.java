
public class 문제풀이2 {
    static boolean isYear(int year)
    {
    	if((year%4==0 && year%100!=0)||(year%400==0))
    		 return true;
    	else
    		return false;
    }
    static void print()
    {
    	int year=문제풀이.input("년도");
    	boolean check=isYear(year);
    	if(check)
    		System.out.println(year+"년도는 윤년입니다");
    	else
    		System.out.println(year+"년도는 윤년이 아닙니다");
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        print();
	}

}
