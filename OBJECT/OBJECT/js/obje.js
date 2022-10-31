const person={
    FirstName:"Ayşe",
    LastName:"BAYRAM",
    Age:45,
    Id:1233456

}

const x=person;
    x.Age=48;

function getir(){

    //document.getElementById("demo").innerHTML=person.FirstName+" "+person.Age;
    document.getElementById("demo").innerHTML=person["Age"]+" "+person["Id"];
}

