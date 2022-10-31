
public class TryCatch2C {

	public static void main(String[] args) {
		try {
		
			int a=10;
			int s=a/0;
			System.out.println("sonuc:"+s);
			
		}catch(Exception e) {
			
			//System.out.println(e);
			System.out.println("Sıfıra bölünemez");
		}

	}

}
