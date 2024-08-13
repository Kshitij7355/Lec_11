package Lec11;

public class equals {

	public static void main(String[] args) {
		String str="hello";
		String str1 = "hello";
		System.out.println(Equal(str,str1));

	}
	public static boolean Equal(String s1, String s2) {
		if(s1.length()!=s2.length()) {
			return false;
		}
		if(s1==s2) {
			return true;
		}
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)!=s2.charAt(i)) {
				return false;
			}
		}
		return true; 
	}

}
