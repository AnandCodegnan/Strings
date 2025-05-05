package com.sb;
public class StringBufferExample3 {
	public static void main(String[] args) {
		
		StringBuffer name1 = new StringBuffer("Preethi Ravela Ravela");
		
		name1.delete(8, 15);
		
		System.out.println(name1);
		
	}
}
