package q11720;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		

		int number = sc.nextInt();
		String num = sc.next();
		int total =0;
		
		for (int i =0; i<num.length(); i++) {
			
			total += num.charAt(i)-'0';//캐릭터형일때만 적용 // 0은 48
		
		}
		
	
		System.out.println(total);
	}

}
