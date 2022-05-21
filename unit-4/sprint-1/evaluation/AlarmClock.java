package com.Evaluation;

public class AlarmClock {
	
	static void   product(int day,bolean vocation = true) {
		   if(day == 0 && vocation == false) {
			   System.out.println("10am!");
		   }
		  }
		  public static void main(String[] args) {
			  for(int day = 0;day<7;day++) {
				  product(day,false);
			  }
		  }
}
