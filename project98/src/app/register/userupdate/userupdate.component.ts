import { Component, OnInit } from '@angular/core';
import {UserserviceService}from '../../userservice.service';
import { Router } from '@angular/router';
import{User}from '../../module/user';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';

@Component({
  selector: 'app-userupdate',
  templateUrl: './userupdate.component.html',
  styleUrls: ['./userupdate.component.css']
})
export class UserupdateComponent implements OnInit {
  updateUser:FormGroup;
  constructor(private formBuilder:FormBuilder,private userserviceservice:UserserviceService, private router:Router) { }

  ngOnInit() {
    this.updateUser=this.formBuilder.group({
      username:['',[Validators.required]],
      password:['',[Validators.required]],
      conformpassword:['',[Validators.required]],
      id:[],
    email:['',[Validators.required,Validators.email]],
      phone:['',Validators.required]
    });
   const id=localStorage.getItem('userId') ;
   if(+id>0){
this.userserviceservice.getUserByID(+id).subscribe(user=>{
this.updateUser.patchValue(user);
});
   }
  }
 updateTheUser(user:User){
  this.userserviceservice.updateUserInfo(this.updateUser.value).subscribe(user=>{   
      this.router.navigate(['user']);
   })
 }
}

  

