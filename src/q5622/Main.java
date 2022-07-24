package q5622;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int alpha[] = {3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,8,8,8,8,9,9,9,10,10,10,10};
		
		String phone = sc.next();
		
		int number =0;
		int totaltime =0;
		
		for(int i =0; i<phone.length(); i++) {
			
			
			number = phone.charAt(i) - 'A';
			totaltime += alpha[number];
		
		}
		
		System.out.println(totaltime);
		

		

	}
	
}
