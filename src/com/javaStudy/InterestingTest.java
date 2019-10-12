package com.javaStudy;

public class InterestingTest {
	public static void main(String [] args) {
		/*String s3 = new String("1") + new String("1");
		String s5 = s3.intern();
		String s4 = "11";
		System.out.println(s5 == s3);
		System.out.println(s5 == s4);
		System.out.println(s3 == s4);*/
		
		
        String s2 = new StringBuffer("He").append("llo").toString();
        String s3 = s2.intern();
        String s1 = "Hello";
        // Determine which strings are equivalent using the ==
        // operator
        System.out.println("s1 == s2? " + (s1 == s2));
        System.out.println("s1 == s3? " + (s1 == s3));
        System.out.println();
        
        StringBuffer sb = new StringBuffer("nihaoa");
		String str6 = sb.toString();
		str6.intern();
		String str7 = "nihaoa";
		System.out.println(str6==str7);
		
		String str = "abcde";
		int result = str.lastIndexOf("cde", 4);
		System.out.println(result);
		
	}
	
	
}
