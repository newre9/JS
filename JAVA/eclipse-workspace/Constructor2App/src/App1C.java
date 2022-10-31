
public class App1C {
public int x=23;
private float y=45.6f;
static String z="Apex";

	public void MyMethod() {
	System.out.println("Method kısım çalıştı ");
		}
	
	static void NewMethod() {
		System.out.println("Static method çalıştı");
	}
	public static void main(String[] args) {
		
		App1C k=new App1C();
		
		k.x=96;
		k.y=74.8f;
		k.z="Salesforce";
		
		System.out.println(k.x);
		System.out.println(k.y);
		System.out.println(z);
		
		k.MyMethod();
        NewMethod();
	}

}
