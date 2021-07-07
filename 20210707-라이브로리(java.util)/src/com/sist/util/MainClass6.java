package com.sist.util;
import java.util.*;
import java.text.*;// 변환 
public class MainClass6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String msg="이름:{0}\n전화:{1}\n나이:{2}\n성별:{3}\n주소:{4}\n";
        //Object[] obj={"홍길동","010-1111-1111",25,"남자","서울시 마포구"};
        String s=MessageFormat.format(msg, "홍길동","010-1111-1111",25,"남자","서울시 마포구");
        System.out.println(s);
        
	}

}
