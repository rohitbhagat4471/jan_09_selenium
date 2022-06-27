package org.myPractice;

public class MockPractice {

	public static void main(String[] args) {
		

			
		String str="Hello My name is shubham";
		String[] str1=str.split("");
		for(int i=str1.length-1;i>=0;i--) {
			if(str1[i]==str1[str1.length-1]) {
				String str2=str1[i].toUpperCase();
				System.out.print(str2);
			}else {
			System.out.print(str1[i]);
			}
		}
		
		
	}

}
