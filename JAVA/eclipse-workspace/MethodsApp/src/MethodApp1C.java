
public class MethodApp1C {
// Maxbul app
	static int MaxBul(int a, int b) {
		
		if(a>b) {
			//System.out.println("a değişkeni daha büyük ");
			return a;
		}else {
			return b;
		}
	}
// Min Bul APP
	static double MinBul( double x,double y) {
		if(x<y) {
			return x;
		}else {
			return y;
		}
	}
// Üçgen Alan Bul 
	static float AlanBul(float t,int y) {
		float Alan=(t*y)/2;
		return Alan;
	}
//Login Ol App
	static void LoginOl(String m,String s) {
	
		if(m=="new@gmail.com" && s=="123456") {
			System.out.println("Başarı bir şekilde giriş yapıldı");
		}else {
			System.out.println("Girilen bilgiler hatalıdır");
		}
		
	}
// Max Bul 3 parametre alarak 
	static int MaxBul3P(int d,int f,int g) {
		if(d>f && d>g) {
			return d;
		}else if(f>d && f>g) {
			return f;
		}else {
			return g;
		}
	}
	
	public static void main(String[] args) {
		//System.out.println(Math.max(5, 6));
		System.out.println(MaxBul(8,5));
		System.out.println(MinBul(2.3,3.6));
		System.out.println(AlanBul(13,5));
		LoginOl("ne@gmail.com","123456");
		System.out.println(MaxBul3P(29,95,23));
	}

}
