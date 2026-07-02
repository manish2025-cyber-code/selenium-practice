package JAVA_CLass;

import java.util.Scanner;

public class scanner_class {

	
	public static void main(String[] args) {
		
		Scanner s1 =new Scanner(System.in); // this will called constructor
		int a= 100;
		int b=200;
		System.out.println("please enter value A:");
		
		int a1 = s1.nextInt();
		System.out.println("please enter value B:");
		int b2=  s1.nextInt();
		
		int sum=a+b+a1+b2;
		System.out.println("Sum number value a:");

		
		System.out.println(sum);
		
		
		
		
	
	}
}
