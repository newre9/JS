
public class TryCatch3C {

	static void YasKontrol(int y) {
		if(y<18) {
			throw new ArithmeticException("Girilen yaş geçersizdir.");
			
		}else {
			System.out.println("Girilen Yaş Geçerlidir");
		}
	}
	public static void main(String[] args) {
		
		YasKontrol(12);
	}

}
