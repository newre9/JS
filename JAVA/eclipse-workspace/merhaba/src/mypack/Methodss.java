package mypack;

public class Methodss {
	
	static void Mesaj() {
		System.out.println("Methodun içindeyim ");
		}
	static float Bolme(float a, float b) {
		float bolmesonucu= a/b;
		return bolmesonucu;
	}
	static int Yas(int dt,int bt) {
		int yassonuc=bt-dt;
		return yassonuc;
	}
	static String Msg(String v,String x,String b) {
		String mesaj=x+v+b;
		return mesaj;
	}
	static char karakter(char d) {
		System.out.println("gelen karakter:" + d);
		return d;
	}
	static void karaktersayi() {
		char f=85;
		System.out.println(f);
		
	}
	
	static int Karealanbul(int c) {
		int karealansonucu=c*c;
		return karealansonucu;
	}
	static int MaxBul(int a, int b,int c) {
		if(a>b && a>c) {
			return a;
		}else if(b>a && b>c) {
			return b;
		}else {
			return c;
		}
	}
	static float MinBul(float a ,float b) {
		if(a<b) {
			return a;
		}else {
			return b;
		}
	}
	static float TekC(float x) {
		float a=x%2;
		if(a==0) {
			System.out.println("bu sayı çift");
		}else {
			System.out.println("bu sayı tek");
		}
		
		return a;
		
	}
	static float UcAlanBul(float t,float h) {
		float Ucgenalan=(t*h)/2;
		return Ucgenalan;
	}
	
	
	
	public static void main(String[] args) {
		int dogumt=1975;
		int bugunt=2022;
		float taban=10.9f;
		float yuksek=52.1f;
		//Mesaj();
		//System.out.println(Bolme(2.0f,9.3f));
		//System.out.println(Yas(dogumt,bugunt));
		//System.out.println(Msg("Merhaba","Javada","Methodlar"));
		//karakter();
		//karaktersayi();
		//int alansonucu=Karealanbul(9);
		//System.out.println(alansonucu);
		//System.out.println(MaxBul(15,19,23));
		//System.out.println(MinBul(2.3f,5.9f));
		//TekC(106.1024f);
		 System.out.println(UcAlanBul(taban,yuksek));
	}

}
