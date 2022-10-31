
public class DeneC {
	static void checkAge(int age) {
	    
	  }

	public static void main(String[] args) {
		try {
			int age=10;
			if (age < 18) {
			      throw new ArithmeticException("GİRİLEN YAŞ GEÇERSİZ");
			    }
			    else {
			      System.out.println("Access granted - You are old enough!");
			    }
			
		}catch(Exception e) {
			 throw new ArithmeticException("GİRİLEN YAŞ GEÇERSİZ");
		}
		
	}

}
