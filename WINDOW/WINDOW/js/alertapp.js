function MyFunction(){
    let x;
    let text=prompt("Lütfen İsminizi girin ");
    if(text==null || text=="" ){
        x="iptal edildi";
    }
    else{
        x="merhaba"+text+"hoş geldiniz";
    }
    document.getElementById("demo1").innerHTML=x;
}