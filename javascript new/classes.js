class First{
  constructor(fname,lname){
this.f=fname;
this.l=lname;

  }
 
}


//var o=new New("naga","sri");
// o.fun();//static method call with classname
// var is=o instanceof New;
// console.log(is);
class Second extends First{
display(){
    console.log('hi');
}
}
class Second1 extends Second{
    fun(){
        console.log( this.f+this.l)
        console.log('hu');
        
    
    }
    display(){
        super.display();//super for parent class method
        console.log('hello');
    }
   

}
var obj=new Second1("naga","sri");
obj.fun();
obj.display();//method overloading

