package com.string;
public class StringExample9 {
	public static void main(String[] args) {
		
		String str = "Java is object oriented, object is an instance of calss";
		
		System.out.println(str.indexOf("oriented"));//15
		
		System.out.println(str.indexOf("object"));//8
		
		System.out.println(str.lastIndexOf("object"));//25

	}
}
