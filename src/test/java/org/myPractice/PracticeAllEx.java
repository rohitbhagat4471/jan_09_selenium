package org.myPractice;


public class PracticeAllEx {

	public static void main(String[] args) {
	String str = "WelVome in India";
	int upper=0;
	int lower= 0;
		
			for (int i =0;i<str.length();i++) {
      char ch =str.charAt(i);
      if(ch>=65 && ch<=90) {
    	  upper++; }
    	  else {
    		  lower++;
    	 
        	   
           }
	}
			System.out.println(lower);
			System.out.println(upper);
	}
}
