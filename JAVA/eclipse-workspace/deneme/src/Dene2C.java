import java.util.Scanner;

public class Dene2C {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int s=1;
		while(s>0) {
			  System.out.println("başlamak için -START- Yazın");
	            System.out.println("çıkmak için EXIT- Yazın");
	            int x=scan.nextInt();
	            
	            if(x==1) {
	            	break;
	            }else if(x==2) {
	            	System.out.print("bir sayı");
	            	int y=scan.nextInt();
	            	if(y%2==1) {
	            		System.out.println("tek");
	            	}else {
	            		System.out.println("çift");
	            	}
	            	
	            }
		}
		
          
            
        
        
		
	}

}
