import java.util.Arrays;

// 추천 프로그램 
/*
 *    영화추천 => 네이버 (블로그,카페)
 *    ========================== 빈도(언급)  ===> REGEX (정규식)
 */
// 204page 
public class 배열활용_빈도수구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr=new int[10];
        for(int i=0;i<arr.length;i++)
        {
        	arr[i]=(int)(Math.random()*10); // 0~9까지 사이의 난수 
        }
        System.out.println(Arrays.toString(arr));
        int[] count=new int[10];
        for(int i=0;i<arr.length;i++)
        {
        	count[arr[i]]++;//count[6]++ => 1
        	//[6, 3, 1, 2, 5, 2, 5, 4, 7, 6]
        }
        for(int i=0;i<count.length;i++)
        {
        	System.out.println(i+"의 갯수:"+count[i]);
        }
	}

}
