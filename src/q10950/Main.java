package q10950;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int testnum = sc.nextInt();
		
		int answer[] = new int[testnum];
		
		for(int i= 0; i<testnum; i++) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			answer[i] = a+b;
		}
		
		for (int i=0; i<testnum; i++) {
			System.out.println(answer[i]);
		}
		
		

			
	}

}
