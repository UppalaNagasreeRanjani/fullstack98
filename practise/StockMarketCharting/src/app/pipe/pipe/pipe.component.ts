import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-pipe',
  templateUrl: './pipe.component.html',
  styleUrls: ['./pipe.component.css']
})
export class PipeComponent implements OnInit {
  message:string;
  price:number;
  salary:number;
  dob:Date;


  constructor() { }

  ngOnInit() {
    this.message='today is 30th jan';
    this.price=7687;
    this.salary=545474.876;
    this.dob=new Date(65-87-88);
  }

}
