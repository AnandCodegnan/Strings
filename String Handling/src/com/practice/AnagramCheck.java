package com.practice;

import java.util.Arrays;

public class AnagramCheck {
	public static void checkAnagram(String input1, String input2) {
		if(input1.length() != input2.length()) {
			return;
		}
		input1 = input1.toLowerCase();
		input2 = input2.toLowerCase();
		
		char arr1[] = input1.toCharArray(); //H E A R T
		char arr2[] = input2.toCharArray(); // E A R T H
		
		Arrays.sort(arr1); // A E H R T
		Arrays.sort(arr2); // A E H R T
		
		if(Arrays.equals(arr1, arr2)) {
			System.out.println("Given String are Anagrams");
		}
		else {
			System.out.println("Given String are not Anagrams");
		}
	}
	public static void main(String[] args) {
		checkAnagram("HEART", "earth");
		checkAnagram("silent", "LISTEN");
		checkAnagram("THING", "night");
		checkAnagram("Anand", "Kumar");
	}
}
