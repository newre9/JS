import java.util.Scanner;
public class App1C {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int key=3;
		while(key==3) {
			System.out.println("HANGİ KONUYU TEST ETMEK İSTİYORSUNUZ");
			System.out.println("******************************");
			System.out.println("-0- çıkış");
			System.out.println("-1-FOR konusu");
			System.out.println("-2- IF ELSE konusu");
			System.out.println("-3- Hazır METHOD konusu");
			System.out.println("-4- DIZI konusu");
			System.out.println("-5- WHILE konusu");
			System.out.println("*********************************");
			int secim=input.nextInt();
			switch(secim) {
			case 0:
				key=0;
				break;
			case 1:
				int toplam=0;
				for(int x=1;x<=10;x++) {
					toplam=toplam+x;
					//System.out.println("Toplam sonucu:"+toplam);
				}
				System.out.println("Toplam sonucu:"+toplam);
				break;
			case 2:
				System.out.println("Öğrenim durumunuz ");
				String okul=input.nextLine();
				input.nextLine();
				System.out.println("Yaş durumunuz");
				int yas=input.nextInt();
				if(okul=="lisans" && yas==45 ) {
					System.out.println("işe alındınız");
				}else {
					System.out.println("başvuru durumunuz olumsuz");
				}
				break;
			case 3:
				String text="merhaba dünya";
				String c="HELLO WORLD";
				System.out.println("Büyük cümle değişimi:"+text.toUpperCase());
				System.out.println("Küçük Cümle değişimi:"+c.toLowerCase());
				System.out.println("max sonuc:"+Math.max(5.9,7.3));
				
				break;
			case 4:
				String[] name= {"Ayşe","Hacer","Mehmet","Ali","Damla","Azra"};
				System.out.println("Dizinin uzunluğu:"+name.length);
				System.out.println("2. index değeri:"+name[2]);
				break;
			case 5:
				int x=1;
				while(x<=20) {
					if(x==3) {
						x++;
						continue;
					}
					
					if(x==9) {
						break;
					}
					System.out.println("Sayı:"+x);
					
					x++;
				}
				break;
			default :
				//key=3 olmayacak şekilde yapılsa döngüden çıkmış olacak 
				key=6;
				System.out.println("Geçersiz bir seçim");
				break;
			
			}//switch case kapanış
		}//while bitiş noktası
		System.out.println("Uygulamadan ÇIKIŞ yaptınız");
	}

}
