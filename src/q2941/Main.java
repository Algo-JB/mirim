package q2941;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String alpha[] = {"c=", "c-", "dz=", "d-", "lj", "nj","s=","z="};
		
		String word= sc.next();
		
		
		String word2;
		char temp = '1';
		
		int cnt =0;
		String stack = "";
		
		for(int i =0; i<word.length(); i++) {
			 temp = word.charAt(i);
			 for(int j=0;j<alpha.length;j++) {
				if(alpha[j].charAt(0) == temp) {
					stack += temp;
					
					
				}
			 }
			
			
		}
		
		
		
		
		

	}

}
