package Lec11;

public class String_Mehod {

	public static void main(String[] args) {
		 String str = "hello";
		 String str1 = new String("hello");
		 String str2 = "hello";
		 String str3 = new String("hello");
		 System.out.println(str==str2);
		 System.out.println(str1==str);
		 System.out.println(str1==str3); 
		 System.out.println(str.equals(str2)); // both Content same hai
         
		 String s = "hellobyeokayhey";
		 System.out.println(s.substring(1, 5));
		 System.out.println(s.substring(6));
		 
	}

}
