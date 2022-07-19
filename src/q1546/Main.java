package q1546;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		
		
		int num = sc.nextInt();
		
		float numtotal[] = new float[num];
		float max = -1;
	    float avg = 0;
		
		
		
		//double 확인 !!
		
		for (int i = 0; i<numtotal.length; i++) {
			
			numtotal[i] = sc.nextInt();
			
			if(max <numtotal[i]) {
				
			   max = numtotal[i];
			   
			}
		}
		
		
		for (int i =0; i<numtotal.length; i++) {
			
			numtotal[i] = (float)numtotal[i]/max*100;
			avg += numtotal[i];
			
		}
		
		
		System.out.println(avg/num);
		
		
		

	}

}
