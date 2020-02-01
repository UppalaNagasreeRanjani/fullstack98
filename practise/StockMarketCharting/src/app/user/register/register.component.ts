import { Component, OnInit } from '@angular/core';
import  {FormGroup, FormBuilder, Validators} from '@angular/forms'
import { ServiceService } from '../service.service';
@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
 
 styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  
registerUser:FormGroup;
  constructor(private formBuilder:FormBuilder,private service:ServiceService) { }

  ngOnInit() {
  
    this.registerUser = this.formBuilder.group({
      id: ['', Validators.required],
      name: ['', Validators.required],
      email: ['', [Validators.required,Validators.email]],
      phone: ['', Validators.required]
    });
  }
 
addUser(){
this.service.saveUser(this.registerUser.value,).subscribe(data=>
{
console.log("data inserted succuessfully");
});
}

onSubmit(){
  console.log(this.registerUser.value);
}
}