package q2439;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for (int i =1; i<=num; i++) {
			                         
			for (int enter= 1; enter<=num-i; enter++) {
				System.out.print(" ");
			}
			for(int star =1; star<=i; star++) {
				 System.out.print("*");
			}
			System.out.println();
			
			
		}
		

	}

}
