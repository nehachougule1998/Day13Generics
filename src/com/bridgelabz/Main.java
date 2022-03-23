package com.bridgelabz;

public class Main {
	public static void main(String[] args) {
		
		Integer[] i = {2,6,4};
		String[] s = {"mango","strawberry","Grapes"};
		Float[] f = {1.4f,3.3f,3.4f};
		new Testmaximum(i).maxElement();
		new Testmaximum(s).maxElement();
		new Testmaximum(f).maxElement();			
	}
}