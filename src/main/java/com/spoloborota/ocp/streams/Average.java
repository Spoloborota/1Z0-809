package com.spoloborota.ocp.streams;

import java.util.Arrays;
import java.util.List;

class Person{
	private String name;
	private int age;
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}

public class Average {

	public static void main(String[] args) {

		List<Person> friends = Arrays.asList(new Person("Bob", 31),
				new Person("Paul", 32),
				new Person("John", 33));
		double averageAge = friends.stream().filter(f->f.getAge()<30)
				.mapToInt(f->f.getAge())
				.average()
				.orElse(0.0);
		System.out.println(averageAge);   
	}



}
