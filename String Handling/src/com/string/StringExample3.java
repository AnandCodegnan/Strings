package com.string;
public class StringExample3 {
	public static void main(String[] args) {
		
		String name1 = "Codegnan";//Literal
		String name2 = "Codegnan";//Literal
		
		System.out.println(name1.equals(name2));//true
		System.out.println(name1 == name2);//true
		
		String name3 = new String("IT Solutions"); //String class object
		String name4 = new String("IT Solutions"); //String class object
		
		System.out.println(name3.equals(name4)); //true
		System.out.println(name3 == name4); //false
			
	}
}