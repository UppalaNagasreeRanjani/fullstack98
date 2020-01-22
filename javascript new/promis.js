/*var promise = new Promise(function(resolve, reject) {
  // do a thing, possibly async, then…
setTimeout(resolve,5000)
})
  
promise.then(function(){
    console.log("this is done")
    })
    promise.then(function(){
        console.log("this is done")
        })*/
       /* var asynchronousFunction=function(){
            return new Promise(function(resolve,reject){
                console.log('kepp every promis you make only make promises that you can keep');
            setTimeout(resolve,5000)
            })
        }
        asynchronousFunction()
        .then(asynchronousFunction)
        .then(asynchronousFunction)*/
        const mypromis =new Promise((resolve,reject) =>{
            if(Math.random() *100<=70){
                resolve('hello promises')

            }
            reject(new Error('in 10% of the cases,i fail.miserably'));
        });
        const onResolved=(Resolvedvalue)=> console.log(Resolvedvalue);
        const onRejected=(error)=>console.log(error);
        mypromis.then(onResolved,onRejected)

        
