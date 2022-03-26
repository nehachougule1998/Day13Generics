package com.bridgelabz;

public class Main {
	
	public static void main(String[] args) {
		Integer i = 23, j = 45, k = 60;
	    Float f = 20.4f, g = 64.67f, h = 45.78f;
	    String s = "mango", t = "strawberry", q = "Grapes";
	  
		new Testmaximum<>(i, j, k).max();
		new Testmaximum<>(f,g,h).max();
		new Testmaximum<>(s,t,q).max();
	}

}