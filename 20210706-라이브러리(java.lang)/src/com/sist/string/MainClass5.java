package com.sist.string;
/*
 *   replace  : º¯È¯ 
 *     String s="Hello"
 *     s.replace('l','k');  ==> Hekko
 *               old  new 
 *   replaceAll
 *   trim
 *   valueOf
 *   length
 *   
 *   String s="Hello Java";
 *   s="Hekko Java";
 *   
 *   int a=10;
 *   int b=a; b=100;
 *   a=100;
 *   
 *   ==> ÀÚ¹Ù (StringÅ¬·¡½º => call by reference(X)) => Call by Value => ÀÏ¹Ý ±âº»Çü µ¥ÀÌÅÍ 
 *   
 */
public class MainClass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String data="Hello Java";
        // º¯È¯µÈ ¹®ÀÚ¿­ ¹Þ±â 
        String s=data.replace('l', 'k');
        System.out.println(s);
        s=data.replace("Java", "Kotlin");// ¹®ÀÚ¿­ ÀüÃ¼ º¯°æ
        System.out.println(s);
        System.out.println(data);
        int rank=(int)(Math.random()*500)+1;
        String data2=rank+"ÁÁÀº »ç¶÷ ÀÖÀ¸¸é ¼Ò°³½ÃÄÑÁà";
        System.out.println(data2);
        String num=data2.replaceAll("[^0-9]", ""); //¼ýÀÚ¸¦ Á¦¿ÜÇÏ°í ³ª¸ÓÁö ""
        String title=data2.replaceAll("[^°¡-ÆR]", "");
        System.out.println("Rank:"+num);
        System.out.println("Title:"+title);
        
        // trim() => ÁÂ¿ìÀÇ °ø¹éÀ» Á¦°Å : »ç¿ëÀÚ ÀÔ·Â°ª => È¸¿ø°¡ÀÔ , ·Î±×ÀÎ ,¾ÆÀÌµðÃ¼Å© , ºñ¹Ð¹øÈ£... => ¿À¶óÅ¬¿¡ ÀúÀå
        String data3=" Hello Java ";
        System.out.println(data3.length());
        System.out.println(data3);
        String s2=data3.trim(); // "Hello Java" => Áß°£¿¡ ÀÖ´Â °ø¹éÀº Á¦°Å ÇÒ ¼ö ¾ø´Ù 
        // s2.replace(" ","")
        System.out.println(s2.length());
        System.out.println(s2);
        System.out.println(s2.replace(" ",""));// Áß°£¿¡ ÀÖ´Â °ø¹éÀº Á¦°Å
        // valueOf() => static => String.valueOf(10) = "10" 
        // String.valueOf(true) => "true" 
        // String.valueOf(10.5) => "10.5" 
        // ¸ðµç µ¥ÀÌÅÍÇüÀ» ¹®ÀÚ¿­·Î º¯È¯  ==> À©µµ¿ì , À¥ (¹®ÀÚ¿­) 
        
        
	}

}








