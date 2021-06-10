// ++ , -- : 1증가 , 1감소
/*
 *   int a=10;
 *   a++; => a+1
 *   a++; => a+1
 *   ++a; => a+1
 */
public class 증감연산자2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=10;
        //int b=a++ + ++a + a++ + ++a;
        //System.out.println(b);
        //    10  +  12 + 12  + 14 ==> 48
        //System.out.println(a);
        //int b= ++a + ++a;
        //     11  + 12 ==> 23
        //       a+1
        //int b= a++ + a++;
        //     10    11  ==> 21
        //int b = ++a + a++;
        //      11    11  ==> 22
        int b = ++a;  // b=11,a=11
        //  1.a를 1개 증가 
        //  2.증가된값을 b에 대입
        System.out.println(b);
   
        int c = a++; // c=11 a=12
        // 1. c에 a값을 대입 
        // 2. a를 한개 증가 
        System.out.println(c);
        
        int d=10;
        int e=d--;
        
        System.out.println(d);//9
        // e=10
        System.out.println(e);
        
        int k=10;
        int m=--k;
        System.out.println(k);//9
        System.out.println(m);//9
	}

}




