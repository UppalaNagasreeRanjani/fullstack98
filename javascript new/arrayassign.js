var arr = new Array(10) 
for(var i = 0;i<arr.length;i++) { 
    arr[i]=   Math.floor(Math.random()*100)

}
let div=arr.filter((x) => x%2==0 && x%5==0)
let inc=arr.map((x)=>parseInt(x*1.1))
console.log(arr);
console.log(div);
console.log(inc);