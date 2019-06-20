package com.Class.Equals;
/**
 * 
 * @author ASUS
 * equals
 * 用来比较方法两个对象的内容是否相等
 * equals 方法不能用于基本数据类型的变量，如果没有对 equals 方法进行重写，则比较的是引用类型的变
量所指向的对象的地址
 * 
 * ==
 * 如果比较的对象是基本数据类型，则比较的是数值是否相等；
 * 如果比较的是引用数据类型，则比较的是对象的地址值是否相等。   
 *
 */

class Student{
	private String name;
	private int age;
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
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
}

public class demo {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1==s2);
		
	}
}
