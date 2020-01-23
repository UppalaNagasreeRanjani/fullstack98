import { Component,OnInit } from '@angular/core';
import { Hero} from './models/hero';
import { HEROES} from './models/heroes';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent{
  title = 'stock';
  // user=new User(87,"nagasari");
   
   hero: Hero = {
     id: 101,
     name: 'Sri'
   };
   heroes = HEROES;
  //  callMe()
  //  {
  //    alert("welcome:"+this.user.name);
  //  }
  
  
}
