import { Component,OnInit } from '@angular/core';
// @Component({   //classes  
//   selector: 'app-root',    
//  // template: `<button class='colorClass' [ngClass]='applyClasses()'>Pankaj Saini</button>`,    
//   styles: [`.boldClass{    
//               font-weight:bold;    
//                 font-size : 30px;    
//           }    
  
//           .italicsClass{    
//               font-style:italic;    
//           }    
  
//           .colorClass{    
//               color:Red;               
// }`]    
// })    
// export class AppComponent {    
//   applyBoldClass: boolean = true;    
//   applyItalicsClass: boolean = true;    
  
//   applyClasses() {    
//       let classes = {    
//           boldClass: this.applyBoldClass,    
//           italicsClass: this.applyItalicsClass    
//       };    
  
//       return classes;    
//   }    
// }    	


 @Component({
  selector: 'app-root',
templateUrl: './app.component.html',
 styleUrls: ['./app.component.css'],
//   template:`<button style='color:green' [ngStyle]="MyStyle()">Pankaj Saini</button>`   
})  
// export class AppComponent {    
//   isBold: boolean = true;    
//   fontSize: number = 30;    
//   isItalic: boolean = true;    
  
//   MyStyle() {    
//       let mystyles = {    
//           'font-weight': this.isBold ? 'bold' : 'normal',    
//           'font-style': this.isItalic ? 'italic' : 'normal',    
//           'font-size.px': this.fontSize    
//       };    
  
//       return mystyles;    
//   }    
// } 


 export class AppComponent{
//   title = 'stock';
// message="hi";
// messagefromChild:string;
// setMessage(msg:string){
//   this.messagefromChild=msg;
// }
  // user=new User(87,"nagasari");
   
  //  hero: Hero = {
  //    id: 101,
  //    name: 'Sri'
  //  };
  //  heroes = HEROES;
  //  callMe()
  //  {
  //    alert("welcome:"+this.user.name);
  //  }
  tilte="stock";
}
  
