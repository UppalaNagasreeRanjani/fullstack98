var num=Number.isNaN(5);
var num=Number.isFinite(5);
var num=Number.isInteger(-00000);
var num=Number.isSafeInteger(-00000000);
console.log(num);

//instance methods
var num1 = 1225.30 
var val = num1.toExponential(); 
console.log(val)
console.log(0010);
var num=new Boolean(4)
console.log(num)
function book(title,author)
    {
        this.title=title
        this.author=author
    }
var num=new book("sri","gaga")
book.prototype.prize="000"
num.prize="7787"
console.log(num.title);
console.log(num.prize);

