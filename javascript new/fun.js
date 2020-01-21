
function add(a,b=2){

    console.log(a+b);
}
add(2)
/*function ad(params){
    console.log(params.length);
}
ad();
ad(3);
ad(3,5,7);*/
function fun1(...params) { //params functions we can declare any number of parametres
    console.log(params.length); 
 }  
 fun1();  
 fun1(5); 
 fun1(5, 6, 7); 
 let a=2;
 var f=function() {
     
     console.log (a)
    }
console.log(f());
var func = new Function("x", "y", "return x*y;"); 
function product() { 
   var result; 
   result = func(10,20); 
   console.log("The product : "+result)
} 
product()
//lambda
var c=(x,y)=>{
    x+y
    console.log("hi")}

console.log(c(2,4))
//hoist functions
hoist_function();  
function hoist_function() { 
   console.log("foo"); 
} 
function* rainbow() { 
    // the asterisk marks this as a generator 
    yield 'red'; 
    yield 'orange'; 
    yield 'yellow'; 
    yield 'green'; 
    yield 'blue'; 
    yield 'indigo'; 
    yield 'violet'; 
 } 
 for(let color of rainbow()) { 
    console.log(color); 
 } 
