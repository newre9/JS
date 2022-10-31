import java.util.Scanner;
public class Input4C {

	static int Topla(int a,int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		Scanner MyObje=new Scanner(System.in);
		System.out.println("Birinci Sayıyı girin");
		int k=MyObje.nextInt();
		System.out.println("ikinci Sayıyı girin");
		int f=MyObje.nextInt();
		
		int s=Topla(k,f);
		
		System.out.println("toplama sonucu:"+s);
		
	}

}
