package demo;

public class polidromstring {

	public static void main(String[] args) {
		
//		String str = "madam";
//		String rev = "";
//		for (int i = str.length() - 1; i >= 0; i--) {
//		    rev += str.charAt(i);
//		}
//		if (str.equals(rev)) {
//		    System.out.println("Palindrome");
//		} else {
//		    System.out.println("Not Palindrome");
//		}
		
		String str = "ABAAS";
		String rev = "";
		
		for (int i= str.length()-1; i>=0; i--)
			
		{
			
			rev+= str.charAt(i);
			
		}
		if (str.equals(rev))
			
		{
			System.out.println("paolidrome");
		}
		else {
			System.out.println("not polidrome");
		}
		
		
		
		
		
	}}
		
//		String str = "ACBDN";
//		String rev = "";
//		
//		for (int i = str.length()-1; i>=0; i--)
//			
//		{
//			rev = rev + str.charAt(i);
//			
//			
//		}
//	System.out.println(rev);
//	}
//}
