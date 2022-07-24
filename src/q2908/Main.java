package q2908;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
	
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num1_re = 0;
		int num2_re = 0;
		
		while(num1 !=0) {
			num1_re *= 10;
			num1_re += num1%10;
			num1 = num1/10;
		}
		
		while(num2 !=0) {
			num2_re *= 10;
			num2_re += num2%10;
			num2 = num2/10;
		}
		
		System.out.print(num1_re>num2_re?num1_re:num2_re);
		
		
		
		
	}

}
