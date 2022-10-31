import java.util.Scanner;
public class Lab2C {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int k=1;
		while(k>0) {
			System.out.println("Sayı Test etmek için 1 'e basın");
			System.out.println("çıkmak için 2'e basın");
			int s=in.nextInt();
			if(s==2) {
				System.out.println("IYI GUNLER");
				break;
			}else if(s==1) {
				System.out.println("test etmek istediğiniz sayıyı girin");
				int n=in.nextInt();
				if(n%2==1) {
					System.out.println(n+"Bu sayı tek");
				}else {
					System.out.println(n+"Bu Sayı Çift");
				}
			}
			
		}
		

	}

}
