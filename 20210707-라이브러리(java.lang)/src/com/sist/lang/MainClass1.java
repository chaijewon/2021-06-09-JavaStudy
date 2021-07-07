package com.sist.lang;
/*
 *    java.lang
 *    ==========
 *      Object(ÃÖ»óÀ§ Å¬·¡½º)
 *        =  toString() : °´Ã¼¸¦ ¹®ÀÚ¿­ º¯È¯  => (String)
 *           String toString()
 *        =  finalize() : ¼Ò¸êÀÚ ÇÔ¼ö 
 *           GC´ë»ó (¸Ş¸ğ¸® ÇØÁ¦)
 *           => °´Ã¼°¡ null
 *           A a=new A();
 *           a=null;
 *           => °´Ã¼¸¦ ´õÀÌ»ó »ç¿ëÇÏÁö ¾Ê´Â °æ¿ì
 *        =  clone() : º¹Á¦ => ÀÖ´Â ±×´ë·Î(º¯¼ö°ª) => ´Ù¸¥ ¸Ş¸ğ¸®¿¡ COPY => ¾Æ¹ÙÅ¸ 
 *           ÂüÁ¶ : °°Àº ÁÖ¼Ò¸¦ Á¦¾î (º°Äª)
 *           A a=new A();
 *           A b=a;
 *           new 
 *           class A
 *           {
 *              int aa=10;
 *              int bb=20;
 *           }
 *           A a=new A(); // a°ø°£ => aa=100 , bb=200
 *             a.aa=100;
 *             a.bb=200;
 *           A b=new A(); ==> ÃÊ±âÈ­ (Å¬·¡½º·Î µî·ÏÇÑ ³»¿ëÀÌ ÃÊ±âÈ­)
 *                        // b°ø°£ => aa=10 , bb=20
 *           clone()
 *           A a=new A(); // a°ø°£ => aa=100 , bb=200
 *             a.aa=100;
 *             a.bb=200;
 *           A b=a.clone() ==> ÃÊ±âÈ­ (Å¬·¡½º·Î µî·ÏÇÑ ³»¿ëÀÌ ÃÊ±âÈ­)
 *                        // b°ø°£ => aa=100 , bb=200
 *        = getClass() => °áÇÕ¼ºÀÌ ³·Àº ÇÁ·Î±×·¥ (ÇÑ°³ÀÇ Å¬·¡½º¿¡¼­ ¼öÁ¤ => ´Ù¸¥ Å¬·¡½º¿¡ ¿µÇâÀÌ ÀÖÀ¸¸é)
 *          ========== Å¬·¡½ºÀÇ Á¤º¸¸¦ °¡Áö°í ¿Í¼­ Ã³¸® 
 *        = °´Ã¼ ºñ±³ : equals
 *        = »ç¿ëÀÚ Á¤ÀÇ,¶óÀÌºê·¯¸® Å¬·¡½º => Object»ó¼Ó (¼³Á¤µÈ ¸ğµç ¸Ş¼Òµå¸¦ »ç¿ëÇÒ ¼ö ÀÖ´Ù => °æ¿ì¿¡ µû¶ó ¿À¹ö¶óÀÌµù °¡´É)
 *        
 *      String(¹®ÀÚ¿­ °ü¸®) : È®ÀåÇÒ ¼ö ¾ø´Â Å¬·¡½º (»ó¼ÓÇÒ ¼ö ¾ø´Ù) => public final class String
 *          => char[]À» Á¦¾îÇÏ´Â ÇÁ·Î±×·¥ 
 *          => ¹®ÀÚ¿­ÀÇ À§Ä¡´Â 0¹øºÎÅÍ ½ÃÀÛ 
 *          => Å¬·¡½º=>Call By reference => String Á¦¿Ü (ÀÌ¹ø ±âº»ÇüÃ³·³ »ç¿ë)
 *          => ""(¹®ÀÚ¿­) => ¹®ÀÚ¿­ ÀÚÃ¼°¡ ÁÖ¼Ò
 *             String s="Hello"
 *             String s1="Hello" => °°Àº ÁÖ¼Ò¸¦ °¡Áö°í ÀÖ´Ù s==s1
 *          => ÁÖ¿ä¸Ş¼Òµå 
 *          1. º¯È¯
 *             replace => ´Ü¾î / ¹®ÀÚ º¯°æ 
 *              String s="Hello Java";
 *              s.replace('a','b') ==> Hello Jbvb
 *              s.replace("Java","Kotlin") ==> Hello Kotlin
 *             replaceAll => µ¥ÀÌÅÍ ¼öÁı (HTMLÆ÷ÇÔ => Á¦°Å)
 *              String s="123Hello";
 *              s.replaceAll("[0-9]",""); => Hello
 *              s.replaceAll("[^0-9]","") (^ ==> !) 123
 *                => Á¤±Ô½Ä
 *                [0-9] => ¹üÀ§
 *                {1,3} => °¹¼ö  
 *                211.238.142.181 , 127.0.0.1 , 90.89.181.1
 *                [0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3} => ¹®ÀÚÆĞÅÏ 
 *                "/watch?v=[^°¡-ÆR]+"
 *             toUpperCase : ´ë¹®ÀÚ º¯È¯
 *             toLowerCase : ¼Ò¹®ÀÚ º¯È¯ 
 *          2. ¹®ÀÚ¿­ °áÇÕ 
 *             +  
 *             concat 
 *             String s="Hello"
 *             String s1=" Java"
 *             s.concat(s1)  ===> Hello Java  ==> +
 *             s+s1=> Hello Java
 *             
 *          3. ¹®ÀÚ Ã£±â 
 *             indexOf() => -1ÀÌ¸é ¾ø´Ù => ¾Õ¿¡¼­ºÎÅÍ Ã£´Â´Ù 
 *             lastIndexOf() => µÚ¿¡¼­ºÎÅÍ Ã£´Â´Ù 
 *             => ¿À¹ö·Îµù 
 *             indexOf(int) , indexOf(String) , indexOf(int,int)
 *             String s="http://www.daum.net/main/main.jsp"
 *                                         ===
 *             s.indexOf('/',8) => À§Ä¡Ã£±â 
 *             
 *             contains() => Æ÷ÇÔ  ===> LIKE %'´Ü¾î'%   ==> .*´Ü¾î.*
 *             startsWith() => ½ÃÀÛ¹®ÀÚ¿­ => LIKE '´Ü¾î'% ==> ^´Ü¾î
 *             endsWith() => ³¡³ª´Â ¹®ÀÚ¿­ => LIKE %'´Ü¾î' ==> ´Ü¾î$
 *             matches(String regex) => Á¤±Ô½ÄÀ¸·Î Ã£´Â ¹æ¹ı
 *             
 *          4. ±âÅ¸ 
 *             trim() : °ø¹é¹®ÀÚ Á¦°Å (ÁÂ¿ì)
 *             valueOf() : ¸ğµç µ¥ÀÌÅÍÇüÀ» ¹®ÀÚ¿­·Î º¯È¯ 
 *             length() : ¹®ÀÚ °¹¼ö 
 *      StringBuffer/StringBuilder
 *        => ¸¹Àº ¹®ÀÚ¿­À» ÀĞ¾î ¿Ã¶§ ÁÖ·Î »ç¿ë 
 *        => append() ¹®ÀÚ¿­ °áÇÕ  *** Buffer(ÀÓ½Ã ±â¾ïÀå¼Ò)
 *        => reverse() : ¹®ÀÚ¸¦ ²¨²Ù·Î µÚÁı´Â ¸Ş¼Òµå 
 *      Math 
 *        => ceil() : ¿Ã¸² => ÃÑÆäÀÌÁö ±¸ÇÏ±â (¿À¶óÅ¬ : ÀÎ¶óºä) : double
 *        => random() : ÀÓÀÇ·Î ÃßÃâ => 0.0~0.99 : double 
 *        
 *      Wrapper : ±âº» µ¥ÀÌÅÍÇüÀ» Å¬·¡½ºÈ­ ½ÃÅ² °Í : Á¦¾îÇÏ±â ½±°Ô ¸¸µé¾î ÁØ´Ù 
 *         º¯È¯ ==> ¹®ÀÚ¿­À» ÇØ´ç µ¥ÀÌÅÍÇüÀ¸·Î º¯°æ
 *         ***int = Integer
 *            = 2Áø¹ı
 *            = 8Áø¹ı
 *            = 10Áø¹ı
 *            = 16Áø¹ı 
 *            = ¹®ÀÚ¿­ => Á¤¼ö·Î º¯È¯ => parseInt() => static => Integer.parseInt("10") => 10
 *         long = Long 
 *         ***double = Double
 *         float = Float
 *         ***byte = Byte ======> ÄÚµå 
 *         https://www.google.com/search?q=%EC%9E%90%EB%B0%94&rlz=1C1CHBD_koKR933KR933&oq=%EC%9E%90%EB%B0%94&aqs=chrome..69i57j69i59j35i39l2j0i433l2j0i131i433j0i433j0l2.1334j0j15&sourceid=chrome&ie=UTF-8
 *         ÀÚ¹Ù=%EC%9E%90%EB%B0%94 ÀÎÄÚµù => µğÄÚµù 
 *         char = Charecter
 *         short = Short
 *         ***boolean = Boolean
 *         ¿ÀÅä¹Ú½Ì / ¾ğ¹Ú½Ì 
 *         
 *         int a=10;
 *         Integer i=a; Integer i=10 Boolean b=true
 *         int b=i
 *         int b=i
 *         ==> int³ª Integer°¡ µ¿ÀÏÇÏ°Ô »ç¿ëÀÌ µÈ´Ù 
 *         
 *      System 
 *         println() , printf() ,  print() , gc() , System.currentTimeMillis():½Ã°£(long)
 *                                                  ===========================
 *      ==========================                    logÆÄÀÏ 
 *    java.util
 *    =========
 *      Date , Calendar
 *      List , Set  , Map => Web,Spring => Á¦³×¸¯½º (µ¥ÀÌÅÍÇüÀ» ÅëÀÏÈ­) <String>
 *      StringTokenizer 
 *    java.io
 *    =========
 *      File , FileReader , FileInputStream , FileWriter , FileOutputStream => ÀÚ·á½Ç(¾÷·Îµå,´Ù¿î·Îµå)
 *      ÃßÃµ 
 *    java.net 
 *    =========
 *      URL , URLEncoder  (Socket,Thread:ÀÏ¹İÀ¥(X) ==> Kotlin)
 *    
 *    Stream(),¶÷´Ù 
 *    ============
 *    
 *    *****
 *    java.sql
 *    ========
 *     Connection , Statement , ResultSet
 *     
 *    ==========================================> ¿ÜºÎ¶óÀÌºê·¯¸® (lombok,simple-json,javax.xml.bind)
 *           Spring / Mybatis(DB ¿¬µ¿) 
 *    ==========================================> 
 *           Áö´ÉÇü À¥  ==> Á¤±Ô½Ä (java.lang.reflect) Pattern/Matcher => µ¥ÀÌÅÍ ºĞ¼® 
 *                        ÇüÅÂ¼Ò ºĞ¼® ==> ÄÚ¸ğ¶õ,²¿²¿¸¶ (ÀÚ¹Ù ¶óÀÌºê·¯¸®)
 *                        ===================================================== Ãªº¿ , À¯»ç °ü·Ã °Ë»ö¾î
 *                         ¿¬°ü ºĞ¼® 
 *                         =======
 */
public class MainClass1 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
        /*String data="SSG º£Å×¶û ¿ì¿Ï ±è»ó¼ö´Â 5ÀÏ ÀÎÃµ ·Ôµ¥Àü¼­ 3ÀÌ´× µ¿¾È 3ÇÇ¾ÈÅ¸(1ÇÇÈ¨·±) "
        		+ "1Å»»ïÁø 2º¼³İ 1½ÇÁ¡À¸·Î Àß ´øÁ³´Ù. 7-3À¸·Î ¾Õ¼± 5È¸ÃÊ ½ÃÀÛ°ú ÇÔ²² ¸¶¿îµå¿¡ ¿Ã¶ú´Ù. "
        		+ "Å¸ÀÌÆ®ÇÑ »óÈ²Àº ¾Æ´Ï¾ú´Ù. »ç½Ç Ä¡¾Æ ºÎ»ó¿¡¼­ µ¹¾Æ¿Â µÚ ÆäÀÌ½º°¡ ¾ÈÁ¤ÀûÀÌÁö ¾Ê¾Ò´Ù. "
        		+ "°áÁ¤Àû ¼ø°£¿¡ Ä¡¸íÀû ÇÑ ¹æÀ» ¸Â±âµµ Çß´Ù. ¶ÇÇÑ, ÃÖ±Ù ½ÅÀÎ ÀåÁöÈÆ°ú ÁÂ¿Ï ±èÅÂÇüÀÇ ÆäÀÌ½º°¡ "
        		+ "»ó´çÈ÷ ÁÁ´Ù.";
        // matches=> Á¤±Ô½Ä => ÀÌ¸ŞÀÏ , IP , ÀüÈ­¹øÈ£ ...
        if(data.matches(".*±è»ó¼ö.*"))
        {
        	System.out.println("Æ÷ÇÔµÇ¾î ÀÖ½À´Ï´Ù");
        }
        else
        {
        	System.out.println("¹ÌÆ÷ÇÔÀÔ´Ï´Ù");
        }*/
        
        // ¿µ¾î¹®ÀÚ Æ÷ÇÔ data.matches(".*[a-zA-Z].*")
        // ¼ıÀÚ Æ÷ÇÔ data.matches(".*[0-9].*")
        // ÇÑ±Û Æ÷ÇÔ data.matches(".*[°¡-ÆR].*")  => Á¤±Ô½Ä 
		String data="ABCDEFGHIJKLMN";
		for(int i=0;i<data.length();i++)
		{
			System.out.print(data.charAt(i));
		}
		System.out.println();
		for(int i=data.length()-1;i>=0;i--)
		{
			System.out.print(data.charAt(i));
		}
		System.out.println();
		StringBuffer sb=new StringBuffer(data); // ±×¸²µµ °¡´É
		System.out.println(sb.toString());
		String s=sb.reverse().toString();
		System.out.println(s);
	}

}








