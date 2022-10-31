
public class TryCatc1C {

	public static void main(String[] args) {
		try {
			int[] MyNumber= {12,15,16};
			System.out.println(MyNumber[3]);
		}catch(Exception e) {
			//System.out.println(e);
			System.out.println("böyle bir index bulunmamaktadır "+e);
		}

	}

}
