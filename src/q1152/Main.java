package q1152;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		
		
		//System.out.println((int)' ');// 32
		
		Scanner sc = new Scanner(System.in);
		
		
		String sentence = sc.nextLine(); 
		sc.close();
		
		StringTokenizer st = new StringTokenizer(sentence," ");
		
		
		System.out.println(st.countTokens());
		
		
		
	
	}

}
