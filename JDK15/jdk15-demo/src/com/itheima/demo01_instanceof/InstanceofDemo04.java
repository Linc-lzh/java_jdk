package com.itheima.demo01_instanceof;

import java.util.Objects;
/**
	目标：JDK 15的新特性模式匹配机制简化对象内容比较的代码写法。
	
	重写hashCode()和equals()方法比较对象的内容是否一样。
*/
public class InstanceofDemo04{
	public static void main(String[] args){
		Student s1 = new Student("黑马");
		Student s2 = new Student("黑马");
		System.out.println(s1.equals(s2));
	}
}

class Student{
	private String name;
	
	public Student(String name){
		this.name = name;
	}
	
//	@Override
//	public boolean equals(Object o) {
//		if (this == o) return true;
//		if (o == null || getClass() != o.getClass()) return false;
//		Student student = (Student) o;
//		return Objects.equals(name, student.name);
//	}

	// JDK 14之后的instanceof的模式匹配机制简化equals代码的书写 
	@Override
	public boolean equals(Object o){
		return o instanceof Student s && Objects.equals(this.name , s.name);
	}
	
	 @Override
    public int hashCode() {
        return Objects.hash(name);
    }
	
}