package projem;

public class First {
	
	

	static int ToplaMethod(int a, int b ) {
		int x=a+b;
		return x;
		
	}
	
	static float AlanUcgen(float taban,float yuksek) {
		float alan=(taban*yuksek)/2;
		return alan;
		
	}
	
	public static void main(String[] args) {
		float aa=3;
		float bb=5;
		System.out.println(ToplaMethod(11,2));//topla methoduna gidecek
		System.out.println(AlanUcgen(aa,bb));//alan methoduna 
		
	}
	
	
	

}
