import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { FormBuilder, FormGroup, FormControl,Validators } from '@angular/forms';
import { first } from 'rxjs/operators';
import { UserserviceService } from '../userservice.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
//RegistrationForm:FormGroup;
registerUser:FormGroup;
  constructor(private formBuilder:FormBuilder,private userserviceservice:UserserviceService) { }

  ngOnInit() {
  //   this.RegistrationForm = new FormGroup({
  //     'username': new FormControl(''),
  //     'password': new FormControl(''),
  //     'conformpassword':new FormControl(''),
  //     'id':new FormControl(''),
  //     'email':new FormControl(''),
  //     'phonenumber':new FormControl('')
  // });
  this.registerUser = this.formBuilder.group({
    username:['',Validators.required],
    password:['',Validators.required],
    conformpassword:['',Validators.required],

    id: ['', Validators.required],
  
    email: ['', [Validators.required,Validators.email]],
    phonenumber: ['', Validators.required]
  });
}
addUser(){
  this.userserviceservice.saveUser(this.registerUser.value).subscribe(data=>
  {
  console.log("data inserted succuessfully");
  });
  }
  
  onSubmit(){
    console.log(this.registerUser.value);
  }
  }
 