package com.sss;

public class ArmStrongNumber {

	public static void main(String[] args) {
		int sumOfCubes=0,temp,a;
		int num =153;
		temp=num;
		while(num>0) {
			a=num%10;
			num=num/10;
			sumOfCubes=sumOfCubes+(a*a*a);
		}if(temp==sumOfCubes) {
			System.out.println("Is Arm Strong: "+temp);
		}else {
			System.out.println("Is Not Arm Strong: "+temp);
		}
	}

}
