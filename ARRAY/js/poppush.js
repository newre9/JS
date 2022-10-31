
  let meyve=[12.45,55,85];
  document.getElementById('demo').innerHTML=meyve;
function ekle(){
  
   // meyve.pop();
   let x=document.getElementById("a").value;
    meyve.push(x,"<br>");
    document.getElementById('demo').innerHTML=meyve;
}
function sil(){
  
     meyve.pop();
   // let x=document.getElementById("a").value;
    // meyve.push(x,"<br>");
     document.getElementById('demo').innerHTML=meyve;
 }