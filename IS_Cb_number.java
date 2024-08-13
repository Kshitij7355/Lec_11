package Lec11;

import java.util.Scanner;

public class IS_Cb_number {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String s1 = s.next();
		System.out.println(Substring(s1));

	}
	public static int Substring(String s1) {
		int count=0;
		boolean[]visited = new boolean[s1.length()];
		for(int len=1;len<=s1.length();len++) {
			for(int j=len;j<=s1.length();j++) {
				int i=j-len;
				String s = s1.substring(i, j);
				//Integer.parseInt(s) for integer
				if(Is_Cbnumber(Long.parseLong(s))==true && IS_visited(visited,i,j)==true) {
					count++;
					for(int k=i;k<j;k++) {
						visited[k]=true;
					}
				}
			}
		}
		return count;
	}
	public static boolean IS_visited(boolean[] visited, int i, int j) {
		
		for(;i<j;i++) {
			if(visited[i]==true) {
				return false;
			}
		}
		return true;
	}
	public static boolean Is_Cbnumber(long num) {
		if(num==0 || num==1) {
			return false;
		}
		int[]arr = {2,3,5,7,11,13,17,19,23,29};
		for (int i = 0; i < arr.length; i++) {
			if(num==arr[i]) {
				return true;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if(num % arr[i]==0) {
				return false;
			}
		}
		return true;
		
		
	}

}
