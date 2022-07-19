package q10818;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();		
		//int num[] = new int[number];
		List<Integer> list = new ArrayList<Integer>();
		
		//max 두어서 풀거나, 정렬 
		for(int i =0; i<number; i++) {
			
		   //num[i] = sc.nextInt();
		   list.add(sc.nextInt());
			
		}
		
		
		list.sort(null);//어떤 것에 대해 정렬할 건지 
		
		System.out.print(list.get(0)+" ");
		System.out.print(list.get(number-1));
		
		
		
		
	}

}
