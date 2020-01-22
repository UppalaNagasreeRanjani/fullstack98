var AgriLoan = /** @class */ (function () {
    function AgriLoan(interest, rebate) {
        this.interest = interest;
        this.rebate = rebate;
    }
    return AgriLoan;
}());
var o = new AgriLoan(10, 1);
console.log("Interest is : " + o.interest + " Rebate is : " + o.rebate);
