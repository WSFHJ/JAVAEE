package com.Class.ToString;
/**
 * 
 * @author ASUS
 * public String toString() 返回该对象的字符串表示
 * 
 */
public class demo {
	public static void main(String[] args) {
		Student s1 = new Student();
		
		System.out.println(s1.hashCode());  
		//366712642
		
		System.out.println(s1.getClass().getName());  
		//com.Class.ToString.Student
		
		System.out.println(s1.toString());
		//com.Class.ToString.Student@15db9742
		//有添加重写方法   Student [name=null, age=0]
		
	}

}
