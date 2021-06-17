/*
 *    String substring(6)
 *    String substring(int begin,int end)
 *    
 *    "Hello Java!!"
 */
public class 자바문자열데이터3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="Hello Java!!";
        System.out.println(s.substring(6));
        System.out.println(s.substring(6,10)); // end-1 (미포함)
        // endIndex - 1
        System.out.println(s.substring(0,4));
	}

}
