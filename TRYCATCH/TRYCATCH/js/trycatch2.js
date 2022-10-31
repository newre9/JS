function Test(){
    let x=document.getElementById("demo2").value;
    let y=document.getElementById("pid");
    y.innerHTML="";
    y.style.color="red";
    
    try{
        if(x=="") throw "input boş olamaz";
        if(isNaN(x)) throw "sayı girmeniz gerekiyor ";
        if(x<5) throw "sayı 5 ten küçük olamaz";
        if(x>10) throw "sayı 10 dan büyük olamaz";
        if(x>=5 && x<=10){
            document.getElementById("pid").innerHTML="tebrikler";
            document.getElementById("pid").style.color="green";
        }

    }catch(e){
       document.getElementById("pid").innerHTML=e; 
    }


}