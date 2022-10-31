public class Hello {
  public static void main(String[] args) {
      int a=5;
        
        int toplam=0;
        
        int yas=45;
        
        String os="lisans";
        
        String msg="bu bir fonksiyon test mesajıdır ";
        
        String[] d={"Ahmet","Mehmet","Ayşe"};
        
        int x=0;
        
        switch(a){
        
        case 1:
         for(int i=1;i<=10;i++){
         toplam=toplam+i;
         System.out.println(toplam);
         }
        break;
        case 2:
        if(yas==45 && os=="lisans"){
        
        System.out.println("tebrikler");
        
        }
        else{
         System.out.println("kusura bakmayın");
        
        }
        break;
        
        case 3:
        System.out.println(msg.toUpperCase());
        System.out.println(msg.toLowerCase());
        System.out.println(Math.max(1.3f,2.5f));
        break;
        
        case 4:
        System.out.println(d.length);
        System.out.println(d[2]);
        break;
        
        case 5:
        while(x<=10) {
          x++;
          if(x==3){
          continue;
            }
            
            if(x==9){
            	break;
            }
            System.out.println(x);
         }
        break;
        
        default:
    System.out.println("Herhangi bir seçim yapmadınız");
      
  }
}}