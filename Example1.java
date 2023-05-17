
public class Example1 {
	
	    void method1() {
	        // code that may throw an exception
	        throw new ArithmeticException("Exception thrown from method1");
	    }

	    public static void main(String[] args) {
	        Example1 obj = new Example1();
	        try {
	            obj.method1();
	        } catch (ArithmeticException e) {
	            System.out.println("Exception caught: " + e.getMessage());
	        }
	    }
	}


