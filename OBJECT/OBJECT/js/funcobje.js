const   person={
    Fname:"Sevgi",
    Lname:"İNAL",
    Age:37,
    fullname:function(){
        return this.Fname +" "+this.Lname;
    }
}

function funccall(){
    document.getElementById("demo2").innerHTML=person.Lname;
}