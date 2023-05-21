
public class Test3 {

	public static void main(String args[]){  
		
		  try{  
		   int m=25/0;  
		   System.out.println(m);  
		  }  
//		  catch(Exception e)
//		  {
//			  System.out.println(e);
//	     }  
		  finally
		  {
			  System.out.println("finally block is always executed.......");
		 }
		  
		  System.out.println("rest of the code...");  
		  }  
}
