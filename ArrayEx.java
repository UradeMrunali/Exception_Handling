import java.util.Scanner;

public class ArrayEx {

	public static void main(String args[]){  
		    
			 int a[]=new int[3];   	
			 Scanner sc=new Scanner(System.in);
				
				try{
				 System.out.println("Enter number 1: ");
				 a[1]=Integer.parseInt(sc.nextLine());
				 System.out.println("Enter number 2: ");
				 a[2]=Integer.parseInt(sc.nextLine());
				  
			 
		            a[0]=a[1]+a[2];
		 
			      System.out.println(a[0]);
			
		    
		     }
		   catch(ArithmeticException e)
		   {
			   System.out.println(e);
			   }  
		     catch(ArrayIndexOutOfBoundsException e)
		   {
		    	 System.out.println(e);
		    	 }  
		     catch(Exception e)
		   {
		    	 System.out.println(e);
		    	 }  
		    System.out.println("hello ...");  
		 }  
		}  

