package com.sb;
public class StringBufferExample6 {
	public static void main(String[] args) {
		
		StringBuffer buffer = new StringBuffer("Uma devi nookala");
		
		buffer.replace(9, 16, "Nukala");
		
		System.out.println(buffer);
	
	}
}
