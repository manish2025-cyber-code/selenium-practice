package JAVA_CLass;

import java.util.Scanner;

public class Scanner_test {

	
	
	public static void main(String[] args) {
		
		Scanner s1= new Scanner(System.in);
		
		System.out.println("value");
		s1.next("manish");
		s1.nextInt();
		s1.nextBoolean();
		s1.nextFloat();
		System.out.println(s1);
		
		
	}
}
