package com.string;
public class StringExample13 {
	public static void main(String[] args) {
		
		String subjects[] = {"Web Techologies", "Web Programming","Operating Systems", "Realtime Systems"};
		
		for(String x : subjects) {
			System.out.println(x);
		}
		System.out.println("==================Subjects starts with Web=================");
		for(String x : subjects) {
			if(x.startsWith("Web")) {
				System.out.println(x);
			}
		}
		System.out.println("===================Subjects ends with Systems==============");
		for(String x: subjects) {
			if(x.endsWith("Systems")) {
				System.out.println(x);
			}
		}
	}
}
