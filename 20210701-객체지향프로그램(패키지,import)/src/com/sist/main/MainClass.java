package com.sist.main;
import com.sist.dao.*;
/*
 *   ��Ű�� => ����(���õ� Ŭ������ ��� ����)
 *        => ���� => import 
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Oracle o=new Oracle();
        o.connection();
        o.disDisconnection();
	}

}
