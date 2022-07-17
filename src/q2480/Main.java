package q2480;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		  
		Scanner sc = new Scanner(System.in);
		
		
		int num[] = new int[3];
		
		int max = -1;
		
		
		for(int i =0;i<num.length;i++) {
			num[i] = sc.nextInt();
		}
		
		if(num[0]==num[1] && num[0]==num[2]) {
			
			System.out.println(10000+num[0]*1000);
		}
		else if(num[0]!=num[1] && num[0]!=num[2] && num[1]!=num[2]) {
			for (int i=0; i<num.length; i++) {
				if (max < num[i]) {
					max = num[i];
				}
			}
			System.out.println(max*100);
		}
		else {
			if(num[0]== num[1]) {
				System.out.println(1000+num[0]*100);
			}else if(num[0]==num[2]) {
				System.out.println(1000+num[0]*100);
			}else if(num[1]==num[2]) {
				System.out.println(1000+num[1]*100);
			}
			
		}
		
		
		
		
		
		
		
		
		
		sc.close();
		
	
		
	}
}
