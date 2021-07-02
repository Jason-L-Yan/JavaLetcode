package com.aoligei;
public class HelloMaven{
	
	public int add(int a,int b){
		return a+b;
	}

	public static void main(String args[]){
		HelloMaven hello = new HelloMaven();
		System.out.println("10+20=" + hello.add(10,20));
	} 
}