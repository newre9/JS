import java.util.Scanner;
import java.util.ArrayList;

public class Randevu1 {

	public static void main(String[] args) {
		 Scanner i=new Scanner(System.in);
	     ArrayList<String> Doktor=new ArrayList<String>();
	     int key=5;
	     while(key==5){
	         System.out.println("Lutfen bir secim yapin ");
	         System.out.println("*************");
	         System.out.println("-0- Sistem cikmak icin ");
	         System.out.println("-1- Randevu al");
	         System.out.println("-2- Doktor Sayfasi");
	         System.out.println("-3- Bashekim sayfasi");
	         String secim=i.nextLine();
	         switch(secim){
	            case "0":
	               key=0;
	                break;
	            case "1":
	                System.out.println("lutfen isim girin");
	                String isim=i.nextLine();
	                Doktor.add(isim);
	                System.out.println("isminiz basari bir sekilde kaydedildi");
	                break;
	            case "2":
	                System.out.println(Doktor);
	                break;
	            case "3":
	                System.out.println("bashekim ");
	                break;
	            default :
	                System.out.println("gecersiz secim");
	                break;
	         }
	         
	     }
	     System.out.println("sistemden çıkış yaptınız");
	     
	}

}
