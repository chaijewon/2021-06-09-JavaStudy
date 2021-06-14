/*
 *    »ïÇ×¿¬»êÀÚ 
 *      Çü½Ä) 
 *           Á¶°Ç ? °ª1 : °ª2
 *           ===
 *            trueÀÏ °æ¿ì ==> °ª1
 *            falseÀÏ °æ¿ì ==> °ª2
 */
import java.util.Scanner; // ÀÔ·Â°ªÀ» ¹Þ´Â °æ¿ì 
// ´Ù¸¥ Å¬·¡½º¸¦ ºÒ·¯ ¿Ã¶§ »ç¿ë 
/*
 *    c/c++  => #include <io.h>
 *    java   => import Å¬·¡½º¸í
 *    c#     => using 
 *    python => from °æ·Î import 
 *    kotlin => import 
 */
public class ÀÚ¹Ù¿¬»êÀÚ_»ïÇ×¿¬»êÀÚ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        char c='A';
        System.out.println(
           (c>='A' && c<='Z')||(c>='a' && c<='z')?"¾ËÆÄºª":"¾ËÆÄºªÀÌ ¾Æ´Ï´Ù"
        );
        char c1='1'; // '0'~'9'   '100'
        // [0-9]  [A-Za-z] [°¡-ÆR]
        System.out.println(
           	c1>='0' && c1<='9'?"¼ýÀÚÇü ¹®ÀÚ":"¼ýÀÚÇü ¹®ÀÚ°¡ ¾Æ´Ï´Ù"
        );
        
        int i=100;
        System.out.println(
           i%3==0 || i%5==0 || i%7==0 ? "3ÀÇ¹è¼ö,5¹è¼ö,7¹è¼ö":"´Ù¸¥ ¹è¼ö"	
        );
	}

}






