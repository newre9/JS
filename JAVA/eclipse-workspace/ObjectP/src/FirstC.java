
public class FirstC {

	//Max bulma Methodu 
	 public int MaxBul(int a,int b) {
		 if(a>b) {
			 return a;
		 }else {
			 return b;
		 }
	 }
	 //Min Bulma methodu
	  static int MinBul(int x,int y) {
		  if(x<y) {
			  return x;
		  }else {
			  return y;
		  }
	  }
	  //Login olma methodu
	  static void LoginOl(String m,String s) {
		  if(m=="new@gmail.com" && s=="123456") {
			  System.out.println("Bilgiler Doğrudur");
		  }else {
			  System.out.println("Bilgiler Yanlıştır");
		  }
		  
	  }
	  
	  //3 parametre alan Maxbul Method
	  public int MaxBul3P(int g,int h, int k) {
		  if(g>h && g>k) {
			  return g;
		  }else if(h>k && h>g) {
			  return h;
		  }else {
			  return k;
		  }
	  }
	  
	public static void main(String[] args) {
		

	}

}
