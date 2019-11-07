package com.javaStudy;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.junit.Test;

public class ReflectionTest {
	@Test
	public void reflectionTest() throws Exception {
		Class<Person> clazz = Person.class;
		Constructor<Person> cons = clazz.getConstructor(String.class,int.class);
		Person person = (Person)cons.newInstance("Francis",27);
		System.out.println(person);
		
		Field name = clazz.getDeclaredField("name");
		name.set(person, "Jack");
		System.out.println(person.name);
		
		Method method = clazz.getDeclaredMethod("setName", String.class);
		method.invoke(person, "Lynn");
		System.out.println(person.name);
		
		Constructor<Person> cons1 = clazz.getDeclaredConstructor(String.class);
		cons1.setAccessible(true);
		Person privatePerson = (Person)cons1.newInstance("Zhao");
		System.out.println(privatePerson);
		
		Method privateMethod = clazz.getDeclaredMethod("showPersonality", String.class);
		privateMethod.setAccessible(true);
		privateMethod.invoke(privatePerson, "shy");
	}
}
