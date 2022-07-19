package q8958;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		int num = sc.nextInt(); // 테스트숫
		double avg =0;
		double total =0;
		int cnt =0;
		
		
		

		
		for (int i =0; i<num; i++) {
			//초기화 
			total =0;
			cnt=0;
			int studentnum = sc.nextInt();//학생숫자 
			int subject[] = new int[studentnum];
			
			for(int j =0; j<subject.length; j++) {
				
				subject[j] = sc.nextInt();
				total += subject[j];
			}
			
			
			avg = (double) total/studentnum;
			for (int s =0; s<subject.length; s++) {
				

				if (subject[s]>avg) {
					
					cnt +=1;
					
				}
			}
			

			
			System.out.println(String.format("%.3f",((double)cnt/studentnum)*100)+"%");
		}
		
		
	
		
		
		
		
		

	}

}
