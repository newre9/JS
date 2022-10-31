import java.util.Scanner;
public class Dene1C {

	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
        
        int rastgele_sayi=(int)(Math.random()*101);
        System.out.println(rastgele_sayi);
        int sayi,sayac = 0;
        
        do {
            System.out.print("Bir sayi giriniz: ");
            sayi = scan.nextInt();
            if(sayi > rastgele_sayi) {
                System.out.println("Sayiyi küçültün.");
            }
            else if(sayi < rastgele_sayi) {
                System.out.println("Sayiyi büyütün.");
            }
            sayac++;
        }
        while(sayi != rastgele_sayi);
        
        System.out.println("Tebrikler!! " + sayac + ". denemede sayıyı buldunuz.");
	}

}
