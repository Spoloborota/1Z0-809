package com.spoloborota.ocp.classes;

import java.util.List;

public class TestInstanceOf {

	static class Cat {}
	
	public static void main(String[] args) {
		Cat cat = new Cat();
		System.out.println(cat instanceof Object);
		System.out.println(cat instanceof Runnable);
		System.out.println(cat instanceof List);
		System.out.println(cat instanceof Readable);
		System.out.println(null instanceof Cat);
		
	}

}
