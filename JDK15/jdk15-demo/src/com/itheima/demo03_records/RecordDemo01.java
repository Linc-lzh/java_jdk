package com.itheima.demo03_records;

/**
	目标：JDK 15新特性：records记录类型
*/
public class RecordDemo01{
	public static void main(String[] args){
		// 1、判断记录类型中是否存在无参数构造器 ：没有无参数构造器的，存在有参数构造器
		// People p1 = new People();
		People p = new People("itheima",10);
		// 2、重写了toString()方法
		System.out.println(p);
		// 3、判断是否存在set方法:没有提供
//		 p.setName("播妞");
		// 4、提供了一些获取内容的方法，这些方法的名称与成员名称一致
		System.out.println(p.name());
		System.out.println(p.age());
	}
}


	
