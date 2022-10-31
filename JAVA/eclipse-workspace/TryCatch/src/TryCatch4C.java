import java.util.Scanner;
public class TryCatch4C {

	static void SinavHesapla(double x,double y) {
		double sonuc=(x*0.4)+(y*0.6);
		System.out.println(sonuc);
		if(sonuc<50) {
			System.out.println("Üzgünüm Ders Tekrarı ");
		}else {
			System.out.println("Tebrikler Dersi Geçtiniz ");
		}
		
	}
	public static void main(String[] args){
		Scanner MyObje=new Scanner(System.in);
		System.out.println("Vize notunu gir");
		double v=MyObje.nextDouble();
		System.out.println("Final notunu gir");
		double f=MyObje.nextDouble();
		SinavHesapla(v,f);		
	}

}
