var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var Inheritence = /** @class */ (function () {
    function Inheritence(a) {
        Inheritence.area = a;
    }
    return Inheritence;
}());
var Second = /** @class */ (function (_super) {
    __extends(Second, _super);
    function Second() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    Second.display = function () {
        console.log(this.area);
    };
    return Second;
}(Inheritence));
var Third = /** @class */ (function (_super) {
    __extends(Third, _super);
    function Third() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    Third.display = function () {
        console.log(this.area);
        _super.display.call(this);
    };
    return Third;
}(Second));
Third.area = 4;
Third.display();
