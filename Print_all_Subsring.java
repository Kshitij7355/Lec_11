package Lec11;

import java.util.Scanner;

public class Print_all_Subsring {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String s1 = s.next();
		PrintSubstring(s1);

	}
	public static void PrintSubstring(String str) {
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<=str.length();j++) {
				String s = str.substring(i, j);
				if(IsPallindrom(s)==true) {
					System.out.println(s);
				}
				
			}
		}
	}
	private static boolean IsPallindrom(String s) {
		int i=0;
		int j=s.length()-1;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
