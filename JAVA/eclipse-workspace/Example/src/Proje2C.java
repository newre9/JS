import java.util.Scanner;

public class Proje2C {

	public static void main(String[] args) {
		Proje1C Obje= new Proje1C();
		Scanner i=new Scanner(System.in);
		
		System.out.println("Döngü kaç defa dönsün ");
		int k=i.nextInt();
		//sistemle alakalı bir durum olduğundan ekledik 
		i.nextLine();
		System.out.println("Yazmak istediğiniz Cümleyi girin ");
		String s=i.nextLine();
		Obje.Say(k,s);
		
	}

}
