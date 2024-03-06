package com.sss;

public class StringNonReapetedLetters {

	public static void main(String[] args) {
		
		String arr="Privacccey";
		
		for(int i=0;i<arr.length();i++) {
			boolean flag=true;
			for(int j=i+1;j<arr.length();j++) {
				if(i!=j && arr.charAt(i)==arr.charAt(j)) {
					flag=false;
					break;
				}
			}if(flag) {
				System.out.println("Non Reapeting letter: "+arr.charAt(i));
				break;
			}
		}

	}

}
