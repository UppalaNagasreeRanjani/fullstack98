var InstanceOf = /** @class */ (function () {
    function InstanceOf() {
    }
    InstanceOf.prototype.display = function () {
        console.log('hi');
    };
    return InstanceOf;
}());
var ob = new InstanceOf();
var ob1 = ob instanceof InstanceOf;
console.log(ob1);
