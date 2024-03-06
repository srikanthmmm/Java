package com.sss;

import java.util.Arrays;

public class NumbersCount {

	public static void main(String[] args) {
		int [] arr =new int [] {1,2,3,4,1,2,3,6,7,8};
		countOccurence(arr);

	}
	static void countOccurence(int [] arr) {
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			int count=1;
			if(i!=arr.length-1) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]==arr[j])
						count++;
					else
						break;
				}
			}
			System.out.println("Reapeted Number:  "+arr[i]+" : Number Of Times: "+count);
			i+=(count-1);
		}
	}

}
