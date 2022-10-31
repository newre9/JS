
public class App2C {
private String name;
private int age;
private int no;
		//name değişkeni için olan değeri göndermek için kullandık 
			public String getName() {
				return name;
			}
		//name değişkeni yeni değerini güncellemek için kullandık
			public void setName(String x ) {
				this.name=x;
			}
			
			public int getAge() {
				return age;
				
			}
           public void setAge(int y) {
        	   this.age=y;
           }
           
           public int getNo() {
        	   return no;
           }
           
           public void setNo(int z) {
        	   this.no=z;
           }
	
	public static void main(String[] args) {
		App2C k=new App2C();
	
		k.setName("Zehra");
		k.setAge(41);
		k.setNo(85);
		
		System.out.println(k.getName()+" "+k.getAge()+" "+k.getNo());	
		
		//System.out.println(k.setName("Ahmet"));

	}

}
