package q1152;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		System.out.println((int)' ');// 32
		
		Scanner sc = new Scanner(System.in);
		
		
		String sentence = sc.next(); 
		
		int cnt =0; 
		int word =0;
		
		
		for (int i =0; i<sentence.length(); i++) {
			
			
			word = (int)sentence.charAt(i);
			
			
			if (word >=97 && word <=122) {
				word = word -32;
				
			}else if (word == 32) {
				cnt++;
			}
			
			
		}
		
		System.out.println
		(cnt);

	}

}
