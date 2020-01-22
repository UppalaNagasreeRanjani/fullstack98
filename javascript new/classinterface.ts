interface ILoan { 
    interest:number 
 } 
 
 class AgriLoan implements ILoan { 
    interest:number 
    rebate:number 
    
    constructor(interest:number,rebate:number) { 
       this.interest = interest 
       this.rebate = rebate 
    } 
 } 
 
 var o = new AgriLoan(10,1) 
 console.log("Interest is : "+o.interest+" Rebate is : "+o.rebate )