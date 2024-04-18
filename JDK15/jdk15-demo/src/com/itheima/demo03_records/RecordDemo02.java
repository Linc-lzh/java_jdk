package com.itheima.demo03_records;

/**
	目标：JDK 14新特性：record类的限制。
		
	限制：
		1、不允许直接定义实例成员变量。	可以定义静态成员变量。
		2、可以定义实例和静态方法的。
*/
public class RecordDemo02{
	public static void main(String[] args){
		Test t = new Test(10 , 2);
		t.test();
		Test.test02();
		System.out.print(t);
	}
}

record Test(int x , int y){
	public static String name ;
	
	public Test{
		if(x > y){
			System.out.println(" >!");
		}
	}
	
	public void test(){
		
	}
	
	public static void test02(){
		
	}
}