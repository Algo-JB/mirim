package q11021;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int answer[] = new int[num];
		
		
		
		for (int i= 0; i<num; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			answer[i]= a+b;
			
		}
		
		for (int i= 0; i<num; i++) {
			
			
				System.out.println("Case #"+(i+1)+":"+" "+answer[i]);
			
		}

	}

}
