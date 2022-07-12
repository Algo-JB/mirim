package q1008;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		
		//double 로 출력하기 위해 강제변환
		int num = in.nextInt();
		int num1 = in.nextInt();
	  
		
		System.out.println((double) num / num1);
		
		
		in.close();

	}

}
