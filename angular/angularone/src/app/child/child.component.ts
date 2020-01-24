import { Component, OnInit,Input, Output, EventEmitter } from '@angular/core';
@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css']
})
export class ChildComponent implements OnInit {

  constructor() { }
  @Input() messageFromParent:string;
message="hellonagasri";
@Output() ChildMessage=new EventEmitter<string>();


  ngOnInit() {
    this.ChildMessage.emit(this.message);
  }

}
