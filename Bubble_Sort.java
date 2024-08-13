package lec11;
import java.util.*;
public class Bubble_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		long n = s.nextLong();
		long []arr = new long[(int) n];
		for(int i =0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		Sort(arr);
		for(int j =0;j<arr.length;j++) {
			System.out.print(arr[j]+" ");
		}
	}
	public static void Sort(long[]arr) {
		for(int turn =1;turn<arr.length;turn++) {
			for(long i =0;i<arr.length-turn;i++) {
				if(arr[(int) i]>arr[(int) (i+1)]) {
					long temp =arr[(int)i];
					arr[(int)i]=arr[(int)i+1];
					arr[(int)i+1]=temp;
							
				}
			}
		}
	}

}
