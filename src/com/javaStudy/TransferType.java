package com.javaStudy;

public class TransferType {
	public static void main(String[] args) {
		char a = 'a';
		
		int b = 'b';
		System.out.println((int)a);
		System.out.println(b);
		
		char [] c = {'c'};
		String d = new String(c);
		System.out.println(d);
		
		char e = 'e';
		String f = String.valueOf(e);
		System.out.println(f);
		
		int integer = 99;
		String str = String.valueOf(integer);
		System.out.println(str);
		
		String str2 = "100";
		int num = Integer.parseInt(str2);
		System.out.println(num);
		
		//array的初始值全部赋值为0
		final int [] array = new int[5];
		array[0] = 1;
		array[1] = 2;
		for(int ele:array) {
			System.out.println(ele);
		}
		
		final int num1 = 5;
		int num2 = 5;
		int num3 = 10;
		int num4 = num1+num2;
		Integer num5 = 5;
		Integer num6 =5;
		Integer num7 = num5+num6;
		Integer num8 = 10;
		Long num9 = 10L;
		String str5 = "hello"+5;
		String str6 = "hello5";
		String str7 = "hello"+num1;
		String str8 = "hello"+num2;
		System.out.println(num1==num2);
		System.out.println(str6==str5);
		System.out.println(str6==str7);
		System.out.println(str6==str8);
		System.out.println(num3==num4);
		System.out.println(num8==num3);
		System.out.println(num8==num7);
		System.out.println(num5==num2);
		System.out.println(num9.equals(num8));
		
		String strTest = new String("2") + new String("2");
		strTest.intern();
		String str100 = "22";
		System.out.println(str100==strTest);
		
		
		
		
		
		
		
	}
}
