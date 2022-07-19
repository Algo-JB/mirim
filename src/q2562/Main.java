package q2562;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		int number[] = new int[9];
		int max = -1;
		int cnt = 0;
		
		
		
		
		for (int i = 0; i<number.length; i++) {
			number[i] = sc.nextInt();		
		}
		
		for (int i=0; i<number.length; i++) {
			if (max < number[i]) {
				max = number[i];
				cnt = i+1;// 최대값 몇번 숫자 
				
				
			}
			
		}
		
		System.out.println(max);
		System.out.println(cnt);
		
		
		
		
	}

}
