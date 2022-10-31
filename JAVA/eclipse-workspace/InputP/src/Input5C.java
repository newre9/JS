import java.util.Scanner;
public class Input5C {

	static int AlanH(int x,int y) {
		int h=x*y;
		return h;
	}
	
	public static void main(String[] args) {
		Scanner MyObje=new Scanner(System.in);
		System.out.println("1. Kenarı girin");
		int b=MyObje.nextInt();
		System.out.println("2. Kenar girin");
		int i=MyObje.nextInt();
		
		System.out.println("Alan Sonucu:"+AlanH(b,i));

	}

}
