package q1316;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
	
		
		int alpha[] = new int[26];
		
		String word[] = new String[num];
		
		String word2;
		
		int word3 =0;
		
		int cnt =0;
		
		boolean flag = true;
		

		
		for (int i=0; i<num; i++) {
			word[i] = sc.next();
		}
		
		for (int i =0; i<word.length; i++) {
			word2 = word[i];
			
			//초기화 
			for (int z=0; z<alpha.length; z++) {
				alpha[z] =0;
			}
			flag = true;
			
			
			for (int j=0; j<word2.length(); j++) {
				
				word3 = word2.charAt(j)-'a';
				if (alpha[word3]==0) {
					alpha[word3]++;
					
				}
				else if (alpha[word3] ==1) {
					if (word2.charAt(j-1) != word2.charAt(j)) {
						flag = false;
						break ;
					}else {
						continue;
					}
				}
			}
			if(flag) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
		
	}

}
