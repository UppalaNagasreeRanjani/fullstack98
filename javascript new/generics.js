var Generics = /** @class */ (function () {
    function Generics() {
    }
    Generics.prototype.setKeyValue = function (key, value, numb) {
        this.key = key;
        this.value = value;
        this.numb = numb;
        console.log('key :' + this.key);
        console.log('value:' + this.value);
        console.log('numb:' + this.numb);
    };
    return Generics;
}());
var obj = new Generics();
obj.setKeyValue(56, "sri", 68);
var obj1 = new Generics();
obj1.setKeyValue("sri", "naga", "uppala");
