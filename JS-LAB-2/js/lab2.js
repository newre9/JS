function Hesapla(){
let i1=parseFloat(document.getElementById("in1").value);
let i2=parseFloat(document.getElementById("in2").value);
let s=document.getElementById("selectid").value;
let sonuc=0;
switch(s){
case "+":
    sonuc=i1+i2;
    document.getElementById("demo2").innerHTML="Toplama Sonucu:"+" "+sonuc;
    break;
case "-":
    sonuc=i1-i2;
    document.getElementById("demo2").innerHTML="Çıkarma Sonucu :"+" "+sonuc;
    break;
case "*":
    sonuc=i1*i2;
    document.getElementById("demo2").innerHTML="Çarpma Sonucu:"+" "+sonuc;
    break;
case "/":
    sonuc=i1/i2;
    document.getElementById("demo2").innerHTML="Bölme Sonucu:"+" "+sonuc;
    break;
default:
    document.getElementById("demo2").innerHTML="İnputlar boş olamaz";
    break;
}

}