
import java.util.Scanner; // import the Scanner class 

public class First {
    public static void main(String[] args) {
        Scanner MyObje= new Scanner(System.in);
	    String userName;
	    
	    // Enter username and press Enter
	    System.out.println("Enter username"); 
	    for(int  a=0;a<10;a++) {
	    	userName = MyObje.nextLine();   
	       
	    System.out.println("Username is: " + userName); }
	    
    }
}