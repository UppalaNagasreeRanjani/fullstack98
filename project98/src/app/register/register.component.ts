import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { FormBuilder, FormGroup, FormControl } from '@angular/forms';
import { first } from 'rxjs/operators';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
RegistrationForm:FormGroup;
  constructor() { }

  ngOnInit() {
    this.RegistrationForm = new FormGroup({
      'username': new FormControl(''),
      'password': new FormControl(''),
      'conformpassword':new FormControl('')
  });
}
  onSubmit() {
    console.log(this.RegistrationForm.value);
  }
}
