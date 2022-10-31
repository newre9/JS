import java.time.LocalTime;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Date4C {
    
	public static void main(String[] args) {
		LocalTime myobje1=LocalTime.now();
		LocalDate myobje2=LocalDate.now();
		LocalDateTime myobje3=LocalDateTime.now();
		
		System.out.println("Zaman:"+myobje1);
		System.out.println("Tarih:"+myobje2);
		System.out.println("Tarih ve Zaman:"+myobje3);
		System.out.println("..............................................");
		
		System.out.println("Zaman:"+LocalTime.now());
		System.out.println("Tarih:"+LocalDate.now());
		System.out.println("Tarih ve Zaman"+LocalDateTime.now());
	}

}
