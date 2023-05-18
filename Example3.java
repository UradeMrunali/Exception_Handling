import java.util.Scanner;

public class Example3 {
	
	
	    void method1() throws Exception {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter an integer: ");
	        int num = sc.nextInt();
	        if (num < 0) {
	            throw new Exception("Negative integer not allowed");
	        } else {
	            System.out.println("Entered integer is: " + num);
	        }
	    }

	    public static void main(String[] args) {
	        Example3 obj = new Example3();
	        try {
	            obj.method1();
	        } catch (Exception e) {
	            System.out.println("Exception caught: " + e.getMessage());
	        }
	    }
	}


