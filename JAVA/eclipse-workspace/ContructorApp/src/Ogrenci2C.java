
public class Ogrenci2C {
	String name;
	int age;
	int No;
	
	public Ogrenci2C(String x,int y,int z) {
		name=x;
		age=y;
		No=z;
	}
	public static void main(String[] args) {
		Ogrenci2C Ogr1=new Ogrenci2C("Ayşe",23,45);
		Ogrenci2C Ogr2=new Ogrenci2C("Ahmet",24,63);
		System.out.println(Ogr1.name+" "+Ogr1.age+" "+Ogr1.No);
		System.out.println(Ogr2.name+" "+Ogr2.age+" "+Ogr2.No);
	}

}
