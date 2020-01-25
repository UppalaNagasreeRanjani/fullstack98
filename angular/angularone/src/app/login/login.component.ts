import { Component, OnInit } from '@angular/core';
import { UserService } from '../services/user.service';
import { analyzeAndValidateNgModules } from '@angular/compiler';
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(private userService: UserService) {
    

   }
  today:any;

   getDate(){
     this.today=this.userService.getTodayDate();
    
     
   }


  ngOnInit() {
    this.getDate();
  }

}
