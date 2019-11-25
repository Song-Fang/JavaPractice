package com.javaStudy;

import org.junit.Test;

public class TestArray {

	@Test
	public void testArray() {
		int [] array = new int[0];
		System.out.println(array.length);
		for(int ele:array) {
			System.out.println(ele);
		}
	}
	
	
}
