
public class Method5C {

	static void Kontrol(int x) {
		if(x<18) {
			System.out.println("Yaşınız 18 den küçük");
		}else {
			System.out.println("Yaşınız 18 den büyük ");
		}
	}
	public static void main(String[] args) {
		
		Kontrol(25);
		Kontrol(13);
	}

}
