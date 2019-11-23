package com.javaStudy;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Random;

import org.junit.Test;

public class ReflectionTest {
	@Test
	public void reflectionTest() throws Exception {
		Class<Person> clazz = Person.class;
		Constructor<Person> cons = clazz.getConstructor(String.class, int.class);
		Person person = (Person) cons.newInstance("Francis", 27);
		System.out.println(person);

		Field name = clazz.getDeclaredField("name");
		name.set(person, "Jack");
		System.out.println(person.name);

		Method method = clazz.getDeclaredMethod("setName", String.class);
		method.invoke(person, "Lynn");
		System.out.println(person.name);

		Constructor<Person> cons1 = clazz.getDeclaredConstructor(String.class);
		cons1.setAccessible(true);
		Person privatePerson = (Person) cons1.newInstance("Zhao");
		System.out.println(privatePerson);

		Method privateMethod = clazz.getDeclaredMethod("showPersonality", String.class);
		privateMethod.setAccessible(true);
		privateMethod.invoke(privatePerson, "shy");
	}

	@Test
	public void reflectionTest2() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// First
		Person person = new Person();
		Class clazz = person.getClass();
		System.out.println(clazz);

		// Second
		Class clazz2 = Person.class;
		Person person2 = (Person) clazz2.newInstance();
		System.out.println(clazz2);
		System.out.println(clazz == clazz2);
		System.out.println(person2);

		// Third
		Class clazz3 = Class.forName("com.javaStudy.Person");
		System.out.println(clazz3);
		System.out.println(clazz3 == clazz2);

		// Fourth
		ClassLoader classLoader = ReflectionTest.class.getClassLoader();
		Class clazz4 = classLoader.loadClass("com.javaStudy.Person");
		System.out.println(clazz4);
	}

	@Test
	public void reflectionTest3() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		String path;
		System.out.println(path);
		
		for (int i = 0; i < 100; i++) {
			int num = new Random().nextInt(3);
			switch (num) {
			case 0:
				path = "java.lang.String";
				createInstance(path);
				break;
			case 1:
				path = "java.util.Date";
				createInstance(path);
				break;
			case 2:
				path = "com.javaStudy.Person";
				createInstance(path);
				break;
			}
		}
	}

	private void createInstance(String path)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class clazz = Class.forName(path);
		Object object = clazz.newInstance();
		System.out.println(object);
	}

}
