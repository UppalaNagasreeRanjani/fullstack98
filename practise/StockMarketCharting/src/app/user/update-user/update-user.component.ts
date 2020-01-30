import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { ServiceService } from '../service.service';
import { Router } from '@angular/router';
import { User } from 'src/app/models/user';

@Component({
  selector: 'app-update-user',
  templateUrl: './update-user.component.html',
  styleUrls: ['./update-user.component.css']
})
export class UpdateUserComponent implements OnInit {
updateUser:FormGroup;
  constructor(private formBuilder:FormBuilder,private serviceservice:ServiceService, private router:Router) { }

  ngOnInit() {
    this.updateUser=this.formBuilder.group({
      id:[],
      name:['',Validators.required],
      email:['',[Validators.required,Validators.email]],
      phone:['',Validators.required]
    });
   const id=localStorage.getItem('userId') ;
   if(+id>0){
this.serviceservice.getUserByID(+id).subscribe(user=>{
this.updateUser.patchValue(user);
});
   }
  }
 updateTheUser(user:User){
  this.serviceservice.updateUserInfo(this.updateUser.value).subscribe(user=>{   
      this.router.navigate(['user']);
   })
 }
}
