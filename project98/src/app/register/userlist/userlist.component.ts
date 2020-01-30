import { Component, OnInit } from '@angular/core';
import {UserserviceService}from './userservice.service';
import { Router } from '@angular/router';
import{User}from '../module/user';
@Component({
  selector: 'app-userlist',
  templateUrl: './userlist.component.html',
  styleUrls: ['./userlist.component.css']
})
export class UserlistComponent implements OnInit {
users:User[];
  constructor(private userservice.service:UserserviceService,private router: Router) ) { }

  ngOnInit() {
    this.userserviceservice.getAllUsers().subscribe(data=>{
      this.users=data;
    })
  }

}
