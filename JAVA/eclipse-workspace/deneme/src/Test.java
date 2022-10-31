import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		ArrayList<Integer> cars = new ArrayList<Integer>();
		
		for(int x=0;x<10;x++) {
			System.out.println("bir sayı girin");
			int i=myObj.nextInt();
			cars.add(i);
			
		}
		System.out.println(cars);

	}

}
