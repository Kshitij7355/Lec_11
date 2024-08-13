package Lec11;

public class Compare_to {

	public static void main(String[] args) {
		String s1 ="Hello";
		String s2 = "Hell";
		System.out.println(Comapate(s1,s2));
		

	}
	public static int Comapate(String s1 , String s2) {
		if(s1==s2) {
			return 0;
		}
		for(int i=0;i<Math.min(s1.length(),s2.length());i++) {
			if(s1.charAt(i)!=s2.charAt(i)) {
				return s1.charAt(i)-s2.charAt(i);
			}
		}
		return s1.length()-s2.length();
	}

}
