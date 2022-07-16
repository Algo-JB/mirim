package q2525;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		int Mtime = sc.nextInt();//소요시간 
		
		
		M = M+Mtime;
		
		if (M >=60) {
			 H+= M/60;
			 M =(int) M%60;
			 
			 if(H >=24) {
				 H=H-24;
			 }
		}
		System.out.println(H+" "+M );
		
		
	
		
		
		

	}

}
