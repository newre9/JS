import java.util.Scanner;
import java.util.ArrayList;
public class Randevu {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		ArrayList<String> Doktor1= new ArrayList<String>();
		ArrayList<String> Doktor2= new ArrayList<String>();
		int key=5;
		while(key==5) {
			System.out.println(">>>>>>>>>>>>>>>>>>>>");
			System.out.println("bir secim yapin");
			System.out.println(">>>>>>>>>>>>>>>>>>>>");
			System.out.println("-0- cikis   ");
			System.out.println("-1- randevu al   ");
			System.out.println("-2- Doktor sayfasi  ");
			System.out.println("-3- Bashekim sayfasi  ");
			System.out.println(">>>>>>>>>>>>>>>>>>>>");
			int secim=input.nextInt();
			
			switch(secim) {
			case 0:
				
				key=0;
				break;
			case 1:
				System.out.println("Secmek istediginiz Doktorun ID numasini girin ");
				System.out.println("**************");
				System.out.println("-1- Doktor Ferhat   ");
				System.out.println("-2- Doktor Sirin   ");
				System.out.println("**************");
				int  doktorsecim=input.nextInt();
				input.nextLine();
				
				if(doktorsecim==1) {
					System.out.println("isminizi girin  ");
					String  ekled1=input.nextLine();
					Doktor1.add(ekled1);
					System.out.println("isminiz basari bir sekilde kayit edildi ");
					System.out.println("MENU icin 5 CIKMAK icin 0 basin ");
					int  keykontrol=input.nextInt();
					input.nextLine();
					key=keykontrol;
					
				}else if(doktorsecim==2)
				 {
					System.out.println("isminizi girin  ");
					String  ekled1=input.nextLine();
					Doktor2.add(ekled1);
					System.out.println("isminiz basari bir sekilde kayit edildi ");
						System.out.println("MENU icin 5 CIKMAK icin 0 basin ");
					int  keykontrol=input.nextInt();
					input.nextLine();
					key=keykontrol;
				}else {
					
					System.out.println("boyle bir ID bulunmadi ");
					System.out.println("MENU icin 5 CIKMAK icin 0 basin ");
					int  keykontrol=input.nextInt();
					input.nextLine();
					key=keykontrol;
					
				}
				
			break;
			case 2:
				System.out.println("ID numaranizi girin ");
				int  dId=input.nextInt();
				
				if(dId==1) {
					System.out.println("Doktor Ferhat Randevu listesi");
					System.out.println(Doktor1);
						System.out.println("MENU icin 5 CIKMAK icin 0 basin ");
					int  keykontrol=input.nextInt();
					input.nextLine();
					key=keykontrol;
					
				}else if(dId==2) {
					System.out.println("Doktor Sirin Randevu listesi");
					System.out.println(Doktor2);
					System.out.println("MENU icin 5 CIKMAK icin 0 basin ");
					int  keykontrol=input.nextInt();
					input.nextLine();
					key=keykontrol;
					
				}else {
					
					System.out.println("boyle bir ID bulunmadi ");
						System.out.println("MENU icin 5 CIKMAK icin 0 basin ");
					int  keykontrol=input.nextInt();
					input.nextLine();
					key=keykontrol;
					
				}
				
				break;
			case 3:
				System.out.println("Tum Randevu Listesi");
				System.out.println("Doktor Ferhat:"+Doktor1);
				System.out.println("Doktor Sirin:"+Doktor2);
				System.out.println("MENU icin 5 CIKMAK icin 0 basin ");
				int  keykontrol=input.nextInt();
				input.nextLine();
				key=keykontrol;
				break;
			default:
				System.out.println("gecersiz bir secim");
				
				
				break;
			}
			
			
		}
		System.out.println("sistemden cikis yaptiniz");

	}

}
