package com.springbean;

public class User {

	String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return "User [name=" + name + "]";
	}
	
	public void init() {
		System.out.println("init");
	}
	
	public void destroy() {
		System.out.println("destroy");
	}
	
	public void print() {
		System.out.println("print");
	}
}
