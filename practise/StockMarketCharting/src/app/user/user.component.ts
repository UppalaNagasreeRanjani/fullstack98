import { Component, OnInit } from '@angular/core';
import { ServiceService } from './service.service';
import { User } from '../models/user';
import { Router } from '@angular/router';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})

export class UserComponent implements OnInit {

  constructor(private serviceservice:ServiceService,private router: Router) { }
//naga:User[];
users:User[];
  ngOnInit() {
    //this.naga=this.serviceservice.getAllUsers();
    this.serviceservice.getAllUsers().subscribe(data=>{
      this.users=data;
    })
  }
deleteUser(user:User){
  this.serviceservice.deleteUser(user.id).subscribe()
  this.users=this.users.filter(u => u !==user)
}
updateUser(user:User){
  localStorage.removeItem('userId');
  localStorage.setItem('userId',user.id.toString());
  this.router.navigate(['update-user']);

}

}
