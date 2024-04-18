package com.itheima.demo05_hidden_class;

public class Demo {
    public static void main(String[] args) {
        Runnable r =() -> {
                System.out.println(Thread.currentThread().getName());
        };
    }
}
