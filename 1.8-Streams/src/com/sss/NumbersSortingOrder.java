package com.sss;

public class NumbersSortingOrder {

	public static void main(String[] args) {
		int [] arr = {2,3,4,3,2,43435,455,67};
		
		int temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}for(int a:arr) {
			System.out.println("Sorting order: "+a);
		}

	}

}
