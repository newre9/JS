import java.util.Scanner;
public class Sayi {

	public static void main(String[] args) {
		Scanner k=new Scanner(System.in);
		
		
		int r=(int)(Math.random()*101);
		System.out.println(r);
		int h=1;
		while(h<=3) {
			System.out.println("lütfen sayı tahmin edin ");
			int x=k.nextInt();
			if(x==r) {
				System.out.println("tebrikler");
				break;
			}else {
				System.out.println("yanlış tahmin");
			}
			System.out.println((3-h)+"Hakkınız kaldı");
			h++;
		}
		 
		
		
		
	}

}
