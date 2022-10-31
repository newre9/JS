import java.util.ArrayList;
import java.util.Scanner;

public class RandevuC {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		ArrayList<String> Doktor1=new ArrayList<String>();
		ArrayList<String> Doktor2=new ArrayList<String>();
		int key=5;
		int kontrol;
		while(key==5) {
			System.out.println("Lütfen bir seçim yapın");
			System.out.println("**************************");
			System.out.println("-0- çıkış");
			System.out.println("-1- Randevu al");
			System.out.println("-2- Doktor Sayfası");
			System.out.println("-3- Başhekim Sayfası");
			System.out.println("*************************");
			int secim=input.nextInt();
			input.nextLine();
			switch(secim) {
			case 0:
				key=0;
				break;
			case 1:
				System.out.println("İsminizi Girin");
				String ekled=input.nextLine();
				System.out.println("**************");
				System.out.println("İstediğiniz Dokturun ID numaarasını girin");
				System.out.println("-1- Doktor Mehmet ");
				System.out.println("-2- Doktor Azra");
				int  DoktorS=input.nextInt();
				if(DoktorS==1) {
					Doktor1.add(ekled);
					System.out.println("İsminiz başarı bir şekilde eklendi");
				}else if(DoktorS==2) {
					Doktor2.add(ekled);
					System.out.println("İsminiz başarı bir şekilde eklendi");
				}else {
					System.out.println("Böyle bir ID Bulunamadı");
				}
				
				System.out.println("MENU için 5 'e ÇIKMAK için 0 ' a basın");
				kontrol=input.nextInt();
				key=kontrol;
				break;
			case 2:
				System.out.println("ID numaranızı girin");
				int dId=input.nextInt();
				if(dId==1) {
					System.out.println("Mehmet:"+Doktor1);
				}else if(dId==2) {
					System.out.println("Azra:"+Doktor2);
				}else {
					System.out.println("ID Bulunamadı");
				}
				System.out.println("MENU için 5'e ÇIKMAK için 0' a basın ");
				kontrol=input.nextInt();
				key=kontrol;
				break;
			case 3:
				System.out.println("Tüm Doktorların Hasta listesi");
				System.out.println("Doktor Mehmet :"+Doktor1);
				System.out.println("Doktor Azra:"+Doktor2);
				System.out.println("MENU için 5 'e ÇIKMAK için 0 ' a basın");
				kontrol=input.nextInt();
				key=kontrol;
				break;
			default :
				System.out.println("Geçersiz bir seçim");
				break;
			}//switch kapanış yeri
			
		}// while kapanış
System.out.println("Sistemden çıkış yaptınız ");
	}

}
