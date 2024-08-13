package lec11;

import java.util.Scanner;

public class insertion_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int []arr = new int[n];
		for(int i = 0; i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		Insertion_Sort(arr);
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}
	public static void Insertion_Sort(int[]arr) {
		//Single element is sorted due to this resion 
		for(int i = 1;i<arr.length;i++) {
			int picked = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]>picked) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=picked;
		}
	}

}
