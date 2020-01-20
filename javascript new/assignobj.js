var det = { name:"nagasri", ID:"98" }; 
var copy = Object.assign({}, det); 
console.log(copy);  
for (let val in copy) { 
   console.log(copy[val]) 
}
//another merging objects
var o1 = { a: 10 }; 
var o2 = { b: 10 }; 
var o3 = { c: 30 }; 
var obj = Object.assign(o1, o2, o3); 
console.log(obj);  
delete obj.o1;console.log(obj);
console.log(obj.o1==obj.o2);