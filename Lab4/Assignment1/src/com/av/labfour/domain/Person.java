package com.av.labfour.domain;

public class Person {

	
	/**
	 * name of person
	 */
	private String name;
	/**
	 * age of person
	 */
	private float age;
	
	public Person(float age, String name){
		this.age = age;
		this.name = name;
		
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAge() {
		return age;
	}
	public void setAge(float age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}
