package q10809;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	

		Scanner sc = new Scanner(System.in);
		
		// abcdefghijklmnopqrstuvwxyz
		
		String word = sc.next();
		int totalword[] = new int[26];
		
		for(int i=0;i<totalword.length;i++) {
			totalword[i] = -1;
		}
		
		int total =0;
		
		for (int i =0; i<word.length(); i++) {
			
			
			total = word.charAt(i)-'a'; 
			
			if(totalword[total]!=-1) {
				continue;
			}
			 
			totalword[total] = i;
			 
		}
		
		for(int i : totalword) {
			System.out.print(i+" ");
		}
		
		

	}

}
