package com.sss;

public class StringReverse {
	public static void main(String[] args) {
		String arr="Privacccey";
		
		char [] chars= arr.toCharArray();
		String reverse="";
		
		for(int i=chars.length-1;i>=0;i--) {
			reverse=reverse+chars[i];
		}
		System.out.println("Name Reverse: "+reverse);
	}

}
