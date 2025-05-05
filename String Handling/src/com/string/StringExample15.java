package com.string;
public class StringExample15 {
	public static void main(String[] args) {
		
		String player = "Mahendra Singh Dhoni";
		
		System.out.println(player.isBlank());
		
		player = "";
		
		System.out.println(player.isBlank());
		
		System.out.println(player.isEmpty());

	}
}
