package com.sb;
public class StringBufferExample2 {
	public static void main(String[] args) {
		
		StringBuffer name1 = new StringBuffer("Mounikea Jauvvaji");
		
		name1.deleteCharAt(6);
		
		name1.deleteCharAt(10);
		
		System.out.println(name1);
		
		StringBuffer name2 = new StringBuffer("Paavan Kumar Gaadde");
		
		name2.deleteCharAt(2);
		
		name2.deleteCharAt(14);
		
		System.out.println(name2);
		
		
		

	}
}
