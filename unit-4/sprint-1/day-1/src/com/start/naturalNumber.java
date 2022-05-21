package com.start;

public class naturalNumber {
	static int sum = 0;
	public static void even(int x) { 
		
		for (int i = 1; i < x; i++) {
			  sum = (x*(x+1)/2); 
		}
		 System.out.println(sum);
	}
 public static void main(String[] args) {
	 even(10); //function call
	 }
}
