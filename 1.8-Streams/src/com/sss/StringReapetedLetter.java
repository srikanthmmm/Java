package com.sss;

public class StringReapetedLetter {

	public static void main(String[] args) {
		String arr="Privacccey";
		
		char [] chars= arr.toCharArray();
		int count=0;
		for(int i=0;i<arr.length();i++) {
		 for(int j=i+1;j<arr.length();j++) {
			 if(chars[i]==chars[j]) {
				 System.out.println("Reapeted Letter: "+chars[i]);
				 count++;
				 break;
			 }
		 }
		}

	}

}
