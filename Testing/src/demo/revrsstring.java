package demo;

public class revrsstring {
	
	public static void main(String[] args) {
		
		String str = "manish";
		String rev = "";
		
		for (int i = str.length()-1; i>=0; i--)
			
		{
			rev = rev + str.charAt(i);
	}

	System.out.println(rev);
		
	}
	
 
	
	String str = "abnbn";
	String rev1 = " ";
	
	for (int i = str.length()- 1; i>0; i--)
		
	{
		rev1 = rev1 + str.charAt(i);
	}

}}
