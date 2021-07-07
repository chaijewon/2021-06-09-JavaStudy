package com.sist.util;
import java.util.*;
/*
 *  Random() => 임의로 숫자 추출 
 *  Random r=new Random();
 *  r.nextInt(10) ==> 0~9
 *  r.nextInt(100) ==> 0~99 => 1~100  r.nextInt(100)+1
 *  => 예약일 , 극장 => 게임 
 *  => 웹 => 데이터베이스 연결 
 */
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 1~100 사이의 난수 nextInt(100)+1  ==> int nextInt(int range)
		int[] arr=new int[5];
		Random r=new Random();
		for(int i=0;i<5;i++)
		{
			arr[i]=r.nextInt(100)+1;
		}
		System.out.println(Arrays.toString(arr));// Arrays => java.util (배열관리)
		
	}

}
