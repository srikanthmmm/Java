package com.sss;

public class MaxAndMin {

	public static void main(String[] args) {
		int [] arr= {1,2,3,4,5,6};
		
		
		int max =0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("Maximum NUmber: "+max);


		int min =1213;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("Minimum NUmber: "+min);

	}

}
