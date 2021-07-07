package com.sist.string;
/*
 *   ¸ğµç Å¬·¡½º´Â Object·ÎºÎÅÍ »ó¼ÓÀ» ¹Ş´Â´Ù 
 *   =========
 *     °´Ã¼¿Í °´Ã¼¸¦ ºñ±³ : equals
 *     »õ·Î¿î ¸Ş¸ğ¸® (¸Ş¸ğ¸® º¹Á¦) : clone
 *     °´Ã¼¸¦ ¹®ÀÚ¿­ º¯È¯ : toString
 *     Å¬·¡½ºÀÇ Á¤º¸¸¦ ÀĞ¾î ¿Â´Ù : getClass
 *     ¸Ş¸ğ¸® ÇØÁ¦ ¿©ºÎ È®ÀÎ : finalize()
 *        Object
 *          |
 *    ------------------- java.lang
 *     String , StringBuffer , StringBuilder 
 *     System, Wrapper , Math
 *    ------------------- java.util
 *     Date , Calendar , StringTokenizer , Scanner , Random
 *     ArrayList , Vector , LinkedList , HashSet , HashMap
 *    ------------------- java.io
 *    ------------------- java.net
 *    ------------------- Web (JSON,XML,CSV)
 *                            ===== Spring => Kotlin,Python,Java,JavaScript
 *                            {"name":"È«±æµ¿","":""} => Map
 *    String :  ¹®ÀÚ¿­ Á¦¾î (464page) => ¿øÇü) public final class String:»ó¼ÓÀ» ³»¸± ¼ö ¾ø´Â Å¬·¡½º 
 *    ====== ÀÖ´Â ±×´ë·Î »ç¿ë (È®ÀåÇÒ ¼ö ¾ø´Â Å¬·¡½º)
 *    ***** ¹®ÀÚ¿­ "" => ÀÚÃ¼°¡ ÁÖ¼Ò°ªÀÌ´Ù 
 *          => char[]¿¡ Á¦¾îÇÏ´Â ÇÁ·Î±×·¥  
 *          String s="Hello"; => char[] s={'H','e','l','l','o'} => char* s="Hello"
 *          => ¹®ÀÚ¿­ ÀúÀå ¹æ¹ı 
 *             String s="Hello"; ÁÖ·Î »ç¿ë 
 *             String s=new String("Hello"); // new¸¦ »ç¿ëÇÏ¸é ¸Ş¸ğ¸® °ø°£À» »õ·Ó°Ô ¸¸µç´Ù 
 *            ¹®ÀÚ¿­Àº ÁÖ¼Ò¸¦ ºñ±³ÇÏÁö ¾Ê°í ÀúÀåµÈ ¹®ÀÚ¿­ ºñ±³
 *            =======================      ========= equals
 *               ==(X) 
 *    ***** ¹®ÀÚ¿­ÀÌ °¡Áö°í ÀÖ´Â ±â´É (¸Ş¼Òµå) 
 *    1) ºñ±³ (¹®ÀÚ¿­°ú ¹®ÀÚ¿­ ºñ±³)
 *       equals => ´ë¼Ò¹®ÀÚ ±¸ºĞ (¾ÆÀÌµğ,ºñ¹Ğ¹øÈ£) ==> ¿À¶óÅ¬Àº ´ë¼Ò¹®±¸ºĞÀÌ ¾ø´Ù
 *                             select selECT SELECT Select.... (¿À¶óÅ¬¿¡¼­ ´ë¼Ò¹®ÀÚ ±¸ºĞ=ÀúÀåµÈ µ¥ÀÌÅÍ)
 *       equalsIgnoreCase => ´ë¼Ò¹®ÀÚ ±¸ºĞ ¾øÀÌ ºñ±³ (»ç¶÷ÀÇ ¿µ¹®ÀÌ¸§)
 *       compare() => Á¤·Ä (Å©±â ºñ±³) 0(°°´Ù)  À½¼ö / ¾ç¼ö  =========> ¿À¶óÅ¬ (Order BY name DESC|ASC)
 *                                  "ABC" "ABC"  "AB" "CD"
 *                                  ===========   A-C => -2
 *                                  A-A=0
 *                                  B-B=0
 *                                  C-C=0
 *    2) Ã£±â 
 *       =============================
 *       indexOf
 *       lastIndexOf ==> ¹®ÀÚÀ§Ä¡ (¹øÈ£)
 *       ============================= MVC (urlÁÖ¼Ò)
 *       contains : Æ÷ÇÔ¿©ºÎ 
 *       ============================= ºĞ¼® => ÀÚÀ½¸¸À¸·Î Ã£±â
 *       startsWith:½ÃÀÛ¹®ÀÚ¿­
 *       endWidth:³¡¹®ÀÚ¿­
 *       ============================= °Ë»ö
 *    3) ¹®ÀÚ¿­ ºĞÇØ 
 *       split => String[]
 *       substring() : 
 *       ============================= ¹®ÀÚ¿­ ºĞÇØ 
 *       
 *    4) ±âÅ¸ 
 *       replace : ÇÑ±ÛÀÚ 
 *       replaceAll => º¯È¯(Á¤±Ô½Ä)
 *       ========================================
 *         [0-9] : ¼ıÀÚ ÀüÃ¼
 *         [A-Z] : ´ë¹®ÀÚ
 *         [a-z] : ¼Ò¹®ÀÚ
 *         [A-Za-z] : ´ë¼Ò¹®ÀÚ
 *         [°¡-ÆR] : ÇÑ±ÛÀüÃ¼
 *         + ÇÑ±ÛÀÚ ÀÌ»ó
 *         * 0±ÛÀÚ ÀÌ»ó
 *         | µÑÁß¿¡ ÇÑ°³ ¼±ÅÃ
 *         ? 
 *         ^ ½ÃÀÛ , Á¦¿Ü   ^A  ^¿µÈ­  [^°¡-ÆR]
 *         $ ³¡¹®ÀÚ  A$
 *       ========================================= AI (30%) Ãªº¿ + ÇüÅÂ¼ÒºĞ¼®
 *         regexp_like()
 *         
 *         ==> ¹®ÀÚ¿¡ ´ëÇÑ ÆĞÅÏ 
 *       trim() : °ø¹é Á¦°Å ===> »ç¿ëÀÚ ÀÔ·Â (space)          ¹®ÀÚ¿­
 *       valueOf : ¸ğµç µ¥ÀÌÅÍÇüÀ» ¹®ÀÚ¿­·Î º¯°æ ========> ÀÚ¹Ù=========>À¥(¹®ÀÚ¿­)
 *                                                   À¥ =========> ÀÚ¹Ù
 *                                                       true  (String)
 *                                                    String s="true";
 *                                                    boolean b=(boolean)s; (X)
 *                                                    Boolean.parseBoolean(s) ==> wrapper
 *       length() : ¹®ÀÚ¿­ ±æÀÌ => È­¸é UI     ...
 *       
 *    5) ¹®ÀÚ¿­ °áÇÕ 
 *       +
 *       concat()  ... => ¹®ÀÚ¿­ °áÇÕ (+) "Hello"+"Java"="HelloJava" => 7+"7"="77"
 *       
 *    ===========================================
 *    
 *    ******* ¹®ÀÚ¿­Àº ¹øÈ£°¡ 0ºÎÅÍ ½ÃÀÛ (¿À¶óÅ¬Àº 1¹øºÎÅÍ ½ÃÀÛ)
 *    "Hello Java"
 *     0123456789  ==>  char[]={'H','e'.....}
 *    ******* String¿¡¼­ Áö¿øÇÏ´Â ¸ğµç ¸Ş¼Òµå´Â ÀÎ½ºÅÏ½º ¸Ş¼Òµå´Ù (Á¦¿Ü : static => valueOf())
 *            String.valueOf()
 *             
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // equals : ¹®ÀÚ¿­ ºñ±³ 
		String s1="Hello";
		String s2="Hello";
		//   s1°ú s2Àº ÁÖ¼Ò°ªÀÌ µ¿ÀÏ ÇÏ´Ù => ¹®ÀÚ¿­ ÀÚÃ¼°¡ ÁÖ¼Ò¸¦ °¡Áö°í ÀÖ´Ù 
		String s3=new String("hello"); // HelloÁÖ¼Ò ¾Æ´Ñ »õ·Î¿î ÁÖ¼Ò¿¡ ÀúÀåÇÑ´Ù 
		
		if(s1==s2)
			System.out.println("s1°ú s2´Â µ¿ÀÏÇÑ ÁÖ¼Ò¸¦ °¡Áö°í ÀÖ´Ù");
		else
			System.out.println("s1°ú s2´Â ´Ù¸¥ ÁÖ¼Ò¸¦ °¡Áö°í ÀÖ´Ù");
		
		// == ½ÇÁ¦°ª (±âº»µ¥ÀÌÅÍÇü,ÁÖ¼Ò°ª ºñ±³)
		if(s1==s3)
			System.out.println("s1°ú s3´Â µ¿ÀÏÇÑ ÁÖ¼Ò¸¦ °¡Áö°í ÀÖ´Ù");
		else
			System.out.println("s1°ú s3´Â ´Ù¸¥ ÁÖ¼Ò¸¦ °¡Áö°í ÀÖ´Ù");
		
		// ½ÇÁ¦ ¸Ş¸ğ¸®¿¡ ÀúÀåµÇ¾î ÀÖ´Â ¹®ÀÚ¿­ ºñ±³ => equals
		// public boolean equals(String s)
		// ´ë¼Ò¹®ÀÚ ±¸ºĞ:equals / ´ë¼Ò¹®ÀÚ ±¸ºĞ ¾øÀÌ :equalsIgnoreCase
		// °Ë»ö¾î : equalsIgnoreCase
		// ºñ¹Ğ¹øÈ£ : equals
		if(s1.equalsIgnoreCase(s3)) // ÀúÀåµÈ ¹®ÀÚ¿­ ÀÚÃ¼¸¦ ºñ±³
		{
			System.out.println("s1¿¡ ÀúÀåµÈ µ¥ÀÌÅÍ¿Í s3¿¡ ÀúÀåµÈ µ¥ÀÌÅÍ°¡ °°´Ù");
		}
		else 
		{
			System.out.println("s1¿¡ ÀúÀåµÈ µ¥ÀÌÅÍ¿Í s3¿¡ ÀúÀåµÈ µ¥ÀÌÅÍ°¡ ´Ù¸£´Ù");
		}
	}

}












