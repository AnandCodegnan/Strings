package com.string;
public class StringExample4 {
	public static void main(String[] args) {
		
		String email1 = "ANAND@CODEGNAN.COM";//Literal
		String email2 = "anand@codegnan.com";//Literal
		
		System.out.println(email1.equals(email2));//false
		System.out.println(email1.equalsIgnoreCase(email2));//true

		
		String email3 = new String("PAVAN@GMAIL.COM"); //String class object
		String email4 = new String("pavan@gmail.com"); //String class object
		
		System.out.println(email3.equals(email4)); //false
		System.out.println(email3.equalsIgnoreCase(email4)); //true

			
	}
}