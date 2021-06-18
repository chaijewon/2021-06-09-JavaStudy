import java.util.Arrays;

// 알파벳을 정렬 
/*
 *     I, W, R, M, Q, P, N
 *     =  =
 *     I  W
 *     =     =
 *     I     R
 *     =        =
 *     I        M
 *     =           =
 *     I           Q
 *     =              =
 *     I              P
 *     =                 =
 *     I                 N
 *     ============================ for 1
 *     I, W, R, M, Q, P, N
 *        =  =
 *        R  W
 *        =     =
 *        M     R
 *        =        =
 *        M        Q
 *        =           =
 *        M           P
 *        =              =
 *        M              N
 *     ============================ for 2
 *     I  M  W  R  Q  P N
 *     ====  =  =
 *           R  W
 *           =     =
 *           Q     R
 *           =        =
 *           P        Q
 *           =          =
 *           N          P
 *    ============================= for 3
 *    I  M  N   W  R  Q P
 *    =======   =  =
 *              R  W
 *              =     =
 *              Q     R
 *              =       =
 *              P       Q
 *              ===========
 *              P  W  R Q
 *    ============================= for 4
 *    I M N P W R Q
 *            = =
 *            R W
 *            =   =
 *            Q   R
 *    ============================ for 5
 *    I M N P Q W R
 *    ========= = =
 *              R W
 *    ============================ for 6
 *    I M N P Q R W
 */
public class 자바배열응용_선택정렬2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*char[] alpha=new char[7];
        // ASC => 올림 차순 
        for(int i=0;i<alpha.length;i++)
        {
        	alpha[i]=(char)((Math.random()*26)+65);
        }
        System.out.println(Arrays.toString(alpha));
        
        //Arrays.sort(alpha);
        for(int i=0;i<alpha.length-1;i++)
        {
        	for(int j=i+1;j<alpha.length;j++)
        	{
        		// 교환 
        		if(alpha[i]>alpha[j])
        		{
        			char temp=alpha[i];
        			alpha[i]=alpha[j];
        			alpha[j]=temp;
        		}
        		
        	}
        }*/
        /*
         *    int a=10;
         *    int b=20;
         *    
         *    a=b; a=20
         *    b=a; b=20
         *    =========
         *    
         *    int temp=a; ==> temp=10;
         *    a=b;  ==> a=20
         *    b=temp;==> b=10
         */
        //System.out.println(Arrays.toString(alpha));
        // String s="ADBHCEOPEK"; ==> DESC
		String s="ADBHCEOPEK";
		char[] alpha=new char[s.length()];
		for(int i=0;i<s.length();i++)
		{
			alpha[i]=s.charAt(i);
		}
		System.out.println(Arrays.toString(alpha));
		/*for(int i=0;i<alpha.length-1;i++)
        {
        	for(int j=i+1;j<alpha.length;j++)
        	{
        		// 교환 
        		if(alpha[i]>alpha[j])
        		{
        			char temp=alpha[i];
        			alpha[i]=alpha[j];
        			alpha[j]=temp;
        		}
        		
        	}
        }*/
		for(int i=0;i<alpha.length-1;i++)
		{
			for(int j=0;j<alpha.length-1-i;j++)
			{
				if(alpha[j]<alpha[j+1])
				{
					char temp=alpha[j];
					alpha[j]=alpha[j+1];
					alpha[j+1]=temp;
				}
			}
		}
		//System.out.println(new String(alpha));
		s=s.valueOf(alpha);// char[] ==> String
		System.out.println(s);
		
	}

}








