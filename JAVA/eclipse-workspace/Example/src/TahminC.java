import java.util.Scanner;
public class TahminC {

	public static void main(String[] args) {
		Scanner Obje=new Scanner(System.in);
		int R=(int)(Math.random()*301);
		//System.out.println(R);
		int h=4;
		
		while(h<=3) {
			System.out.println("0-300 arasında bir sayı tahmin et");
			int t=Obje.nextInt();
			if(R==t) {
				System.out.println("Tebrikler Kazandınız ");
				break;
			}else {
				System.out.println("Yanlış tahmin");
			}
		System.out.println((3-h)+"hakkınız kaldı ");	
			h++;
		}
		
		System.out.println("üretilen sayı:"+R);
		
		
	}

}
