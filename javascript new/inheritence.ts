class Inheritence{
   static area:number
    constructor(a:number){
        Inheritence.area=a;
    }
}
class Second extends Inheritence{
   static display():void{
        console.log(this.area);
    }
}
class Third extends Second{
   static  display():void{
        console.log(this.area);
        super.display();
    }
}
Third.area=4;
Third.display();