package com.string;
public class StringExample5 {
	public static void main(String[] args) {
		
		String email1 = "ANAND@CODEGNAN.COM";//Literal
		String email2 = "anand@codegnan.com";//Literal
		
		System.out.println(email1.compareTo(email2));//-32
		System.out.println(email1.compareToIgnoreCase(email2));//0

		
		String email3 = new String("PAVAN@GMAIL.COM"); //String class object
		String email4 = new String("pavan@gmail.com"); //String class object
		
		System.out.println(email3.compareTo(email4)); //-32
		System.out.println(email3.compareToIgnoreCase(email4)); //0

			
	}
}