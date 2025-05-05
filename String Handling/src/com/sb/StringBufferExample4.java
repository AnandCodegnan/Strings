package com.sb;
public class StringBufferExample4 {
	public static void main(String[] args) {
		
		StringBuffer name = new StringBuffer("Durga manimala");
		
		name.reverse();
		
		System.out.println(name);
		
		StringBuffer word = new StringBuffer("malayalam");
		
		String originalword = word.toString();
		
		String reverseword =  word.reverse().toString();
		
		if(originalword.equals(reverseword)) {
			System.out.println("Palindrome");
		}

	}
}
