package q5622_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		String phonenumber = sc.next();
		
		int total = 0; 
		
		char phone;
		
		for(int i=0; i<phonenumber.length(); i++) {
			 phone = phonenumber.charAt(i);
			 
			 if (phone =='A' || phone == 'B' || phone=='C') {
				 total+= 3;
			 }else if (phone =='D' || phone == 'E' || phone=='F') {
				 total+=4;
			 }else if (phone =='G' || phone == 'H' || phone=='I') {
				 total+=5;
			 }else if (phone =='J' || phone == 'K' || phone=='L') {
				 total+=6;
			 }else if (phone =='M' || phone == 'N' || phone=='O') {
				 total+=7;
			 }else if (phone =='P' || phone == 'Q' || phone=='R' || phone=='S') {
				 total+=8;
			 }else if (phone =='T' || phone == 'U' || phone=='V') {
				 total+=9;
			 }else if (phone =='W' || phone == 'X' || phone=='Y' || phone =='Z') {
				 total+=10;
			 }
			 
		}
		
		System.out.println(total);
		

	}

}
