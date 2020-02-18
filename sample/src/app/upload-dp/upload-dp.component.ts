import { Component, OnInit } from '@angular/core';
import { UserService } from 'src/app/services/user.service';

@Component({
  selector: 'app-upload-dp',
  templateUrl: './upload-dp.component.html',
  styleUrls: ['./upload-dp.component.css']
})
export class UploadDpComponent implements OnInit {

  constructor(private userService:UserService) { }

  ngOnInit() {
  }

}
