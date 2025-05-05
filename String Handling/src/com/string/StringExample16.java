package com.string;
public class StringExample16 {
	public static void main(String[] args) {
		String player = "Mahendra Singh Dhoni";
		
		player = player.toLowerCase();
		
		char characters[] = player.toCharArray();
		
		int vowelscount = 0;
		int concount = 0;
		
		for(char c : characters) {
			if( c != ' ') {
				if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
					vowelscount++;
				}
				else {
					concount++;
				}
			}
		}
		
		System.out.println("Vowels count "+vowelscount);
		System.out.println("Consonants count "+concount);
	}
}