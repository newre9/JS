import java.util.Scanner;
public class Lab1C {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int Ran=(int)(Math.random()*601);
		System.out.println(Ran);
		
		int s=0;
		int c;
		do {
			System.out.println("0-600 arasında bir sayı tahmin edin");
			 c=in.nextInt();
			if(c>Ran) {
				System.out.println("tahmin durumunuzu küçültün");
			}else if(c<Ran) {
				System.out.println("Tahmin ettiğiniz sayıyı büyütün");
			}
			s++;
					
		}while(c!=Ran);
	System.out.println("Tebrikler Bildiniz"+s+". denemede Sayıyı doğru tahmin ettiniz");	

	}

}
