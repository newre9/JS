import java.util.Scanner;
public class EnCap {
 String name;
 
 public void setName(String n) {
	 this.name=n;
 }
 public String getName() {
	 return name;
 }
 static void test(String d,int t) {
	 for (int i=0;i<t;i++) {
		 System.out.println(d);
	 }
	 
 }
	public static void main(String[] args) {
		Scanner k=new Scanner(System.in);
	String  x=k.nextLine();
	int y=k.nextInt();
	test(x,y);
	}

}
