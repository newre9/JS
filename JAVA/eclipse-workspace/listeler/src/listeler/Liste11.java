package listeler;
import java.util.ArrayList;
import java.util.Collections;
public class Liste11 {
	public static void main(String[] args) {
		ArrayList<Integer> myNumbers = new ArrayList<Integer>();
	    myNumbers.add(33);
	    myNumbers.add(15);
	    myNumbers.add(20);
	    myNumbers.add(34);
	    myNumbers.add(8);
	    myNumbers.add(12);
	    
	    myNumbers.remove(3);
	    Collections.sort(myNumbers);  
	    System.out.println(myNumbers.get(3));
	    for (int i : myNumbers) {
	      System.out.println(i);
	    }
		
		
	}
	
}
