/*
 *   반복제어문 : 반복문을 제어하는 프로그램 
 *             ======
 *             1. 반복문을 중단 => break
 *             2. 반복문에서 특정부분 제외 => continue
 *   *** 주의점 : break,continue는 소속 반복문만 제어 할 수 있다 
 *   outer:
 *   for(int i=1;i<=5;i++)
 *   {
 *      for(int j=1;j<=5;j++)
 *      {
 *          if(j==3)
 *             break; ==> 2차 for문 제어 
 *          if(j==5)
 *             break outer;
 *      }
 *   } 
 *     
 */
public class 자바제어문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for1:
        for(int i=1;i<=5;i++)
        {
        	for2:
        	for(int j=1;j<=5;j++)
        	{
        		/*if(j==3)
        			break for2;*/
        		if(j==3)
					/* break for1; */
        			continue;// 증가식 ==> j++ (4...)
        		System.out.println("i="+i+",j="+j);
        	}
        }
        /*
         *   i=1 j=1
         *       j=2
         *       j=3//제외 
         *       j=4
         *       j=5
         *   ========
         *   i=2 j=1
         *       j=2
         *       
         *   i=3 j=1
         *       j=2
         *       
         *   i=4 j=1
         *       j=2
         *       
         *   i=5 j=1
         *       j=2
         *       
         */
	}

}












