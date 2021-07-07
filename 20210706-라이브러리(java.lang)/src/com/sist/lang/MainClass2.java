package com.sist.lang;

public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr={10,20,30,40,50};
        int[] temp=new int[5];
        temp[0]=arr[0];
        temp[1]=arr[1];
        temp[2]=arr[2];
        temp[3]=arr[3];
        temp[4]=arr[4]; // 값만 복사 
        // int[] temp=arr; => 동시에 같은 곳을 제어 
        // temp[0]=100 ==> arr[0]=100
        int[] arr2=arr.clone();
        arr2[0]=1000;
        System.out.println("arr[0]="+arr[0]);
        System.out.println("arr2[0]="+arr2[0]);
	}

}
