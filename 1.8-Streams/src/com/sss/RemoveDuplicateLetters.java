package com.sss;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateLetters {
	
	public static void main(String[] args) {
		String arr="Privaccccey";
		Set<Character> set = new LinkedHashSet<>();
		
		for(int i=0;i<arr.length();i++) {
			set.add(arr.charAt(i));
		}for(Character c:set) {
			System.out.println("After removing duplicate letters: "+c);
		}
	}

}
