package com.string;
public class StringExample10 {
	public static void main(String[] args) {
		
		String str = "Java is object oriented, object is an instance of class";
		
		String arr[] = str.split(" ");
		
		int count = 0;
		for(String word : arr) {
			if(str.indexOf(word) == str.lastIndexOf(word)) {
				System.out.println(word);
				count++;
			}
		}
		System.out.println(count);
	}
}
