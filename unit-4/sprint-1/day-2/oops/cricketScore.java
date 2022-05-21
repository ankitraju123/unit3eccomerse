package com.oops;

public class cricketScore {
	 static  int total = 0;
 public static void totalRun(int one,int two,int three,int four,int five,int six) {
		total = (one+two+three+four+five+six);
				System.out.println(total);
	}
	public static void main(String[] args) {
		totalRun(1,2,3,4,5,6);
		 }
}
