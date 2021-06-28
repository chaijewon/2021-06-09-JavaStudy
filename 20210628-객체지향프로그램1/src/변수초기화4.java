
public class 변수초기화4 {
    int a=10; // 1
    {
    	a=100; // 2
    }
    변수초기화4()
    {
    	a=1000; //3
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        변수초기화4 aa=new 변수초기화4();
        System.out.println(aa.a);
	}

}
