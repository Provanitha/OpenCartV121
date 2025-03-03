package com.test;

public class MethodOverLoading {
	
	int a;
	int b;
	
	void sum() {
		a=10;
		b=3;
		System.out.println(a+b);
	}
	
	void sum(int x, int y) {
	int a=x;
	int b=y;
		System.out.println(a+b);
		}
	void sum(int x, int y, int z) {
		System.out.println(x+y+z);
	}
	
	void sum(int x, double y) {
		System.out.println(x+y);
		
	}
	
	
	public static void main(String ar[]) {
		MethodOverLoading mo = new MethodOverLoading();
		mo.sum();
		mo.sum(10,20);
		mo.sum(10,2,20);
		mo.sum(2,2.0);
}
}