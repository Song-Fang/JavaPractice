package com.javaStudy;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class HashMapTest {
	public static void main(String[] args) {
		
	}
	
	@Test
	public void test1() {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("AA",111);
		map.put("BB", 345);
		//map.clear();
		//int value = map.remove("AA");
		//相当于一个多态
		Object value1 = map.get("AA");
		//不写泛型，以下就是错误了
		//int value1 = map.get("AA");
		System.out.println(map.containsKey("AA"));
		System.out.println(map.containsValue("345"));
		//找到一个就不找了
		//System.out.println(value);
		
		Map<String, Integer> map2 = new HashMap<String,Integer>();
		map2.put("AA",111);
		map2.put("BB", 345);
		System.out.println(map.equals(map2));
		
	}
}


