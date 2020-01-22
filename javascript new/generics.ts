class Generics<T,U,Z>{
    private key:T
    private value:U
    private numb:Z
    setKeyValue(key:T,value:U,numb:Z){
        this.key=key;
        this.value=value;
        this.numb=numb;
        console.log('key :'+this.key);
        console.log('value:'  +this.value);
        console.log('numb:'+this.numb);
    }
}
var obj=new Generics<number,string,number>();
obj.setKeyValue(56,"sri",68)
var obj1=new Generics<string,string,string>();
obj1.setKeyValue("sri","naga","uppala")