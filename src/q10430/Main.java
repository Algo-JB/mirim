package q10430;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int num1 = sc.nextInt();
		int num2= sc.nextInt();
		
		System.out.println((num+num1)%num2);
		System.out.println(((num % num2)+(num1 % num2))%num2);
		System.out.println((num * num1)%num2);
		System.out.println(((num % num2) * (num1 % num2))%num2);
		
		
	}

}
