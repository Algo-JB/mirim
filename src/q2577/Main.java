package q2577;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int total= num1 * num2 * num3;
		
		int multotal[] = new int[10];
		
		while(true) {
			
			  int n =total % 10;
			  total = total/10;
			  multotal[n]++;
			  
			  if (total ==0) {
				  break;
			  }
		}
	
		for (int i = 0; i<multotal.length; i++) {
			System.out.println(multotal[i]);
		}

	}

}
