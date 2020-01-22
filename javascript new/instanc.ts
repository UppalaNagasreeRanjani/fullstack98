class InstanceOf{
   display(){
       console.log('hi');
   } 

}
var ob=new InstanceOf();
var ob1=ob instanceof InstanceOf;
console.log(ob1);
