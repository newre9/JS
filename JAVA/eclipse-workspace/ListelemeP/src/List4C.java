import java.util.ArrayList;
import java.util.Scanner;

public class List4C {

	public static void main(String[] args) {
		ArrayList<Integer> number=new ArrayList<Integer>();
		Scanner Sayi=new Scanner(System.in);
		for(int x=0;x<5;x++) {
			System.out.println(x+". index sayıyı girin");
			int y=Sayi.nextInt();
			number.add(y);
		}
		
		System.out.println(number);
		
	}

}
