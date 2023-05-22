import java.util.Scanner;
public class ThrowAndThrows {
 void ageValid(int age) throws ArithmeticException
 {
	 if(age<18)
	 {
	 throw new ArithmeticException("Age not Valid Exception");
	 }
	 else
	 {
		 System.out.println("Age is Valid");
	 }
 }
 void div() throws NumberFormatException,ArithmeticException
 {
	 int a,b;
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter num 1: ");
	 a=Integer.parseInt(sc.nextLine());
	 System.out.println("Enter num 2: ");
	 b=Integer.parseInt(sc.nextLine());
	 System.out.println("Result = "+(a/b));
 }
 public static void main(String[] args) {
     ThrowAndThrows obj = new ThrowAndThrows();
     try
     {
         obj.ageValid(20);
         obj.div();
     } 
     catch (ArithmeticException e)
     {
         System.out.println("Exception: " + e.getMessage());
     } 
     catch (NumberFormatException e)
     {
         System.out.println("NumberFormatException: " + e.getMessage());
     }
 }
}
