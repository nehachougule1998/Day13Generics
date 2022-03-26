package com.bridgelabz;

public class Testmaximum<T extends Comparable<T>> {
	T x, y, z;
	public Testmaximum(T x, T y, T z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	private static <T extends Comparable> void getMaximum(T a, T b, T c) {
		T max = a;
		if (b.compareTo(a) > 0) {
			max = b;
	    }
	    if (c.compareTo(max) > 0) {
	        max = c;
	    }
	    
	     System.out.println("Maximum :" + max);
	}
	
	public void max() {
		Testmaximum.getMaximum(x, y, z);
	 }
}