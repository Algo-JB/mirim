package q2675;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int number =0;
		
		char alpha =0;
		
		int wordlen =0;
		String word;
		
		for(int i =0; i<num; i++) {
			number = sc.nextInt();
			word = sc.next();
			
			
			for(int j=0; j<word.length(); j++) {
				alpha = word.charAt(j);
				for(int z =0; z<number; z++) {
					System.out.print(alpha);
					
					
				}	

				 
			}
			 System.out.println();//띄워쓰기 조심하기 
			 
			
			
		}
		
		
		
		
	}
	

}
