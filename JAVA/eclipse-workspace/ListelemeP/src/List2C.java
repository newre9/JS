import java.util.ArrayList;
import java.util.Collections;
public class List2C {

	public static void main(String[] args) {
		ArrayList<Integer> MyNumber=new ArrayList<Integer>();
		MyNumber.add(12);
		MyNumber.add(52);
		MyNumber.add(96);
		MyNumber.add(101);
		MyNumber.add(73);
		Collections.sort(MyNumber);
	for(int x=0;x<MyNumber.size();x++) {
		System.out.println(MyNumber.get(x));
	}

	}

}
