package com.javaStudy;

public class Block {
	public static void main(String [] args) {
		String gender = Person.gender;
		System.out.println(gender);
		//Person p = new Person();
	}
}


class Person{
	int age;
	String name;
	static String gender = "male";

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	{
		System.out.println("Hello,Block");
	}
	
	static {
		System.out.println("Hello,Static Block");
	}
}