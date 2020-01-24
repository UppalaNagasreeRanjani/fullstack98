import { Component, OnInit } from '@angular/core';
import {Form} from '../form';
@Component({
  selector: 'app-form',
  templateUrl: './form.component.html',
  styleUrls: ['./form.component.css']
})
export class FormComponent implements OnInit {
  powers = ['Really Smart', 'Super Flexible',
  'Super Hot', 'Weather Changer'];

model = new Form(18, 'Dr IQ', this.powers[0], 'Chuck Overstreet');
  constructor() { }

  ngOnInit() {
  }

}
