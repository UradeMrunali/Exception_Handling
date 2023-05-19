//Exception handling is nothing but a runtime error

import java.util.Scanner;

public class Test {
 public static void main(String[] args) {
	int a,b,c=0;
	
	Scanner sc=new Scanner(System.in);
	
	try{
	 System.out.println("Enter number 1: ");
	 a=Integer.parseInt(sc.nextLine());
	 System.out.println("Enter number 2: ");
	 b=Integer.parseInt(sc.nextLine());
	  
	 c= a/b;
	}
	
	catch(ArithmeticException e){
		System.out.println("you cannot enter zero");
	}
	catch(NumberFormatException e){
		System.out.println("you cannot enter string");
		System.out.println("plz enter number");
	}
	catch(Exception e){
		System.out.println(e);
	}
//	finally {
//		System.out.println("Thank You! :)");
//	}
	
	 
	 System.out.println("Result "+c);
	 System.out.println("Thank You");
}
}
