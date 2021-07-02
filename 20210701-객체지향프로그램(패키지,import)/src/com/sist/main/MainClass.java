package com.sist.main;
import com.sist.dao.*;
/*
 *   패키지 => 재사용(관련된 클래스를 묶어서 저장)
 *        => 사용시 => import 
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Oracle o=new Oracle();
        o.connection();
        o.disDisconnection();
	}

}
