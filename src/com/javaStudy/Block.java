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
	
	
	public Person() {
		
	}
	
	private Person(String name) {
		this.name = name;
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	
	
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
	
	private void showPersonality(String personality){
		System.out.println("Her personality is "+personality);
	}
	
	{
		System.out.println("Hello,Block");
	}
	
	static {
		System.out.println("Hello,Static Block");
	}
	
	public String toString() {
		return "name:"+name+",age:"+age+",gender:"+gender;
	}
}
