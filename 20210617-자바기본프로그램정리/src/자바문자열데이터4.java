/*
 *   int indexOf(庚切)
 *   Hello Java
 *   0123456789
 *   
 *   indexOf('o') ==> 4
 *   indexOf('a') ==> 7   ==> 溌舌切  aa.aa.java
 *   // 坦製採斗 達奄 => 
 *   lastIndexOf('a') => 及拭辞 達奄  ==> 9  ==> \\ , / 井稽誤 
 *   
 *   辞随働紺獣 辞段姥 重鋼匂稽45掩 50-9 政遭柵漁 走腰 辞随獣 辞段姥 節据疑 35-8 政遭柵漁
 *   
 *   ぞぞ せせせせせせせ  しし
 */
public class 切郊庚切伸汽戚斗4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    String addr="辞随働紺獣 辞段姥 重鋼匂稽45掩 50-9 政遭柵漁 走腰 辞随獣 辞段姥 節据疑 35-8 政遭柵漁";
	        String first=addr.substring(0,addr.indexOf("走"));   
	        System.out.println(first.trim());
	        // substring(3) => 3採斗
	        // substring(3,9) => 3採斗 9猿走 窒径 => 9精 薦須  ==> 3,4,5,6,7,8
	        String s=addr.substring(addr.indexOf("腰")+1);
	        System.out.println(s.trim()); // 疎酔税 因拷庚切 薦暗  => trim()
	}

}











