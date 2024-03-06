package com.sss;

public class IsPrimeOrNot {

	public static void main1(String[] args) {
		int [] arr = {1,2,3,4,5,6,7,8,9,10};
		
		for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int j=1;j<arr.length;j++) {
				if(arr[i]%j==0) {
					count++;
				}
			}if(count==2) {
				System.out.println("Is Prime: "+arr[i]);
			}else {
				System.out.println("Is Not Prime: "+arr[i]);
			}
		}

	}
	public static void main2(String[] args) {
		int prime=7;
		int count=0;
		
		for(int i=1;i<=prime;i++) {
			if(prime%i==0) {
				count++;
			}
		}if(count==2) {
			System.out.println("Is prime");
		}else {
			System.out.println("Is Not Prime");
		}
	}
	public static void main(String[] args) {
		int num =100;
		for(int i=0;i<=num;i++) {
			int count=0;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					count++;
				}
			}if(count==0) {
				System.out.println("Prime Numbers: "+i);
			}
		}
	}
}
