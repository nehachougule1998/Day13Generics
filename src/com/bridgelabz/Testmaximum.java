package com.bridgelabz;

public class Testmaximum {
	public void maxElement(Integer[] intArray) {
		for(int i=0; i<intArray.length-1; i++) {
			if(intArray[i].compareTo(intArray[i+1])==1) {
				intArray[i+1] = intArray[i];
			}
		}
		System.out.println(intArray[intArray.length-1]);
	}
	
	public void maxElement(Float[] inputArray) {
		for(int i=0; i<inputArray.length-1; i++) {
			if(inputArray[i].compareTo(inputArray[i+1])==1) {
				inputArray[i+1] = inputArray[i];
			}
		}
		System.out.println(inputArray[inputArray.length-1]);
	}
}
