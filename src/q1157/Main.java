package q1157;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		String word = sc.next();
		
		int alphabet[] = new int[26];
		
		int index =0;
		
		for (int i =0; i <word.length(); i++) {
			
			int number = (int)word.charAt(i);
			
			if (number >=97 && number <=122){
				
				 number = number -32;
				 index = number -'A';
				 alphabet[index]+=1;
				 
			}else {
				 
				index = number -'A';
				alphabet[index]+=1;
				
			}
			
		}	
		
		int max =-1;
		int indexvalue=0; // 인덱스 값이 들어가는 곳 
		
			
			
		for (int i =0; i <alphabet.length; i++) {
		
				
			if(max <alphabet[i]) {
				max = alphabet[i];
				indexvalue = i;
				indexvalue = (char)indexvalue +'A';
			}else if(max == alphabet[i]) {
				indexvalue = '?';
			}
			
			
			
		}
		
		
	
		
		
		
		
		
		System.out.println((char)indexvalue);
		
			

			
	}

}

