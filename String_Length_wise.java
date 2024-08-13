package Lec11;

import java.util.Scanner;

public class String_Length_wise {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String s1 = s.next();
		String(s1);
	}
	public static void String(String s1 ) {
		for(int len=1;len<=s1.length();len++) {
			for(int j=len;j<=s1.length();j++) {
				int i = j-len;
				System.out.println(s1.substring(i, j));
			}
		}
	}

}
