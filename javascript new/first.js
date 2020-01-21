console.log('hello world');
let name='amit';
 name='rahul';
//same varialble can be declare more than ones
//the scope of the var is function scope
console.log('name:'+name);//it will allow overrriding by using var 
function test(){
    for(let index =0;index<5;index++){
    console.log('index:'+index);
}
console.log(name);
}
test();