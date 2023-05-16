

	public class Example {
	    void method1() throws Exception {
	        // code that may throw an exception
	        throw new Exception("Exception thrown from method1");
	    }

	    void method2() {
	        try {
	            method1();
	        } catch (Exception e) {
	            System.out.println("Exception caught in method2: " + e);
	        }
	    }

	    public static void main(String[] args) {
	        Example obj = new Example();
	        obj.method2();
	    }
	}


