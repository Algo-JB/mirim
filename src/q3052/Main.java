package q3052;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int number[] = new int[42];
		int cnt = 0;
		
		
		
		// 0 부터 41까지 나머지가 나옴 
	
			
			for (int i = 0; i<10; i++) {
				
				int num = sc.nextInt();
				int n = num%42;
				
				number[n]++;
				
			}
			
		    for (int i= 0; i<number.length; i++) {
		    	if (number[i]>=1) {
		    		cnt++;
		    	}
		    }
			
			
		System.out.println(cnt);
		
		
		
		
	}



}


