import java.util.ArrayList;
import java.util.Collections;
public class List3C {

	public static void main(String[] args) {
		ArrayList<String> Alfabe=new ArrayList<String>();
		Alfabe.add("Merhaba");
		Alfabe.add("Zeynep");
		Alfabe.add("Hello");
		Alfabe.add("Ahmet");
		Alfabe.add("Hasan");
		Collections.sort(Alfabe);
		for(int y=0;y<Alfabe.size();y++) {
			System.out.println(Alfabe.get(y));
		}
		

	}

}
