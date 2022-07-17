package q10871;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int numtest = sc.nextInt();
		int numlong[] = new int[num];
		
		
		for (int i =0; i<num; i++) {
			numlong[i] = sc.nextInt();
			
		}
		
		for (int i =0; i<numlong.length; i++) {
			if (numlong[i]<numtest) {
				System.out.print(numlong[i]+" ");
				// 마지막에는 띄어쓰기 안해주는 방법을 ,, 알고 싶다 !!!!
				
				
				
				
			}
		}

	}

}
