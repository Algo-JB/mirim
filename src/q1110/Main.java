package q1110;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int cnt = 0;
		int firstnum = num;
		
		while(true) {
			
			
			int a= num / 10;
			int b= num % 10;
			
			
			int total = a+b;
			
			//조건 잘 읽기 ~~~~
			if (total >=10) {
				int c = total %10;
				num = (b*10+c);
			}else {

				num = b*10+total;
			}
			
			cnt++;
			if (num == firstnum) {
				System.out.println(cnt);
				break;
			}
			
			
		}
		
	}

}
