import java.util.Scanner;
public class Try {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in); 
		try 
	    {
	        
	       int  number_of_rigons = scan.nextInt(); // sc is an object of scanner class 
	    } 
	    catch (Exception e) 
	    {
	        
	        System.out.println("lutfen sayi girin");
	    }

	}

}
